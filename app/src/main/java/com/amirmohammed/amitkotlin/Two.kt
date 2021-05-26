package com.amirmohammed.amitkotlin

class Two(
    private var name: String,
    private var email: String,
    private var phone: String,
    private var loaction: String,
) {

    init {
        println("Class Two init")
    }

//    var name = ""
//    constructor()
//
//    constructor(
//        name: String,
//        email: String,
//        phone: String,
//        location: String,
//    )
//
//    constructor(name: String){
//        this.name = name
//    }

//    var name = ""
//
//    init {
//        this.name = name
//    }

    fun printName() {
        println(name)
    }

}