package com.github.studyandroid.kotlin.base.c05_class

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: 类定义
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
fun main() {
    Fruit()
    Empty()
    Animal().jump()
}

/**
 * 使用关键字class声明类，后面紧跟类名
 */
class Fruit { // 类名为Fruit
    // 大括号内是类体构成
}

/**
 * 定义一个空类
 */
class Empty

/**
 * 在类中定义成员函数
 */
class Animal {
    fun jump() { // 成员函数
        println("Animal jump")
    }
}