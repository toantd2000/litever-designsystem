package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.union
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * Standard Material 3 Scaffold with Litever defaults.
 * Automatically handles IME padding for better keyboard support.
 */
@Composable
fun LiteverScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    containerColor: Color = MaterialTheme.colorScheme.background,
    contentColor: Color = contentColorFor(containerColor),
    contentWindowInsets: WindowInsets = ScaffoldDefaults.contentWindowInsets.union(WindowInsets.ime),
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        modifier = modifier,
        topBar = topBar,
        bottomBar = bottomBar,
        snackbarHost = snackbarHost,
        floatingActionButton = floatingActionButton,
        floatingActionButtonPosition = floatingActionButtonPosition,
        containerColor = containerColor,
        contentColor = contentColor,
        contentWindowInsets = contentWindowInsets,
        content = content
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverScaffoldPreview() {
    LiteverTheme(darkTheme = false) {
        val spacing = LiteverTheme.spacing
        LiteverScaffold(
            topBar = { Text("Top Bar", modifier = Modifier.padding(spacing.medium)) },
            bottomBar = { Text("Bottom Bar", modifier = Modifier.padding(spacing.medium)) }
        ) { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text("Scaffold Content")
            }
        }
    }
}

@Preview(showBackground = true, name = "FAB Center")
@Composable
fun LiteverScaffoldFabCenterPreview() {
    LiteverTheme(darkTheme = false) {
        val spacing = LiteverTheme.spacing
        LiteverScaffold(
            topBar = { Text("Top Bar", modifier = Modifier.padding(spacing.medium)) },
            bottomBar = {
                NavigationBar {
                    NavigationBarItem(selected = true, onClick = {}, icon = { Icon(Icons.Default.Home, contentDescription = null) }, label = { Text("Home") })
                    NavigationBarItem(selected = false, onClick = {}, icon = { Icon(Icons.Default.Settings, contentDescription = null) }, label = { Text("Settings") })
                }
            },
            floatingActionButton = {
                FloatingActionButton(onClick = {}) {
                    Icon(Icons.Default.Add, contentDescription = null)
                }
            },
            floatingActionButtonPosition = FabPosition.Center
        ) { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text("Content with FAB Center")
            }
        }
    }
}

@Preview(showBackground = true, name = "FAB End")
@Composable
fun LiteverScaffoldFabEndPreview() {
    LiteverTheme(darkTheme = false) {
        val spacing = LiteverTheme.spacing
        LiteverScaffold(
            topBar = { Text("Top Bar", modifier = Modifier.padding(spacing.medium)) },
            bottomBar = {
                NavigationBar {
                    NavigationBarItem(selected = true, onClick = {}, icon = { Icon(Icons.Default.Home, contentDescription = null) }, label = { Text("Home") })
                    NavigationBarItem(selected = false, onClick = {}, icon = { Icon(Icons.Default.Settings, contentDescription = null) }, label = { Text("Settings") })
                }
            },
            floatingActionButton = {
                FloatingActionButton(onClick = {}) {
                    Icon(Icons.Default.Add, contentDescription = null)
                }
            },
            floatingActionButtonPosition = FabPosition.End
        ) { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text("Content with FAB End")
            }
        }
    }
}

@Preview(showBackground = true, name = "FAB Docked (BottomAppBar)")
@Composable
fun LiteverScaffoldFabDockedPreview() {
    LiteverTheme(darkTheme = false) {
        val spacing = LiteverTheme.spacing
        LiteverScaffold(
            topBar = { Text("Top Bar", modifier = Modifier.padding(spacing.medium)) },
            bottomBar = {
                BottomAppBar(
                    actions = {
                        androidx.compose.foundation.layout.Row(modifier = Modifier.weight(1f)) {
                            NavigationBarItem(selected = true, onClick = {}, icon = { Icon(Icons.Default.Home, contentDescription = "Home") }, label = { Text("Home") })
                            NavigationBarItem(selected = false, onClick = {}, icon = { Icon(Icons.Default.Settings, contentDescription = "Settings") }, label = { Text("Settings") })
                        }
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = {}) {
                            Icon(Icons.Default.Add, contentDescription = "Add")
                        }
                    }
                )
            },
            floatingActionButton = {}, 
        ) { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text("Content with FAB Docked in BottomAppBar")
            }
        }
    }
}
