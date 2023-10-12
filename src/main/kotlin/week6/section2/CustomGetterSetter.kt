package week6.sections.customgetset

import java.util.*

// 커스텀 게터/세터의 사용
class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.uppercase(Locale.getDefault()) // 받은 인자를 대문자로 변경해 프로퍼티에 할당
        }

    var age: Int = _age
        private set
}

fun main() {
    val user1 = User(1, "kildong", 35)

    user1.name = "coco"
    println("user3.name = ${user1.name}")
    //user1.age = 36    // 외부에서 변경할 수 없음
}
