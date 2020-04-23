package com.github.studyandroid.kotlin.base.c06_inheritance

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: 类的继承
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
fun main() {
    Empty()
    Derived(10)
}

/**
 * 所有类都继承Any类，它是所有类的超类，对于没有超类型声明的类是默认超类
 */
class Empty { // 从Any隐式继承
    /**
     * Any默认提供了以下三个函数
     */
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}

/**
 * 类需要被继承，使用open关键字进行修饰
 */
open class Base(p: Int) // 定义基类

class Derived(p: Int) : Base(p)