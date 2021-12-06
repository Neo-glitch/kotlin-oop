fun main(){
    val a = "How are you"
    val word = a.getAllWords()
    println(word)
}


// extension function to add extra function to a class not owned
fun String.getAllWords(): List<String>{
    return this.split(" ")
}