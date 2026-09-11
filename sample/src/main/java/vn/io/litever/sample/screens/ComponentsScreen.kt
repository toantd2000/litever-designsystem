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
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import vn.io.litever.designsystem.components.FeedbackStateType
import vn.io.litever.designsystem.components.FeedbackStateView
import vn.io.litever.designsystem.components.FullScreenLoading
import vn.io.litever.designsystem.components.dialog.LvAlertDialog
import vn.io.litever.designsystem.components.button.LvButton
import vn.io.litever.designsystem.components.button.LvButtonType
import vn.io.litever.designsystem.components.chip.LvChip
import vn.io.litever.designsystem.components.button.LvIconButton
import vn.io.litever.designsystem.components.core.LvSemantic
import vn.io.litever.designsystem.components.textfield.LvTextField
import vn.io.litever.designsystem.components.textfield.LvTextFieldType
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
    var showDialog by remember { mutableStateOf(false) }
    var selectedChipIndex by remember { mutableIntStateOf(0) }
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
            // 1. OPINIONATED COMPONENTS: LVBUTTON (Matrix Demo)
            // ==========================================
            Text(
                text = "1. Opinionated LvButton (Type x Semantic)",
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
                        text = "Clean LvButton API automatically applying 6.dp shape & semantic colors",
                        style = LiteverTheme.typography.labelMedium,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )

                    // Primary Filled
                    LvButton(
                        onClick = { scope.launch { snackbarHostState.showSnackbar("Primary LvButton clicked") } },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(Icons.AutoMirrored.Rounded.Send, contentDescription = null)
                        Spacer(modifier = Modifier.width(spacing.small))
                        Text("Primary Filled (Default)")
                    }

                    // Success Filled
                    LvButton(
                        onClick = { scope.launch { snackbarHostState.showSnackbar("Success LvButton clicked") } },
                        semantic = LvSemantic.Success,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(Icons.Rounded.Check, contentDescription = null)
                        Spacer(modifier = Modifier.width(spacing.small))
                        Text("Success Filled")
                    }

                    // Tertiary Filled
                    LvButton(
                        onClick = { scope.launch { snackbarHostState.showSnackbar("Tertiary LvButton clicked") } },
                        semantic = LvSemantic.Tertiary,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Tertiary Filled")
                    }

                    // Neutral Tonal
                    LvButton(
                        onClick = { scope.launch { snackbarHostState.showSnackbar("Neutral LvButton clicked") } },
                        type = LvButtonType.Tonal,
                        semantic = LvSemantic.Neutral,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Neutral Tonal")
                    }

                    // Destructive Outlined
                    LvButton(
                        onClick = { scope.launch { snackbarHostState.showSnackbar("Destructive Outlined clicked") } },
                        type = LvButtonType.Outlined,
                        semantic = LvSemantic.Destructive,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(Icons.Rounded.Delete, contentDescription = null)
                        Spacer(modifier = Modifier.width(spacing.small))
                        Text("Destructive Outlined")
                    }

                    // Warning Tonal
                    LvButton(
                        onClick = { scope.launch { snackbarHostState.showSnackbar("Warning Tonal clicked") } },
                        type = LvButtonType.Tonal,
                        semantic = LvSemantic.Warning,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Warning Tonal")
                    }

                    // Secondary Text
                    LvButton(
                        onClick = { scope.launch { snackbarHostState.showSnackbar("Secondary Text clicked") } },
                        type = LvButtonType.Text,
                        semantic = LvSemantic.Secondary,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Secondary Text Button")
                    }

                    Spacer(modifier = Modifier.height(spacing.tiny))
                    HorizontalDivider()
                    Spacer(modifier = Modifier.height(spacing.tiny))

                    Text(
                        text = "Opinionated LvIconButton (Squircle 6.dp Shape)",
                        style = LiteverTheme.typography.labelMedium,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(spacing.small)
                    ) {
                        // Filled Primary
                        LvIconButton(
                            onClick = { scope.launch { snackbarHostState.showSnackbar("Filled Icon clicked") } },
                            type = LvButtonType.Filled,
                            semantic = LvSemantic.Primary
                        ) {
                            Icon(Icons.AutoMirrored.Rounded.Send, contentDescription = "Send")
                        }

                        // Success Tonal
                        LvIconButton(
                            onClick = { scope.launch { snackbarHostState.showSnackbar("Tonal Success Icon clicked") } },
                            type = LvButtonType.Tonal,
                            semantic = LvSemantic.Success
                        ) {
                            Icon(Icons.Rounded.Check, contentDescription = "Success")
                        }

                        // Tertiary Tonal
                        LvIconButton(
                            onClick = { scope.launch { snackbarHostState.showSnackbar("Tonal Tertiary Icon clicked") } },
                            type = LvButtonType.Tonal,
                            semantic = LvSemantic.Tertiary
                        ) {
                            Icon(Icons.Rounded.Inbox, contentDescription = "Tertiary")
                        }

                        // Destructive Outlined
                        LvIconButton(
                            onClick = { scope.launch { snackbarHostState.showSnackbar("Outlined Destructive Icon clicked") } },
                            type = LvButtonType.Outlined,
                            semantic = LvSemantic.Destructive
                        ) {
                            Icon(Icons.Rounded.Delete, contentDescription = "Delete")
                        }

                        // Neutral Standard Icon
                        LvIconButton(
                            onClick = { scope.launch { snackbarHostState.showSnackbar("Neutral Icon clicked") } },
                            type = LvButtonType.Text,
                            semantic = LvSemantic.Neutral
                        ) {
                            Icon(Icons.Rounded.Search, contentDescription = "Search")
                        }
                    }
                }
            }

            // ==========================================
            // 2. OPINIONATED COMPONENTS: LVCHIP
            // ==========================================
            Text(
                text = "2. Opinionated LvChip (Squircle 6.dp)",
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
                        text = "LvChip replaces M3 pill shape with brand 6.dp squircle and semantic states",
                        style = LiteverTheme.typography.labelMedium,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(spacing.small)
                    ) {
                        LvChip(
                            selected = selectedChipIndex == 0,
                            onClick = { selectedChipIndex = 0 },
                            label = "Primary",
                            semantic = LvSemantic.Primary
                        )
                        LvChip(
                            selected = selectedChipIndex == 1,
                            onClick = { selectedChipIndex = 1 },
                            label = "Tertiary",
                            semantic = LvSemantic.Tertiary
                        )
                        LvChip(
                            selected = selectedChipIndex == 2,
                            onClick = { selectedChipIndex = 2 },
                            label = "Neutral",
                            semantic = LvSemantic.Neutral
                        )
                        LvChip(
                            selected = selectedChipIndex == 3,
                            onClick = { selectedChipIndex = 3 },
                            label = "Success",
                            semantic = LvSemantic.Success
                        )
                    }
                }
            }

            // ==========================================
            // 3. OPINIONATED COMPONENTS: LVTEXTFIELD
            // ==========================================
            Text(
                text = "3. Opinionated LvTextField (Outlined & Filled)",
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
                        text = "Supports both Outlined and Filled styles, with integrated error text & semantics",
                        style = LiteverTheme.typography.labelMedium,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )

                    // Outlined Style
                    LvTextField(
                        value = textInput,
                        onValueChange = { textInput = it },
                        type = LvTextFieldType.Outlined,
                        label = "Outlined Style",
                        placeholder = "Enter text...",
                        leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null) },
                        trailingIcon = if (textInput.isNotEmpty()) {
                            {
                                IconButton(onClick = { textInput = "" }) {
                                    Icon(Icons.Rounded.Clear, contentDescription = "Clear")
                                }
                            }
                        } else null,
                        modifier = Modifier.fillMaxWidth()
                    )

                    // Filled Style
                    LvTextField(
                        value = textInput,
                        onValueChange = { textInput = it },
                        type = LvTextFieldType.Filled,
                        label = "Filled Style",
                        placeholder = "Enter text...",
                        modifier = Modifier.fillMaxWidth()
                    )

                    // LvTextField with Error State
                    LvTextField(
                        value = textInput,
                        onValueChange = { textInput = it },
                        label = "Field with Error",
                        errorMessage = if (textInput.isEmpty()) "This field cannot be blank" else null,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            // ==========================================
            // 4. OPINIONATED COMPONENTS: LVALERTDIALOG
            // ==========================================
            Text(
                text = "4. Opinionated LvAlertDialog",
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
                        text = "Standard dialog with 10.dp rounded corners and integrated action buttons",
                        style = LiteverTheme.typography.labelMedium,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )

                    LvButton(
                        onClick = { showDialog = true },
                        type = LvButtonType.Outlined,
                        semantic = LvSemantic.Destructive,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Open LvAlertDialog Demo")
                    }
                }
            }

            if (showDialog) {
                LvAlertDialog(
                    onDismissRequest = { showDialog = false },
                    title = { Text("Delete Confirmation") },
                    text = { Text("Are you sure you want to delete this sample record? This uses the new LvAlertDialog component.") },
                    confirmButton = {
                        LvButton(
                            onClick = {
                                showDialog = false
                                scope.launch { snackbarHostState.showSnackbar("Item deleted!") }
                            },
                            semantic = LvSemantic.Destructive
                        ) {
                            Text("Delete")
                        }
                    },
                    dismissButton = {
                        LvButton(
                            onClick = { showDialog = false },
                            type = LvButtonType.Outlined,
                            semantic = LvSemantic.Secondary
                        ) {
                            Text("Cancel")
                        }
                    }
                )
            }

            // ==========================================
            // 5. SHARED UI VIEWS
            // ==========================================
            Text(
                text = "5. Shared UI Views (Universal)",
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
                        LvButton(
                            onClick = {
                                scope.launch {
                                    snackbarHostState.showSnackbar("Empty state action triggered!")
                                }
                            },
                            semantic = LvSemantic.Primary
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
                        LvButton(
                            onClick = {
                                scope.launch {
                                    snackbarHostState.showSnackbar("Success action clicked!")
                                }
                            },
                            semantic = LvSemantic.Success
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
            LvButton(
                onClick = { showLoadingOverlay = true },
                type = LvButtonType.Filled,
                semantic = LvSemantic.Secondary,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Trigger FullScreenLoading (2s)")
            }

            // ==========================================
            // 6. OPINIONATED COMPONENTS: LVSNACKBAR
            // ==========================================
            Text(
                text = "6. Opinionated LvSnackbar",
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
                        text = "Snackbar with semantic colors and 6.dp rounded corners.",
                        style = LiteverTheme.typography.labelMedium,
                        color = LiteverTheme.colors.onSurfaceVariant
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(spacing.small)
                    ) {
                        LvButton(
                            onClick = {
                                scope.launch {
                                    snackbarHostState.showSnackbar(
                                        vn.io.litever.designsystem.components.snackbar.LvSnackbarVisuals(
                                            message = "Task completed successfully!",
                                            actionLabel = "Undo",
                                            semantic = LvSemantic.Success
                                        )
                                    )
                                }
                            },
                            semantic = LvSemantic.Success,
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Success")
                        }

                        LvButton(
                            onClick = {
                                scope.launch {
                                    snackbarHostState.showSnackbar(
                                        vn.io.litever.designsystem.components.snackbar.LvSnackbarVisuals(
                                            message = "Warning: Check your connection.",
                                            semantic = LvSemantic.Warning
                                        )
                                    )
                                }
                            },
                            semantic = LvSemantic.Warning,
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Warning")
                        }
                    }

                    LvButton(
                        onClick = {
                            scope.launch {
                                snackbarHostState.showSnackbar(
                                    vn.io.litever.designsystem.components.snackbar.LvSnackbarVisuals(
                                        message = "Error: Failed to save data.",
                                        actionLabel = "Retry",
                                        semantic = LvSemantic.Destructive
                                    )
                                )
                            }
                        },
                        semantic = LvSemantic.Destructive,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Destructive Snackbar")
                    }
                }
            }

            Spacer(modifier = Modifier.height(spacing.doubleLarge))
        }

        if (showLoadingOverlay) {
            FullScreenLoading(
                message = strings.loadingMessage
            )
        }

        vn.io.litever.designsystem.components.snackbar.LvSnackbarHost(
            hostState = snackbarHostState,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}

@Preview(showBackground = true, name = "Components Light Mode")
@Composable
fun ComponentsScreenLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(color = LiteverTheme.colors.background) {
            ComponentsScreen()
        }
    }
}

@Preview(showBackground = true, name = "Components Dark Mode")
@Composable
fun ComponentsScreenDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface(color = LiteverTheme.colors.background) {
            ComponentsScreen()
        }
    }
}

