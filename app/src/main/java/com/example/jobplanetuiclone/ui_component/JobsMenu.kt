package com.example.jobplanetuiclone.ui_component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun JobsMenu() {
    Row(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Menu(icon = Icons.Default.Check, name = "Menu")
        Menu(icon = Icons.Default.Check, name = "Menu")
        Menu(icon = Icons.Default.Check, name = "Menu")
        Menu(icon = Icons.Default.Check, name = "Menu")
    }
}

@Composable
fun Menu(icon: ImageVector, name: String) {
    Column(Modifier.wrapContentSize()) {
        Icon(imageVector = icon, contentDescription = name)
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = name)
    }
}