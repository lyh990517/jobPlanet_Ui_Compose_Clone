package com.example.jobplanetuiclone.ui_component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopMenu() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(60.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "YoonPlanet", modifier = Modifier.padding(8.dp), fontSize = 23.sp)
        Row(
            Modifier.weight(1f),
            horizontalArrangement = Arrangement.End
        ) {
            Text(text = "2", Modifier.padding(5.dp))
            Text(text = "dummyCompany", Modifier.padding(5.dp))
        }
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "search",
            modifier = Modifier.padding(5.dp)
        )
        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = "Notification",
            modifier = Modifier.padding(5.dp)
        )
    }
}
//416790*