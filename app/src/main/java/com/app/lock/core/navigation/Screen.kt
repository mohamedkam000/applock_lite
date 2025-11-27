package com.app.lock.core.navigation

sealed class Screen(val route: String) {
    object SetPassword : Screen("set_password")
    object ChangePassword : Screen("change_password")
    object Main : Screen("main")
    object PasswordOverlay : Screen("password_overlay")
    object Settings : Screen("settings")
}