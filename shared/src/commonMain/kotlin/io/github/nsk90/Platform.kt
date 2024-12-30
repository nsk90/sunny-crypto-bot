package io.github.nsk90

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform