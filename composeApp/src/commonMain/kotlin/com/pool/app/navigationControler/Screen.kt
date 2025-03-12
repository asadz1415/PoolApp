package com.pool.app.navigationControler

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen(val route: String) {
    @Serializable
    data object DashboardScreen : Screen("DashboardScreen")
    @Serializable
    data object CreatePoolScreenFlow : Screen("CreatePoolScreenFlow")
    @Serializable
    data object PoolListingScreenFlow : Screen("PoolListingScreenFlow")
}