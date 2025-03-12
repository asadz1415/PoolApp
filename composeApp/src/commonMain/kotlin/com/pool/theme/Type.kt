package com.pool.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import poolapp.composeapp.generated.resources.Res
import poolapp.composeapp.generated.resources.sf_pro_display_bold_700
import poolapp.composeapp.generated.resources.sf_pro_display_light_300
import poolapp.composeapp.generated.resources.sf_pro_display_medium_500
import poolapp.composeapp.generated.resources.sf_pro_display_regular_400
import poolapp.composeapp.generated.resources.sf_pro_display_semi_bold_600


@Composable
fun FustatFontFamily() = FontFamily(
    Font(Res.font.sf_pro_display_light_300, weight = FontWeight.Light),
    Font(Res.font.sf_pro_display_regular_400, weight = FontWeight.Normal),
    Font(Res.font.sf_pro_display_medium_500, weight = FontWeight.Medium),
    Font(Res.font.sf_pro_display_semi_bold_600, weight = FontWeight.SemiBold),
    Font(Res.font.sf_pro_display_bold_700, weight = FontWeight.Bold)
)

@Composable
fun NavigationButtonText(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 13.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
        lineHeight = 18.46.sp, // Line height
        letterSpacing = (-0.1).sp, // Letter spacing
        textAlign = TextAlign.Center, // Text alignment
        textDecoration = TextDecoration.None // No underline
    )
}
@Composable
fun TextSize8(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 8.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}

@Composable
fun TextSize9(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 9.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}

@Composable
fun TextSize10(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 10.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}

@Composable
fun TextSize11(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 11.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize12(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 12.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}


@Composable
fun TextSize13(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 13.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize14(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 14.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize15(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 15.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize16(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 16.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize17(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 17.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize18(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 18.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize20(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 20.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize22(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 22.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize24(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 24.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize28(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 28.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize33(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 33.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize30(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 30.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextSize42(): TextStyle {
    val fontFamily = FustatFontFamily() // Get custom font family

    return TextStyle(
        fontFamily = fontFamily,
        fontSize = 42.sp, // Font size
        fontWeight = FontWeight.Normal, // Font weight
    )
}
@Composable
fun TextStyle.bold():TextStyle {
    return this.copy(fontWeight = FontWeight.Bold)
}
@Composable
fun TextStyle.semiBold():TextStyle {
    return this.copy(fontWeight = FontWeight.SemiBold)
}
@Composable
fun TextStyle.boldExtraBold():TextStyle {
    return this.copy(fontWeight = FontWeight.ExtraBold)
}
@Composable
fun TextStyle.boldLight():TextStyle {
    return this.copy(fontWeight = FontWeight.Light)
}
@Composable
fun TextStyle.boldExtraLight():TextStyle {
    return this.copy(fontWeight = FontWeight.ExtraLight)
}
@Composable
fun TextStyle.Medium():TextStyle {
    return this.copy(fontWeight = FontWeight.Medium)
}
@Composable
fun TextStyle.Normal():TextStyle {
    return this.copy(fontWeight = FontWeight.Normal)
}
@Composable
fun TextStyle.Light():TextStyle {
    return this.copy(fontWeight = FontWeight.Light)
}