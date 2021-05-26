package com.amirmohammed.amitkotlin

class Three() : BaseClass() , I2{

    fun onCreate(){
        super.checkNetwork()

        super.startLoading()
        startLoading()

        super.firstName
        super.secondName

        super.test()
    }

    override fun startLoading() {
//        super.startLoading()
        println("Start loading from Three")
    }

    override fun test2() {
        TODO("Not yet implemented")
    }


}