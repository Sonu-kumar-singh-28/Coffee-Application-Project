package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.assessment.portfolio.mycoffeeapplcaiton.R
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.CoffeeBrown
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.LightBrown

@Preview(showBackground = true)
@Composable
fun MySearchBar(){
    var  searchText by remember { mutableStateOf(value = "") }

    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {
        TextField(
            value = searchText,
            onValueChange ={
                searchText = it},
             placeholder ={Text("SearchCoffee",
                 color = Color.Gray)},
            shape = RoundedCornerShape(
                topEnd = 0.dp,
                topStart = 16.dp,
                bottomStart = 16.dp,
                bottomEnd = 0.dp
            ),
            singleLine = true,
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = "search",
                    modifier = Modifier.size(20.dp),
                    tint = Color.White
                )
            },
            modifier = Modifier.weight(1f).height(56.dp),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.LightGray,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor =Color.Transparent,
                focusedContainerColor = Color(0xFF422A24),
                unfocusedContainerColor = Color(0xFF2A2A2A),
                cursorColor = Color.LightGray
            )
        )
        Spacer(modifier = Modifier.width(4.dp))
        IconButton(onClick = {},
            modifier = Modifier.size(56.dp).background(color = CoffeeBrown,
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    bottomEnd = 16.dp,
                    bottomStart = 0.dp,
                    topEnd = 16.dp
                )
                )
        ) {
            Icon(
                painterResource(R.drawable.filter,),
                contentDescription = "filter", tint = Color.White
            )
        }

    }
}