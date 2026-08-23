package vn.io.litever.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import vn.io.litever.designsystem.theme.LiteverTheme

@Composable
fun LiteverCard(
    modifier: Modifier = Modifier,
    shape: Shape = LiteverTheme.shapes.medium,
    colors: CardColors = CardDefaults.cardColors(),
    elevation: CardElevation = CardDefaults.cardElevation(),
    border: BorderStroke? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        modifier = modifier,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        content = content
    )
}

@Composable
fun LiteverElevatedCard(
    modifier: Modifier = Modifier,
    shape: Shape = LiteverTheme.shapes.medium,
    colors: CardColors = CardDefaults.elevatedCardColors(),
    elevation: CardElevation = CardDefaults.elevatedCardElevation(),
    content: @Composable ColumnScope.() -> Unit,
) {
    ElevatedCard(
        modifier = modifier,
        shape = shape,
        colors = colors,
        elevation = elevation,
        content = content
    )
}

@Composable
fun LiteverOutlinedCard(
    modifier: Modifier = Modifier,
    shape: Shape = LiteverTheme.shapes.medium,
    colors: CardColors = CardDefaults.outlinedCardColors(),
    elevation: CardElevation = CardDefaults.outlinedCardElevation(),
    border: BorderStroke = CardDefaults.outlinedCardBorder(),
    content: @Composable ColumnScope.() -> Unit,
) {
    OutlinedCard(
        modifier = modifier,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        content = content
    )
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun LiteverCardPreview() {
    LiteverTheme(darkTheme = false) {
        Surface(modifier = Modifier.padding(LiteverTheme.spacing.medium)) {
            Column {
                LiteverCard(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Standard Card", modifier = Modifier.padding(LiteverTheme.spacing.medium))
                }
                Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                LiteverElevatedCard(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Elevated Card", modifier = Modifier.padding(LiteverTheme.spacing.medium))
                }
                Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                LiteverOutlinedCard(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Outlined Card", modifier = Modifier.padding(LiteverTheme.spacing.medium))
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Dark Mode")
@Composable
fun LiteverCardDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface(modifier = Modifier.padding(LiteverTheme.spacing.medium)) {
            Column {
                LiteverCard(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Standard Card", modifier = Modifier.padding(LiteverTheme.spacing.medium))
                }
                Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                LiteverElevatedCard(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Elevated Card", modifier = Modifier.padding(LiteverTheme.spacing.medium))
                }
                Spacer(modifier = Modifier.height(LiteverTheme.spacing.small))
                LiteverOutlinedCard(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Outlined Card", modifier = Modifier.padding(LiteverTheme.spacing.medium))
                }
            }
        }
    }
}
