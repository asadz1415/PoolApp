package com.pool.app.mainScreens

import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pool.theme.Light
import com.pool.theme.TextSize12
import com.pool.theme.TextSize24
import com.pool.theme.bold
import kotlinx.coroutines.delay
import androidx.compose.runtime.*
import com.pool.app.navigationControler.Screen


@Composable
fun DashboardScreen(newRoute: (String) -> Unit) {
    Spacer(modifier = Modifier.height(15.dp))
    Column(modifier = Modifier.padding(horizontal = 14.dp, vertical = 20.dp)) {
        Text("Join the Pool Frenzy!", style = TextSize24().bold(), color = Color.Black)
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            "Predict the Winner and See What Others Think!",
            style = TextSize12().Light(),
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(45.dp))

        // Row for two cards
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp) // Space between cards
        ) {
            // Card 1: Post Pool
            AnimatedCard(
                title = "Post Pool",
                description = "Create and share your own pool.",
                backgroundColor = Color.LightGray,
                textFromTop = true,
                textFromLeft = true,
                modifier = Modifier.weight(1f), // Take half the width
                        routs=newRoute
            )

            // Card 2: Pools List
            AnimatedCard(
                title = "Pools List",
                description = "View and vote on existing pools.",
                backgroundColor = Color.Gray,
                textFromTop = true,
                textFromLeft = false,
                modifier = Modifier.weight(1f) ,// Take half the width
                routs=newRoute
            )
        }
    }
}

@Composable
fun AnimatedCard(
    title: String,
    description: String,
    backgroundColor: Color,
    textFromTop: Boolean,
    textFromLeft: Boolean,
    modifier: Modifier = Modifier,
    routs: (String) -> Unit
) {
    val cardHeight = 150.dp
    val animationDuration = 1000
    val animationSpec = tween<IntOffset>(durationMillis = animationDuration)

    var startAnimation by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        delay(300)
        startAnimation = true
    }

    // Animation for text coming from the top
    val textOffsetY by animateIntOffsetAsState(
        targetValue = if (startAnimation) IntOffset(0, 0) else IntOffset(0, -200),
        animationSpec = animationSpec, label = ""
    )

    // Animation for text coming from the left or right
    val textOffsetX by animateIntOffsetAsState(
        targetValue = if (startAnimation) IntOffset(0, 0) else IntOffset(if (textFromLeft) -200 else 200, 0),
        animationSpec = animationSpec, label = ""
    )

    Card(
        modifier = modifier
            .height(cardHeight)
            .padding(5.dp),
        elevation = 4.dp, // Optional: Adds shadow for a better UI
        shape = RoundedCornerShape(8.dp) // Rounded corners for the card
    ) {
        Box(
            modifier = Modifier.clickable {
                if(title=="Post Pool"){
                    routs.invoke(Screen.CreatePoolScreenFlow.route)
                }else{
                    routs.invoke(Screen.PoolListingScreenFlow.route)

                }

            }
                .fillMaxSize()
                .background(backgroundColor) // Set background color here
        ) {
            // Text coming from the top and centered
            Column(
                modifier = Modifier
                    .align(Alignment.Center) // Center the text vertically and horizontally
                    .offset { textOffsetY },
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = title,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.offset { textOffsetX }
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = description,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.offset { textOffsetX }
                )
            }
        }
    }
}