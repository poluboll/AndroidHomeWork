package com.example.homework

fun parse(str: String, calculator: Calculator): String {
    var returnString = ""
    var operation = ""
    var firstNumber = ""
    var secondNumber = ""
    when {
        str.contains("*") -> {
            operation = Regex("[\\d]+\\*[\\d]+").find(str)?.groups?.get(0)?.value!!
            firstNumber =
                Regex("[\\d]+\\*").find(operation!!)!!.groups[0]!!.value.replace("*", "")
            secondNumber =
                Regex("\\*[\\d]+").find(operation!!)!!.groups[0]!!.value.replace("*", "")
            calculator.mul(firstNumber.toInt(), secondNumber.toInt())
            returnString = str.replace(operation, "")

        }
        str.contains("/") -> {
            operation = Regex("[\\d]+\\/[\\d]+").find(str)?.groups?.get(0)?.value!!
            firstNumber =
                Regex("[\\d]+\\/").find(operation!!)!!.groups[0]!!.value.replace("/", "")
            secondNumber =
                Regex("\\/[\\d]+").find(operation!!)!!.groups[0]!!.value.replace("/", "")
            calculator.div(firstNumber.toInt(), secondNumber.toInt())
            returnString = str.replace(operation, "")
        }
        str.contains("-") -> {
            operation = Regex("\\-[\\d]+").find(str)?.groups?.get(0)?.value!!
            calculator.sub(operation.replace("-", "").toInt(), 0)
            returnString = str.replace(operation, "")
        }

        str.contains("+") -> {
            operation = Regex("\\+?[\\d]+").find(str)?.groups?.get(0)?.value!!

            calculator.add(operation.replace("+", "").toInt(), 0)

            returnString = str.replace(operation, "")
        }


    }
    return returnString
}