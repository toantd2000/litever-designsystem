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
import androidx.compose.material.icons.automirrored.rounded.Message
import androidx.compose.material.icons.rounded.DarkMode
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LightMode
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Palette
import androidx.compose.material.icons.rounded.Translate
import androidx.compose.material.icons.rounded.Widgets
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.window.Dialog
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import vn.io.litever.designsystem.components.LiteverLogo
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.screens.ComponentsScreen
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
            var isEnglish by remember { mutableStateOf(true) }
            var currentPalette by remember { mutableStateOf(vn.io.litever.designsystem.theme.LiteverThemeColor.DEFAULT) }

            val appStrings = if (isEnglish) EnglishStrings else VietnameseStrings

            val locale = java.util.Locale.forLanguageTag(if (isEnglish) "en" else "vi")
            val configuration = android.content.res.Configuration(LocalConfiguration.current).apply {
                setLocale(locale)
            }

            LiteverTheme(darkTheme = darkTheme, themeColor = currentPalette) {
                CompositionLocalProvider(
                    LocalAppStrings provides appStrings,
                    LocalConfiguration provides configuration
                ) {
                    MainShowcaseScreen(
                        darkTheme = darkTheme,
                        onThemeToggle = { darkTheme = !darkTheme },
                        isEnglish = isEnglish,
                        onLanguageToggle = { isEnglish = !isEnglish },
                        currentPalette = currentPalette,
                        onPaletteChange = { currentPalette = it }
                    )
                }
            }
        }
    }
}

enum class DemoScreen(val getTitle: (AppStrings) -> String, val icon: androidx.compose.ui.graphics.vector.ImageVector) {
    OVERVIEW({ it.overview }, Icons.Rounded.Home),
    COMPONENTS({ if (it.overview == "Tổng quan") "Thành phần UI" else "UI Components" }, Icons.Rounded.Widgets),
    TOKENS({ it.tokens }, Icons.Rounded.Palette)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainShowcaseScreen(
    darkTheme: Boolean,
    onThemeToggle: () -> Unit,
    isEnglish: Boolean,
    onLanguageToggle: () -> Unit,
    currentPalette: vn.io.litever.designsystem.theme.LiteverThemeColor,
    onPaletteChange: (vn.io.litever.designsystem.theme.LiteverThemeColor) -> Unit
) {
    val strings = LocalAppStrings.current
    val spacing = LiteverTheme.spacing
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val snackbarHostState = remember { SnackbarHostState() }
    var currentScreen by remember { mutableStateOf(DemoScreen.OVERVIEW) }
    var isPaletteMenuExpanded by remember { mutableStateOf(false) }

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

    if (isPaletteMenuExpanded) {
        Dialog(onDismissRequest = { isPaletteMenuExpanded = false }) {
            Box(
                modifier = Modifier
                    .clip(LiteverTheme.shapes.large)
                    .background(LiteverTheme.colors.surface)
                    .padding(24.dp)
            ) {
                Column {
                    Text(
                        text = "Choose Palette",
                        style = LiteverTheme.typography.titleLarge,
                        color = LiteverTheme.colors.onSurface,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(4),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(vn.io.litever.designsystem.theme.LiteverThemeColor.entries.toTypedArray()) { color ->
                            val (primary, primaryContainer) = when (color) {
                                vn.io.litever.designsystem.theme.LiteverThemeColor.RED -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.redDarkColorScheme.primary to vn.io.litever.designsystem.theme.palettes.redDarkColorScheme.primaryContainer else vn.io.litever.designsystem.theme.palettes.redLightColorScheme.primary to vn.io.litever.designsystem.theme.palettes.redLightColorScheme.primaryContainer
                                vn.io.litever.designsystem.theme.LiteverThemeColor.ORANGE -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.orangeDarkColorScheme.primary to vn.io.litever.designsystem.theme.palettes.orangeDarkColorScheme.primaryContainer else vn.io.litever.designsystem.theme.palettes.orangeLightColorScheme.primary to vn.io.litever.designsystem.theme.palettes.orangeLightColorScheme.primaryContainer
                                vn.io.litever.designsystem.theme.LiteverThemeColor.YELLOW -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.yellowDarkColorScheme.primary to vn.io.litever.designsystem.theme.palettes.yellowDarkColorScheme.primaryContainer else vn.io.litever.designsystem.theme.palettes.yellowLightColorScheme.primary to vn.io.litever.designsystem.theme.palettes.yellowLightColorScheme.primaryContainer
                                vn.io.litever.designsystem.theme.LiteverThemeColor.GREEN -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.greenDarkColorScheme.primary to vn.io.litever.designsystem.theme.palettes.greenDarkColorScheme.primaryContainer else vn.io.litever.designsystem.theme.palettes.greenLightColorScheme.primary to vn.io.litever.designsystem.theme.palettes.greenLightColorScheme.primaryContainer
                                vn.io.litever.designsystem.theme.LiteverThemeColor.BLUE -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.blueDarkColorScheme.primary to vn.io.litever.designsystem.theme.palettes.blueDarkColorScheme.primaryContainer else vn.io.litever.designsystem.theme.palettes.blueLightColorScheme.primary to vn.io.litever.designsystem.theme.palettes.blueLightColorScheme.primaryContainer
                                vn.io.litever.designsystem.theme.LiteverThemeColor.INDIGO -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.indigoDarkColorScheme.primary to vn.io.litever.designsystem.theme.palettes.indigoDarkColorScheme.primaryContainer else vn.io.litever.designsystem.theme.palettes.indigoLightColorScheme.primary to vn.io.litever.designsystem.theme.palettes.indigoLightColorScheme.primaryContainer
                                vn.io.litever.designsystem.theme.LiteverThemeColor.VIOLET -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.violetDarkColorScheme.primary to vn.io.litever.designsystem.theme.palettes.violetDarkColorScheme.primaryContainer else vn.io.litever.designsystem.theme.palettes.violetLightColorScheme.primary to vn.io.litever.designsystem.theme.palettes.violetLightColorScheme.primaryContainer
                                vn.io.litever.designsystem.theme.LiteverThemeColor.DEFAULT -> if (darkTheme) vn.io.litever.designsystem.theme.palettes.blueDarkColorScheme.primary to vn.io.litever.designsystem.theme.palettes.blueDarkColorScheme.primaryContainer else vn.io.litever.designsystem.theme.palettes.blueLightColorScheme.primary to vn.io.litever.designsystem.theme.palettes.blueLightColorScheme.primaryContainer
                            }
                            
                            Box(
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .clip(LiteverTheme.shapes.medium)
                                    .background(primaryContainer)
                                    .clickable {
                                        onPaletteChange(color)
                                        isPaletteMenuExpanded = false
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = color.name,
                                    color = primary,
                                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                    style = LiteverTheme.typography.labelSmall,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
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
                HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant, thickness = 0.5.dp)
                Spacer(modifier = Modifier.height(spacing.medium))

                DemoScreen.entries.forEach { screen ->
                    NavigationDrawerItem(
                        label = { Text(screen.getTitle(strings), style = LiteverTheme.typography.bodyLarge) },
                        selected = currentScreen == screen,
                        onClick = {
                            currentScreen = screen
                            scope.launch { drawerState.close() }
                        },
                        icon = { Icon(screen.icon, contentDescription = null) },
                        modifier = Modifier.padding(horizontal = spacing.small)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))
                HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant, thickness = 0.5.dp)

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(spacing.medium)
                ) {
                    Text(
                        text = "Version: 1.0.5\nLitever Design System",
                        style = LiteverTheme.typography.labelMedium,
                        color = LiteverTheme.colors.onSurfaceVariant.copy(alpha = 0.7f)
                    )
                }
            }
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = currentScreen.getTitle(strings),
                            style = LiteverTheme.typography.titleLarge
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = { scope.launch { drawerState.open() } }) {
                            Icon(Icons.Rounded.Menu, contentDescription = "Navigation menu")
                        }
                    },
                    actions = {
                        IconButton(onClick = { isPaletteMenuExpanded = true }) {
                            Icon(Icons.Rounded.Palette, contentDescription = "Switch Palette")
                        }
                        IconButton(onClick = onLanguageToggle) {
                            Icon(
                                imageVector = Icons.Rounded.Translate,
                                contentDescription = "Switch Language"
                            )
                        }
                        IconButton(onClick = onThemeToggle) {
                            Icon(
                                imageVector = if (darkTheme) Icons.Rounded.LightMode else Icons.Rounded.DarkMode,
                                contentDescription = "Toggle Theme"
                            )
                        }
                    }
                )
            },
            snackbarHost = {
                SnackbarHost(hostState = snackbarHostState)
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {
                        scope.launch {
                            snackbarHostState.showSnackbar(strings.welcomeTitle + "!")
                        }
                    },
                    shape = LiteverTheme.shapes.large
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
                    DemoScreen.COMPONENTS -> ComponentsScreen()
                    DemoScreen.TOKENS -> TokensScreen()
                }
            }
        }
    }
}
