package com.movingtoast

enum class MovingToastStyle {
    SUCCESS, ERROR, WARNING, INFO, DELETE, NO_INTERNET;

    fun getName(): String {
        if(this.name.contains("_")) {
            return this.name.replaceFirst("_", " ")
        }
        return this.name
    }
}