package com.compose.playzone.screen.home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.playzone.R

@Composable
fun ImageGameCard(image: Int) {
    Card(modifier = Modifier.height(128.dp)) {
        Box {
            Image(
                painter = painterResource(id = image),
                contentDescription = "null",
                contentScale = ContentScale.Fit
            )
            PlayButton(
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(48.dp)
                    .clip(CircleShape),
            )
        }
    }
}

@Preview
@Composable
fun ImageGameCardPreview() {
    ImageGameCard(R.drawable.image)
}