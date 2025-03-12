package com.pool.app.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.pool.theme.TextSize14
import com.pool.theme.TextSize16
import com.pool.theme.White
import com.pool.theme.mainButtonGradient
import com.pool.theme.semiBold

@Composable
fun AddPoolButtonBorder(
    modifier: Modifier = Modifier.fillMaxWidth().height(buttonHeight),
    heading: String = "Next",

    clicked: (Boolean) -> Unit
) {
    Box(modifier = modifier.clip(shape = roundedShapeForInput)
        .background(shape = roundedShapeForInput, color = Color.Transparent)
        .border(width = 1.dp, color = Color(0xFF9336CC), shape = roundedShapeForInput)
        .clickable { clicked.invoke(true) }
    ) {
        AddPoolMainButton1(heading = heading)
    }
}

@Composable
private fun AddPoolMainButton1(heading: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = heading, style = TextSize14().semiBold(), color = Color(0xFF5B5B5B))
    }
}


@Composable
fun MainButton1(
    modifier: Modifier = Modifier.fillMaxWidth().height(buttonHeight),
    heading: String = "Next",

    clicked: (Boolean) -> Unit
) {
    Box(modifier = modifier.clip(shape = roundedShapeForInput)
        .background(shape = roundedShapeForInput, brush = mainButtonGradient)
        .clickable { clicked.invoke(true) }
    ) {
        SingleMainButton(heading = heading)
    }
}


@Composable
private fun SingleMainButton(heading: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = heading, style = TextSize16().semiBold(), color = White)
    }
}


val buttonHeight = 50.dp
val roundedShapeForInput = RoundedCornerShape(
    bottomStart = 10.dp,
    bottomEnd = 10.dp,
    topStart = 10.dp,
    topEnd = 10.dp
)