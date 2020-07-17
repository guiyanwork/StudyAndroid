package com.github.studyandroid.kotlin.base.c08_extension

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: 扩展函数
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
fun main() {
    val extFunc = ExtFunc("guiyanwork")
    extFunc.print()
    val list = mutableListOf(1, 2, 3)
    list.swap(1, 2)
    println(list.toString())
}

/**
 * 扩展是一种静态行为，对被扩展的类[ExtFunc]代码本身不会造成任何影响。
 */
class ExtFunc(val name: String)

/**
 * 扩展函数[print]在已有[ExtFunc]类中添加新的方法，不会对原类做修改
 */
fun ExtFunc.print() {
    println("用户名：$name")
}

/**
 * 扩展函数[swap]调换不同位置的值
 */
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // this对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}