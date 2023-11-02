package com.compose.playzone.screen.home.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.playzone.R
import com.compose.playzone.screen.home.presentation.components.IconGameCard
import com.compose.playzone.screen.home.presentation.components.ImageGameCard
import com.compose.playzone.screen.home.presentation.components.InstallButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val images = listOf(R.drawable.image_game_1, R.drawable.image_game_2)
    Box(
        Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = "null",
            contentScale = ContentScale.FillWidth
        )
        Box(modifier = Modifier.align(Alignment.BottomCenter)) {
            Box(modifier = Modifier.border(1.dp, Color.Black)) {
                Column(
                    modifier = Modifier
                        .height((screenHeight / 1.42).dp)
                        .verticalScroll(rememberScrollState())
                        .background(MaterialTheme.colorScheme.primary)
                        .fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.height(94.dp))
                    Text(
                        modifier = Modifier.padding(horizontal = 24.dp), text =
                        stringResource(R.string.description),
                        style = MaterialTheme.typography.bodyMedium
                            .copy(color = MaterialTheme.colorScheme.surfaceTint.copy(alpha = 0.7f))
                    )
                    Spacer(modifier = Modifier.height(43.dp))
                    LazyRow(
                        contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
                        horizontalArrangement = Arrangement.spacedBy(14.dp),
                        content = {
                            items(images) { item ->
                                ImageGameCard(item)
                            }
                        },
                    )
                    Spacer(modifier = Modifier.height(51.dp))
                    CompositionLocalProvider(
                        LocalMinimumInteractiveComponentEnforcement provides false,
                    ) {
                        InstallButton()
                    }
                }
            }
            IconGameCard(
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
                    .height(84.dp)
                    .offset(24.dp, (-screenHeight / 2.8).dp)
                    .width(84.dp),
            )
        }
    }
    Box(
        modifier = Modifier
            .height(130.dp)
            .fillMaxWidth()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Black,
                        Color.Black.copy(alpha = 0F),
                    ),
                )
            ),
    )
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}