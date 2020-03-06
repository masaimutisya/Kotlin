package functions

//SYNTAX FOR FUNCTION
    //fun name_of_function(){
    //    code to execute
    //}

//FUNCTION DECLARATION/ CREATION
fun greetings(){
    println("Herooooo World")
    println("Herooooo World Again")
}


//A FUNCTION THAT TAKES IN A SINGLE ARGUMENT
fun greetings2(name :String){
    println("Haroooooo $name")
}


//A FUNCTION THAT TAKES IN MORE THAN ONE ARGUMENT
fun greetings3(name :String, age :Int){
    println("Haroooooo $name, Your age is $age")
}

fun greetings4(name :String, age :Int, country :String){
    println("Haroooooo My name is $name, am $age yrs old and I come from $country")
}

fun greetings5(name :String, age :Int){
    println("Haroooooo $name, Your age is $age, and you will be ${age+10} in ten years")
}


//FUNCTION THAT RETURNS VALUES
fun sum_of_two(num1 :Int, num2 :Int):Int{
    val sum :Int = num1 + num2
    return sum
}


fun main(){

//    A FUNCTION IS A BLOCK OF CODE THAT IS TASKED TO DO A SPECIFIC TASK/JOB
//    WE USE FUNCTIONS TO WRITE CODE THAT WILL BE USED REPEATEDLY
//    A FUNCTION CAN AND CANNOT RETURN A VALUE
//    TO USE A FUNCTION YOU CALL IT BY USING THE NAME OF THE FUNCTION FOLLOWED BY PARENTHESIS
//    IN KOTLIN THE fun KEYWORD IS USED TO DECLARE A FUNCTION




    greetings()

    greetings2("Mutisya")

    greetings3("Mutisya",59)

    greetings4("Mutisya", 99, "Kenya" )

    greetings5("Mutisya", 68)

//    USE THE PRINT FUNCTION
    println(sum_of_two(22, 11))

//STORE THE RETURNRD VALUE IN A VARIABLE THEN PRINT
    val s1 :Int = sum_of_two(10, 10)
    val s2 :Int = sum_of_two(20, 20)
    val s3 :Int = sum_of_two(40, 40)
    println(s1)
    println(s2)
    println(s3)
    println(s1 + s2 + s3)





}





