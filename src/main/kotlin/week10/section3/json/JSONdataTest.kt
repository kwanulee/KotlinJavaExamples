package week10.section3.json
import com.google.gson.Gson

fun main() {
    val  jsonData = """
        {
            "name": "Alice",
            "age": 30,
            "city": "New York",
            "hobbies": ["reading", "traveling"],
            "address": {
                "street": "123 Main St",
                "zip": "10001"
            }
        }
        """.trimIndent()

    // Gson 인스턴스 생성
    val gson = Gson()

    // JSON -> 객체 변환
    val person: Person = gson.fromJson(jsonData, Person::class.java)

    println(person)
}

data class Person(
    val name: String,
    val age: Int,
    val city: String,
    val hobbies: List<String>,
    val address: Address
)

data class Address (
    val street: String,
    val zip: String
)
