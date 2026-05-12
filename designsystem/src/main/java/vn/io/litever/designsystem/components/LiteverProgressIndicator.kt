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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import vn.io.litever.designsystem.theme.LiteverTheme

@Composable
fun LiteverCircularProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = LiteverTheme.colors.primary,
    strokeWidth: Dp = ProgressIndicatorDefaults.CircularStrokeWidth,
    trackColor: Color = ProgressIndicatorDefaults.circularIndeterminateTrackColor
) {
    CircularProgressIndicator(
        modifier = modifier,
        color = color,
        strokeWidth = strokeWidth,
        trackColor = trackColor
    )
}

@Composable
fun LiteverCircularProgressIndicator(
    progress: () -> Float,
    modifier: Modifier = Modifier,
    color: Color = LiteverTheme.colors.primary,
    strokeWidth: Dp = ProgressIndicatorDefaults.CircularStrokeWidth,
    trackColor: Color = ProgressIndicatorDefaults.circularDeterminateTrackColor
) {
    CircularProgressIndicator(
        progress = progress,
        modifier = modifier,
        color = color,
        strokeWidth = strokeWidth,
        trackColor = trackColor
    )
}

@Composable
fun LiteverLinearProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = LiteverTheme.colors.primary,
    trackColor: Color = ProgressIndicatorDefaults.linearTrackColor
) {
    LinearProgressIndicator(
        modifier = modifier,
        color = color,
        trackColor = trackColor
    )
}

@Composable
fun LiteverLinearProgressIndicator(
    progress: () -> Float,
    modifier: Modifier = Modifier,
    color: Color = LiteverTheme.colors.primary,
    trackColor: Color = ProgressIndicatorDefaults.linearTrackColor
) {
    LinearProgressIndicator(
        progress = progress,
        modifier = modifier,
        color = color,
        trackColor = trackColor
    )
}

@Preview(showBackground = true)
@Composable
fun LiteverProgressIndicatorPreview() {
    LiteverTheme {
        Surface(modifier = Modifier.padding(16.dp)) {
            Column {
                LiteverCircularProgressIndicator()
                Spacer(modifier = Modifier.height(16.dp))
                LiteverCircularProgressIndicator(progress = { 0.7f })
                Spacer(modifier = Modifier.height(16.dp))
                LiteverLinearProgressIndicator()
                Spacer(modifier = Modifier.height(16.dp))
                LiteverLinearProgressIndicator(progress = { 0.4f })
            }
        }
    }
}
