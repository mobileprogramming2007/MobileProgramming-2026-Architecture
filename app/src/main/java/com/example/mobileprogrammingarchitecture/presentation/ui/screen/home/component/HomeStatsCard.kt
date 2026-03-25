package com.example.mobileprogrammingarchitecture.presentation.ui.screen.home.component

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mobileprogrammingarchitecture.presentation.theme.MobileProgrammingArchitectureTheme

@Composable
fun HomeStatsCard(
    level: Int,
    xp: Int,
    streak: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.Gray)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Player Stats",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Cyan
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Level: $level", color = Color.DarkGray)
            Text(text = "XP: $xp", color = Color.Cyan)
            Text(text = "Streak: $streak days", color = Color.DarkGray)
        }
    }
}

@Preview
@Composable
private fun HomeStatsCardPreview() {
    MobileProgrammingArchitectureTheme {
        HomeStatsCard(
            level = 2,
            xp = 123,
            streak = 5
        )
    }
}

