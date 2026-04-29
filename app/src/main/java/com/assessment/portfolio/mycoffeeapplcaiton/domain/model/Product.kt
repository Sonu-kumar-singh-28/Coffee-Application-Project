package com.assessment.portfolio.mycoffeeapplcaiton.domain.model

import androidx.compose.ui.input.pointer.PointerId

data class Product(
    val  id: Int,
    val name: String,
    val description : String,
    val price: Double,
    val imgRes: Int
)