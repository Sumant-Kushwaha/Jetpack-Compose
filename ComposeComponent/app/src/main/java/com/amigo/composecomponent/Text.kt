package com.amigo.composecomponent

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun TextStyling(){
    Text(text = "Hello",
        fontSize = 40.sp,
        color=Color.Green)
}