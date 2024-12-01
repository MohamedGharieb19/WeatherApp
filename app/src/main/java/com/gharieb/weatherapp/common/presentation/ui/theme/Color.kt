package com.gharieb.weatherapp.common.presentation.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val DarkBlue = Color(0xFF1B3B5A)
val DeepBlue = Color(0xFF102840)

val LightColorPalette = lightColors(
    primary = Color(0xFF4FC3F7),          // Sky Blue
    primaryVariant = Color(0xFF039BE5),   // Deep Sky Blue
    secondary = Color(0xFFFFD54F),        // Soft Yellow
    background = Color(0xFFD9D9D9),       // Light Gray
    surface = Color(0xFFFFFFFF),          // White
    onPrimary = Color.White,              // Text on Primary
    onSecondary = Color(0xFF212121),      // Text on Secondary
    onBackground = Color(0xFF212121),     // Text on Background
    onSurface = Color(0xFF212121)         // Text on Surface
)

val DarkColorPalette = darkColors(
    primary = Color(0xFF0D47A1),          // Midnight Blue
    primaryVariant = Color(0xFF002171),   // Navy Blue
    secondary = Color(0xFFFF9800),        // Soft Orange
    background = Color(0xFF121212),       // Deep Gray
    surface = Color(0xFF1E1E1E),          // Charcoal Gray
    onPrimary = Color.White,              // Text on Primary
    onSecondary = Color(0xFFB0BEC5),      // Text on Secondary
    onBackground = Color(0xFFE0E0E0),     // Text on Background
    onSurface = Color(0xFFE0E0E0)         // Text on Surface
)