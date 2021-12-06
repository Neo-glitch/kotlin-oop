fun main(){
    println(Manager)
    println(Manager)

    println("\n ${ManagerOld.getInstance()}")
    println(ManagerOld.getInstance())

}


// singleTon Implementation
object Manager{

    init {
        println("Manger object created")
    }
}

// old Singleton java implementation using kt code, but param can be passed to constructor
// also thread safe using synchronized keyword
class ManagerOld private constructor(private var dummyString: String){

    companion object {
        private var instance: ManagerOld? = null

        fun getInstance() = synchronized(this){
            if(instance == null)
                instance = ManagerOld("Dummy name")
            instance
        }


    }

}