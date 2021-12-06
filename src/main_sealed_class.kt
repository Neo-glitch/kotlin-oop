fun main(){
    val data = getData()

    when(data){
        is Data.Success -> {println(data)}
        is Data.Error -> {println(data)}
        is Data.Loading ->{println(data)}
    }
}



fun getData(): Data{
    return  Data.Success((100..100).random().toString())
}

sealed class Data{

    // this class could still be outside data class
    data class Success(val data:String): Data()
    data class Error(val data: String): Data()
    object Loading: Data()
}