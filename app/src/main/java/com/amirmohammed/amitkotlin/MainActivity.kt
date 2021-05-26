package com.amirmohammed.amitkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.amirmohammed.amitkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // String name;
    // String name = "Amir Mohammed";

    val name: String = "Amir Mohammed"
    var phone = "01116036522"
    var number: Int = 123

    var firstName: String? = null

    lateinit var position: String

    lateinit var binding: ActivityMainBinding
    private lateinit var editTextEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // ClassName objectName = new ClassName();
        // var objectName = ClassName()
        val one = One("Ahmed")
        println(one.name)

        val two = Two("Mohamed", "", "", "")
        two.printName()


        val three = Three()
        three.startLoading()

        val base = BaseClass()
        base.firstName

        Four.PI
        Four.test()
        Four.TAG

        val data1 = DataOne("amir")
        val data2 = DataOne("Amir")

        if (data1 == data2){
            println(true)
        }
        else{
            println(false)
        }

        println(MyObject.baseUrl)
        MyObject.test()

        if (true) return

        var age: String
        var i = 0
        number = 111

        println(firstName?.split(" "))

        println("HelloKotlin!")
        println("My name : " + name + " , my phone : " + phone)
        println("My name : $name , my phone : $phone")

        var stringNumber = number.toString()
        var intPhone = phone.toInt()

        val result = sum(10, 5)
        println(result)

        printSum(10, 15)

        var a = 1
        // simple name in template:
        val s1 = "a is $a"

        a = 2
        // arbitrary expression in template:
        val s2 = "${s1.replace("is", "was")}, but now is $a"
        println(s2)

        println("1.5 is ${describe(1.5)}")

        for (i in 0..10) {
            if (i in 1..5) println(i)
        }

        val list = listOf("a", "b", "c", "d", "e")
        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list indices range, too")
        }

        println(list.indices)
    }

    fun secondWhen(x: Int) {
        when {
            x == 1 -> print(1)
            x > 2 -> print(2)
            x <= 3 -> print(3)
        }
    }

    fun thirdWhen(x: Int): Int {
        when (x) {
            1 -> return 1
            2 -> return 2
            3 -> return 3
            else -> return 0
        }
    }

    fun fourthWhen(x: Int): Int {
        return when (x) {
            1 -> 1
            2 -> 2
            3 -> 3
            else -> 0
        }
    }

    fun maxOf(a: Int, b: Int) = if (a > b) a else b

    fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

    fun firstWhen(x: Int) {
        when (x) {
            1 -> print(x)
            2 -> print(x)
            3 -> print(x)
            4 -> print(x)
            5 -> print(x)
            else -> print(x)
        }
    }

    // Void = Unit
    // void print() , int sum()

    private fun print(numberOne: Int, numberTwo: Int): Int {
        val result = numberOne + numberTwo
        println(result)
        return result
    }

    private fun sum(numberOne: Int, numberTwo: Int) = numberOne + numberTwo

    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${sum(a, b)}")
    }

    fun shareApp() {
        try {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name")
            var shareMessage = "\nLet me recommend you this application\n\n"
            shareMessage = """
                ${shareMessage}https://play.google.com/store/apps/details?id=${BuildConfig.APPLICATION_ID}
                
                
                """.trimIndent()
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
            startActivity(Intent.createChooser(shareIntent, "choose one"))
        } catch (e: Exception) {
            //e.toString();
        }
    }
}