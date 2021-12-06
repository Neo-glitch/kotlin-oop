fun main(){

    var obj = OuterClass(1, 2, 3);
    var innerClass = obj.InnerClass("Box")

    innerClass.printContent()
}

class OuterClass(var width: Int, var length: Int, var height: Int){


    inner class InnerClass(val content: String){

        fun printOuterClasInfo(){
            println("$width, $length, $height")
        }

        fun printContent(){
            println(content)
        }
    }
}