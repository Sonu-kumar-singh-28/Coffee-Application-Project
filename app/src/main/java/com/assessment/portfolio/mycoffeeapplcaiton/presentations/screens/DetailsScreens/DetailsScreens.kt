package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.DetailsScreens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.assessment.portfolio.mycoffeeapplcaiton.R
import com.assessment.portfolio.mycoffeeapplcaiton.domain.model.Product

@Composable
fun DetailsScreens(productId: Int, navController: NavController) {

    val products = listOf(
        Product(1, "Espresso", "Strong and Rich", 3.80, R.drawable.coffee_1),
        Product(2, "Latte", "Smooth and Creamy", 4.50, R.drawable.coffee_2),
        Product(3, "Cappucinao", "With Chocolate", 4.20, R.drawable.coffee_3),
        Product(4, "Mocha", "With Cocoa Flavour", 4.60, R.drawable.coffee_4),
        Product(5, "Macchiato", "Bold and Milky", 3.69, R.drawable.coffee_5),
        Product(6, "FlatWhite", "Velvety Smooth", 2.36, R.drawable.coffee_6),
        Product(7, "Iced Mocha", "Refreshing and Rich", 2.22, R.drawable.coffee_6)
    )

    val selectedProduct = products.find { it.id == productId }

    if (selectedProduct == null) {
        Text(
            text = "Product Not Found",
            color = Color.Red
        )
        return
    }

    Scaffold(
        topBar = { DetailsScreenTopAppBar(navController) },
        bottomBar = { DetailsScreenBottomAppBar() }
    ) { innerPadding ->
        LazyColumn {
            item {
                ProductDetailsContainer(selectedProduct, innerPadding)
            }
        }
    }
}
