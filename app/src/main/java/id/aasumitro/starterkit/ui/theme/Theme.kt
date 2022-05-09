package id.aasumitro.starterkit.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = starterkit_purple_800,
    secondary = starterkit_red,
    surface = starterkit_purple_900,
    onSurface = starterkit_white,
    primaryVariant = starterkit_purple_700,
)

private val LightColorPalette = lightColors(
    primary = starterkit_purple_800,
    secondary = starterkit_red,
    surface = starterkit_purple_900,
    onSurface = starterkit_white,
    primaryVariant = starterkit_purple_700,
)

@Composable
fun KotlinStarterKitTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorPalette else LightColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}