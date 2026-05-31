package vn.io.litever.sample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import vn.io.litever.designsystem.theme.LiteverIcons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.automirrored.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import vn.io.litever.designsystem.components.*
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.screens.*
import vn.io.litever.sample.utils.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var darkTheme by remember { mutableStateOf(false) }
            var isEnglish by remember { mutableStateOf(true) } // English by default

            val appStrings = if (isEnglish) EnglishStrings else VietnameseStrings

            LiteverTheme(darkTheme = darkTheme) {
                CompositionLocalProvider(LocalAppStrings provides appStrings) {
                    MainShowcaseScreen(
                        darkTheme = darkTheme,
                        onThemeToggle = { darkTheme = !darkTheme },
                        isEnglish = isEnglish,
                        onLanguageToggle = { isEnglish = !isEnglish }
                    )
                }
            }
        }
    }
}

enum class DemoScreen(val getTitle: (AppStrings) -> String, val icon: androidx.compose.ui.graphics.vector.ImageVector) {
    OVERVIEW({ it.overview }, LiteverIcons.Rounded.Home),
    INPUTS({ it.inputs }, LiteverIcons.Rounded.Edit),
    LISTS({ it.lists }, LiteverIcons.Rounded.List),
    DIALOGS({ it.dialogs }, LiteverIcons.Rounded.Info),
    TOKENS({ it.tokens }, LiteverIcons.Rounded.Palette),
    AUXILIARY({ it.auxiliary }, LiteverIcons.Rounded.Star)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainShowcaseScreen(
    darkTheme: Boolean,
    onThemeToggle: () -> Unit,
    isEnglish: Boolean,
    onLanguageToggle: () -> Unit
) {
    val strings = LocalAppStrings.current
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val snackbarHostState = remember { SnackbarHostState() }
    var currentScreen by remember { mutableStateOf(DemoScreen.OVERVIEW) }

    var isFirstLaunch by remember { mutableStateOf(true) }
    LaunchedEffect(isEnglish) {
        if (isFirstLaunch) {
            isFirstLaunch = false
        } else {
            scope.launch {
                snackbarHostState.showSnackbar(strings.langChanged)
            }
        }
    }

    LiteverNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            LiteverDrawerSheet {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp, horizontal = 20.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Column {
                        LiteverLogo(fontSize = 32.sp)
                        Text(
                            text = strings.drawerSubtitle,
                            style = LiteverTheme.typography.bodyMedium,
                            color = LiteverTheme.colors.onSurfaceVariant
                        )
                    }
                }
                HorizontalDivider(color = LiteverTheme.colors.outlineVariant, thickness = 0.5.dp)
                Spacer(modifier = Modifier.height(16.dp))

                DemoScreen.entries.forEach { screen ->
                    LiteverNavigationDrawerItem(
                        label = { Text(screen.getTitle(strings), style = LiteverTheme.typography.bodyLarge) },
                        selected = currentScreen == screen,
                        onClick = {
                            currentScreen = screen
                            scope.launch { drawerState.close() }
                        },
                        icon = { Icon(screen.icon, contentDescription = null) }
                    )
                }

                Spacer(modifier = Modifier.weight(1f))
                HorizontalDivider(color = LiteverTheme.colors.outlineVariant, thickness = 0.5.dp)

                // Quick details at the bottom of the drawer
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Version: 1.0.5\nLitever Team © 2026",
                        style = LiteverTheme.typography.labelMedium,
                        color = LiteverTheme.colors.onSurfaceVariant.copy(alpha = 0.7f)
                    )
                }
            }
        }
    ) {
        LiteverScaffold(
            topBar = {
                LiteverTopAppBar(
                    title = currentScreen.getTitle(strings),
                    navigationIcon = {
                        IconButton(onClick = { scope.launch { drawerState.open() } }) {
                            Icon(
                                imageVector = LiteverIcons.Rounded.Menu,
                                contentDescription = "Open Drawer"
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = onLanguageToggle) {
                            Icon(
                                imageVector = LiteverIcons.Rounded.Translate,
                                contentDescription = "Switch Language"
                            )
                        }
                        IconButton(onClick = onThemeToggle) {
                            Icon(
                                imageVector = if (darkTheme) LiteverIcons.Rounded.LightMode else LiteverIcons.Rounded.DarkMode,
                                contentDescription = "Toggle Theme"
                            )
                        }
                    }
                )
            },
            snackbarHost = {
                LiteverSnackbarHost(hostState = snackbarHostState)
            },
            floatingActionButton = {
                LiteverFloatingActionButton(
                    onClick = {
                        scope.launch {
                            snackbarHostState.showSnackbar(strings.welcomeTitle + "!")
                        }
                    }
                ) {
                    Icon(LiteverIcons.Rounded.Message, contentDescription = "Quick Message")
                }
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .background(LiteverTheme.colors.background)
            ) {
                when (currentScreen) {
                    DemoScreen.OVERVIEW -> OverviewScreen()
                    DemoScreen.INPUTS -> InputsScreen()
                    DemoScreen.LISTS -> ListsScreen()
                    DemoScreen.DIALOGS -> DialogsScreen()
                    DemoScreen.TOKENS -> TokensScreen()
                    DemoScreen.AUXILIARY -> AuxiliaryScreen()
                }
            }
        }
    }
}
