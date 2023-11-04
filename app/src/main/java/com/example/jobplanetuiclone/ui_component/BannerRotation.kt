package com.example.jobplanetuiclone.ui_component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
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
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun BannerRotation() {
    val pagerState = rememberPagerState(
        initialPage = 5,
    )
    HorizontalPager(pagerState.currentPage) { page ->
        Banner(page)
    }
}

val dummyRecommendations = listOf(
    "전 현직원 추천",
    "높은 연봉으로 보상받아요",
    "훌륭한 업무 환경",
    "팀 협업 강화",
    "석사학위 지원",
    "창의적인 프로젝트 기회",
    "전문 역량 개발 지원",
    "워라밸 프로그램 제공",
    "포괄적인 복지 혜택",
    "글로벌 업무 기회"
)

@Composable
fun Banner(page: Int) {
    Card(
        modifier = Modifier
            .height(150.dp)
            .fillMaxWidth()
            .padding(10.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(Color.Gray)
    ) {
        Row(
            Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                Modifier
                    .weight(1f)
                    .padding(20.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = dummyRecommendations[page * 2], fontSize = 15.sp)
                Text(text = dummyRecommendations[page * 2 + 1], fontSize = 18.sp)
                Text(text = "채용 공고 보기 >", fontSize = 12.sp)
            }
            Image(
                modifier = Modifier
                    .padding(20.dp)
                    .size(50.dp),
                painter = painterResource(id = R.drawable.dummy_image),
                contentDescription = "icon",
                contentScale = ContentScale.Crop
            )
        }
    }
}
