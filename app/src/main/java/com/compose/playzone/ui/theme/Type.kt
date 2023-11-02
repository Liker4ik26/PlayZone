package com.compose.playzone.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.compose.playzone.R

val SkModernist = FontFamily(
    Font(R.font.sk_modernist_regular, FontWeight.Normal),
    Font(R.font.sk_modernist_bold, FontWeight.Bold),
    Font(R.font.sk_modernist_mono, FontWeight.Medium),
)

val Montserrat = FontFamily(
    Font(R.font.montserrat, FontWeight.Medium),
)

val Typography = Typography(

    titleLarge = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        lineHeight = 57.6.sp,
        letterSpacing = 0.5.sp
    ),
    titleMedium = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.5.sp
    ),
    titleSmall = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 19.2.sp,
        letterSpacing = 0.6.sp
    ),
    labelSmall = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 19.2.sp,
        letterSpacing = 0.6.sp
    ),
    displaySmall =  TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 14.4.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 19.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 14.4.sp,
        letterSpacing = 0.5.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 12.19.sp,
        letterSpacing = 0.5.sp
    ),
    displayMedium = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    ),
)