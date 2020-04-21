package com.github.studyandroid.kotlin.base.c02_data_type

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: 基本数值类型
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
fun main(args: Array<String>) {
    val valueType = ValueType()
    println("double: " + valueType.double)
    println("float: " + valueType.float)
    println("long: " + valueType.long)
    println("int: " + valueType.int)
    println("short: " + valueType.short)
    println("byte: " + valueType.byte)
}

class ValueType {
    /**
     * 基本数值类型包括Byte, Short, Int, Long, Float, Double等。
     * 不同于Java的是，字符Char不属于数值类型，是一个独立的数据类型。
     */
    val double: Double = 123.34213124123 // 64 bit
    val float: Float = 2331.2315f        // 32 bit
    val long: Long = 12345679876543L     // 64 bit
    val int: Int = 1234443               // 32 bit
    val short: Short = 121               // 16 bit
    val byte: Byte = 12                  // 8 bit
}