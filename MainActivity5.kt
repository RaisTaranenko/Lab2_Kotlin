fun main() {
    val numerator = 10
    val denominator = 0

    try {
        val result = numerator / denominator
        println("Результат: $result")
    } catch (e: ArithmeticException) {
        println("Помилка: ділення на нуль!")
    }
}
