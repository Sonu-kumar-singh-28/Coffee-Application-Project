package com.assessment.portfolio.mycoffeeapplcaiton.screens.ui_component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.assessment.portfolio.mycoffeeapplcaiton.R


@Preview(showBackground = true)
@Composable
private fun MyBottomNavBar() {

    //Bottom Nav Items
    val navItems = listOf(
        NavItem(
            "Home",
            R.drawable.home
        ),

        NavItem(
            "Cart",
            R.drawable.cart
        ),
        NavItem(
            "Favorites",
            R.drawable.love
        ),
        NavItem(
            "Profile",
            R.drawable.user
        )
    )

    NavigationBar(containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(16.dp)
    ) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title
                    )
                },
                label = {
                    Text(item.title)
                },
                modifier = Modifier.size(15.dp),

                onClick = {},
                selected = true,
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    selectedTextColor = MaterialTheme.colorScheme.primary,
                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    indicatorColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    }
}


data class NavItem(
    val title: String,
    val icon: Int
)