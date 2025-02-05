import kotlin.math.pow

fun main(){
    var num1 = readLine()!!.toDouble()
    var num2 = readLine()!!.toDouble()
    when{
        (num1 == num2) -> println(num1.pow(3))
        (num1 > num2) -> println("num1 + 1="+(num1 + 1))
        (num2 > num1) -> println("num2 + 1="+(num1 + 1))
        else -> println("num1=$num1 num2=$num2")
    }
}