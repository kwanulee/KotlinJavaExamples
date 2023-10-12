package week7.section1.derivedWithMainCons

open class Point (val x:Int, val y:Int) {
    fun showPoint() = println("($x,$y)")
}

class ColorPoint (x:Int, y:Int, val color:String)
                                    : Point(x,y) {
    fun showColorPoint()  {
        showPoint()
        println("Color:$color")
    }
}

fun main() {
    val cp = ColorPoint(2,3,"RED")
    cp.showColorPoint()
}