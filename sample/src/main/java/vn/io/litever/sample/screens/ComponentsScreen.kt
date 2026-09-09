package vn.io.litever.sample.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Inbox
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.automirrored.rounded.Send
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import vn.io.litever.designsystem.components.FeedbackStateType
import vn.io.litever.designsystem.components.FeedbackStateView
import vn.io.litever.designsystem.components.FullScreenLoading
import vn.io.litever.designsystem.components.LiteVerButtonDefaults
import vn.io.litever.designsystem.components.LiteVerTextFieldDefaults
import vn.io.litever.designsystem.components.OfflineWarning
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.utils.LocalAppStrings

@Composable
fun ComponentsScreen(modifier: Modifier = Modifier) {
    val strings = LocalAppStrings.current
    val spacing = LiteverTheme.spacing
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    var textInput by remember { mutableStateOf("Litever Design System") }
    var showLoadingOverlay by remember { mutableStateOf(false) }
    var retryCount by remember { mutableIntStateOf(0) }

    LaunchedEffect(showLoadingOverlay) {
        if (showLoadingOverlay) {
            delay(2000)
            showLoadingOverlay = false
            snackbarHostState.showSnackbar(strings.langChanged)
        }
    }

    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(spacing.medium),
            verticalArrangement = Arrangement.spacedBy(spacing.large)
        ) {
            // ==========================================
            // 1. COMPONENT DEFAULTS: BUTTONS
            // ==========================================
            Text(
                text = "1. Component Defaults (Buttons)",
                style = LiteverTheme.typography.titleMedium,
                color = LiteverTheme.colors.primary
            )

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = LiteverTheme.shapes.medium
            ) {
                Column(
                    modifier = Modifier.padding(spacing.medium),
                    verticalArrangement = Arrangement.spacedBy(spacing.small)
                ) {
                    Text(
                        text = "Standard M3 Button with LiteVerButtonDefaults",
                        style = LiteverTheme.typography.labelMedium,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )

                    // Primary Button
                    Button(
                        onClick = {
                            scope.launch { snackbarHostState.showSnackbar("Primary clicked") }
                        },
                        shape = LiteVerButtonDefaults.shape,
                        colors = LiteVerButtonDefaults.primaryColors(),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(Icons.AutoMirrored.Rounded.Send, contentDescription = null)
                        Spacer(modifier = Modifier.width(spacing.small))
                        Text("Primary Button")
                    }

                    // Secondary Button
                    Button(
                        onClick = {
                            scope.launch { snackbarHostState.showSnackbar("Secondary clicked") }
                        },
                        shape = LiteVerButtonDefaults.shape,
                        colors = LiteVerButtonDefaults.secondaryColors(),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Secondary Button")
                    }

                    // Destructive Button
                    Button(
                        onClick = {
                            scope.launch { snackbarHostState.showSnackbar("Destructive clicked") }
                        },
                        shape = LiteVerButtonDefaults.shape,
                        colors = LiteVerButtonDefaults.destructiveColors(),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(Icons.Rounded.Delete, contentDescription = null)
                        Spacer(modifier = Modifier.width(spacing.small))
                        Text("Destructive Button")
                    }

                    // Success Button
                    Button(
                        onClick = {
                            scope.launch { snackbarHostState.showSnackbar("Success clicked") }
                        },
                        shape = LiteVerButtonDefaults.shape,
                        colors = LiteVerButtonDefaults.successColors(),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(Icons.Rounded.Check, contentDescription = null)
                        Spacer(modifier = Modifier.width(spacing.small))
                        Text("Success Button")
                    }

                    // Outlined Button
                    OutlinedButton(
                        onClick = {
                            scope.launch { snackbarHostState.showSnackbar("Outlined clicked") }
                        },
                        shape = LiteVerButtonDefaults.shape,
                        colors = LiteVerButtonDefaults.outlinedColors(),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Outlined Button")
                    }

                    // Text Button
                    TextButton(
                        onClick = {
                            scope.launch { snackbarHostState.showSnackbar("TextButton clicked") }
                        },
                        colors = LiteVerButtonDefaults.textColors(),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Text Button")
                    }
                }
            }

            // ==========================================
            // 2. COMPONENT DEFAULTS: TEXT FIELDS
            // ==========================================
            Text(
                text = "2. Component Defaults (TextFields)",
                style = LiteverTheme.typography.titleMedium,
                color = LiteverTheme.colors.primary
            )

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = LiteverTheme.shapes.medium
            ) {
                Column(
                    modifier = Modifier.padding(spacing.medium),
                    verticalArrangement = Arrangement.spacedBy(spacing.medium)
                ) {
                    Text(
                        text = "Standard M3 OutlinedTextField with LiteVerTextFieldDefaults",
                        style = LiteverTheme.typography.labelMedium,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )

                    OutlinedTextField(
                        value = textInput,
                        onValueChange = { textInput = it },
                        label = { Text("Label") },
                        placeholder = { Text("Enter text...") },
                        leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null) },
                        trailingIcon = if (textInput.isNotEmpty()) {
                            {
                                IconButton(onClick = { textInput = "" }) {
                                    Icon(Icons.Rounded.Clear, contentDescription = "Clear")
                                }
                            }
                        } else null,
                        shape = LiteVerTextFieldDefaults.shape,
                        colors = LiteVerTextFieldDefaults.outlinedColors(),
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )

                    TextField(
                        value = textInput,
                        onValueChange = { textInput = it },
                        label = { Text("Filled Style") },
                        shape = LiteVerTextFieldDefaults.shape,
                        colors = LiteVerTextFieldDefaults.colors(),
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            // ==========================================
            // 3. SHARED UI VIEWS
            // ==========================================
            Text(
                text = "3. Shared UI Views (Universal)",
                style = LiteverTheme.typography.titleMedium,
                color = LiteverTheme.colors.primary
            )

            // OfflineWarning Demo
            OfflineWarning(
                message = strings.offlineWarningMsg,
                retryLabel = if (retryCount == 0) strings.offlineRetry else "${strings.offlineRetry} ($retryCount)",
                onRetry = {
                    retryCount++
                    scope.launch {
                        snackbarHostState.showSnackbar("Retrying network connection... (#$retryCount)")
                    }
                }
            )

            // FeedbackStateView: Empty Type Demo
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = LiteverTheme.shapes.medium
            ) {
                FeedbackStateView(
                    title = strings.emptyStateTitle,
                    description = strings.emptyStateDesc,
                    type = FeedbackStateType.EMPTY,
                    action = {
                        Button(
                            onClick = {
                                scope.launch {
                                    snackbarHostState.showSnackbar("Empty state action triggered!")
                                }
                            },
                            shape = LiteVerButtonDefaults.shape,
                            colors = LiteVerButtonDefaults.primaryColors()
                        ) {
                            Icon(Icons.Rounded.Add, contentDescription = null)
                            Spacer(modifier = Modifier.width(spacing.small))
                            Text(strings.emptyStateAction)
                        }
                    },
                    modifier = Modifier.padding(spacing.medium)
                )
            }

            // FeedbackStateView: Success Type Demo
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = LiteverTheme.shapes.medium
            ) {
                FeedbackStateView(
                    title = "Operation Successful!",
                    description = "Your action has been processed and saved successfully.",
                    type = FeedbackStateType.SUCCESS,
                    action = {
                        Button(
                            onClick = {
                                scope.launch {
                                    snackbarHostState.showSnackbar("Success action clicked!")
                                }
                            },
                            shape = LiteVerButtonDefaults.shape,
                            colors = LiteVerButtonDefaults.successColors()
                        ) {
                            Icon(Icons.Rounded.Check, contentDescription = null)
                            Spacer(modifier = Modifier.width(spacing.small))
                            Text("Acknowledge")
                        }
                    },
                    modifier = Modifier.padding(spacing.medium)
                )
            }

            // FullScreenLoading Demo
            Button(
                onClick = { showLoadingOverlay = true },
                shape = LiteVerButtonDefaults.shape,
                colors = LiteVerButtonDefaults.secondaryColors(),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Trigger FullScreenLoading (2s)")
            }

            Spacer(modifier = Modifier.height(spacing.doubleLarge))
        }

        if (showLoadingOverlay) {
            FullScreenLoading(
                message = strings.loadingMessage
            )
        }

        SnackbarHost(
            hostState = snackbarHostState,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}
