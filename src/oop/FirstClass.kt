package oop

//CLASS ==BLUEPRINT
//TO CREATE A CLASS USE THE KEYWORD class, FOLLOWED BY THE NAME OF THE CLASS FOLLOWED BY THE NAME OF THE CLASS STARTING WITH A CAPITAL LETTER
//THE CLASS NAME IS FOLLOWED BY CURLY BRACKET {}


class Car{
//    PROPERTIES/FIELDS: VARIABLES
    var wheels: Int = 4
    var bonnet: String = "long"
    var size: String = "big"
    var logo: String = "Benz"
    var door: Int = 5
    var color: String = "Yellow"
    var automatic: Boolean = false



//METHODS: ACTIONS:FUNCTIONS INSIDE A CLASS

    fun greetings(){
        println("Harooooo Kotlin")
    }

//METHOD THAT TAKES AN ARGUMENT
    fun speed(mbio:Int){
        println("This Car moves at $mbio Mph")
    }

//METHOD THAT RETURNS A VALUE
    fun yom(year:Int):Int{
    return year
}





}









fun main(args: Array<String>) {
//    OBJECT/INSTANCE: AN EXAMPLE OF A BLUE PRINT
//    TO CREATE AN OBJECT DECLARE VAR FOLLOWED BY THE OBJECT THEN ASSIGN THE BLUE PRINT

    val car1 = Car()
//    car1 : OBJECT
//    Car : CLASS
//    WHEN YOU CREATE AN OBJECT FROM A CLASS IT INHERITS ALL THE FEATURES OF THE CLASS

//    ACCESSING CLASS PROPERTIES AND METHODS
//    USE THE DOT OPERATOR TO ACCESS
    println(car1.wheels)    //4
    println(car1.automatic)  //FALSE

    println(car1.greetings())

    println(car1.speed(200))

// USE PRINTLN
    println(car1.yom(2020))

// ASSINGN TO A VARIABLE AND USE IT LATER
    val year0 :Int = car1.yom(2000)
    println(year0 - 50)




}