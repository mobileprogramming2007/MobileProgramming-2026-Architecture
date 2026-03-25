package com.example.mobileprogrammingarchitecture.presentation.ui.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mobileprogrammingarchitecture.presentation.theme.MobileProgrammingArchitectureTheme
import com.example.mobileprogrammingarchitecture.presentation.ui.component.ScreenHeader
import com.example.mobileprogrammingarchitecture.presentation.ui.screen.home.component.HomeStatsCard

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        ScreenHeader(
            title = "Home",
            subtitle = "Welcome back to LifeRPG"
        )
        Spacer(modifier = Modifier.height(16.dp))
        HomeStatsCard(
            level = 3,
            xp = 120,
            streak = 5
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    MobileProgrammingArchitectureTheme {
        HomeScreen()
    }
}