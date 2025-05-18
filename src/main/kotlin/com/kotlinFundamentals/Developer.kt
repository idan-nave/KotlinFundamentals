package com.kotlinFundamentals

data class Developer(
    var skills: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Spring Boot")
) : Person("AnyDevName")