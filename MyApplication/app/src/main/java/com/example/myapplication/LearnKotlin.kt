package com.example.myapplication

import kotlin.math.max

fun main() {
    var a : Int = 1
    a = a * 10
    a = a * methodName(1,1)
    a = getMax(100, 32)
    a = getMaxIf(20, 21)
    println("a = " + a)
    println(getScore("xiaodu"))
    println(checkNumber(111))
    testFor()
    val person = Person()
    person.name = "小杜"
    person.age = 19
    person.eat()
}
fun methodName(param1:Int, param2:Int) : Int {
    return 0
}

fun getMax(num1: Int, num2: Int): Int{
    return max(num1, num2)
}

fun getMaxIf(num1: Int, num2: Int) = if(num1 < num2) num2 else num1

fun getScore(name: String) = when (name) {
    "xiaodu" -> 59
    "xiaocao" -> 99
    else -> 0
}

fun checkNumber(num: Number) = when(num) {
    is Long -> "长整型"
    is Int -> "整形"
    else -> "不知道啥东西"
}

fun testFor() {
    for (i in 10 downTo 1 step 5){
        println(i)
    }
}
