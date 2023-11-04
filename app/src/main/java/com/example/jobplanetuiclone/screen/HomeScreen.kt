package com.example.jobplanetuiclone.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
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
    Scaffold {
        Column {
            TopMenu()
            BannerRotation()
            JobsMenu()
            JobRecommendation()
            JobTheme()
            ThemeRecommendation()
        }
    }
}