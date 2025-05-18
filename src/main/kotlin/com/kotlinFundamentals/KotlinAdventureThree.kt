package com.kotlinFundamentals

class KotlinAdventureThree {


    fun greet(name: String = "Guest", age: Int = 15){
        println("Hello$, $name")

    }

    fun sum(a: Int =5, b: Int = 10): Int{

        return a + b
    }

    fun userInfo(name: String = "Guest", age: Int, country: String){

        println("$name is $age years old and from $country. ")
    }


}