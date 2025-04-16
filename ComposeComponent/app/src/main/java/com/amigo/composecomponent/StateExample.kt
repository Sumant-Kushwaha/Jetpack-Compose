package com.amigo.composecomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun NotificationScreen(){
    val count= rememberSaveable{
        mutableIntStateOf(0)
    }
    Column(
        Modifier.fillMaxSize(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        NotificationCounter(count.intValue) { count.intValue++ }
        NotificationCounterBar(count.intValue)
    }
}


@Composable
fun NotificationCounterBar(count: Int){
    Row (
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            imageVector = Icons.Outlined.FavoriteBorder,
            contentDescription = "Notification Counter"
        )
        Text(" notification sent - $count")
    }
}


@Composable
fun NotificationCounter(count:Int,increment:()-> Unit){
    Column {
        Text("Total notification Sent = $count")
    }
    Button({
        increment()
    }) {
        Text("Send Notification")
    }
}