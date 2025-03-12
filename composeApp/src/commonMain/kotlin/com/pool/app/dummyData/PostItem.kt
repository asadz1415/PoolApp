package com.pool.app.dummyData

import org.jetbrains.compose.resources.DrawableResource

sealed class PostItem {
    data class ImagePost(
        val userName: String,
        val userImage: DrawableResource,
        val imageUrl: DrawableResource,
        val likes: String,
        val comments: String,
        val shares: String
    ) : PostItem()

    data class PollPost(
        val userName: String,
        val userImage: DrawableResource,
        val percentages: List<Int>,
        val likes: String,
        val comments: String,
        val shares: String
    ) : PostItem()
}
