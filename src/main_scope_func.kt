fun main(){

    val square = Square(10, 15).apply {
        addText("The first text")
        fillColor("blue")
    }

    println(square)

    with(square){
        fillColor("Red")
        this
    }

    println("\n$square")

    square.let {
        it.fillColor("Yellow")
        it
    }

    println("\n$square")

    square.run {
        fillColor("Grey")
        this
    }
    println("\n$square")


}



class Square(
    private val width: Int,
    private val height:Int,
    private var color: String? = null,
    private var text: String? = null
){

    fun fillColor(color: String){
        this.color = color
        println("$color color Filled")
    }

    fun addText(text: String){
        this.text = text
        println("\"$text\" text added")
    }

    override fun toString(): String {
        return "width = $width, height = $height, color = $color"
    }
}