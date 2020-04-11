package com.example.myapplication

import kotlin.math.max

fun main() {
    var a : Int = 1
    a = a * 10
    a = a * methodName(1,1)
    a = getMax(100, 32)
    println("a = " + a)
}
fun methodName(param1:Int, param2:Int) : Int {
    return 0
}

fun getMax(num1: Int, num2: Int): Int{
    return max(num1, num2)
}