package com.example.jobplanetuiclone.ui_component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
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
import com.example.jobplanetuiclone.model.DummyTheme

@Composable
fun JobTheme() {
    RowTitle(title = "재직자 리뷰에서 찾은 공고")
    LazyHorizontalGrid(
        modifier = Modifier.height(140.dp),
        rows = GridCells.Fixed(2),
        content = {
            items(dummyThemes, key = { it.themeName }) {
                ThemeItem(themeName = it.themeName)
            }
        })
}
val dummyThemeNames = listOf(
    "Ocean Breeze",
    "Autumn Leaves",
    "Midnight Serenade",
    "Sunny Meadows",
    "Enchanted Forest",
    "Urban Jungle",
    "Vintage Elegance"
)
val dummyThemes = List(7) { index ->
    DummyTheme(
        icon = R.drawable.dummy_image, // 아이콘 리소스 ID를 원하는 이미지로 변경
        themeName = dummyThemeNames[index]
    )
}

@Composable
fun ThemeItem(icon: Int = 0, themeName: String) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(4.dp))
            .wrapContentSize()
    ) {
        Row(modifier = Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
            Spacer(modifier = Modifier.width(6.dp))
            Text(modifier = Modifier, text = themeName)
        }
    }
}