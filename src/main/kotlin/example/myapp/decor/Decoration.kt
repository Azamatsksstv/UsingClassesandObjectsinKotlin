package example.myapp.decor

import example.myapp.makeFish

data class Decoration(val rocks: String) {
}
fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)
}

fun main () {
    makeDecorations()
}