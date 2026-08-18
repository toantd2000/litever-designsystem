package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem

@Composable
fun LiteverScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        modifier = modifier.imePadding(),
        topBar = topBar,
        bottomBar = bottomBar,
        snackbarHost = snackbarHost,
        floatingActionButton = floatingActionButton,
        floatingActionButtonPosition = floatingActionButtonPosition,
        content = content
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverScaffoldPreview() {
    LiteverTheme(darkTheme = false) {
        LiteverScaffold(
            topBar = { Text("Top Bar", modifier = Modifier.padding(16.dp)) },
            bottomBar = { Text("Bottom Bar", modifier = Modifier.padding(16.dp)) }
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
        LiteverScaffold(
            topBar = { Text("Top Bar", modifier = Modifier.padding(16.dp)) },
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
        LiteverScaffold(
            topBar = { Text("Top Bar", modifier = Modifier.padding(16.dp)) },
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
        LiteverScaffold(
            topBar = { Text("Top Bar", modifier = Modifier.padding(16.dp)) },
            bottomBar = {
                BottomAppBar(
                    actions = {
                        // Sử dụng Weight cho Row để NavigationBarItem chiếm đều không gian bên trái FAB
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
            // Note: When using BottomAppBar's built-in FAB slot, 
            // we DO NOT pass the FAB to Scaffold's floatingActionButton parameter.
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
