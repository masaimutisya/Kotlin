package oop

class Calculator(num1:Int, num2:Int){

    var namba1 :Int
    var namba2 :Int



    init {
        this.namba1 = num1
        this.namba2 = num2
    }


fun multiply() {
    println("The multiplication of $namba1 and $namba2 is ${namba1 * namba2}")
    }
fun divide() {
        println("The Division of $namba1 and $namba2 is ${namba1 / namba2}")
    }
fun addition() {
        println("The addition of $namba1 and $namba2 is ${namba1 + namba2}")
    }
fun substract() {
        println("The substraction of $namba1 and $namba2 is ${namba1 - namba2}")
    }


}



fun main(args: Array<String>) {
    val multiply = Calculator(20,10)
    val substract = Calculator(20, 10)
    val divide = Calculator(20, 2)
    val addition = Calculator(20, 2)



    println(multiply.multiply())
    println(substract.substract())
    println(divide.divide())
    println(addition.addition())

}









