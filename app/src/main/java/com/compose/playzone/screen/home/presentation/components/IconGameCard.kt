package com.compose.playzone.screen.home.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.playzone.R

@Composable
fun IconGameCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color.Black,
        ),
        elevation = CardDefaults.elevatedCardElevation(10.dp),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.onSecondary)
    ) {
        Image(
            painter = painterResource(id = R.drawable.icon_game),
            contentDescription = null,
            modifier = Modifier
                .padding(17.dp)

        )
    }
}

@Preview
@Composable
fun IconGameCardPreview() {
    IconGameCard()
}