package com.xurxodev.multiplatformexample.core

expect object Platform {
    val name: String
}

class Hello {
    fun multiplatformHello(): String = "Hello from ${Platform.name}"
}
