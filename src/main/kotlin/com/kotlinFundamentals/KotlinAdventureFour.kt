package com.kotlinFundamentals

class KotlinAdventureFour {

//
//    public Function<String, String> funcAbc {
//
//
//    }
    //higher order function
    fun operate(a:Int, b:Int, operation: (Int, Int)->Int):Int{
        return operation(a, b)

    }
}