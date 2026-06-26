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

package com.movtery.zalithlauncher.ui.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.movtery.zalithlauncher.BuildKeys
import com.movtery.zalithlauncher.R
import com.movtery.zalithlauncher.components.InstallableItem
import com.movtery.zalithlauncher.setting.AllSettings
import com.movtery.zalithlauncher.ui.base.applyFullscreen
import com.movtery.zalithlauncher.ui.screens.NormalNavKey
import com.movtery.zalithlauncher.ui.screens.rememberTransitionSpec
import com.movtery.zalithlauncher.ui.theme.onBackgroundColor
import com.movtery.zalithlauncher.viewmodel.SplashBackStackViewModel

// XU Launcher colors
private val XUBlack = Color(0xFF0A0A0A)
private val XURed = Color(0xFFE53935)
private val XUWhite = Color(0xFFFFFFFF)
private val XUGrey = Color(0xFFB0B0B0)

/**
 * Splash screen with XU Launcher branding
 * - Shows logo, name, and "Unofficial Modified Version"
 * - Displays unpack progress below
 */
@Composable
fun SplashScreen(
    startAllTask: () -> Unit,
    unpackItems: List<InstallableItem>,
    screenViewModel: SplashBackStackViewModel
) {
    Column(
        modifier = Modifier
            .applyFullscreen(AllSettings.launcherFullScreen.state)
            .background(XUBlack)  // Pure black background
    ) {
        // Top bar with XU branding
        TopBar(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentColor = XUWhite
        )

        // Main content: unpack progress (keeps original functionality)
        NavigationUI(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            startAllTask = startAllTask,
            unpackItems = unpackItems,
            screenViewModel = screenViewModel
        )
    }
}

@Composable
private fun TopBar(
    modifier: Modifier = Modifier,
    contentColor: Color,
) {
    CompositionLocalProvider(
        LocalContentColor provides contentColor
    ) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // XU Logo (using the vector drawable)
            androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.logo_xu),
                contentDescription = "XU Launcher Logo",
                modifier = Modifier.size(48.dp)
            )

            Column(
                modifier = Modifier.padding(start = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "XU Launcher",
                    color = XUWhite,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Unofficial Modified Version",
                    color = XUGrey,
                    fontSize = 11.sp,
                    modifier = Modifier.padding(top = 2.dp)
                )
            }
        }
    }
}

@Composable
private fun NavigationUI(
    modifier: Modifier = Modifier,
    startAllTask: () -> Unit,
    unpackItems: List<InstallableItem>,
    screenViewModel: SplashBackStackViewModel
) {
    val backStack = screenViewModel.splashScreen.backStack

    val currentKey = backStack.lastOrNull()
    LaunchedEffect(currentKey) {
        screenViewModel.splashScreen.currentKey = currentKey
    }

    if (backStack.isNotEmpty()) {
        NavDisplay(
            backStack = backStack,
            modifier = modifier,
            transitionSpec = rememberTransitionSpec(),
            popTransitionSpec = rememberTransitionSpec(),
            entryProvider = entryProvider {
                entry<NormalNavKey.UnpackDeps> {
                    // Wrap UnpackScreen with XU styling (keep original)
                    UnpackScreen(unpackItems, screenViewModel) {
                        startAllTask()
                    }
                }
            }
        )
    } else {
        // Fallback: show loading indicator
        Box(
            modifier = modifier,
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Loading...",
                color = XUWhite,
                fontSize = 16.sp
            )
        }
    }
}
