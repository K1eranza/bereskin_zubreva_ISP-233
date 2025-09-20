fun main() {
    print("Введите первое число: ")
    val number1 = readln().toInt()
    print("Введите второе число: ")
    val number2 = readln().toInt()
    if (number1 > number2) {
        println("Первое число больше")
    } else if (number1 == number2) {
        println("Числа равны")
    } else {
        println("Второе число больше")
    }
    val max = if (number1 > number2) number1 else number2
    println("Максимальное число: $max")
    val age = readln().toInt()
    val status = if(age >= 18) "Взрослый" else "Ребенок"
    println(status)
}