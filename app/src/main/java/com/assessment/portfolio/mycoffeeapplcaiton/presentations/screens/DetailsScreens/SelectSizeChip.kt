package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.DetailsScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.CharcoalGray
import com.assessment.portfolio.mycoffeeapplcaiton.ui.theme.LightBrown

@Composable
fun SelectSizeChip(
    sizeText: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(
                color = if (selected) Color(0xFFF7F0EB) else Color.White,
                shape = RoundedCornerShape(12.dp)
            )
            .border(
                width = 1.dp,
                color = if (selected) Color(0xFFC67C4E) else Color.LightGray,
                shape = RoundedCornerShape(12.dp)
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = sizeText,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = if (selected) LightBrown else CharcoalGray
        )
    }
}