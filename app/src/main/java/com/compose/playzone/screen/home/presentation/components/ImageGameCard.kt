package com.compose.playzone.screen.home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImageGameCard(image: Int) {
    Card(modifier = Modifier.height(128.dp)) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "null",
            contentScale = ContentScale.Fit
        )
    }
}