package com.example.jobplanetuiclone.ui_component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopMenu() {
    Row(Modifier.fillMaxWidth()) {
        Text(text = "YoonPlanet", modifier = Modifier.padding(5.dp))
        Row(Modifier.weight(1f)) {
            Text(text = "2")
            Text(text = "dummyCompany")
        }
        Icon(imageVector = Icons.Default.Search, contentDescription = "search")
        Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notification")
    }
}
//416790*