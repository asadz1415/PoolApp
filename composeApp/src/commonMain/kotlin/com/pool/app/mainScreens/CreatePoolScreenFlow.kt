package com.pool.app.mainScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pool.app.common.AddPoolButtonBorder
import com.pool.app.common.buttonHeight
import com.pool.app.navigationControler.Screen
import com.pool.theme.Black
import com.pool.theme.Normal
import com.pool.theme.TextSize14
import com.pool.theme.semiBold
import com.pool.theme.viewALlColor
import kotlinx.coroutines.delay
import com.pool.app.common.MainButton1
import org.jetbrains.compose.resources.painterResource
import poolapp.composeapp.generated.resources.Res
import poolapp.composeapp.generated.resources.ic_closed_ioc

@Composable
fun CreatePoolScreenFlow(newRoute: (String) -> Unit) {

    var alertMessage by remember { mutableStateOf("") }
    var question by remember { mutableStateOf("") }
    var options by remember { mutableStateOf(listOf("Option #1", "Option #2", "Option #3")) }
    val keyboardController = LocalSoftwareKeyboardController.current

    if(alertMessage.isNotEmpty()){
        LaunchedEffect(alertMessage) {
            delay(3000) // 3 seconds
            alertMessage = ""
            newRoute.invoke(Screen.DashboardScreen.route)

        }
    }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 80.dp) // Add padding to avoid overlap with the Submit Button
        ) {
            // Title
            Text(
                text = "Ask your question",
                style = TextSize14().semiBold(),
                color = Black,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Question Input
            BasicTextField(
                value = question,
                onValueChange = { question = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(114.dp)
                    .border(
                        width = 0.8.dp,
                        color = Color(0xFFDFDFDF),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.White)
                    .padding(12.dp),
                textStyle = TextSize14().Normal(),
                decorationBox = { innerTextField ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.TopStart
                    ) {
                        if (question.isEmpty()) {
                            Text(
                                text = "Not more than 190 words..",
                                style = TextSize14(),
                                color = viewALlColor
                            )
                        }
                        innerTextField()
                    }
                }
            )

            Spacer(modifier = Modifier.height(15.dp))

            // Title
            Text(
                text = "Choose your options",
                style = TextSize14().semiBold(),
                color = Black,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Options List
            options.forEachIndexed { index, option ->
                OptionItem(
                    option = option,
                    onOptionChange = { newValue ->
                        options = options.toMutableList().apply { set(index, newValue) }
                    },
                    showCloseIcon = index > 1,
                    onCloseClick = {
                        options = options.toMutableList().apply { removeAt(index) }
                    }
                )
            }

            Spacer(modifier = Modifier.height(15.dp))

            // Add Option Button
            AddPoolButtonBorder(
                heading = "Add Option",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(buttonHeight)
            ) {
                keyboardController?.hide()
                options = options + "Option #${options.size + 1}"
            }
        }

        // Submit Button (Fixed at the bottom)
        MainButton1(
            heading = "Submit",
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .align(Alignment.BottomCenter) // Align at the bottom
        ) {
            keyboardController?.hide()
            alertMessage="Post Uploaded Successfully"
            // Handle submit action
        }

        Spacer(modifier = Modifier.height(35.dp))
    }


    if (alertMessage.isNotEmpty()) {
     /*   println("alertMessage ")
        AlertMessageDialog(
            message = alertMessage,
            resource = Res.drawable.ic_cross,
            resourceTick = Res.drawable.ic_tick_dialog,
        ) { onClick ->
            alertMessage = ""
            if (!onClick) {
                dashboardRouts.invoke(DashboardSubScreen.HomeScreen.route)
            }
        }*/
    }

}


@Composable
fun OptionItem(
    option: String,
    onOptionChange: (String) -> Unit,
    showCloseIcon: Boolean,
    onCloseClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(50.dp) // Set fixed height to 50dp
            .padding(vertical = 4.dp)
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(8.dp)
            )
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp)
        ) {
            BasicTextField(
                value = option,
                onValueChange = onOptionChange,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center // Center the input text horizontally
                ),
                singleLine = true,
                decorationBox = { innerTextField ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center // Center both hint and text
                    ) {
                        if (option.isEmpty()) {
                            Text(
                                text = "Enter option...",
                                style = TextStyle(fontSize = 16.sp, color = Color.LightGray),
                                textAlign = TextAlign.Center
                            )
                        }
                        innerTextField()
                    }
                }
            )

            if (showCloseIcon) {
                IconButton(
                    onClick = onCloseClick,
                    modifier = Modifier.size(10.dp) // Set size of the icon
                ) {
                    Icon(
                        painter = painterResource(resource = Res.drawable.ic_closed_ioc), // Replace with your close icon resource
                        contentDescription = "Remove Option",
                        tint = Color.Black
                    )
                }
            }
        }
    }
}