package com.cyberpro.kotlin.KotlinProject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinProjectApplication

fun main(args: Array<String>) {
    runApplication<KotlinProjectApplication>(*args)


    //mutable variables
    var name = "Vivek"

    println("name: " + name)
    System.out.println(name)
    println("name : $name")

    name = "Idan"

    println("name after changing : $name")


    //immutable variable
    val msg = "Hello Friends.."

    //msg = "Hello again"


    //Data TYpes
    val i: Int = 1
    val j = 1
    val d: Double = 1.22
    val b: Boolean = true
    val c: Char = 'a'
    val bo = true

    val name2 = "John"

    println(name2.length)


    var strg = StringBuilder()

    strg.append("abc")
    strg.append(" :  efg")

    println(strg)


    val str = "Zev"


    //Object of your user defined class
    val kotliNadventureOne = KotliNadventureOne()
    kotliNadventureOne.checkNumber(23)

    kotliNadventureOne.getDayOfWeek(5)

    //Loop Statements
    val kotlinAdventureTwo = KotlinAdventureTwo()

    kotlinAdventureTwo.loop1(5)
    kotlinAdventureTwo.loop2(10)


    //Default arguments
    val kotlinAdventureThree = KotlinAdventureThree()
    kotlinAdventureThree.greet()
    kotlinAdventureThree.greet("Idan")

    //Named Arguments
    kotlinAdventureThree.userInfo("ALex", 25, "Israel")
//    kotlinAdventureThree.userInfo(25, "Alex", "Israel")

    kotlinAdventureThree.userInfo(name="Gaash", age = 25, country = "Israel")
    kotlinAdventureThree.userInfo( age = 25, name="Gaash", country = "Israel")
    kotlinAdventureThree.userInfo(country = "Israel", age = 25)

    //Advantages of Named Arguments:

    /*improves readability and flexibility.
    Order doesn't matter.
    Useful for functions with many parameters.
    */

    val kotlinAdventureFour = KotlinAdventureFour()

    //Lambda expressions (functions as arguments to my higher-order function)
    val sum = {x: Int, y: Int -> x + y}
    val multiply = {x: Int, y: Int -> x * y }
    val divide = {x: Int, y: Int -> x / y }

    kotlinAdventureFour.operate(5, 10, sum)
    kotlinAdventureFour.operate(5, 10, multiply)
    kotlinAdventureFour.operate(5, 10, divide)




}

