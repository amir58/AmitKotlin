package com.amirmohammed.amitkotlin

class Four(
    override var name: String,
    override var email: String,
    override var phone: String) : I {

    companion object {
        const val PI = 3.14

        const val TAG = "Four"


        fun test() {}
    }

    override fun test() {

    }


}