package com.compose.playzone.screen.home.utils

import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun ContentDrawScope.drawNeonStroke(radius: Dp) {
    this.drawIntoCanvas {
        val paint =
            Paint().apply {
                style = PaintingStyle.Stroke
                strokeWidth = 6f
            }

        val frameworkPaint =
            paint.asFrameworkPaint()

        val color = Color(0xFFF4D144)

        this.drawIntoCanvas {
            frameworkPaint.color = color.copy(alpha = 0f).toArgb()
            frameworkPaint.setShadowLayer(
                radius.toPx(), 0f, 0f, color.copy(alpha = .28f).toArgb()
            )
            it.drawRoundRect(
                left = 0f,
                right = size.width,
                bottom = size.height,
                top = 0f,
                radiusY = radius.toPx(),
                radiusX = radius.toPx(),
                paint = paint
            )
            drawRoundRect(
                color = Color(0xFFF4D144),
                size = size,
                cornerRadius = CornerRadius(radius.toPx(), radius.toPx()),
                style = Stroke(width = 1.dp.toPx())
            )
        }
    }
}
