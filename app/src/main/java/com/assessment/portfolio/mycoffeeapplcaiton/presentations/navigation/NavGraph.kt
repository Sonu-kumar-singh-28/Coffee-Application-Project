package com.assessment.portfolio.mycoffeeapplcaiton.presentations.navigation

import android.app.FragmentManager
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.DetailsScreens.DetailsScreens
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.cardScreen.CartScreen
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.favouriteScreen.FavouriteScreen
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.homescreen.HomeScreen
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.profileScreen.ProfileScreen
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.welcomescreen.WelcomeScreen

@Preview
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.WelcomeScreen) {
        composable<Routes.WelcomeScreen>
        {
            WelcomeScreen(navController = navController)
        }

        composable<Routes.HomeScreen> {
            HomeScreen(navController)
        }

        composable<Routes.DetailsScreen> { backStackEntry ->
            val args = backStackEntry.toRoute<Routes.DetailsScreen>()
            DetailsScreens(productId = args.productId, navController)
        }

        composable<Routes.CartScreen> {
            CartScreen(navController)
        }

        composable <Routes.FavoritesScreen>{
            FavouriteScreen(navController)
        }

        composable <Routes.ProfileScreen>{
            ProfileScreen(navController)
        }
    }
}