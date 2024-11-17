package week10.section3.csv

fun main() {
    val csvData = """
        Name,Age,City
        Alice,30,New York
        Bob,25,Los Angeles
        Charlie,35,Chicago
    """.trimIndent()
    val resultList = parseCSV(csvData)
    println(resultList)
}

data class Person(
    val name: String,
    val age: Int,
    val city: String
)

fun parseCSV(data: String): List<Person> {
    val dataList = mutableListOf<Person>()

    data.lineSequence().forEach {
        val tokens = it.split(",").map { it.trim() }
        try {
            val dataItem = Person(
                name = tokens[0],
                age = tokens[1].toInt(),
                city = tokens[2]
            )
            dataList.add(dataItem)
        } catch (e: Exception) {
            println("CSV 파싱 오류: $it")
        }
    }
    return dataList
}