package com.pool.theme


import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

// Neutral Colors
val Black = Color(0xFF000000)
val Black10Per = Color(0x1A000000)
val Black02 = Color(0xFF020202)
val Black44 = Color(0xFF444444)
val White = Color(0xFFFFFFFF)
val chatBg=Color(0xFFF7F6FE)
val RedF80B1C = Color(0xFFF80B1C)
val RedD52020 = Color(0xFFFD52020)
val Gray82 = Color(0xFF828282)
val Gray767680Per12 = Color(0x1A767680)
val GreyColor=Color(0xFF5B5B5B)
val chatColors=Color(0xFFF9F9F9)

val ScreenBackColor = Color(0xFFF5FBFE)
val dividerColorE6E6E6 = Color(0xFFE6E6E6)
val dividerColor787880Per20 = Color(0x78788033)

val headingColor = Color(0xFF250A3D)
val viewALlColor = Color(0xFFABAFB4)
val addressColor = Color(0xFF5B5B5B)
val commentTitleColor=Color(0xFF585858)

//Gray Colors
val Gray5A = Color(0xFF5A5A5A)
val Gray9C = Color(0xFF9C9C9C)
val Gray353A47 = Color(0xFF353A47)
val GrayD9 = Color(0xFFD9D9D9)
val Gray50 = Color(0xFF505050)
val Gray69 = Color(0xFF696969)
val Gray35 = Color(0xFF353A47)
val Gray45 = Color(0xFF454242)
val GrayF7 = Color(0xFFF7F7F7)
val GrayF0 = Color(0xFFF0F0F0)
val GrayE4 = Color(0xFFE4E4E4)
val GrayFC = Color(0xFFFCFCFC)
val GrayF5 = Color(0xFFF5F5F5)
val Gray5B = Color(0xFF5B5B5B)
val GrayF6 = Color(0xFFF6F6F6)
val GrayF2 = Color(0xFFF2F2F2)
val Gray99 = Color(0xFF999999)

val purple15Per = Color(0x269336CC)
val purpleEFE1F8 = Color(0xFFEFE1F8)

val BorderColor=Color(0xFFDFDFDF)
val BorderColorPurple = Color(0xFF9336CC)


val HintTextColorABAFB4 = Color(0xFFABAFB4)
val TextColor250A3D = Color(0xFF250A3D)
val TextColor7622BD = Color(0xFF7622BD)

val inPutBackgroundColor = Color.White
val inPutBoarderColor = Color(0xFFF2F2F2)
val inPutBoarderColorDFDFDF = Color(0xFFDFDFDF)

// Brand/Primary Colors
val PrimaryBlue = Color(0xFF407FFC)
val AccentRed = Color(0xFFF1586C)
val AccentRed_70 = Color(0xB3F1586C)
val Green = Color(0xFF32C254)
val LocColor = Color(0xFF353A47)
val ToolbarColor = Color(0xFF353A47)


var mainButtonGradient = Brush.linearGradient(
    colors = listOf(
        AccentRed,
        Color(0xFF714FDB),
        PrimaryBlue
    ),
    start = Offset(0f, 0f),
    end = Offset(1000f, 500f)
)

var editButtonGradient = Brush.linearGradient(
    colors = listOf(
        AccentRed,
        Color(0xFF714FDB),
        PrimaryBlue
    ),
    start = Offset(0f, 0f),
    end = Offset(230f, 100f)
)