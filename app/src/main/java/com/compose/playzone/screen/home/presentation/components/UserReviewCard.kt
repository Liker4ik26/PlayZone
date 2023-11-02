package com.compose.playzone.screen.home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.compose.playzone.screen.home.presentation.models.UserModel

@Composable
fun UserReviewCard(userModel: UserModel) {
    Column(modifier = Modifier.padding(horizontal = 24.dp)) {
        Row {
            Image(
                painter = painterResource(userModel.image),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = userModel.fullName,
                    style = MaterialTheme.typography.labelSmall
                        .copy(color = MaterialTheme.colorScheme.surfaceTint)
                )
                Spacer(modifier = Modifier.height(7.dp))
                Text(
                    text = userModel.date,
                    style = MaterialTheme.typography.displaySmall
                        .copy(color = MaterialTheme.colorScheme.surfaceTint.copy(.4f))
                )
            }
        }
        Spacer(modifier = Modifier.height(17.dp))
        Text(
            text = userModel.description,
            style = MaterialTheme.typography.displayMedium
                .copy(color = MaterialTheme.colorScheme.onTertiary)
        )
    }
}