package vn.io.litever.designsystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.ErrorOutline
import androidx.compose.material.icons.rounded.Inbox
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.components.button.LvButton
import vn.io.litever.designsystem.components.core.LvSemantic
import vn.io.litever.designsystem.theme.LiteverSpacing
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * Type of feedback to communicate through [FeedbackStateView].
 */
enum class FeedbackStateType {
    EMPTY,
    SUCCESS,
    ERROR,
    INFO
}

/**
 * Universal feedback and status screen/view for Litever applications (String convenience overload).
 *
 * @param title The primary headline describing the condition.
 * @param modifier The modifier to apply to this composable.
 * @param description Optional supporting text with explanation or instructions.
 * @param type The semantic feedback type ([FeedbackStateType.EMPTY], [FeedbackStateType.SUCCESS], [FeedbackStateType.ERROR], [FeedbackStateType.INFO]).
 * @param icon Optional vector icon override (defaults based on [type]).
 * @param iconSize Size of the icon.
 * @param badgeColor Color for the optional circular badge background.
 * @param iconTint Color for the icon tint.
 * @param titleStyle Custom TextStyle for the title (defaults to [LiteverTheme.typography.titleLarge] with bold weight).
 * @param titleColor Custom text color for the title (defaults to [MaterialTheme.colorScheme.onSurface]).
 * @param descriptionStyle Custom TextStyle for the description (defaults to [LiteverTheme.typography.bodyMedium]).
 * @param descriptionColor Custom text color for the description (defaults to [MaterialTheme.colorScheme.onSurfaceVariant]).
 * @param maxContentWidth Maximum width constraint for text content.
 * @param illustration Custom illustration composable slot (takes precedence over [icon]).
 * @param action Optional action button slot (typically an [LvButton]).
 */
@Composable
fun FeedbackStateView(
    title: String,
    modifier: Modifier = Modifier,
    description: String? = null,
    type: FeedbackStateType = FeedbackStateType.EMPTY,
    icon: ImageVector? = null,
    iconSize: Dp = if (type == FeedbackStateType.EMPTY) LiteverSpacing().tripleLarge else (LiteverSpacing().extraLarge + LiteverSpacing().extraSmall),
    badgeColor: Color? = when (type) {
        FeedbackStateType.SUCCESS -> LiteverTheme.colors.successContainer
        FeedbackStateType.ERROR -> MaterialTheme.colorScheme.errorContainer
        FeedbackStateType.INFO -> MaterialTheme.colorScheme.secondaryContainer
        FeedbackStateType.EMPTY -> null
    },
    iconTint: Color = when (type) {
        FeedbackStateType.SUCCESS -> LiteverTheme.colors.onSuccessContainer
        FeedbackStateType.ERROR -> MaterialTheme.colorScheme.onErrorContainer
        FeedbackStateType.INFO -> MaterialTheme.colorScheme.onSecondaryContainer
        FeedbackStateType.EMPTY -> MaterialTheme.colorScheme.primary.copy(alpha = 0.8f)
    },
    titleStyle: TextStyle = LiteverTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
    titleColor: Color = MaterialTheme.colorScheme.onSurface,
    descriptionStyle: TextStyle = LiteverTheme.typography.bodyMedium,
    descriptionColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    maxContentWidth: Dp = 360.dp,
    illustration: @Composable (() -> Unit)? = null,
    descriptionSlot: @Composable (() -> Unit)? = null,
    action: @Composable (() -> Unit)? = null,
) {
    FeedbackStateView(
        modifier = modifier,
        title = {
            Text(
                text = title,
                style = titleStyle,
                color = titleColor,
                textAlign = TextAlign.Center,
                modifier = Modifier.widthIn(max = maxContentWidth)
            )
        },
        description = descriptionSlot ?: description?.let { desc ->
            {
                Text(
                    text = desc,
                    style = descriptionStyle,
                    color = descriptionColor,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.widthIn(max = maxContentWidth)
                )
            }
        },
        type = type,
        icon = icon,
        iconSize = iconSize,
        badgeColor = badgeColor,
        iconTint = iconTint,
        illustration = illustration,
        action = action
    )
}

/**
 * Universal feedback and status screen/view for Litever applications (Composable slot overload).
 *
 * @param modifier The modifier to apply to this composable.
 * @param title Optional composable slot for title.
 * @param description Optional composable slot for description/content.
 * @param type The semantic feedback type ([FeedbackStateType.EMPTY], [FeedbackStateType.SUCCESS], [FeedbackStateType.ERROR], [FeedbackStateType.INFO]).
 * @param icon Optional vector icon override (defaults based on [type]).
 * @param iconSize Size of the icon.
 * @param badgeColor Color for the optional circular badge background.
 * @param iconTint Color for the icon tint.
 * @param illustration Custom illustration composable slot (takes precedence over [icon]).
 * @param action Optional action button slot (typically an [LvButton]).
 */
@Composable
fun FeedbackStateView(
    modifier: Modifier = Modifier,
    title: @Composable (() -> Unit)? = null,
    description: @Composable (() -> Unit)? = null,
    type: FeedbackStateType = FeedbackStateType.EMPTY,
    icon: ImageVector? = null,
    iconSize: Dp = if (type == FeedbackStateType.EMPTY) LiteverSpacing().tripleLarge else (LiteverSpacing().extraLarge + LiteverSpacing().extraSmall),
    badgeColor: Color? = when (type) {
        FeedbackStateType.SUCCESS -> LiteverTheme.colors.successContainer
        FeedbackStateType.ERROR -> MaterialTheme.colorScheme.errorContainer
        FeedbackStateType.INFO -> MaterialTheme.colorScheme.secondaryContainer
        FeedbackStateType.EMPTY -> null
    },
    iconTint: Color = when (type) {
        FeedbackStateType.SUCCESS -> LiteverTheme.colors.onSuccessContainer
        FeedbackStateType.ERROR -> MaterialTheme.colorScheme.onErrorContainer
        FeedbackStateType.INFO -> MaterialTheme.colorScheme.onSecondaryContainer
        FeedbackStateType.EMPTY -> MaterialTheme.colorScheme.primary.copy(alpha = 0.8f)
    },
    illustration: @Composable (() -> Unit)? = null,
    action: @Composable (() -> Unit)? = null,
) {
    val spacing = LiteverTheme.spacing

    val defaultIcon = when (type) {
        FeedbackStateType.EMPTY -> Icons.Rounded.Inbox
        FeedbackStateType.SUCCESS -> Icons.Rounded.Check
        FeedbackStateType.ERROR -> Icons.Rounded.ErrorOutline
        FeedbackStateType.INFO -> Icons.Rounded.Info
    }
    val effectiveIcon = icon ?: defaultIcon

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(spacing.large),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        when {
            illustration != null -> {
                illustration()
                Spacer(modifier = Modifier.height(spacing.mediumLarge))
            }
            badgeColor != null -> {
                Box(
                    modifier = Modifier
                        .size(spacing.tripleLarge + spacing.small)
                        .clip(CircleShape)
                        .background(badgeColor),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = effectiveIcon,
                        contentDescription = null,
                        modifier = Modifier.size(iconSize),
                        tint = iconTint
                    )
                }
                Spacer(modifier = Modifier.height(spacing.large))
            }
            else -> {
                Icon(
                    imageVector = effectiveIcon,
                    contentDescription = null,
                    modifier = Modifier.size(iconSize),
                    tint = iconTint
                )
                Spacer(modifier = Modifier.height(spacing.mediumLarge))
            }
        }

        if (title != null) {
            title()
        }

        if (description != null) {
            if (title != null) {
                Spacer(modifier = Modifier.height(spacing.small))
            }
            description()
        }

        if (action != null) {
            Spacer(modifier = Modifier.height(spacing.large))
            action()
        }
    }
}

// ==========================================
// PREVIEWS
// ==========================================

@Preview(showBackground = true, name = "1. Empty State - Light")
@Composable
fun FeedbackStateViewEmptyLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface {
            FeedbackStateView(
                title = "No Transactions Found",
                description = "You haven't recorded any expenses or income for this period. Start by adding one below.",
                type = FeedbackStateType.EMPTY,
                action = {
                    LvButton(
                        onClick = {},
                        semantic = LvSemantic.Primary
                    ) {
                        Text("Add Transaction")
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "2. Success State - Light")
@Composable
fun FeedbackStateViewSuccessLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface {
            FeedbackStateView(
                title = "Payment Successful!",
                description = "Your transaction #TX-98421 has been recorded and a receipt was sent to your email.",
                type = FeedbackStateType.SUCCESS,
                action = {
                    LvButton(
                        onClick = {},
                        semantic = LvSemantic.Success
                    ) {
                        Text("Complete Flow")
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "3. Error State - Light")
@Composable
fun FeedbackStateViewErrorLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface {
            FeedbackStateView(
                title = "Sync Failed",
                description = "We couldn't connect to the server to update your budget. Please check your network and try again.",
                type = FeedbackStateType.ERROR,
                action = {
                    LvButton(
                        onClick = {},
                        semantic = LvSemantic.Destructive
                    ) {
                        Text("Retry Connection")
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "4. Info State - Light")
@Composable
fun FeedbackStateViewInfoLightPreview() {
    LiteverTheme(darkTheme = false) {
        Surface {
            FeedbackStateView(
                title = "New Features Available",
                description = "Update to the latest version to unlock multi-currency wallet support and automated analytics.",
                type = FeedbackStateType.INFO,
                action = {
                    LvButton(
                        onClick = {},
                        semantic = LvSemantic.Secondary
                    ) {
                        Text("Learn More")
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "5. Success State - Dark Mode")
@Composable
fun FeedbackStateViewSuccessDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface {
            FeedbackStateView(
                title = "Goal Achieved!",
                description = "Congratulations! You've reached your monthly savings target in FinLog.",
                type = FeedbackStateType.SUCCESS,
                action = {
                    LvButton(
                        onClick = {},
                        semantic = LvSemantic.Success
                    ) {
                        Text("View Summary")
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true, name = "6. Error State - Dark Mode")
@Composable
fun FeedbackStateViewErrorDarkPreview() {
    LiteverTheme(darkTheme = true) {
        Surface {
            FeedbackStateView(
                title = "Unable to Load Data",
                description = "Something went wrong while retrieving your reminders.",
                type = FeedbackStateType.ERROR,
                action = {
                    LvButton(
                        onClick = {},
                        semantic = LvSemantic.Destructive
                    ) {
                        Text("Try Again")
                    }
                }
            )
        }
    }
}
