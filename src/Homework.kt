import kotlin.random.Random

fun main() {

    // Задание 1. Угадай число

    val x = Random.nextInt(1, 50)
    println("Угадай число от 1 до 50")
    while (true){
        print("Введи число:")
        val input = readln().toInt()

        when {
            input < x -> println("Загаданное число больше")
            input > x -> println("Загаданное число меньше")
            else -> {
                println("Поздравляю! Ты угадал число $x")
                break
            }
        }
    }

    // Задание 2. Счётчик гласных

    print("Введите строку: ")
    val input = readln().toString()
    var count = 0

    for (i in input){
        if (i in "aeiou" ){
            count++
        }
    }
    println(count)

    // Задание 3. Обратный отсчёт

    print("Введите число N: ")
    val n = readln().toInt()
    for (i in n downTo 1){
        println(i)
    }

    // Задание 4. Генератор пароля

    val char = "abcdefghijklmnopqrstuvwxyz123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#"
    val len = (8..16).random()
    var pass = ""

    for (i in 1..len){
        pass += char.random()
    }
    println(pass)

    // Задание 5. Мини-опрос

    print("Как тебя зовут: ")
    val name = readln().toString()

    print("Где ты живешь: ")
    val city = readln().toString()

    print("Что ты ел на завтрак: ")
    val food = readln().toString()

    print("Какое любимое мороженое: ")
    val  ice_cream = readln().toString()

    val feedback = listOf("Круто", "Молодец", "Здорово", "Отлично")

    println("Имя: $name")
    println("Город: $city \nЕда: $food \nМороженое: $ice_cream")
    println("Отзыв: ${feedback.random()}")

    // Задание 6. Сумма чисел

    print("Введите число N: ")
    val n1 = readln().toInt()
    var sum = 0

    for (i in 1..n1){
        sum += i
    }

    println("Сумма чисел от 1 до $n1: $sum")

    // Задание 7. Кубик D6

    println("10 бросков щестигранного кубика: ")
    for (i in 1..10){
        val d = Random.nextInt(1,7)
        println("Бросок $i: $d")
    }

    // Задание 8. Слот-машина
    var count1 = 0

    while (true) {
        val num1 = Random.nextInt(0, 6)
        val num2 = Random.nextInt(0, 6)
        val num3 = Random.nextInt(0, 6)

        count1++
        println("Попытка - $count1")
        println("Числа: $num1, $num2, $num3 ")

        if(num1 == num2 && num2 == num3){
            println("Джекпот!")
            break
        }
    }

    // Задание 9. Банковский счёт

    var balance = (100..1000).random()
    var day = 1

    println("День - $day: На счету - $balance рублей")

    while (balance > 0){
        val take_off = (10..100).random()
        balance -= take_off
        if (balance < 0){
            println("Недостаточно средств для снятия - $take_off рублей")
            break
        }
        println("День - $day: Снято - $take_off Осталось - $balance рублей")
        day++
    }

    // Задание 10. Прогноз погоды

    val days = listOf("Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс")

    println("Температура на неделе:")
    for (day in days){
        val temp = (-10..30).random()
        if (temp < 0){
            println("$day: $temp°C - минусовая температура")
        }
        else{
            println("$day: ${temp}°C")
        }
    }
}