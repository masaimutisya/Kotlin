package lesson1

fun main(){
    print ("Herroooo World")
    print ("Herroooo World")

    println()
    println("Herroooo Again")

//    VARIABLES IN KOTLIN
//    YOU CAN DECLARE A VARIABLE IN KOTLIN USING var AND val KEYWORDS.

//    INPLICIT TYPE INFERENCE
    val name ="Mutisya Evans"
    var language = "Kotlin"

//    REASIGN A VARIABLE
    language = "PHP"
    println (name)
    println (language)

//    EXPLICIT TYPE INFERENCE
    val age:Int = 99
    val country:String = "China"

    println (age)
    println (country)

//    age = 56. changing val age will not work

    val myname:String = "Mutisya Evans"
    val myage:Int = 99
    val mycountry:String = "Kenya"

    println ("My name is " + myname + " and I am " + myage + " Years old. From " + mycountry)

    println ("My name is $myname I come from $mycountry and I am $myage years old")

    println ("My name is $myname I come from $mycountry and I am $myage years old and I will be ${myage + 10} in 10 Years")

println(100+10)


}


