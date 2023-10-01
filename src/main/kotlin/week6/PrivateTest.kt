package week6

class PrivateClass {
    private var _myArray = arrayOf("1","2","3")
    val myIterator : Iterator<String>
        get() = _myArray.toList().iterator()


}