fun main() {
    // Шаг 1. Цикл while
    /*while (условие) {
        //Код который будет повторяться
    }*/
    /*var number = 1
    while (number <= 5) {
        println("Число: $number")
        number++
    }*/

    // Шаг 2. Операторы continue и break

    /*var number = 0
    while (number < 10) {
        number++
        if (number == 3) {
            println("Останавливаемся на $number")
            continue
        }
        println(number)
    }*/

    /*print("Напишите что-нибудь (для выхода введите 'выход'): ")

    while (true) {
        val input = readLine()
        if (input == "выход") {
            println("До свидания!")
            break
        }
        println("Вы вывели $input")
    }*/

    /*var message = 'A'

    while (message <= 'Z') {
        print(message)
        message++
    }*/

    //Шаг 4. Цикл do...while

    /*do {
        //Блок кода
    } while (условие)*/

    /*var number: Int

    do {
        print("Введите число больше 10: ")
        number = readln().toInt()
    } while (number <= 10)
    println("Спасибо! Вы вввели $number.")*/


    /*var password: String?

    do {
        print("Введите пароль:  ")
        password = readln()
    } while (password != "qwerty")

    println("Доступ разрешен!")*/

    //Шаг 5. Цикл for

    /*for (переменная in диапазон/коллекция) {
        //тело цикла
    }*/
   /* for (i in 1..5) {
        println("Шаг $i")
    }*/

    /*val fruits = listOf("apple", "banana", "cherry")
    for (fruit in fruits) {
        println("Фрукт: $fruit")
    }*/

    //Шаг 6. Метод split()

    /*val sentence = "Kotlin is awesome"
    val words = sentence.split( " ")
    println(words)*/

    /*val data = "apple, banana, orange"
    val fruits = data.split(",")
    for (fruit in fruits) {
        println(fruit)
    }*/

    /*val messy = "word1, word2;word3|word4"
    val parts = messy.split(",",";", "|")*/

    /*val fullName = "Гвоздева Вероника"
    val parts = fullName.split(" ")
    val lastName = parts[0]
    val firstName = parts[1]
    println("Фамилия: $lastName, Имя: $firstName")*/


    /*print("Введите числа через пробел: ")
    val input = readln()
    val numbers = input.split(" ")
    var sum = 0

    for (number in numbers) {
        sum += number.toInt()
    }
    println("Сумма чисел: $sum")*/



}
