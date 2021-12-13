package com.example.homework

class Mul (unit: ArithmeticUnit, operandFirst: Int,operandSecond: Int): Command(unit, operandFirst,operandSecond) {
    override fun execute() {
        unit.run('*',operandFisrt,operandSecond)
    }
}