package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.profileScreen

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.navigation.Routes
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.uicomponent.MyBottomNavBar
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.LightBrown
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.LightGray


@Composable
fun ProfileScreen(navController: NavController) {

    val Location = "JantaRoad,Chhapra "

    Scaffold(topBar = {
        ProfileScreenTopAppBar()
    },
        bottomBar = {
            MyBottomNavBar(navController = navController, "Profile")
        }) {
        innerPadding->

        Column(modifier = Modifier
            .fillMaxSize().padding(16.dp)
            .padding(innerPadding)) {


            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier.size(120.dp).clip(CircleShape)
                        .background(
                            color = Color.LightGray
                        ), contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile Picture",
                        modifier = Modifier.size(80.dp),
                        tint = LightBrown
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    "Sonu Kumar Singh",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                )

                Text(
                    "Sonukumarsingh@gmail.com",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray
                )
            }

            Spacer(modifier = Modifier.height(50.dp))

            Text(
                "Address",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                "Janta Road,\nChhapra, \nBihar 841422",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold,
                color = Color.DarkGray
            )


            Spacer(modifier = Modifier.height(60.dp))


            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = LightGray.copy(0.5f)
                )
            ) {
                Column(
                    modifier = Modifier.padding(30.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    )
                    {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Cart",
                            modifier = Modifier.size(28.dp).clickable{
//                                navController.navigate(Routes.CartScreen)
                            },
                            tint = LightBrown
                        )
                        Spacer(modifier = Modifier.size(12.dp))
                        Text(
                            "Cart",
                            fontSize = 24.sp,
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    )
                    {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Cart",
                            modifier = Modifier.size(28.dp),
                            tint = LightBrown
                        )

                        Spacer(modifier = Modifier.size(12.dp))
                        Text(
                            "Favourite",
                            fontSize = 24.sp,

                            )
                    }


                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    )
                    {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Setting",
                            modifier = Modifier.size(28.dp).clickable{
//                                navController.navigate(Routes.CartScreen)
                            },
                            tint = LightBrown
                        )

                        Spacer(modifier = Modifier.size(12.dp))
                        Text(
                            "Settings",
                            fontSize = 24.sp,

                            )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    )
                    {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = "information",
                            modifier = Modifier.size(28.dp).clickable{
//                                navController.navigate(Routes.ProfileScreen)
                            },
                            tint = LightBrown
                        )

                        Spacer(modifier = Modifier.size(12.dp))
                        Text(
                            "Information",
                            fontSize = 24.sp,

                            )
                    }
                }
            }
        }
    }
}