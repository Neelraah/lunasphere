package com.example.lunasphere

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform