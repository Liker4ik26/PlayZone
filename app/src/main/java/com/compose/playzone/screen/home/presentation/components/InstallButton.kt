package com.compose.playzone.screen.home.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.playzone.R
import com.compose.playzone.screen.home.utils.drawNeonStroke

@Composable
fun InstallButton() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(vertical = 20.dp)
            .fillMaxWidth()
            .height(64.dp)
            .padding(horizontal = 24.dp)
            .drawWithContent {
                drawContent()
                drawNeonStroke(12.dp)
            },
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondary,
        )
    ) {
        Text(
            text = stringResource(R.string.button_text),
            style = MaterialTheme.typography.titleMedium.copy(color = MaterialTheme.colorScheme.primary)
        )
    }
}

@Preview
@Composable
fun InstallButtonPreview() {
    InstallButton()
}