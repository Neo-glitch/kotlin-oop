import kotlin.reflect.KProperty

fun main() {

    val student = Student()

    student.firstName = "NeoKing"
    student.lastName= " Marcello"
    println(student.toString())

}


class Student {
//    var firstName: String? = null
//    set(value){
//        if(value != null && value.length > 5){
//            field = value.trim().toUpperCase()
//        }
//    }

//    var lastName: String? = null
//        set(value){
//            if(value != null && value.length > 5){
//                field = value.trim().toUpperCase()
//            }
//        }
//

    var firstName: String? by NameDelegate()
    var lastName: String? by NameDelegate()

    override fun toString(): String {
        return "$firstName $lastName"
    }



}

class NameDelegate{
    var formattedValue : String? = null

    // delegated setter
    /**
     * fist param = calling obj(can be anyType) of var
     * second param = metaInfo of var
     * third param = value to set the property to
     */
    operator fun setValue(thisRef: Any?,
                          property: KProperty<*>,
                          value: String?){
            if(value != null && value.length > 5){
                formattedValue = value.trim().toUpperCase()
            }
    }

    operator fun getValue(thisRef: Any?,
                          property: KProperty<*>): String?{
        return formattedValue
    }
}