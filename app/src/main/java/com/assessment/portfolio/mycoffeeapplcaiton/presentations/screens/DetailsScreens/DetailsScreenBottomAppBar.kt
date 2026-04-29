package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.DetailsScreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.ui_component.AppMessageDailog
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.IvoryWhite
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.LightBrown

@Preview
@Composable
fun DetailsScreenBottomAppBar() {
    var showCartDialog by remember { mutableStateOf(false) }
    BottomAppBar(
        containerColor = Color.Transparent
    ) {
        Row( modifier = Modifier.padding(horizontal = 16.dp)) {
            Column(
            ) {
                Text("Price",
                    fontSize = 16.sp)

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "$4.S3"
                , fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,)
            }

            Spacer(modifier = Modifier.width(40.dp))

            Button(onClick = {
                showCartDialog = true
            },
                modifier = Modifier.weight(1f)
                    .height(56.dp)
                    .clip(RoundedCornerShape(16.dp)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightBrown,
                    contentColor = IvoryWhite
                )) {
                Text("Add To Cart",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold)
            }



            AppMessageDailog(show =showCartDialog,
                title = "Added To Cart",
                "Items Has been Added in your cart",
                onDismiss = {showCartDialog= false}
            )
        }
    }
}