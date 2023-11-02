package com.compose.playzone.screen.home.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.compose.playzone.R

@Composable
fun PlayButton(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier,
        content = {
            Box(
                modifier = Modifier
                    .background(Color.White.copy(.2f))
                    .border(
                        BorderStroke(
                            1.dp,
                            Brush.linearGradient(
                                listOf(
                                    Color.White.copy(0f),
                                    Color.White.copy(0.4f),
                                )
                            )
                        ),
                        CircleShape
                    )
                    .blur(
                        radius = 16.dp,
                        edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(8.dp))
                    )
                    .size(48.dp)

                    .clip(CircleShape),
            )
            Image(
                modifier = Modifier.align(Alignment.Center),
                painter = painterResource(id = R.drawable.play_icon),
                contentDescription = null,
            )

        }
    )
}