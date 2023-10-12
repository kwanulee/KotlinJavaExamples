package week7.section1.derivedWithNoMainCons

open class Point (val x:Int, val y:Int) {
    fun showPoint() = println("($x,$y)")
}

class ColorPoint : Point {
    val color:String
    constructor(x:Int, y:Int, color:String) : super(x,y) {
        this.color = color
    }
    fun showColorPoint()  {
        showPoint()
        println("Color:$color")
    }
}

fun main() {
    val cp = ColorPoint(2,3,"RED")
    cp.showColorPoint()
}