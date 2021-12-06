import kotlin.properties.Delegates

fun main(){
    val student = StudentSmall()
//     student.marks = 800

    student.age = 13
    student.age = 10
    student.age = 18
    student.age = 9
}

class StudentHeavy{
    init {
        println("Heavy student initialized")
    }
}


class StudentSmall{
    val heavy by lazy {
        StudentHeavy()
    }

    // observes for changes to this var and call a function
    var marks: Int by Delegates.observable(50){
        property, oldValue, newValue ->
        println("Old Value: $oldValue")
        println("New value: $newValue")
    }

    // assigns value to this var only when a condition i truw
    var age: Int by Delegates.vetoable(10){
        property, oldValue, newValue ->
        println("Old Value: $oldValue")
        println("New value: $newValue")
        newValue >= 14

    }
}