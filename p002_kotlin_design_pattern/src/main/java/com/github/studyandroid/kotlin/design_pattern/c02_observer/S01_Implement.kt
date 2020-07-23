package com.github.studyandroid.kotlin.design_pattern.c02_observer

/**
 * Copyright (c) 2020 GitHub, Inc.
 * Description: 观察者模式的实现
 * Author(s): Gui Yan (guiyanwork@163.com)
 */
fun main(args: Array<String>) {
    val observableLeader = ObservableImpl()
    val observerZhang = ObserverImpl("张三")
    val observerLi = ObserverImpl("李四")
    val observerWang = ObserverImpl("王五")

    observableLeader.message = "欢迎你们来到新公司"
    observableLeader.registerObserver(observerZhang)
    observableLeader.registerObserver(observerLi)
    observableLeader.registerObserver(observerWang)
    observableLeader.notifyObserver()
    observableLeader.unregisterObserver(observerZhang)
    observableLeader.unregisterObserver(observerLi)
    observableLeader.unregisterObserver(observerWang)
}

/**
 * 具体观察者
 * 实现了[Observer]接口
 */
class ObserverImpl(val name: String) : Observer {
    override fun update(message: String?) {
        println("观察者${name}收到了观察者发送的推送消息：$message")
    }
}

/**
 * 具体被观察者
 * 实现了[Observable]接口
 */
class ObservableImpl : Observable {
    private val mObservers = mutableListOf<Observer>()
    var message: String? = null // 被观察者向观察者发送的消息

    override fun registerObserver(observer: Observer) {
        mObservers.add(observer)
    }

    override fun unregisterObserver(observer: Observer) {
        if (mObservers.isNotEmpty())
            mObservers.remove(observer)
    }

    override fun notifyObserver() {
        for (observer in mObservers) {
            observer.update(message)
        }
    }
}

/**
 * 抽象观察者
 * 当被观察者调用通知观察者方法时，观察者的[update]方法会被回调
 */
interface Observer {
    fun update(message: String?)
}

/**
 * 抽象被观察者
 * 声明了注册[registerObserver]、注销[unregisterObserver]、通知[notifyObserver]观察者方法
 */
interface Observable {
    fun registerObserver(observer: Observer)
    fun unregisterObserver(observer: Observer)
    fun notifyObserver()
}