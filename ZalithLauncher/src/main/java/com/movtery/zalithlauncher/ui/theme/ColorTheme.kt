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
 * XU Launcher Color Theme
 * Design: Black background, Red accents, White text
 * All themes use the same XU color scheme for consistency.
 */
data class ColorTheme(
    val embermire: Color,
    val velvetRose: Color,
    val mistwave: Color,
    val glacier: Color,
    val verdantField: Color,
    val urbanAsh: Color,
    val verdantDawn: Color
)

enum class ColorThemeType {
    DYNAMIC,
    EMBERMIRE,
    VELVET_ROSE,
    MISTWAVE,
    GLACIER,
    VERDANTFIELD,
    URBAN_ASH,
    VERDANT_DAWN,
    CUSTOM
}

// XU Launcher Color Scheme — Dark Theme (Black + Red)
val xuColorScheme = ColorTheme(
    embermire = Color(0xFFE53935),      // Red accent
    velvetRose = Color(0xFFE53935),     // Red accent
    mistwave = Color(0xFFE53935),       // Red accent
    glacier = Color(0xFFE53935),        // Red accent
    verdantField = Color(0xFFE53935),   // Red accent
    urbanAsh = Color(0xFFE53935),       // Red accent
    verdantDawn = Color(0xFFE53935)     // Red accent
)

// Background and surface colors (all black/dark)
val xuBackground = Color(0xFF0A0A0A)    // Pure black
val xuSurface = Color(0xFF1A1A1A)       // Dark gray
val xuOnBackground = Color(0xFFFFFFFF)  // White text
val xuOnSurface = Color(0xFFFFFFFF)     // White text on surface
val xuOnPrimary = Color(0xFFFFFFFF)     // White text on red
val xuPrimary = Color(0xFFE53935)       // Red accent

// Keep the original theme objects if the app references them.
// We'll override them to use XU colors.
val EMBERMIRE = xuColorScheme
val VELVET_ROSE = xuColorScheme
val MISTWAVE = xuColorScheme
val GLACIER = xuColorScheme
val VERDANTFIELD = xuColorScheme
val URBAN_ASH = xuColorScheme
val VERDANT_DAWN = xuColorScheme

// For dynamic theme (if used), we also return XU colors.
val DYNAMIC = xuColorScheme

// Map theme types to color schemes
fun getColorTheme(type: ColorThemeType): ColorTheme {
    return when (type) {
        ColorThemeType.DYNAMIC -> xuColorScheme
        ColorThemeType.EMBERMIRE -> xuColorScheme
        ColorThemeType.VELVET_ROSE -> xuColorScheme
        ColorThemeType.MISTWAVE -> xuColorScheme
        ColorThemeType.GLACIER -> xuColorScheme
        ColorThemeType.VERDANTFIELD -> xuColorScheme
        ColorThemeType.URBAN_ASH -> xuColorScheme
        ColorThemeType.VERDANT_DAWN -> xuColorScheme
        ColorThemeType.CUSTOM -> xuColorScheme
    }
}
