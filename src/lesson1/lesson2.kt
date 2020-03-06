package lesson1


fun main(){

    //IF STATEMENTS IN KOTLIN
//SYNTAX
//    if(condition that is true){
//        code to execute if true
//    }else{
//        code to execute if false
//    }


    val x :Int = 10
    if(x <100){
        println("$x is less than 100")
    }else{
        println("$x is not less than 100")
    }

//    IF AS A VARIABLE
    val result = if(x <100){
        println("$x is less than 100")
    }else{
        println("$x is not less than 100")
    }

    println(result)


//   IF ...ELSE ...LADDER
    val age = 17
    val restrict = if(age <=18)
        "YOU ARE NOT ALLOWED TO PARTE AFTER PARTE"
    else if(age >18)
        "YOU CAN PAAAAARTY"
    else
        "PROGRAM EXITING"

    println(restrict)


//LOOPING IN KOTLIN

//    WHILE
    var y = 0
    while (y < 10){
        println(y)
        y++
    }
//DO WHILE

//do{
//    code to execute
//}while(condition is true)

var w:Int = 0
do{
    println("$w Herooooooo World")
    w++
}while (w < 10)

//FOR LOOP

//    IN KOTLIN FOR LOOP IS USED TO ITERATE THROUGH RANGES, ARRAYS, MAPS AND SO ON (ANYTHING THAT PROVIDES AN ITERATION)

//    for (item in collection){
//        body of the loop
//    }

//   LOOPING THROUGH A RANGE

    for (i in 0..10){
        println(i)
    }


//FIZZ BUZZ

for(e in 0..50){
    if(e %5==0 && e %3==0){
        println("FIZZBUZZ")
    }else if( e %3== 0){
        println("FIZZ")
    }else if ( e %5==0){
        println("BUZZ")
    }else{
        println("$e")
    }
}



//    for (i in 1..50) {
//        val result: String =
//            if (i % 3 == 0 && ) "FizzBuzz"
//            else if (i % 3 == 0) "Fizz"
//            else if (i % 5 == 0) "Buzz"
//            else "${i}"
//        println(result)
//    }



}
