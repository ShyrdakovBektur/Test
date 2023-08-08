package com.itproger.test

class Math {
    fun add(a: String, b: String): String {
        if (a.contains("..") || b.contains("..")) {
            return "You entered two dots!"
        }
        if (a.isBlank() || b.isBlank()) {
            return "You haven't filled in all the fields!"
        }
        return try {
            val result = (a.replace(" ", " ").toDouble() + b.replace(" ", " ").toDouble())
            if (result % 1 > 0.0) {
                result.toString()
            } else {
                result.toInt().toString()
            }
        }catch (ex: NumberFormatException) {
            "Invalid input"
        }
    }
    fun divide(a: String, b: String): String {
        return if (b == "0") {
            "You can't divide by zero!"
        }else{
            try {
                (a.toInt() / b.toInt()).toString()
            }catch (ex: ArithmeticException) {
                "Invalid input"
            }
        }
    }
}