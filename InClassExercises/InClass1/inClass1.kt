/* 
    Name: Arnold Hien
    In-Class Problems 1
    Kotlin Basics
*/
 fun main() {

    // 1. Print these messages on separate lines
    
    println("Use the val keyword when the value doesn't change.")  
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

    // 2. Uncomment the following code and fix the compile error
    println("New chat message from a friend")

    // 3. Uncomment the following and fix the compile error
    
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
    

    // 4. Uncomment and fix this code so it prints:
    // The total part size is: 50
    
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
     

    // 5. Uncomment and fix this code so it compiles
    
    val numCats: Double = 2.0
    var numDogs: Int = 2
    numDogs += numCats.toInt()
    

    // 6. After fixing number 5, write a print statement to print the number
    // of cats and dogs using the variables, like:
    // There are 2 cats and 4 dogs
    println("There are ${numCats.toInt()} cats and $numDogs dogs")

    // 7. Write a when statement that prints whether there are more cats than 
    // dogs, more dogs than cats, are there are the same number of each.
    
    when { 
        numCats > numDogs -> println("There are more cats than dogs") 
        numDogs > numCats -> println("There are more dogs than cats") 
        else -> println("there are the same number of cats and dogs")}

    // 8. Use when to determine if a character is a vowel or consonant and
    // print the result. Char has methods named lowerCaseChar() and
    // upperCaseChar() you can use, or you can assume upper/lowercase
    val myChar = 'y'
    val check = when (myChar.lowercaseChar()){
        'a', 'e', 'i', 'o','u' -> "vowel"
        else -> "consonant"
    }
    println("$myChar is a $check")
    

    // 9. Use a for loop to print the numbers 0 to 9 in reverse order. Hint -
    // there is a downTo keyword
    for (i in 9 downTo 0) print(i)
    
    // 10. Create one list with 3 of your favorite shows/movies/games/etc. and
    // print the list
    val faves = listOf("Avatar", "Death Note", "Aquaman")
    println(faves)

    // 11. Create another list with 2 or 3 of your least favorite shows/movies/
    // /games/etc. Then, create a third list that contains everything from both lists.
    // Print out this new list.
    val unfaves = listOf("Wonder Woman", "Dead Pool", "Black Adam")
    val combo = (faves + unfaves).toMutableList()
    println(combo)


    // 12. Remove your most and least favorite from the combined list, and print
    // this new list. (You may need to modify what you did for 10 and 11)
    combo.remove("Black Adam")
    println(combo)
    println(faves)
    println(unfaves)


    // 13. Create a string variable and set it to null, then print the string
    val str: String? = null
    println(str)

    // 14. Make a variable and set it to the length of the string from 13 such that if
    // the string is null, the variable will be -1, then print the length.
     
     val length = str?.length ?: -1
    println(length)

    // 15. Write a when statement that returns a string saying if the string
    // is empty, the string is short, the string is medium length, or the string
    // is long. It's up to you as to what short, medium, and long strings are.
     val testStr: String? = "abc"
     val strDesc = when(testStr?.length) {
       0 -> "empty"
       in 1..6 -> "short"
       in 7..13 -> "medium"
       else -> "long"
    }
    println(strDesc)


}
 
