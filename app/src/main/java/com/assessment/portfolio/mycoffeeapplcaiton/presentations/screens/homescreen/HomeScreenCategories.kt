package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.homescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreenCategories() {

    val categories = listOf("All Coffee", "Macchiato", "Latte", "Americano", "Desserts")

    var selectedCategory by remember { mutableStateOf(categories.first()) }

    LazyRow(modifier = Modifier.padding(horizontal = 12.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        items(categories) { category ->

            CategoriesChip(
                text = category,
                isSelected = category == selectedCategory,
                onSelected = {
                    selectedCategory = category
                }
            )
        }
    }
}