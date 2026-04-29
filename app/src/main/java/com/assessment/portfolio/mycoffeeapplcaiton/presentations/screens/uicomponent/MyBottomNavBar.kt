package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.uicomponent

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.assessment.portfolio.mycoffeeapplcaiton.R
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.navigation.Routes
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.LightBrown

@Composable
fun MyBottomNavBar(
    navController: NavController,
    currentRoute: String
) {

    val navItems = listOf(
        NavItem("Home", R.drawable.home, Routes.HomeScreen),
        NavItem("Cart", R.drawable.cart, Routes.CartScreen),
        NavItem("Favorites", R.drawable.love, Routes.FavoritesScreen),
        NavItem("Profile", R.drawable.user, Routes.ProfileScreen)
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        navItems.forEach { item ->

            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title,
                        modifier = Modifier.size(20.dp)
                    )
                },

                label = {
                    Text(item.title)
                },

                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },

                selected = item.title == currentRoute,
                alwaysShowLabel = false,

                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = LightBrown.copy(alpha = 0.03f)
                )
            )
        }
    }
}

data class NavItem(
    val title: String,
    val icon: Int,
    val route: Routes
)