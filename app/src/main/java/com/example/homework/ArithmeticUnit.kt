package com.example.homework

import java.math.BigDecimal

class ArithmeticUnit {
     var register:Int=0


    fun run(operationCode: Char,operandFirst:Int,operandSecond:Int){
        when(operationCode){
            '+'->register+=operandFirst
            '-'-> register -= operandFirst
            '*'-> register += (operandFirst * operandSecond)
            '/'->register+=(operandFirst/operandSecond)
        }
        println()
    }
}