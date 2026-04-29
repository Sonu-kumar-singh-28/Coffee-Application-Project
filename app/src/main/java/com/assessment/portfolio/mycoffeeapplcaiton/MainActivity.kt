package com.assessment.portfolio.mycoffeeapplcaiton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.navigation.NavGraph
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.DetailsScreens.DetailsScreens
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.homescreen.HomeScreen
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.MyCoffeeApplcaitonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCoffeeApplcaitonTheme {
                NavGraph()
            }
        }
    }
}
