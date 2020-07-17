package com.github.studyandroid.kotlin.base.c08_extension

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: 扩展函数的特性
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
fun main() {
    printFoo(Apple())
    println(Dog().run())
    val obj = null
    println(obj.toString())
    println(arrayOf(0, 1, 2, 3, 4, 5).lastIndex)
}

open class Fruit
class Apple : Fruit()

/**
 * 扩展函数[foo]是静态解析的
 */
fun Fruit.foo() = "fruit"
fun Apple.foo() = "apple"

/**
 * 在调用扩展函数时，具体被调用的是哪一个函数[foo]，由调用函数的对象[Fruit]表达式来决定的，而不是动态的类型[Apple]决定的
 */
fun printFoo(fruit: Fruit) {
    println(fruit.foo()) // 类型是Fruit类，不是接收者类型Apple的虚拟成员
}

/**
 * 若扩展函数[run]和成员函数[run]一致，使用该函数[run]时，会优先使用成员函数
 */
class Dog {
    fun run() = "Dog的成员函数run()"
}

fun Dog.run() = "Dog扩展函数run()"

/**
 * 扩展一个空(null)对象
 */
fun Any?.toString(): String {
    if (this == null) return "null" // 空检测之后，this会自动转换为非空类型，所以下面才可以使用toString()
    return toString()
}

/**
 * 扩展一个属性[lastIndex]。扩展属性只能被声明为val，允许定义在类或者kotlin文件中，不允许定义在函数中
 */
val <T> List<T>.lastIndex: Int
    get() = size - 1

/**
 * 初始化属性因为属性没有后端字段，所以不允许被初始化，只能由显式提供的getter与setter定义
 */
// val <T> List<T>.lastIndex = 1