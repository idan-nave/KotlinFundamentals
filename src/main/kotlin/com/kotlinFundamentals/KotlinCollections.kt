package com.kotlinFundamentals

import kotlin.random.Random

class KotlinCollections {
    val devCollection: MutableCollection<Developer> =
        (1..4).map { idx ->
            val skills = ('A'..'C').map { letter -> "Skill#${idx}-${letter}" }.toMutableSet()
            Developer(skills = skills).apply {
                name = "Developer $idx"
                age = Random.nextInt(15, 50)
            }
        }.toMutableSet()

    fun listAllDevelopers() = println(devCollection.map { it.toString() })

    fun listAllOldDevelopers() = println(devCollection.filter { it.age > 18 }.map { it.toString() })

    fun listAllOCompanySkills() =
        println(devCollection.flatMap { it.skills }.toString())

    fun sumAllDevelopersAges(): Int =
        devCollection.map { it.age }.reduce { acc, age -> acc + age }

}
