package com.amigo.composecomponent

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true, showSystemUi = true)
@Composable

fun ColumnExample() {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(.5f)
                .border(2.dp, Color.Blue, RectangleShape),
//            horizontalAlignment = Alignment.Start,
            horizontalAlignment = Alignment.CenterHorizontally,
//            horizontalAlignment = Alignment.End,
//            verticalArrangement = Arrangement.Top,
            verticalArrangement = Arrangement.Center,
//            verticalArrangement = Arrangement.SpaceEvenly,
//            verticalArrangement = Arrangement.Bottom,
//            verticalArrangement = Arrangement.SpaceAround,
//            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(text = "Column Text")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(1f)
                .border(2.dp, Color.Black, RectangleShape),
//            horizontalAlignment = Alignment.Start,
            horizontalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.End,
//            verticalArrangement = Arrangement.Top,
            verticalAlignment = Alignment.CenterVertically,
//            verticalArrangement = Arrangement.SpaceEvenly,
//            verticalArrangement = Arrangement.Bottom,
//            verticalArrangement = Arrangement.SpaceAround,
//            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(text = "Row Text")
        }
    }

}