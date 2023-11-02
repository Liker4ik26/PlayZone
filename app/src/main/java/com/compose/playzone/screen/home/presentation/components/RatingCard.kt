package com.compose.playzone.screen.home.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.compose.playzone.R

@Composable
fun RatingCard(modifier: Modifier = Modifier, rating: Float) {
    Row(modifier = modifier) {
        Text(
            text = stringResource(R.string._4_9),
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
        Spacer(modifier = Modifier.width(18.dp))
        Column {
            Spacer(modifier = Modifier.height(20.dp))
            RatingBar(rating = rating, spaceBetween = 4.3.dp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                stringResource(R.string._70m_reviews), style = MaterialTheme.typography.displaySmall
                    .copy(color = Color.White.copy(0.4f))
            )
        }
    }
}