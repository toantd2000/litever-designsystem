package vn.io.litever.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Create
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import vn.io.litever.designsystem.components.LiteverButton
import vn.io.litever.designsystem.components.LiteverCard
import vn.io.litever.designsystem.components.LiteverCheckbox
import vn.io.litever.designsystem.components.LiteverFilledIconButton
import vn.io.litever.designsystem.components.LiteverFilledTonalIconButton
import vn.io.litever.designsystem.components.LiteverIconButton
import vn.io.litever.designsystem.components.LiteverOutlinedButton
import vn.io.litever.designsystem.components.LiteverOutlinedIconButton
import vn.io.litever.designsystem.components.LiteverOutlinedTextField
import vn.io.litever.designsystem.components.LiteverPasswordTextField
import vn.io.litever.designsystem.components.LiteverRadioButton
import vn.io.litever.designsystem.components.LiteverSearchTextField
import vn.io.litever.designsystem.components.LiteverSegmentedButton
import vn.io.litever.designsystem.components.LiteverSingleChoiceSegmentedButtonRow
import vn.io.litever.designsystem.components.LiteverSwitch
import vn.io.litever.designsystem.components.LiteverTextButton
import vn.io.litever.designsystem.components.LiteverTextField
import vn.io.litever.designsystem.theme.LiteverIcons
import vn.io.litever.designsystem.theme.LiteverTheme
import vn.io.litever.sample.utils.LocalAppStrings

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputsScreen(modifier: Modifier = Modifier) {
    val strings = LocalAppStrings.current
    val spacing = LiteverTheme.spacing
    
    var buttonsEnabled by remember { mutableStateOf(true) }
    var textValue by remember { mutableStateOf("Litever") }
    var passwordValue by remember { mutableStateOf("") }
    var searchValue by remember { mutableStateOf("") }
    
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
            .padding(spacing.medium)
    ) {
        // Section: Buttons
        Text(
            text = strings.buttonsTitle,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = spacing.small)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(spacing.medium)) {
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
                Spacer(modifier = Modifier.height(spacing.medium))

                LiteverButton(
                    onClick = {},
                    enabled = buttonsEnabled,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(strings.primaryButton)
                }
                Spacer(modifier = Modifier.height(spacing.small))

                LiteverOutlinedButton(
                    onClick = {},
                    enabled = buttonsEnabled,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(strings.outlinedButton)
                }
                Spacer(modifier = Modifier.height(spacing.small))

                LiteverTextButton(
                    onClick = {},
                    enabled = buttonsEnabled,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(strings.textButton)
                }
            }
        }

        Spacer(modifier = Modifier.height(spacing.mediumLarge))
        
        // Section: Icon Buttons
        Text(
            text = strings.iconButtonsTitle,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = spacing.small)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(spacing.medium),
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

        Spacer(modifier = Modifier.height(spacing.mediumLarge))

        // Section: TextFields
        Text(
            text = strings.inputsTitle,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = spacing.small)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(spacing.medium)) {
                Text("Standard Variants", style = LiteverTheme.typography.labelMedium)
                Spacer(modifier = Modifier.height(spacing.extraSmall))
                
                LiteverTextField(
                    value = textValue,
                    onValueChange = { textValue = it },
                    label = strings.enterText,
                    placeholder = strings.placeholderText,
                    leadingIcon = { Icon(LiteverIcons.Rounded.Create, contentDescription = null) },
                    showClearButton = true,
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(spacing.medium))

                LiteverOutlinedTextField(
                    value = textValue,
                    onValueChange = { textValue = it },
                    label = "Outlined Style",
                    placeholder = strings.placeholderText,
                    showClearButton = true,
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(spacing.mediumLarge))
                Text("Specialized Fields", style = LiteverTheme.typography.labelMedium)
                Spacer(modifier = Modifier.height(spacing.extraSmall))

                LiteverPasswordTextField(
                    value = passwordValue,
                    onValueChange = { passwordValue = it },
                    label = "Password Field",
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(spacing.medium))

                LiteverSearchTextField(
                    value = searchValue,
                    onValueChange = { searchValue = it },
                    placeholder = "Search something...",
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(spacing.mediumLarge))
                Text("Error State", style = LiteverTheme.typography.labelMedium)
                Spacer(modifier = Modifier.height(spacing.extraSmall))

                LiteverOutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = strings.errorState,
                    isError = true,
                    supportingText = strings.invalidInput,
                    leadingIcon = { Icon(LiteverIcons.Rounded.Warning, contentDescription = null) },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Spacer(modifier = Modifier.height(spacing.mediumLarge))

        // Section: Selection Controls
        Text(
            text = strings.selectionTitle,
            style = LiteverTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = LiteverTheme.colors.primary,
            modifier = Modifier.padding(bottom = spacing.small)
        )

        LiteverCard(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(spacing.medium)) {
                Text(
                    strings.segmentedRow,
                    style = LiteverTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(bottom = spacing.small)
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

                Spacer(modifier = Modifier.height(spacing.medium))

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
                
                Spacer(modifier = Modifier.height(spacing.medium))
                
                Text(
                    strings.checkboxesTitle,
                    style = LiteverTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(bottom = spacing.small)
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    LiteverCheckbox(
                        checked = checkboxValue1,
                        onCheckedChange = { checkboxValue1 = it }
                    )
                    Text("Option A", modifier = Modifier.padding(start = spacing.small))
                    Spacer(modifier = Modifier.width(spacing.medium))
                    LiteverCheckbox(
                        checked = checkboxValue2,
                        onCheckedChange = { checkboxValue2 = it }
                    )
                    Text("Option B", modifier = Modifier.padding(start = spacing.small))
                }
                
                Spacer(modifier = Modifier.height(spacing.medium))
                
                Text(
                    strings.radioButtonsTitle,
                    style = LiteverTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(bottom = spacing.small)
                )
                Column {
                    options.forEach { option ->
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            LiteverRadioButton(
                                selected = radioSelected == option,
                                onClick = { radioSelected = option }
                            )
                            Text(option, modifier = Modifier.padding(start = spacing.small))
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(spacing.tripleLarge + spacing.medium))
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
