package com.amigo.composecomponent

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

val customFont = FontFamily(
    Font(R.font.lexend_black, FontWeight.Black),
    Font(R.font.lexend_thin, FontWeight.Thin),
    Font(R.font.lexend_regular, FontWeight.Normal),
    Font(R.font.lexend_semibold, FontWeight.SemiBold),
    Font(R.font.lexend_light, FontWeight.Light),
    Font(R.font.lexend_medium, FontWeight.Medium),
    Font(R.font.lexend_extralight, FontWeight.ExtraLight),
    Font(R.font.lexend_bold, FontWeight.Bold),
    Font(R.font.lexend_extrabold, FontWeight.ExtraBold),
)

@Composable
fun TextStyling() {
    Text(
        buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = 50.sp,
                    fontFamily = customFont,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Red
                )
            ){
                append("S")
            }
            append("umant")
            withStyle(
                style = SpanStyle(
                    fontSize = 50.sp,
                    fontFamily = customFont,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Red
                )
            ){
                append(" K")
            }
            append("ushwaha")
        },
        fontSize = 40.sp,
        fontFamily = customFont,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold,
        color = Color.Green
    )
}