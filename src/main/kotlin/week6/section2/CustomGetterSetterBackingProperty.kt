package week6.section2.customproperty

import java.util.*


// 커스텀 게터/세터의 사용
class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var age: Int = _age

    private var _givenName: String? = null
    private var _familyName: String? = null

    var name:String =""             // 프로퍼티 초기화
        get() {
            if (_familyName==null)
                return field.uppercase(Locale.getDefault())
            else
                return "$_givenName ${_familyName!!.uppercase(Locale.getDefault())}"
        }
        set(value) {
            println("The name was changed")
            field = value           // 인자를 프로퍼티에 할당
            if (value.split(" ").count()>1) {   // 인자가 두 단어 이상이면
                _familyName = value.split(" ").get(0)
                _givenName = value.split(" ").get(1)
            }
        }

    init {
        name = _name
    }
}

fun main() {
    val user1 = User(1, "Lee Kwanwoo", 35)
    println("user1.name = ${user1.name}")
    val user2 = User(2, "John", 30)
    println("user2.name = ${user2.name}")
    user2.name = "Lee David"
    println("user2.name = ${user2.name}")

}
