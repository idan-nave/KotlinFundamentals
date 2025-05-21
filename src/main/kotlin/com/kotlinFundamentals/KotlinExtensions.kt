package com.kotlinFundamentals

fun String.isPalindrome() = this == this.reversed()

fun KotlinCollections.isAgesExceed120() = this.sumAllDevelopersAges() > 120