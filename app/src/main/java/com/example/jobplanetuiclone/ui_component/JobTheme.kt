package com.example.jobplanetuiclone.ui_component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.jobplanetuiclone.R

@Composable
fun JobTheme() {

    ThemeItem(themeName = "test21klrioweqfiowfe", icon = R.drawable.dummy_image)
}

@Composable
fun ThemeItem(icon: Int = 0, themeName: String) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(4.dp))
            .wrapContentSize()
    ) {
        Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
            Spacer(modifier = Modifier.width(6.dp))
            Text(modifier = Modifier, text = themeName)
        }
    }
}