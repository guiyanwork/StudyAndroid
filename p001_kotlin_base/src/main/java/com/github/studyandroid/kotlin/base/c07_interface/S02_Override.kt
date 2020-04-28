package com.github.studyandroid.kotlin.base.c07_interface

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: 函数重写
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
fun main() {
    val classC = ClassC()
    classC.foo()
    classC.bar()
    val classD = ClassD()
    classD.foo()
    classD.bar()
}

/**
 * 接口[InterfaceA]实现了方法[foo]
 */
interface InterfaceA {
    fun foo() { // 已实现
        println("InterfaceA foo")
    }

    fun bar()   // 未实现，没有方法体，是抽象的
}

/**
 * 接口[InterfaceB]实现了方法[foo]与[bar]
 */
interface InterfaceB {
    fun foo() { // 已实现
        println("InterfaceB foo")
    }

    fun bar() { // 已实现
        println("InterfaceB bar")
    }
}

/**
 * 具体类[ClassC]是[InterfaceA]的实现，必须重写[bar]
 */
class ClassC : InterfaceA {
    override fun bar() { // 重写
        println("ClassC bar")
    }
}

/**
 * 具体类[ClassD]是[InterfaceA]与[InterfaceB]的派生，必须实现多个接口继承的所有方法
 */
class ClassD : InterfaceA, InterfaceB {
    override fun foo() { // 继承多个实现的方法
        super<InterfaceA>.foo()
        super<InterfaceB>.foo()
    }

    override fun bar() { // 继承单个实现的方法
        super<InterfaceB>.bar()
    }
}