package com.amigo.composecomponent

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Modifiers() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .border(2.dp, Color.Green)
    ) {

        Text(
            text = "Modifier example",
            color=Color.Red,
            fontSize=30.sp,
            modifier = Modifier
                .align(Alignment.Center)
                .border(2.dp,Color.Red)
                .padding(20.dp)
        )
    }
}