package com.pool.app.common.smallWidget

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.pool.app.dummyData.PostItem
import com.pool.theme.Black
import com.pool.theme.Black02
import com.pool.theme.Gray5B
import com.pool.theme.HintTextColorABAFB4
import com.pool.theme.TextSize10
import com.pool.theme.TextSize12
import com.pool.theme.TextSize14
import com.pool.theme.semiBold
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource
import poolapp.composeapp.generated.resources.Res

@Composable
fun Poll(post: PostItem.PollPost, routs: (String) -> Unit) {


    var alertMessage by remember { mutableStateOf("") }
    var type by remember { mutableStateOf("") }


    LaunchedEffect(alertMessage) {
        delay(3000) // 3 seconds
        alertMessage = ""
    }




    Box(
        modifier = Modifier.padding(vertical = 4.dp)
            .background(Color.White, shape = RoundedCornerShape(8.dp)).fillMaxWidth().height(330.dp)
            .height(225.dp).shadow(
                elevation = 12.dp,
                shape = RoundedCornerShape(8.dp),
                ambientColor = Color.Black.copy(alpha = 0.4f),
                spotColor = Color.Black.copy(alpha = 0.5f)
            )
            .background(Color.White, RoundedCornerShape(8.dp))

    ) {

        /* Card(
             modifier = Modifier.fillMaxSize(),
             shape = RoundedCornerShape(8.dp),
             colors = CardDefaults.cardColors(containerColor = Color.White),
             elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
         ) {*/

        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 14.dp, start = 14.dp, end = 14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {

                Row(
                    modifier = Modifier.weight(0.70f), horizontalArrangement = Arrangement.Start
                ) {
                   /* Image(
                        modifier = Modifier,
                        painter = painterResource(resource = Res.drawable.profile_image),
                        contentDescription = "Location Icon"
                    )*/

                    Column(modifier = Modifier) {

                        Row(
                            modifier = Modifier.padding(start = 4.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Profile Name",
                                style = TextSize14().semiBold(),
                                color = Black
                            )

                        }

                        Text(
                            modifier = Modifier.padding(start = 4.dp, top = 4.dp),
                            text = "1 W",
                            style = TextSize10(),
                            color = Gray5B
                        )


                    }

                }

            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                modifier = Modifier.fillMaxWidth().padding(start = 14.dp, end = 25.dp),
                text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna?",
                style = TextSize12(),
                color = Gray5B,
                maxLines = 2
            )


            Spacer(modifier = Modifier.height(10.dp))



            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
            ) {
                PollWithProgress()
            }

            /*Column(modifier = Modifier.fillMaxWidth().height(135.dp)) {
                PollWithProgress()
            }*/




            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 14.dp, start = 14.dp, end = 14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {

                Row(
                    modifier = Modifier.weight(0.50f), horizontalArrangement = Arrangement.End
                ) {

                    Text(
                        modifier = Modifier.padding(start = 0.dp),
                        text = "518 Comments .",
                        style = TextSize12(),
                        color = HintTextColorABAFB4
                    )
                    Spacer(modifier = Modifier.width(3.dp))


                    Text(
                        modifier = Modifier.padding(start = 0.dp),
                        text = "791 Shared",
                        style = TextSize12(),
                        color = HintTextColorABAFB4
                    )

                }


            }

            Spacer(modifier = Modifier.height(10.dp))

            Divider(
                modifier = Modifier.padding(horizontal = 14.dp),
                color = Color(0xFFF6F6F6),
                thickness = 1.dp
            ) // Line separator
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth().padding(start = 14.dp, end = 14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {




            }


        }


    }



    /*   }*/

}

@Composable
fun PollWithProgress() {
    var selectedOption by remember { mutableStateOf(-1) } // Track selected option
    val percentages = listOf(25, 45, 30) // Example percentages for each option

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(162.dp)
            .padding(start = 14.dp, end = 14.dp, top = 2.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        (1..3).forEach { option ->
            Box(
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .fillMaxWidth()
                    .height(44.dp)
                    .clickable {
                        selectedOption = option // Set selected option when clicked
                    },
                contentAlignment = Alignment.CenterStart
            ) {
                // Background progress bar (always visible)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .border(
                            width = 1.dp,
                            color = if (selectedOption != -1) BorderColor else BorderColor,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .background(Color.White, shape = RoundedCornerShape(10.dp))
                )

                // Filled progress (visible when any option is selected)
                if (selectedOption != -1) {

                    val animatedProgress by animateFloatAsState(
                        targetValue = percentages[option - 1] / 100f, // Target progress percentage
                        animationSpec = tween(durationMillis = 10000) // Animation duration (1 second)
                    )


                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(animatedProgress) // Adjust width based on percentage
                                .fillMaxHeight()
                                .clip(
                                    RoundedCornerShape(
                                        topStart = 10.dp,
                                        bottomStart = 10.dp
                                    )
                                ) // Clip only the end corners
                                .background(
                                    color = Purple, // Solid purple color
                                )
                        )
                    }
                }

                // Text and percentage labels
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {


                    Text(
                        text = "Option #$option",
                        modifier = Modifier
                            .weight(1f) // Allocate space for the text
                            .padding(start = 16.dp) // Add padding to shift the text to the left
                            .wrapContentWidth(
                                if (selectedOption != -1) Alignment.Start else Alignment.CenterHorizontally
                            ), // Align text to start if selected, else center
                        style = TextSize14(),
                        color = if (selectedOption != -1) Black02 else Black02 // Change text color when any option is selected
                    )


                    if (selectedOption != -1) {
                        Text(
                            text = "${percentages[option - 1]}%",
                            modifier = Modifier.padding(end = 16.dp),
                            style = TextSize14(),
                            color = Black02 // Black color for percentage
                        )
                    }
                }
            }
        }
    }
}





// Define colors
val Purple = Color(0xFFECCEFF) // Purple color for progress and text
val BorderColor = Color(0xFFDFDFDF) // Light gray for border




