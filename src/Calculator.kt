fun main() {
    print("Введите первое число, знакоперации и второе число через пробел: ")
    val input = readln().split(" ")
    val symbol = input[1]
    val firstNumber = input[0].toDouble()
    val secondNumber = input[2].toDouble()
    var result = 0.0
    when (symbol) {
        "/" -> result = firstNumber / secondNumber
        "*" -> result = firstNumber * secondNumber
        "+" -> result = firstNumber + secondNumber
        "-" -> result = firstNumber - secondNumber
        else -> println("Неккоректный ввод")
    }
    println("$firstNumber $symbol $secondNumber = $result")
}