package com.example.homework

import java.lang.StringBuilder
import java.math.BigDecimal


fun main(){
    print(calculator())
}

fun calculator(): String {
    val str= readLine()
    if(str==null || str.contains(Regex("[^0-9+*/\\-]")))
        return "error"
    else
        return str
}

interface Command {
    fun execute()
}

class Calculator{
    fun plus(x: Number,y:Number):Number{

    }
    fun minus(x: Number,y:Number):Number{

    }

    fun div(x: Number,y:Number):Number{

    }
    fun multiply(x: Number,y:Number):Number{

    }
}
class PlusCommand constructor(val calc:Calculator) :Command{
    override fun execute() {
        calc.plus();
    }
}class MinusCommand constructor(val calc:Calculator) :Command{
    override fun execute() {
        calc.minus();
    }
}class DivCommand constructor(val calc:Calculator) :Command{
    override fun execute() {
        calc.div();
    }
}class MultiplyCommand constructor(val calc:Calculator) :Command{
    override fun execute() {
        calc.multiply();
    }
}
class User constructor(val plus:Command,
                       val minus:Command,
                       val div:Command,
                       val multiply:Command){
    fun plusCalc(){
        plus.execute()
    }
    fun minusCalc(){
        minus.execute()
    }
    fun divCalc(){
        div.execute()
    }
    fun multiplyCalc(){
        multiply.execute()
    }
}