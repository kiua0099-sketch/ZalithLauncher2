/*
 * VX Launcher
 * Copyright (C) 2025 MovTery <movtery228@qq.com> and contributors
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

package com.movtery.Vxlauncher.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.material3.darkColorScheme

// Colors for Zyron style
val BackgroundBlack = Color(0xFF0A0A0A)
val SurfaceBlack = Color(0xFF141414)
val SurfaceVariantBlack = Color(0xFF1E1E1E)

val ZyronRed = Color(0xFFD32F2F)
val ZyronRedDark = Color(0xFFB71C1C)
val OnRed = Color(0xFFFFFFFF)

val TextWhite = Color(0xFFEEEEEE)
val TextGray = Color(0xFFAAAAAA)

val DarkColorScheme = darkColorScheme(
    primary = ZyronRed,
    onPrimary = OnRed,
    primaryContainer = ZyronRedDark,
    onPrimaryContainer = TextWhite,
    
    background = BackgroundBlack,
    onBackground = TextWhite,
    
    surface = SurfaceBlack,
    onSurface = TextWhite,
    surfaceVariant = SurfaceVariantBlack,
    onSurfaceVariant = TextGray
)
