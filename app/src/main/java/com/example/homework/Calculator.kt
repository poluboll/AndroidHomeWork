package com.example.homework

class Calculator (){

    val arithmeticUnit:ArithmeticUnit= ArithmeticUnit()
    val controlUnit: ControlUnit= ControlUnit()

    private fun run(command:Command):Int{
        controlUnit.executeCommand(command)
        return arithmeticUnit.register
    }

    fun add(operandFirst:Int,operandSecond: Int):Int{
        return run(Add(arithmeticUnit,operandFirst,operandSecond))
    }
    fun sub(operandFirst:Int,operandSecond: Int):Int{
        return run(Sub(arithmeticUnit,operandFirst,operandSecond))
    }
    fun div(operandFirst:Int,operandSecond: Int):Int{
        return run(Div(arithmeticUnit,operandFirst,operandSecond))
    }
    fun mul(operandFirst:Int,operandSecond: Int):Int{
        return run(Mul(arithmeticUnit,operandFirst,operandSecond))
    }


}