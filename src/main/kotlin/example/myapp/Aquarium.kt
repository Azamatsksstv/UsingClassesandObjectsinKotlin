package example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    var length: Int = length
    var width: Int = width
    var height: Int = height
//    Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40)
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

