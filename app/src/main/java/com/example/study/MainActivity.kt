package com.example.study

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.graphics.toArgb
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.study.ui.theme.StudyTheme

class MainActivity : ComponentActivity() {
    private val viewmodel by viewModels<StudyMainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                !viewmodel.isReady.value
            }
        }
        enableEdgeToEdge()
        setContent {
            StudyTheme {
                ChangeSystemBarsTheme(!isSystemInDarkTheme())
            }
        }
    }
}

@Composable
fun ComponentActivity.ChangeSystemBarsTheme(lightTheme: Boolean) {
    val barColor = MaterialTheme.colorScheme.background.toArgb()
    LaunchedEffect(lightTheme) {
        if (lightTheme) {
            enableEdgeToEdge(
                statusBarStyle = SystemBarStyle.light(
                    barColor, barColor,
                ),
                navigationBarStyle = SystemBarStyle.light(
                    barColor, barColor,
                ),
            )
        } else {
            enableEdgeToEdge(
                statusBarStyle = SystemBarStyle.dark(
                    barColor,
                ),
                navigationBarStyle = SystemBarStyle.dark(
                    barColor,
                )
            )
        }
    }
}