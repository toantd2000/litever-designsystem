package vn.io.litever.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.List
import androidx.compose.material.icons.automirrored.rounded.Message
import androidx.compose.material.icons.rounded.DarkMode
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.LightMode
import androidx.compose.material.icons.rounded.Palette
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.Translate
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import vn.io.litever.designsystem.components.LiteverActionButtonBar
import vn.io.litever.designsystem.components.LiteverDrawerSheet
import vn.io.litever.designsystem.components.LiteverFloatingActionButton
import vn.io.litever.designsystem.components.LiteverHorizontalDivider
import vn.io.litever.designsystem.components.LiteverIconButton
import vn.io.litever.designsystem.components.LiteverLogo
import vn.io.litever.designsystem.components.LiteverNavigationDrawer
import vn.io.litever.designsystem.components.LiteverNavigationDrawerItem
import vn.io.litever.designsystem.components.LiteverNavigationIconType
import vn.io.litever.designsystem.components.LiteverScaffold
import vn.io.litever.designsystem.components.LiteverSnackbarHost
import vn.io.litever.designsystem.components.LiteverTopAppBar
import vn.io.litever.designsystem.theme.LiteverIcons
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.screens.AuxiliaryScreen
import vn.io.litever.sample.screens.DialogsScreen
import vn.io.litever.sample.screens.InputsScreen
import vn.io.litever.sample.screens.ListsScreen
import vn.io.litever.sample.screens.OverviewScreen
import vn.io.litever.sample.screens.TokensScreen
import vn.io.litever.sample.utils.AppStrings
import vn.io.litever.sample.utils.EnglishStrings
import vn.io.litever.sample.utils.LocalAppStrings
import vn.io.litever.sample.utils.VietnameseStrings

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT
            ),
            navigationBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT
            )
        )
        setContent {
            var darkTheme by remember { mutableStateOf(false) }
            var isEnglish by remember { mutableStateOf(true) } // English by default

            val appStrings = if (isEnglish) EnglishStrings else VietnameseStrings

            val locale = if (isEnglish) java.util.Locale("en") else java.util.Locale("vi")
            val configuration = android.content.res.Configuration(LocalConfiguration.current).apply {
                setLocale(locale)
            }

            LiteverTheme(darkTheme = darkTheme) {
                CompositionLocalProvider(
                    LocalAppStrings provides appStrings,
                    LocalConfiguration provides configuration
                ) {
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
    LISTS({ it.lists }, Icons.AutoMirrored.Rounded.List),
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
    val spacing = LiteverTheme.spacing
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
                        .padding(vertical = spacing.large, horizontal = spacing.mediumLarge),
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
                LiteverHorizontalDivider(color = LiteverTheme.colors.outlineVariant, thickness = 0.5.dp)
                Spacer(modifier = Modifier.height(spacing.medium))

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
                LiteverHorizontalDivider(color = LiteverTheme.colors.outlineVariant, thickness = 0.5.dp)

                // Quick details at the bottom of the drawer
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(spacing.medium)
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
                    navigationIconType = LiteverNavigationIconType.Menu,
                    onNavigationClick = { scope.launch { drawerState.open() } },
                    actions = {
                        LiteverIconButton(onClick = onLanguageToggle) {
                            Icon(
                                imageVector = LiteverIcons.Rounded.Translate,
                                contentDescription = "Switch Language"
                            )
                        }
                        LiteverIconButton(onClick = onThemeToggle) {
                            Icon(
                                imageVector = if (darkTheme) LiteverIcons.Rounded.LightMode else LiteverIcons.Rounded.DarkMode,
                                contentDescription = "Toggle Theme"
                            )
                        }
                    }
                )
            },
            bottomBar = {
                if (currentScreen == DemoScreen.INPUTS) {
                    LiteverActionButtonBar(
                        primaryText = strings.alertConfirm,
                        onPrimaryClick = {
                            scope.launch {
                                snackbarHostState.showSnackbar(strings.alertConfirm + " successful!")
                            }
                        },
                        secondaryText = strings.alertDismiss,
                        onSecondaryClick = {
                            scope.launch {
                                snackbarHostState.showSnackbar(strings.alertDismiss + " clicked")
                            }
                        }
                    )
                }
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
                    Icon(Icons.AutoMirrored.Rounded.Message, contentDescription = "Quick Message")
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
