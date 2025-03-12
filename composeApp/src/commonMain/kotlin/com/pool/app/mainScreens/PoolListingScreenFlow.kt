package com.pool.app.mainScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.pool.app.common.smallWidget.Poll
import com.pool.app.dummyData.PostItem
import poolapp.composeapp.generated.resources.Res
import poolapp.composeapp.generated.resources.ic_closed_ioc

@Composable
fun PoolListingScreenFlow(newRoute: (String) -> Unit) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){

        items(getPosts()) { post ->
            when (post) {
                is PostItem.ImagePost -> ""
                is PostItem.PollPost -> Poll(post,routs=newRoute)
            }

            Spacer(modifier = Modifier.height(10.dp))
        }

    }

}

fun getPosts(): List<PostItem> {
    return listOf(

        PostItem.PollPost(
            userName = "Ms Incredible",
            userImage = Res.drawable.ic_closed_ioc,
            percentages = listOf(25, 45, 30),
            likes = "2,618",
            comments = "518 Comments",
            shares = "791 Shared"
        ),


        PostItem.PollPost(
            userName = "Ms Incredible",
            userImage = Res.drawable.ic_closed_ioc,
            percentages = listOf(35, 65, 900),
            likes = "2,618",
            comments = "518 Comments",
            shares = "791 Shared"
        ),

    )
}