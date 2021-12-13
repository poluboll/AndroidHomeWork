package com.example.homework

abstract class Command constructor(val unit:ArithmeticUnit,
                                   val operandFisrt:Int,
                                   val operandSecond:Int){
        abstract fun execute()


}