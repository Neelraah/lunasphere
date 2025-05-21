package com.example.lunasphere

import androidx.compose.runtime.*
import com.example.lunasphere.screens.*

@Composable
fun App() {
    var isLoggedIn by remember { mutableStateOf(false) }

    if (isLoggedIn) {
        FeedScreen(onLogout = { isLoggedIn = false })
    } else {
        LoginScreen(onLoginSuccess = { isLoggedIn = true })
    }
}
