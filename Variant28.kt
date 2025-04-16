class InvalidProductDataException(message: String) : Exception(message)

fun main() {
    var totalSum = 0.0
    var expensivePurchasesCount = 0
    var maxPurchaseValue = 0.0
    var maxPurchaseItem: String? = null

    println("Введіть кількість покупок: ")
    val numberOfPurchases = readLine()?.toIntOrNull() ?: return println("Невірне значення кількості покупок.")

    for (i in 1..numberOfPurchases) {
        println("Введіть дані для покупки $i:")

        print("Ім’я товару: ")
        val itemName = readLine()

        print("Кількість товару: ")
        val quantity = readLine()?.toIntOrNull() ?: 0

        print("Ціна за одиницю товару: ")
        val pricePerUnit = readLine()?.toDoubleOrNull() ?: 0.0

        try {
            // Перевірка на від'ємні значення
            if (quantity < 0 || pricePerUnit < 0) {
                throw InvalidProductDataException("Кількість або ціна не можуть бути від'ємними!")
            }

            val totalPrice = quantity * pricePerUnit
            totalSum += totalPrice

            if (totalPrice > maxPurchaseValue) {
                maxPurchaseValue = totalPrice
                maxPurchaseItem = itemName
            }

            if (pricePerUnit > 1000) {
                expensivePurchasesCount++
            }

        } catch (e: InvalidProductDataException) {
            println("Помилка: ${e.message}")
        }
    }

    println("\nЗвіт про покупки:")
    println("Найдорожча покупка: ${maxPurchaseItem ?: "Не було покупок"} на суму $maxPurchaseValue")
    println("Загальна сума всіх покупок: $totalSum")
    println("Кількість товарів дорожчих за 1000 грн: $expensivePurchasesCount")
}
