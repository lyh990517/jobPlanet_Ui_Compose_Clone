package com.example.jobplanetuiclone.ui_component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jobplanetuiclone.R
import com.example.jobplanetuiclone.model.DummyJobInfo

@Composable
fun JobRecommendation(title: String) {
    RowTitle(title = title, "전체 보기 >")
    JobRow()
}

val dummyJobs = listOf(
    DummyJobInfo("Software Engineer", "ABC Inc.", R.drawable.dummy_image),
    DummyJobInfo("Data Analyst", "XYZ Corp.", R.drawable.dummy_image),
    DummyJobInfo("Product Manager", "123 Industries", R.drawable.dummy_image),
    DummyJobInfo("UX Designer", "PQR Ltd.", R.drawable.dummy_image),
    DummyJobInfo("Marketing Specialist", "LMN Group", R.drawable.dummy_image),
    DummyJobInfo("QA Engineer", "TestCo", R.drawable.dummy_image),
    DummyJobInfo("Business Analyst", "Beta Corp.", R.drawable.dummy_image),
    DummyJobInfo("Graphic Designer", "DesignX", R.drawable.dummy_image)
)

@Composable
fun JobRow() {
    LazyRow(Modifier.padding(8.dp)) {
        items(dummyJobs, key = { it.company }) {
            JobItem(position = it.position, company = it.company, image = it.image)
        }
    }
}

@Composable
fun JobItem(position: String, company: String, image: Int = 0) {
    Column(
        Modifier
            .wrapContentSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Card(
            Modifier
                .size(width = 200.dp, height = 120.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Gray)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = image),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
        Text(text = position)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.Star, contentDescription = "")
            Text(modifier = Modifier.padding(horizontal = 4.dp), text = "5.0", fontSize = 12.sp)
            Text(text = company)
        }
        Text(text = "취업축하금: 200만원")
    }
}