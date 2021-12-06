fun main(){

    Color.values().forEach {
        println(it)
    }
}

//enum class Color{
//    RED,
//    GREEN,
//    BLUE
//
//}

enum class Color(var colorName: String, val colorVaue: Int){
    RED("Red", 10),
    GREEN("Green", 100),    // simple instance of this color enum class
    BLUE("Blue", 50)

}