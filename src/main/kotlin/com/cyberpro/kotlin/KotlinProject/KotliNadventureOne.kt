package com.cyberpro.kotlin.KotlinProject

class KotliNadventureOne {

    //Kotlin provides two types opf condityional statements
    /*

     */


    fun checkNumber(num: Int){

        if(num > 0)
            println("Positive Number")
        else if (num  < 0)
            println("Negative Number")
        else
            println("Zeroooooo")


    }

    //when

    fun getDayOfWeek(day: Int){

        when(day){

            1-> println("Mon")
            2-> println("Tue")
            3-> println("Wed")
            4,5 -> println("Thursday or Friday")
            in 6..7-> println("Weekend")
            else-> println("Invalid Day")

        }


    }

}