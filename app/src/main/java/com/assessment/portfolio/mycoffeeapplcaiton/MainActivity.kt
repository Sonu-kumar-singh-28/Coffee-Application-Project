package com.assessment.portfolio.mycoffeeapplcaiton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
<<<<<<< HEAD
import com.assessment.portfolio.mycoffeeapplcaiton.screens.homescreen.HomeScreen
=======
>>>>>>> dc7a1ca365487cc4beb3b47960ea927f7172a826
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.MyCoffeeApplcaitonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCoffeeApplcaitonTheme {
<<<<<<< HEAD
                HomeScreen()
=======

>>>>>>> dc7a1ca365487cc4beb3b47960ea927f7172a826
            }
        }
    }
}
