package com.github.studyandroid.kotlin.base.c04_cycle_control

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: For循环
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
fun main() {
    val forCycle = For()
    forCycle.iterator()
    forCycle.index()
    forCycle.deconstruct()
}

class For {
    /**
     * for循环可以对任何提供迭代器的对象进行遍历
     */
    fun iterator() {
        val items = listOf("apple", "banana", "kiwi", "orange")
        for (item in items) {
            println("${items.indexOf(item)}nd item: $item")
        }
    }

    /**
     * 通过索引遍历一个数组或者一个list
     */
    fun index() {
        val items = listOf("apple", "banana", "kiwi", "orange")
        for (index in items.indices) {
            println("item ${items[index]} index is $index")
        }
    }

    /**
     * 遍历时可以将一个对象元素解构成多个变量
     */
    fun deconstruct() {
        val items = mapOf(0 to "apple", 1 to "banana", 2 to "kiwi", 3 to "orange")
        for ((index, value) in items) {
            println("item $value index is $index")
        }
    }
}