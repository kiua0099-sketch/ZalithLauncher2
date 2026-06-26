/*
 * XU Launcher - Modified Version of Zalith Launcher 2
 * Original Copyright (C) 2025 MovTery <movtery228@qq.com> and contributors
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/gpl-3.0.txt>.
 */

package com.movtery.zalithlauncher.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * XU Launcher Color Scheme
 * Design: Black background, Red accents, White text
 * Inspired by Zyron Launcher style
 */
data class XUColorScheme(
    val primary: Color,
    val onPrimary: Color,
    val primaryContainer: Color,
    val onPrimaryContainer: Color,
    val secondary: Color,
    val onSecondary: Color,
    val secondaryContainer: Color,
    val onSecondaryContainer: Color,
    val tertiary: Color,
    val onTertiary: Color,
    val tertiaryContainer: Color,
    val onTertiaryContainer: Color,
    val error: Color,
    val onError: Color,
    val errorContainer: Color,
    val onErrorContainer: Color,
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val surfaceVariant: Color,
    val onSurfaceVariant: Color,
    val outline: Color,
    val outlineVariant: Color,
    val scrim: Color,
    val inverseSurface: Color,
    val inverseOnSurface: Color,
    val inversePrimary: Color,
    val surfaceDim: Color,
    val surfaceBright: Color,
    val surfaceContainerLowest: Color,
    val surfaceContainerLow: Color,
    val surfaceContainer: Color,
    val surfaceContainerHigh: Color,
    val surfaceContainerHighest: Color
)

// XU Launcher Colors - Dark Theme Only (Black + Red)
val XUDarkColors = XUColorScheme(
    // Primary - Red accent
    primary = Color(0xFFE53935),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFB71C1C),
    onPrimaryContainer = Color(0xFFFFFFFF),
    
    // Secondary - Dark red
    secondary = Color(0xFFC62828),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFF1A1A1A),
    onSecondaryContainer = Color(0xFFB0B0B0),
    
    // Tertiary - Muted red
    tertiary = Color(0xFFD32F2F),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFF2A0A0A),
    onTertiaryContainer = Color(0xFFFF8A80),
    
    // Error - Bright red
    error = Color(0xFFFF1744),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFB71C1C),
    onErrorContainer = Color(0xFFFFDAD6),
    
    // Background - Pure black
    background = Color(0xFF0A0A0A),
    onBackground = Color(0xFFFFFFFF),
    
    // Surface - Dark gray/black
    surface = Color(0xFF1A1A1A),
    onSurface = Color(0xFFFFFFFF),
    
    // Surface Variant - Slightly lighter dark
    surfaceVariant = Color(0xFF2A2A2A),
    onSurfaceVariant = Color(0xFFB0B0B0),
    
    // Outline - Gray borders
    outline = Color(0xFF444444),
    outlineVariant = Color(0xFF333333),
    
    // Scrim - Black overlay
    scrim = Color(0xFF000000),
    
    // Inverse - Light theme simulation (for dark mode)
    inverseSurface = Color(0xFFFFFFFF),
    inverseOnSurface = Color(0xFF0A0A0A),
    inversePrimary = Color(0xFFE53935),
    
    // Surface variations (all dark)
    surfaceDim = Color(0xFF0A0A0A),
    surfaceBright = Color(0xFF2A2A2A),
    surfaceContainerLowest = Color(0xFF050505),
    surfaceContainerLow = Color(0xFF121212),
    surfaceContainer = Color(0xFF1A1A1A),
    surfaceContainerHigh = Color(0xFF222222),
    surfaceContainerHighest = Color(0xFF2A2A2A)
)

// XU Launcher Colors - Light Theme (Fallback, but we use dark by default)
val XULightColors = XUColorScheme(
    primary = Color(0xFFE53935),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFFFCDD2),
    onPrimaryContainer = Color(0xFF4A0000),
    secondary = Color(0xFFC62828),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFFFEBEE),
    onSecondaryContainer = Color(0xFF3A0000),
    tertiary = Color(0xFFD32F2F),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFFE5E5),
    onTertiaryContainer = Color(0xFF2A0000),
    error = Color(0xFFB71C1C),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),
    background = Color(0xFFF5F5F5),
    onBackground = Color(0xFF0A0A0A),
    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF0A0A0A),
    surfaceVariant = Color(0xFFE0E0E0),
    onSurfaceVariant = Color(0xFF444444),
    outline = Color(0xFF999999),
    outlineVariant = Color(0xFFCCCCCC),
    scrim = Color(0xFF000000),
    inverseSurface = Color(0xFF0A0A0A),
    inverseOnSurface = Color(0xFFFFFFFF),
    inversePrimary = Color(0xFFFFCDD2),
    surfaceDim = Color(0xFFE0E0E0),
    surfaceBright = Color(0xFFFFFFFF),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceContainerLow = Color(0xFFF5F5F5),
    surfaceContainer = Color(0xFFEEEEEE),
    surfaceContainerHigh = Color(0xFFE0E0E0),
    surfaceContainerHighest = Color(0xFFD0D0D0)
)
