package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.cardScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.assessment.portfolio.mycoffeeapplcaiton.R
import com.assessment.portfolio.mycoffeeapplcaiton.domain.model.Product
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.uicomponent.MyBottomNavBar
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.CoffeeBrown
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.LightBrown



@Composable
fun CartScreen(navController: NavController) {


    var amount by remember { mutableStateOf(12.50) }
    var delivery by remember { mutableStateOf(1.00) }

    var totalAmount by remember { mutableStateOf(amount+delivery) }


    val cartProducts = listOf(
        Product(1, "Espresso", "Strong and Rich", 3.80, R.drawable.coffee_1),
        Product(2, "Latte", "Smooth and Creamy", 4.50, R.drawable.coffee_2),
        Product(3, "Cappucino", "With Chocolate", 4.20, R.drawable.coffee_3),
    )


    Scaffold(topBar = {
        CardScreenTopAppBar(navController)
    }, bottomBar = { MyBottomNavBar(navController, "Cart") }) {
        innerPadding->
        LazyColumn(modifier = Modifier.padding(16.dp).padding(innerPadding)) {
            item {
                Row() {
                    Text("Deliver",
                        fontSize = 30.sp,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = CoffeeBrown,
                        )
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                cartProducts.forEach {
                    product->
                    CartItemCard(product)
                }

                Spacer(modifier = Modifier.height(24.dp))

                Text("Payment Summary",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement =
                        Arrangement.SpaceBetween) {
                    Text("Price",
                        fontSize = 18.sp
                    )
                    Text("$ ${amount}",
                        fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(4.dp))

                Row(modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement
                    =Arrangement.SpaceBetween) {
                    Text("Delivery Fee",
                        fontSize = 18.sp)
                    Text(text = "$ ${delivery}",
                        fontSize = 18.sp)
                }
                
                Spacer(modifier = Modifier.height(16.dp))

                PaymentModeSelectionCart(totalAmount)
            }
        }
    }
}