package com.amirmohammed.amitkotlin

open class BaseClass {

    var firstName = "Amir"
    protected var secondName = "Mohamed"

    protected fun test(){}

    fun checkNetwork(): Boolean {
        return true
    }

    open fun startLoading(){
        println("start loading from base class")
    }


}