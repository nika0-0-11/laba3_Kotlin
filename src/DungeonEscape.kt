fun main() {
    var lvl = 0
    println("Добр пожаловать в подземелье!")
    while (lvl < 5) {
        println("\nВы на уровне $lvl.")
        println("Выберите действие: [1] Вперед | [2] Осмотреться | [0] Сдаться")
        val input = readLine()
        when (input) {
            "1" -> {
                lvl++
                println("Вы переходитек на уровень $lvl")
            }
            "2" -> {
                println("Вы осматриваетесь. Тут ничего интересного.")
                continue
            }
            "0" -> {
                println("Вы сдались. Игра окончена.")
                break
            }
            else -> {
                println("Неверный ввод. Попробуйте снова.")
                continue
            }

        }
        if (lvl == 5)
            println("Поздравляем! ВЫ выбрались из подзмелья.")


    }

}