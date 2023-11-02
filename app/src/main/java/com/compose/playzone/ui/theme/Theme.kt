package com.compose.playzone.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = BlackPearl,
    secondary = Saffron,
    surfaceTint = Color.White,
    tertiary = PictonBlue,
    onPrimary = Mirage,
    onSecondary = EbonyClay
)

private val LightColorScheme = lightColorScheme(
    primary = BlackPearl,
    secondary = Saffron,
    surfaceTint = Color.White,
    tertiary = PictonBlue,
    onPrimary = Mirage,
    onSecondary = EbonyClay
)


@Composable
fun PlayZoneTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    (view.context as? Activity)?.window
        ?: throw Exception("Not in an activity - unable to get Window reference")
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    SideEffect {
        val window = (view.context as Activity).window
        window.statusBarColor = Color.Transparent.toArgb()
        WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}