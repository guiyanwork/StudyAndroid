package com.github.studyandroid.kotlin.base.c03_conditional_control

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: If表达式
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
fun main(args: Array<String>) {
    val ifCond = If()
    ifCond.commonUsage()
    ifCond.elseUsage()
    ifCond.expressUsage()
    ifCond.varUsage()
}

class If {
    /**
     * 一个if语句包含一个布尔表达式和一条或多条语句
     */
    fun commonUsage() { // 传统用法
        val a = 14
        val b = 33
        var max = a

        if (a < b)
            max = b
        println("max的值为$max")
    }

    // 使用else
    fun elseUsage() {
        val x = (-1..1).random()
        val y = (0..2).random()

        if (x > 0) {
            println("x大于0")
        } else if (x == 0) {
            println("x等于0")
        } else {
            println("x小于0")
        }

        if (y < 1) {
            println("y小于1")
        } else {
            println("y大于等于1")
        }
    }

    // 作为表达式，类似Java的三元操作符
    fun expressUsage() {
        val a = 1
        val b = 2
        val c = if (a >= b) a else b

        println("c的值为$c")
    }

    /**
     * 可以把If表达式的结果赋值给一个变量
     */
    fun varUsage() {
        val a = 1
        val b = 2
        val max = if (a > b) {
            print("Choose a: $a, ")
            a
        } else {
            print("Choose b: $b, ")
            b
        }

        println("max的值为$max")
    }
}