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
import vn.io.litever.designsystem.components.*
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.utils.LocalAppStrings

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputsScreen(modifier: Modifier = Modifier) {
    val strings = LocalAppStrings.current
    var buttonsEnabled by remember { mutableStateOf(true) }
    var textValue by remember { mutableStateOf("Litever") }
    var segmentedIndex by remember { mutableIntStateOf(0) }
    val options = listOf(strings.daily, strings.monthly, strings.yearly)
    var switchValue by remember { mutableStateOf(true) }
    
    var checkboxValue1 by remember { mutableStateOf(true) }
    var checkboxValue2 by remember { mutableStateOf(false) }
    var radioSelected by remember { mutableStateOf(options[0]) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Section: Buttons
        Text(
            text = strings.buttonsTitle,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        strings.enableButtons,
                        style = LiteverTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Medium
                    )
                    LiteverSwitch(
                        checked = buttonsEnabled,
                        onCheckedChange = { buttonsEnabled = it }
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))

                LiteverButton(
                    onClick = {},
                    enabled = buttonsEnabled,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(strings.primaryButton)
                }
                Spacer(modifier = Modifier.height(8.dp))

                LiteverOutlinedButton(
                    onClick = {},
                    enabled = buttonsEnabled,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(strings.outlinedButton)
                }
                Spacer(modifier = Modifier.height(8.dp))

                LiteverTextButton(
                    onClick = {},
                    enabled = buttonsEnabled,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(strings.textButton)
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        
        // Section: Icon Buttons
        Text(
            text = strings.iconButtonsTitle,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                LiteverIconButton(
                    onClick = {},
                    enabled = buttonsEnabled
                ) {
                    Icon(LiteverIcons.Rounded.Home, contentDescription = null)
                }
                
                LiteverFilledIconButton(
                    onClick = {},
                    enabled = buttonsEnabled
                ) {
                    Icon(LiteverIcons.Rounded.Add, contentDescription = null)
                }
                
                LiteverFilledTonalIconButton(
                    onClick = {},
                    enabled = buttonsEnabled
                ) {
                    Icon(LiteverIcons.Rounded.Settings, contentDescription = null)
                }
                
                LiteverOutlinedIconButton(
                    onClick = {},
                    enabled = buttonsEnabled
                ) {
                    Icon(LiteverIcons.Rounded.Person, contentDescription = null)
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Section: TextFields
        Text(
            text = strings.inputsTitle,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                LiteverTextField(
                    value = textValue,
                    onValueChange = { textValue = it },
                    label = strings.enterText,
                    placeholder = strings.placeholderText,
                    leadingIcon = { Icon(LiteverIcons.Rounded.Create, contentDescription = null) },
                    onClearClick = { textValue = "" },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                LiteverTextField(
                    value = "",
                    onValueChange = {},
                    label = strings.errorState,
                    isError = true,
                    supportingText = {
                        Text(strings.invalidInput)
                    },
                    leadingIcon = { Icon(LiteverIcons.Rounded.Warning, contentDescription = null) },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Section: Selection Controls
        Text(
            text = strings.selectionTitle,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    strings.segmentedRow,
                    style = LiteverTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                LiteverSingleChoiceSegmentedButtonRow(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    options.forEachIndexed { index, label ->
                        LiteverSegmentedButton(
                            selected = segmentedIndex == index,
                            onClick = { segmentedIndex = index },
                            label = { Text(label) }
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            strings.interactiveSwitch,
                            style = LiteverTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            "${strings.currentStatus}: ${if (switchValue) strings.statusOn else strings.statusOff}",
                            style = LiteverTheme.typography.bodyMedium,
                            color = LiteverTheme.colors.onSurfaceVariant
                        )
                    }
                    LiteverSwitch(
                        checked = switchValue,
                        onCheckedChange = { switchValue = it }
                    )
                }
                
                Spacer(modifier = Modifier.height(16.dp))
                
                Text(
                    strings.checkboxesTitle,
                    style = LiteverTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    LiteverCheckbox(
                        checked = checkboxValue1,
                        onCheckedChange = { checkboxValue1 = it }
                    )
                    Text("Option A", modifier = Modifier.padding(start = 8.dp))
                    Spacer(modifier = Modifier.width(16.dp))
                    LiteverCheckbox(
                        checked = checkboxValue2,
                        onCheckedChange = { checkboxValue2 = it }
                    )
                    Text("Option B", modifier = Modifier.padding(start = 8.dp))
                }
                
                Spacer(modifier = Modifier.height(16.dp))
                
                Text(
                    strings.radioButtonsTitle,
                    style = LiteverTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Column {
                    options.forEach { option ->
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            LiteverRadioButton(
                                selected = radioSelected == option,
                                onClick = { radioSelected = option }
                            )
                            Text(option, modifier = Modifier.padding(start = 8.dp))
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(80.dp))
    }
}

@Preview(showBackground = true, name = "Inputs Light Mode")
@Composable
fun InputsScreenLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(color = LiteverTheme.colors.background) {
            InputsScreen()
        }
    }
}

@Preview(showBackground = true, name = "Inputs Dark Mode")
@Composable
fun InputsScreenDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface(color = LiteverTheme.colors.background) {
            InputsScreen()
        }
    }
}
