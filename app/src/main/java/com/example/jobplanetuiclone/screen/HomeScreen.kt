package com.example.jobplanetuiclone.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jobplanetuiclone.ui_component.BannerRotation
import com.example.jobplanetuiclone.ui_component.JobRecommendation
import com.example.jobplanetuiclone.ui_component.JobTheme
import com.example.jobplanetuiclone.ui_component.JobsMenu
import com.example.jobplanetuiclone.ui_component.ThemeRecommendation
import com.example.jobplanetuiclone.ui_component.TopMenu

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val scrollState = rememberScrollState()
    Scaffold {
        Column(modifier = Modifier.verticalScroll(scrollState)) {
            TopMenu()
            BannerRotation()
            Spacer(modifier = Modifier.height(10.dp))
            JobsMenu()
            Spacer(modifier = Modifier.height(30.dp))
            JobRecommendation()
            Spacer(modifier = Modifier.height(30.dp))
            JobTheme()
            ThemeRecommendation()
        }
    }
}