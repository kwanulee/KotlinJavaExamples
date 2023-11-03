package week9.section2.sortwith

data class Product(val name: String, val price: Double)

fun main(args : Array<String>) {
    val products = arrayOf(
            Product("Snow Ball", 870.00),
            Product("Smart Phone A", 999.00),
            Product("Drone", 240.00),
            Product("Mouse", 633.55),
            Product("Keyboard", 125.99),
            Product("Smart Phone B", 1500.99),
            Product("Mouse", 512.99))

    // 두 객체의 비교, p1이 크면 1, 같으면 0, 작으면 -1
    products.sortWith(
            Comparator<Product> { p1, p2 ->
                when {
                    p1.price > p2.price -> 1
                    p1.price == p2.price -> 0
                    else -> -1
                }
            }
    )

/*  Comparator 구현 클래스를 이용한 방식
    class ComparatorImp : Comparator<Product> {
        override fun compare(p1:Product, p2:Product) =
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
    }
    val comparator = ComparatorImp()
    products.sortWith(comparator)
*/

    products.forEach { println(it) }
    println()

    //  compareBy를 함께 사용해 두개의 정보 정렬
    // varargs로 받고 있으므로 두개 이상 사용 가능
 //   products.sortWith(compareBy({it.name}, {it.price}))

    products.sortWith(
                    compareBy(
                        {product -> product.name},      // 첫번째 정렬기준: name
                        {product -> product.price}      // 두번째 정렬기준: price
                    )
    )

    products.forEach { println(it) }
    println()

}
