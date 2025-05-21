package com.kotlinFundamentals

data class Developer(
    var skills: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Spring Boot"),
    var age: Int = 10
) : Person("AnyDevName")