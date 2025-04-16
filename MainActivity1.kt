fun maxOfThree(a: Int, b: Int, c: Int): Int {
    var max = a
    if (b > max) {
        max = b
    }
    if (c > max) {
        max = c
    }
    return max
}
fun main() {
    val max = maxOfThree(10, 25, 17)
    println("Максимальне число: $max") // Виведе: Максимальне число: 25
}
