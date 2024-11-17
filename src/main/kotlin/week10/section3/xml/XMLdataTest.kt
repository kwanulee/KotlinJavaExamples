package week10.section3.xml

import com.fasterxml.jackson.dataformat.xml.XmlMapper

fun main() {
    val  xmlData = """
        <person>
            <name>Alice</name>
            <age>30</age>
            <city>New York</city>
            <hobbies>
                <hobby>reading</hobby>
                <hobby>traveling</hobby>
            </hobbies>
            <address>
                <street>123 Main St</street>
                <zip>10001</zip>
            </address>
        </person>
    """.trimIndent()

    val xmlMapper = XmlMapper()
   // val resultList = parseCSV(xmlData)
    val person = xmlMapper.readValue(xmlData, Person::class.java)
    println(person)
}

data class Person(
    val name: String,
    val age: Int,
    val city: String,
    val hobbies: List<String>,
    val address: Address
) {
    constructor(): this("",0,"",ArrayList(), Address())
}

data class Address (
    val street: String,
    val zip: String
) {
    constructor(): this("","")
}
