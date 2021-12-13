package com.example.homework


fun main() {
    val calculator: Calculator = Calculator()
    var result = 0
    var workCalc: Boolean = true

    while (workCalc) {
        println("введите операцию. для выхода введите close ")
        var str = readLine()
        if (str == "close") {
            workCalc = false
            break
        }
        if (str == null || str.contains(Regex("[^\\d+*/\\-]"))) {
            println("неверный формат ввода")
            continue
        }

        while (str !="") {
            str = parse(str!!, calculator)
            println(calculator.arithmeticUnit.register)
        }
    }
}












