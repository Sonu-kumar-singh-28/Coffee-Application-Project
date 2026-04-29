package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.cardScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.assessment.portfolio.mycoffeeapplcaiton.R
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.navigation.Routes


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardScreenTopAppBar(navController: NavController) {
    TopAppBar(
        title = {
            Text(
                text = "Order",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        },

        navigationIcon = {
            IconButton(
                onClick = {
                    navController.navigate(Routes.HomeScreen)
                }
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_arrowback),
                    contentDescription = "Back",
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .clickable(onClick = {
                        navController.navigateUp()  // or Write the navigate(Routes.HomeScreen)
                        })
                )
            }
        }
    )
}