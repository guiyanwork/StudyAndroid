package com.github.studyandroid.kotlin.base.c07_interface

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: 接口的定义
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
fun main() {
    val myImpl = MyImpl()
    println("name: " + myImpl.name)
    println("age: " + myImpl.age)
    myImpl.bar()
    myImpl.foo()
}

/**
 * 使用interface关键字定义接口
 */
interface MyInterface {
    /**
     * 接口中的属性只能是抽象的，不允许初始化值，接口不会保存属性值，实现接口时，必须重写属性
     */
    var name: String // name属性是抽象的
    val age: Int     // age属性是抽象的

    /**
     * 接口中的方法允许有默认实现
     */
    fun bar()   // 未实现
    fun foo() { // 已实现
        println("foo")
    }
}

/**
 * 一个类或者对象可以实现一个或多个接口
 */
class MyImpl : MyInterface {
    override var name: String = "github" // 重写属性
    override var age: Int = 10           // 重写属性
    override fun bar() { // 方法体
        println("bar")
    }
}