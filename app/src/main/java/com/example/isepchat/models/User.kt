package com.example.isepchat.models

data class User(
    var uuid: String,
    val email: String,
    var fullname: String,
    var image: String?
) {
    constructor(): this("","","","")
}
