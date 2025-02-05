fun main(){
    var numbers = readLine()!!.toInt()
    when{
        (numbers > 9) -> println("Число введено больше нужного")
        (numbers < 0) -> println("Число введено меньшего нужного")

        (numbers == 0) -> println("Ноль")
        (numbers == 1) -> println("Один")
        (numbers == 2) -> println("Два")
        (numbers == 3) -> println("Три")
        (numbers == 4) -> println("Четыре")
        (numbers == 5) -> println("Пять")
        (numbers == 6) -> println("Шесть")
        (numbers == 7) -> println("Семь")
        (numbers == 8) -> println("Восемь")
        (numbers == 9) -> println("Девять")
    }
}