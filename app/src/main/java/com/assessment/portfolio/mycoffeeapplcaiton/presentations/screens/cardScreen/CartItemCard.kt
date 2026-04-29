package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.cardScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.assessment.portfolio.mycoffeeapplcaiton.R
import com.assessment.portfolio.mycoffeeapplcaiton.domain.model.Product
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.LightBrown


@Composable
fun CartItemCard(product: Product) {


    var quantity by remember { mutableStateOf(1) }

    Card(
        modifier = Modifier.fillMaxWidth().padding(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.LightGray
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Row(modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {
            Image(
                painterResource(product.imgRes), contentDescription = "Coffee Image",
                modifier = Modifier.size(70.dp).clip(RoundedCornerShape(10.dp))
            )

            Column(modifier = Modifier.padding(10.dp).weight(1f)) {
                Text(product.name,
                    style= MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    ))
                Text(product.description,
                    color = Color.DarkGray
                )
            }

            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement =
                    Arrangement.spacedBy(10.dp)) {
                IconButton(onClick = {
                    quantity--
                }, enabled = quantity>1 ,
                    modifier = Modifier
                        .background(color = LightBrown
                            .copy(0.2f),
                        shape = CircleShape
                    ).size(24.dp)) {
                    Icon(painterResource(R.drawable.substract),
                        contentDescription = "Subtract",
                        )
                }

                Text(text = quantity.toString(),
                    style = MaterialTheme.typography.bodyLarge.
                copy(fontWeight = FontWeight.SemiBold))

                IconButton(onClick = {
                    quantity++
                },
                    modifier = Modifier
                        .background(color = LightBrown
                            .copy(0.2f),
                        shape = CircleShape
                    ).size(24.dp)) {
                    Icon(imageVector = Icons.Default.Add,
                        contentDescription = "Remove")
                }
            }
        }
    }
}