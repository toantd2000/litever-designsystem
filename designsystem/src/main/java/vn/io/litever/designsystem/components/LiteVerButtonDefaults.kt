package vn.io.litever.designsystem.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * Standard branded defaults for Material 3 buttons in Litever applications.
 *
 * Provides branded shapes, accessible color palettes, content paddings, and elevations
 * for standard [androidx.compose.material3.Button], [androidx.compose.material3.OutlinedButton],
 * and [androidx.compose.material3.TextButton].
 */
object LiteVerButtonDefaults {

    /**
     * Standard branded shape for Litever buttons.
     * Overrides Material 3's default pill shape with [LiteverTheme.shapes.medium].
     */
    val shape: Shape
        @Composable
        @ReadOnlyComposable
        get() = LiteverTheme.shapes.medium

    /**
     * Standard content padding for filled and outlined buttons.
     */
    val ContentPadding: PaddingValues = PaddingValues(
        horizontal = 24.dp,
        vertical = 10.dp
    )

    /**
     * Compact content padding for smaller buttons.
     */
    val SmallContentPadding: PaddingValues = PaddingValues(
        horizontal = 16.dp,
        vertical = 6.dp
    )

    /**
     * Content padding for text buttons.
     */
    val TextButtonContentPadding: PaddingValues = PaddingValues(
        horizontal = 12.dp,
        vertical = 8.dp
    )

    val MinHeight: Dp = 40.dp
    val MinWidth: Dp = 64.dp
    val IconSize: Dp = 18.dp
    val IconSpacing: Dp = 8.dp

    /**
     * Primary button colors using the active theme's primary palette.
     */
    @Composable
    fun primaryColors(
        containerColor: Color = MaterialTheme.colorScheme.primary,
        contentColor: Color = MaterialTheme.colorScheme.onPrimary,
        disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
        disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
    ): ButtonColors = ButtonDefaults.buttonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    /**
     * Secondary button colors using the active theme's secondary palette.
     */
    @Composable
    fun secondaryColors(
        containerColor: Color = MaterialTheme.colorScheme.secondary,
        contentColor: Color = MaterialTheme.colorScheme.onSecondary,
        disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
        disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
    ): ButtonColors = ButtonDefaults.buttonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    /**
     * Tonal button colors using the active theme's secondary container palette.
     */
    @Composable
    fun tonalColors(
        containerColor: Color = MaterialTheme.colorScheme.secondaryContainer,
        contentColor: Color = MaterialTheme.colorScheme.onSecondaryContainer,
        disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
        disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
    ): ButtonColors = ButtonDefaults.filledTonalButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    /**
     * Destructive / Error button colors for dangerous operations.
     */
    @Composable
    fun destructiveColors(
        containerColor: Color = MaterialTheme.colorScheme.error,
        contentColor: Color = MaterialTheme.colorScheme.onError,
        disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
        disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
    ): ButtonColors = ButtonDefaults.buttonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    /**
     * Success button colors for positive confirmations and completed flows.
     */
    @Composable
    fun successColors(
        containerColor: Color = LiteverTheme.colors.success,
        contentColor: Color = LiteverTheme.colors.onSuccess,
        disabledContainerColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
        disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
    ): ButtonColors = ButtonDefaults.buttonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    /**
     * Outlined button colors.
     */
    @Composable
    fun outlinedColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = MaterialTheme.colorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
    ): ButtonColors = ButtonDefaults.outlinedButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    /**
     * Text button colors.
     */
    @Composable
    fun textColors(
        containerColor: Color = Color.Transparent,
        contentColor: Color = MaterialTheme.colorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f)
    ): ButtonColors = ButtonDefaults.textButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    /**
     * Standard border stroke for [androidx.compose.material3.OutlinedButton].
     */
    @Composable
    fun outlinedBorder(
        enabled: Boolean = true,
        color: Color = MaterialTheme.colorScheme.outline,
        disabledColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
        width: Dp = 1.dp
    ): BorderStroke = BorderStroke(
        width = width,
        color = if (enabled) color else disabledColor
    )

    /**
     * Button elevation configuration.
     */
    @Composable
    fun elevation(
        defaultElevation: Dp = 1.dp,
        pressedElevation: Dp = 2.dp,
        focusedElevation: Dp = 1.dp,
        hoveredElevation: Dp = 2.dp,
        disabledElevation: Dp = 0.dp
    ): ButtonElevation = ButtonDefaults.buttonElevation(
        defaultElevation = defaultElevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        disabledElevation = disabledElevation
    )

    /**
     * Flat elevation with 0.dp across all interaction states.
     */
    @Composable
    fun flatElevation(): ButtonElevation = ButtonDefaults.buttonElevation(
        defaultElevation = 0.dp,
        pressedElevation = 0.dp,
        focusedElevation = 0.dp,
        hoveredElevation = 0.dp,
        disabledElevation = 0.dp
    )
}

/**
 * Type alias to support canonical camelCase spelling.
 */
typealias LiteverButtonDefaults = LiteVerButtonDefaults
