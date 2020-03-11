package oop

class Animal(name: String, origin: String ){

    var name: String
    var origin: String


    init {
        this.name = name
        this.origin = origin
    }

    fun printdetails(){
        println("This is a $name and it comes from $origin")
    }
}




//OPEN CLASS
open class Food(open val name:String, open val calories:Int){
    val food_name: String
    val food_calories: Int

    init {
        this.food_name = name
        this.food_calories = calories
    }

    fun printDetails(){
        println("${this.food_name} is made up of calories ${this.food_calories}")
    }
}


class AfricanFood(override val name: String, override val calories: Int):Food(name,calories){

}
class IndianFood(override val name: String, override val calories: Int):Food(name,calories){

}



//ABSTRACT CLASS
abstract class Student(open  val school:String, open val studentID: Int){
//    fun inteligent(): Boolean = true
    fun inteligent(): Boolean{
    return true
}
    abstract fun get_grade()//IT CAN HAVE A DIFFERENT IMPLIMENTATION IN A SUBCLASS
}

class HighSchoolStudent(override val school:String, override val studentID:Int):Student(school,studentID){
    override fun get_grade(){
        println("Scored an A")
    }
    fun studentDetails(){
        println("Student comes from $school")
        println("Student ID is: $studentID")
    }
}


fun main(args: Array<String>) {
    val animal1 = Animal("Lion", "Africa")
    val animal2 = Animal("Kangaroo", "Australia")

    val x = AfricanFood("Ugali", 100)

    animal1.printdetails()
    println(animal2.printdetails())

    x.printDetails()



}



//class Animalia  (name: String, origin: String){
////    DECLARE EMPTY VARIABLES
//    val animal_name :String
//    val animal_origin :String
//
////    DEFINE INIT TO ASSIGN VALUES TO CLASS PROPERTIES(VARIABLES)
//    init {
//        this.animal_name = animal_name
//        this.animal_origin = animal_origin
//    }
//
////DEFINE METHODS
////fun sound() :String = "Animal sound"
//    fun sound(){
//    println("Animal Sound")
//}
//    fun printDetails(){
//        println("Animal name: ${this.animal_name}")
//        println("Origin name: ${this.animal_origin}")
//    }
//
//}