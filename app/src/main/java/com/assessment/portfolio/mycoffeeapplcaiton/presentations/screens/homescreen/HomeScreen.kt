package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.homescreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.assessment.portfolio.mycoffeeapplcaiton.R
import com.assessment.portfolio.mycoffeeapplcaiton.domain.model.Product
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.uicomponent.MyBottomNavBar


@Composable
fun HomeScreen(navController: NavController) {

    val Location = "JantaRoad,Chhapra "
    Scaffold(bottomBar =
        { MyBottomNavBar(navController, "Home")}
    ){
        innerPadding ->
        Box(modifier = Modifier.fillMaxWidth()
            .fillMaxSize(1f/3f)
            .background(brush = Brush.linearGradient(
                colors = listOf(
                    Color(0xFF303030),
                    Color(0xFF1F1F1F),
                    Color(0XFF121212)
                )
            )
            )
        )

        Column(modifier = Modifier.fillMaxSize().padding(16.dp).padding(innerPadding)){

            // Display Product
            val products = listOf(
                Product(id = 1, "Espresso", "Strong and Rich",3.80, R.drawable.coffee_1),
                Product(id = 2, "Latte", "Smooth and Creamy",4.50, R.drawable.coffee_2),
                Product(id = 3, "Cappucinao", "With Chocolate",4.20, R.drawable.coffee_3),
                Product(id = 4, "Mocha", "With Cocoa Flavour",4.60, R.drawable.coffee_4),
                Product(id = 5, "Macchiato", "Bold and Milky",3.69, R.drawable.coffee_5),
                Product(id = 6, "FlatWhite", "Velvety Smooth",2.36, R.drawable.coffee_6),
                Product(id = 7, "Iced Mocha", "Refreshing and Rich",2.22, R.drawable.coffee_6)
            )
            
            // Pass the Product
            ProductGrid(products , navController = navController){
                Text(text = "Location"
                    , color = Color.Gray
                    , fontSize = 16.sp
                    , fontWeight = FontWeight.SemiBold)


                Spacer(modifier = Modifier.height(4.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(Location
                        ,color = Color.White)
                    Icon(imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Change Location",
                        tint = Color.White)
                }
                Spacer(modifier = Modifier.height(10.dp))

                // Search Bar Design
                MySearchBar()

                //Banner Design
                Spacer(modifier = Modifier.height(30.dp))
                Image(
                    painter = painterResource(R.drawable.banner_1),
                    contentDescription = "Home banner",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.clip(RoundedCornerShape(
                        20.dp
                    ))
                )
                Spacer(modifier = Modifier.height(14.dp))
                HomeScreenCategories()
            }
        }
    }
}
