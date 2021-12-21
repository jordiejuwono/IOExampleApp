package app

import utils.CalcUtils

class App {
    fun run(){
        printHeader()
        inputValue()
    }

    private fun printHeader(){
        println("================")
        println("Simple Calc App!")
        println("================")
    }
    private fun inputValue(){
        print("Enter Value for A : ")
        val a = readLine()?.toInt() ?: 0
        print("Enter Value for B : ")
        val b = readLine()?.toInt() ?: 0
        calculate(a,b)
    }

    private fun calculate(a : Int, b : Int){
        val calcUtils = CalcUtils()
        println("Result for Plus = ${calcUtils.plus(a,b)}")
        println("Result for Minus = ${calcUtils.minus(a,b)}")
        println("Result for Multiply = ${calcUtils.multiply(a,b)}")
        println("Result for Divided = ${calcUtils.divided(a.toDouble(),b.toDouble())}")
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()
            app.run()
        }
    }

}