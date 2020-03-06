package arrays

fun main(){

//Array is collection of similar data types either of Int, String etc.
//Array in Kotlin is mutable in nature with fixed size which means we can perform both read and write operations on elements of array
//Kotlin array size is fixed after creation

   //IMPLICIT
    var fruits = arrayOf("Banana", "Mango", "Oranges", "Guavas")

    var ages = arrayOf(12 , 4 , 56, 99)

    var mystaff = arrayOf("Keyboard", 4 , "Kenyan", 99 ,true)

    //EXPLICIT
    var counties = arrayOf<String>("Nairobi", "KIambu", "Machakos")

    var population = arrayOf<Int>(12000, 3256, 6842, 654)

    var bools = arrayOf<Boolean>(true, false, true, false, true, true)

    //ACCESSING ARRAY ITEMS
    //    1. USE ITEM NUMBER.
    println(fruits[0])
    println(ages[0])
    println(mystaff[0])

    //    2. USE GET FUNCTION
    println(counties.get(2))
    println(population.get(0))
    println(bools.get(0))


//    UPDATING ARRAY VALUES: USE SET()FUNCTION
//    Set()function takes two args 1 -Position 2-value

    counties.set(1, "Mombasa")
    println(counties.get(1))

//    LOOPING THROUGGH ARRAY VALUES USE FOR LOOP

    for (fruit in fruits){
        println(fruit)
    }

    for (c in counties){
        println(c)
    }


//FOR SIZE OF AN ARRAY USE SIZE() FUNCTION

    val num_counties : Int = counties.size
    println(num_counties)

//LOOPING OR TRAVERSING

    for (i in 0..num_counties-1){
        //Using item number
//        println(counties[i])
        //Using .get function
        println(counties.get(i))
    }


//HARSHMAP IS ACOLLECTION WHICH CONTAINS PAIRS OF OBJECTS
//Hashmap(): ITS THE DEFAULT CONSTRUCTOR WHICH CONSTRUCTS AN EMPTY HASHMAP INSTANCE
//TO CREATE A HASHMAP YOU MUST SPECIFY THE TYPE OF DATA FOR KEYS AND VALUES

//    EMPTY HASHMAP
    var rows : HashMap<String, Int> = HashMap<String, Int>()

//    PRINTING AN EMPTY HASMAP
    println(rows)

//    ADDING ITEMS IN A HASHMAP: USE PUT()
    rows.put("ID", 1)
    rows.put("Kipande", 2)
    rows.put("Huduma", 3)
    rows.put("Kitambulisho", 4)

    println(rows)

//ACCESING HASHMAP VALUES
//    USE KEYS TO ACCESS VALUES

    println(rows["ID"])
    println(rows["Kipande"])
    println(rows["Huduma"])
    println(rows["Kitambulisho"])

//LOOPING OR TRAVERSING THROUGH A HASHMAP

    for (key in rows.keys){
        println(key)
    }

    for (value in rows.values){
        println(value)
    }


//PRINT OUT BOTH KEY AND VALUE

    for (key in rows.keys){
        println("$key matches with ${rows[key]}")
    }

//    for (value in rows.values){
//        println("$values matches with ${rows[value]}")
//    }




}
