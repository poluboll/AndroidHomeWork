package com.example.homework

class Sub (unit: ArithmeticUnit, operandFirst: Int,operandSecond: Int): Command(unit, operandFirst,operandSecond) {
    override fun execute() {
        unit.run('-',operandFisrt,operandSecond)
    }
}