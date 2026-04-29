package com.assessment.portfolio.mycoffeeapplcaiton.presentations.screens.ui_component

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun AppMessageDailog(show: Boolean,
                     title: String,
                     message: String,
                     onDismiss:()-> Unit) {

    if(show){
        AlertDialog(
            onDismissRequest = onDismiss,
            title = {
                Text(
                    text = title
                )
            },
            text = {
                Text(text = message)
            },
            confirmButton = {TextButton(onClick = onDismiss) {
                Text("oK")}
            }
        )
    }
}