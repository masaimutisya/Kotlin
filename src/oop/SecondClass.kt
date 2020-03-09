package oop

class Player(wealth:Long, goat:Boolean, club:String){
    var mali:Long
    var mbuzi:Boolean
    var klabu:String

// ASSIGN DATA TO THE EMPTY VARIABLES
//    THIS CODE WILL BE CALLED AS SOON AS THE OBJECT IS CREATED
    init {
        this.mali = wealth
        this.mbuzi = goat
        this.klabu = club
    }

    var gender: String = "male"
    var color: String = "black"


    fun printDetails(){
        println("This Player is worth ${this.mali}")
        println("Is he a goat ${this.mbuzi}")
        println("He plays for ${this.klabu}")
    }



}


fun main(args: Array<String>) {
    val p1 = Player(2000_000, goat = false, club = "Aston villa")
    val p2 = Player(2000_000_000, goat = true, club = "Man U")
    var p3 = Player(8000_000_000, goat = true, club = "Liverpool")

    println(p1.color)
    println(p1.mali)

    println(p1.printDetails())
    p2.printDetails()
    println(p3.printDetails())
}




