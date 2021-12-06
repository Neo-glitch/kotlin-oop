fun main(){

    val arrayUtils = ArrayUtils<Int>(arrayOf(1, 2,3,4,5, 8))
    val arrayUtilsString = ArrayUtils<String>(arrayOf("1","2","3", "4", "5","8"))
    arrayUtils.findElement(3) { index, element ->
        println("Index $index")
        println("Element $element")
    }

    arrayUtilsString.findElement("4") {
            index, element ->
        println("Index $index")
        println("Element $element")
    }
}


class ArrayUtils<T>(private val array: Array<T>){

    // foundELement is a fun and args is index and element and fun returns nothing
    fun findElement(element: T, foundElement: (index: Int, element: T?) -> Unit){
        for(i in array.indices){
            if(array[i] == element){
                foundElement(i, element)
                return
            }
        }
        foundElement(-1, null)
        return
    }

}