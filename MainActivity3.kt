fun main() {
    val numbers = intArrayOf(10, 25, 7, 45, 18, 3)

    val maxNumber = numbers.maxOrNull()
    val minNumber = numbers.minOrNull()

    println("Найбільше число: $maxNumber")
    println("Найменше число: $minNumber")
}
