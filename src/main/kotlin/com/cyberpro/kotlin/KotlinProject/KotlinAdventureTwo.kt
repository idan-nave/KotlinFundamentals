package com.cyberpro.kotlin.KotlinProject

class KotlinAdventureTwo {

    /*

     */


    //Inclusive range - (includes both start and end)
    fun loop1(num: Int){

        for(i in 1..num){
            println(i)
        }

    }

    fun loop2(num: Int){

        for(i in 1..num step 2){
            println(i)
        }

    }

    //printing from num to 1
    fun loop3(num: Int){

        for(i in num downTo 1){
            println(i)
        }

    }

    //printing from 1 to num
    fun loop4(num: Int){

        for(i in 1 until num){
            println(i)
        }

    }

    fun runWhileLoop(){

        var num =5
        while(num > 0){
            if(num == 3) continue
            println("Countdown: $num")
            num--
        }

    }

    fun tryDoWhileLoop(){

        var num = 1

        do{
            println(" Number : $num")
            num++

        }while(num <=5)
    }




}