package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.favouriteScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import com.assessment.portfolio.mycoffeeapplcaiton.R
import com.assessment.portfolio.mycoffeeapplcaiton.domain.model.Product
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.uicomponent.MyBottomNavBar

@Composable
fun FavouriteScreen(navController: NavController) {

    var favouriteItems by remember {
        mutableStateOf(
            listOf(
                Product(1, "Espresso", "Strong and Rich", 3.80, R.drawable.coffee_1),
                Product(2, "Latte", "Smooth and Creamy", 4.50, R.drawable.coffee_2),
                Product(3, "Cappucino", "With Chocolate", 4.20, R.drawable.coffee_3)
            )
        )
    }


    Scaffold(
        topBar = {
            FavouriteScreenTopAppBar()
        },
        bottomBar = {
            MyBottomNavBar(navController = navController, "Favourites")
        }
    ) {
        innerPadding->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding)
        ) {
            items(favouriteItems) { product ->
                FavoriteItemCard(
                    product = product,
                    onRemove = {
                        favouriteItems = favouriteItems - product
                    }
                )
            }
        }

    }
}