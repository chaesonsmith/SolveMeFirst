/*  
    This was originally a C++ problem, I solved it using Scala and also added validation for user input.

    Problem: 
        Complete the function solveMeFirst to compute the sum of two integers.
    
    Example:
        A = 7
        B = 3

        Return 10
    
    Function Description:
        Complete the solveMeFirst function in the editor below.

        solveMeFirst has the following parameters:
            int a: the first value
            int b: the second value
        
        Returns
            int: the sum of a and b
    
    Constraints:
        1 < a,b < 1000
*/

import scala.io.StdIn._                             // Import function for readInt() and println()

object HackerRankChallenge {
    def solveMeFirst(a: Int, b: Int): Int = {       // Simple function that adds two integers
        return a + b
    }

    def getValidInteger(varName: Char): Int = {     // Function that checks if input is between 1 and 1000
        var isValid: Boolean = false                // Displays error and prompts the user again until valid input is entered
        var number: Int = 0

        while (!isValid) {
            print(varName + ": ")
            number = readInt()

            if (number > 1 && number < 1000) {
                isValid = true
            }
            else {
                println("Error: Number must be greater than 1 and less than 1000; Try again.")
            }
        }

        return number
    }

    def main(args: Array[String]): Unit = {         // Main function 
        println("Enter two integers...")

        var a = getValidInteger('a')
        var b = getValidInteger('b')

        println("The sum of the two integers is: " + solveMeFirst(a, b))
    }
}
