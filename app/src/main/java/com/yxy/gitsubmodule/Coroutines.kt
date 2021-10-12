package com.yxy.gitsubmodule

import kotlinx.coroutines.*

//协程的函数
fun main() {
//    corortines()
}

fun corortines() {
    val scope = MainScope()
    scope.launch {
        delay(1000)
    }
    scope.launch(Dispatchers.IO) {
        withContext(Dispatchers.Main) {

        }
    }

    scope.launch(Dispatchers.IO) {
        val userinfo = getUserInfo()
        withContext(Dispatchers.Main) {

        }
    }
}

suspend fun getUserInfo(): String {
    return withContext(Dispatchers.IO) {
        delay(2000)
        "Kotlin"
    }
}