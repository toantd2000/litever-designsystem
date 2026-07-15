package vn.io.litever.sample.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import vn.io.litever.designsystem.theme.LiteverIcons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.automirrored.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import vn.io.litever.designsystem.components.*
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.utils.LocalAppStrings

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DialogsScreen(modifier: Modifier = Modifier) {
    val strings = LocalAppStrings.current
    var showAlertDialog by remember { mutableStateOf(false) }
    var showTimePickerDialog by remember { mutableStateOf(false) }
    var showDatePickerDialog by remember { mutableStateOf(false) }
    var showBottomSheet by remember { mutableStateOf(false) }
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    var selectedTimeText by remember { mutableStateOf("") }
    val displaySelectedTime = if (selectedTimeText.isEmpty()) strings.notSelected else selectedTimeText
    val timePickerState = rememberTimePickerState()

    var selectedDateText by remember { mutableStateOf("") }
    val displaySelectedDate = if (selectedDateText.isEmpty()) strings.notSelected else selectedDateText
    val datePickerState = rememberDatePickerState()

    // Automatic progress animation state
    var progressVal by remember { mutableStateOf(0f) }
    LaunchedEffect(Unit) {
        while (true) {
            delay(50)
            progressVal += 0.01f
            if (progressVal > 1f) progressVal = 0f
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Section: Dialogs
        Text(
            text = strings.dialogsHeader,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.tertiary,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                LiteverButton(
                    onClick = { showAlertDialog = true },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(LiteverIcons.Rounded.Warning, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(strings.openAlertDialog)
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                LiteverOutlinedButton(
                    onClick = { showTimePickerDialog = true },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(LiteverIcons.Rounded.AccessTime, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(strings.openTimePickerDialog)
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                LiteverOutlinedButton(
                    onClick = { showDatePickerDialog = true },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(LiteverIcons.Rounded.DateRange, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Open Date Picker Dialog")
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "${strings.selectedTime}: $displaySelectedTime",
                    style = LiteverTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    color = LiteverTheme.colors.onSurfaceVariant
                )

                Text(
                    text = "Selected Date: $displaySelectedDate",
                    style = LiteverTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    color = LiteverTheme.colors.onSurfaceVariant
                )
            }
        }
        
        Spacer(modifier = Modifier.height(16.dp))

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                LiteverButton(
                    onClick = { showBottomSheet = true },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(strings.openBottomSheet)
                }

                Spacer(modifier = Modifier.height(12.dp))

                LiteverOutlinedButton(
                    onClick = {
                        scope.launch {
                            snackbarHostState.showSnackbar(strings.snackbarTitle)
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(strings.openSnackbar)
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Section: Progress Indicators
        Text(
            text = strings.progressDialogs,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.tertiary,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                // Indeterminate Progress
                Text(
                    strings.indeterminateProgress,
                    style = LiteverTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    LiteverCircularProgressIndicator()
                    Spacer(modifier = Modifier.width(16.dp))
                    LiteverLinearProgressIndicator(modifier = Modifier.weight(1f))
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Determinate Progress (Animated loop)
                Text(
                    strings.determinateProgress,
                    style = LiteverTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    "${strings.runningProgress}: ${(progressVal * 100).toInt()}%",
                    style = LiteverTheme.typography.bodyMedium,
                    color = LiteverTheme.colors.onSurfaceVariant,
                    modifier = Modifier.padding(bottom = 12.dp)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    LiteverCircularProgressIndicator(
                        progress = { progressVal }
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    LiteverLinearProgressIndicator(
                        progress = { progressVal },
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(80.dp))
    }

    // Dialog Rendering
    if (showAlertDialog) {
        LiteverAlertDialog(
            onDismissRequest = { showAlertDialog = false },
            confirmButtonText = strings.alertConfirm,
            onConfirmClick = { showAlertDialog = false },
            dismissButtonText = strings.alertDismiss,
            onDismissClick = { showAlertDialog = false },
            title = strings.alertTitle,
            text = strings.alertDesc
        )
    }

    if (showTimePickerDialog) {
        LiteverTimePickerDialog(
            title = strings.selectedTime,
            onDismissRequest = { showTimePickerDialog = false },
            confirmButtonText = strings.alertConfirm,
            onConfirmClick = {
                selectedTimeText = String.format("%02d:%02d", timePickerState.hour, timePickerState.minute)
                showTimePickerDialog = false
            },
            dismissButtonText = strings.alertDismiss,
            onDismissClick = { showTimePickerDialog = false }
        ) {
            TimePicker(state = timePickerState)
        }
    }

    if (showDatePickerDialog) {
        LiteverDatePickerDialog(
            onDismissRequest = { showDatePickerDialog = false },
            confirmButtonText = strings.alertConfirm,
            onConfirmClick = {
                val selectedMillis = datePickerState.selectedDateMillis
                selectedDateText = if (selectedMillis != null) {
                    val date = java.util.Date(selectedMillis)
                    val format = java.text.SimpleDateFormat("MMM dd, yyyy", java.util.Locale.getDefault())
                    format.format(date)
                } else {
                    ""
                }
                showDatePickerDialog = false
            },
            dismissButtonText = strings.alertDismiss,
            onDismissClick = { showDatePickerDialog = false }
        ) {
            DatePicker(state = datePickerState)
        }
    }
    
    if (showBottomSheet) {
        LiteverModalBottomSheet(
            onDismissRequest = { showBottomSheet = false }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = strings.bottomSheetTitle,
                    style = LiteverTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "This is the content of the bottom sheet.",
                    style = LiteverTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(32.dp))
                LiteverButton(onClick = { showBottomSheet = false }) {
                    Text("Close")
                }
            }
        }
    }
    
    // Local SnackbarHost
    Box(modifier = Modifier.fillMaxSize()) {
        LiteverSnackbarHost(
            hostState = snackbarHostState,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}

@Preview(showBackground = true, name = "Dialogs Light Mode")
@Composable
fun DialogsScreenLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(color = LiteverTheme.colors.background) {
            DialogsScreen()
        }
    }
}

@Preview(showBackground = true, name = "Dialogs Dark Mode")
@Composable
fun DialogsScreenDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface(color = LiteverTheme.colors.background) {
            DialogsScreen()
        }
    }
}
