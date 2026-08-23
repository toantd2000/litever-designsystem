package vn.io.litever.designsystem.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import vn.io.litever.designsystem.theme.LiteverTheme

/**
 * Standard Material 3 Circular Progress Indicator with Material 3 defaults.
 * Indeterminate version.
 */
@Composable
fun LiteverCircularProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = ProgressIndicatorDefaults.circularColor,
    strokeWidth: Dp = ProgressIndicatorDefaults.CircularStrokeWidth,
    trackColor: Color = ProgressIndicatorDefaults.circularIndeterminateTrackColor,
    strokeCap: StrokeCap = ProgressIndicatorDefaults.CircularIndeterminateStrokeCap,
) {
    CircularProgressIndicator(
        modifier = modifier,
        color = color,
        strokeWidth = strokeWidth,
        trackColor = trackColor,
        strokeCap = strokeCap
    )
}

/**
 * Standard Material 3 Circular Progress Indicator with Material 3 defaults.
 * Determinate version.
 */
@Composable
fun LiteverCircularProgressIndicator(
    progress: () -> Float,
    modifier: Modifier = Modifier,
    color: Color = ProgressIndicatorDefaults.circularColor,
    strokeWidth: Dp = ProgressIndicatorDefaults.CircularStrokeWidth,
    trackColor: Color = ProgressIndicatorDefaults.circularDeterminateTrackColor,
    strokeCap: StrokeCap = ProgressIndicatorDefaults.CircularDeterminateStrokeCap,
) {
    CircularProgressIndicator(
        progress = progress,
        modifier = modifier,
        color = color,
        strokeWidth = strokeWidth,
        trackColor = trackColor,
        strokeCap = strokeCap
    )
}

/**
 * Standard Material 3 Linear Progress Indicator with Material 3 defaults.
 * Indeterminate version.
 */
@Composable
fun LiteverLinearProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = ProgressIndicatorDefaults.linearColor,
    trackColor: Color = ProgressIndicatorDefaults.linearTrackColor,
    strokeCap: StrokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
) {
    LinearProgressIndicator(
        modifier = modifier,
        color = color,
        trackColor = trackColor,
        strokeCap = strokeCap
    )
}

/**
 * Standard Material 3 Linear Progress Indicator with Material 3 defaults.
 * Determinate version.
 */
@Composable
fun LiteverLinearProgressIndicator(
    progress: () -> Float,
    modifier: Modifier = Modifier,
    color: Color = ProgressIndicatorDefaults.linearColor,
    trackColor: Color = ProgressIndicatorDefaults.linearTrackColor,
    strokeCap: StrokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
) {
    LinearProgressIndicator(
        progress = progress,
        modifier = modifier,
        color = color,
        trackColor = trackColor,
        strokeCap = strokeCap
    )
}

@Preview(showBackground = true)
@Composable
fun LiteverProgressIndicatorPreview() {
    LiteverTheme {
        Surface(modifier = Modifier.padding(LiteverTheme.spacing.medium)) {
            val spacing = LiteverTheme.spacing
            Column {
                LiteverCircularProgressIndicator()
                Spacer(modifier = Modifier.height(spacing.medium))
                LiteverCircularProgressIndicator(progress = { 0.7f })
                Spacer(modifier = Modifier.height(spacing.medium))
                LiteverLinearProgressIndicator()
                Spacer(modifier = Modifier.height(spacing.medium))
                LiteverLinearProgressIndicator(progress = { 0.4f })
            }
        }
    }
}
