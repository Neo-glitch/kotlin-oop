import java.lang.ArithmeticException
import java.lang.IllegalArgumentException

/**
 * heirachy of exception
 * Throwable
 * Exception
 * all other exceptions that are predefine
 */

// custom exception class
class IllegalVoterException(message: String): Exception(message){

}



fun vote(nameOfVoter: String, ageOfVoter: Int){
    if(ageOfVoter < 18){
        throw IllegalVoterException("Younger than eighteen can't vote")
    } else {
        println("$nameOfVoter voted")
    }
}

val a = 10
val b = 0

fun main() {
    try {
        vote("John", 13)
    }catch (e: IllegalVoterException){
        e.printStackTrace()
    }


}