package com.cyberpro.kotlin.KotlinProject

import java.time.LocalDateTime

data class Article(

    val title:String,
    val content: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),

    val palindromeString: Boolean = title.isPalindrome()

)


