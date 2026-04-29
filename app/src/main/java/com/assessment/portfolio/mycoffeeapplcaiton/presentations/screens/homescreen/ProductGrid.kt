package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.homescreen


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.assessment.portfolio.mycoffeeapplcaiton.domain.model.Product


@Composable
fun ProductGrid(product: List<Product>,navController: NavController, TopContent: @Composable ()-> Unit) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {

        item {
            TopContent()
        }

        items(product.chunked(2)) { rowItems ->

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {

                ProductCard(
                    product = rowItems[0],
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp),
                    navController = navController
                )

                if (rowItems.size == 2) {
                    ProductCard(
                        product = rowItems[1],
                        modifier = Modifier
                            .weight(1f)
                            .padding(4.dp),
                        navController = navController
                    )
                } else {
                    Spacer(
                        modifier = Modifier
                            .weight(1f)
                            .padding(4.dp)
                    )
                }
            }
        }
    }
}