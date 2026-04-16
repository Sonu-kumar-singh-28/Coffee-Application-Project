package com.assessment.portfolio.mycoffeeapplcaiton.screens.uicomponent

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.assessment.portfolio.mycoffeeapplcaiton.R
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.LightBrown


@Composable
fun MyBottomNavBar() {

    val navItems = listOf(
        NavItem("Home", R.drawable.home),
        NavItem("Cart", R.drawable.cart),
        NavItem("Favorites", R.drawable.love),
        NavItem("Profile", R.drawable.user)
    )

    var selectedIndex = remember { mutableStateOf(0) }

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        navItems.forEachIndexed { index, item ->

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

                selected = selectedIndex.value == index,

                onClick = {
                    selectedIndex.value = index
                },

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
    val icon: Int
)