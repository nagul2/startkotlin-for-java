package lec04

fun main() {
    val money1 = JavaMoney(3_000L)
    val money2 = money1
    val money3 = JavaMoney(3_000L)

    println(money1 === money2) // money1과 money2의 주소가 같은지 확인 -> true
    println(money1 === money3) // money1과 money3의 주소가 같은지 확인 -> false
    println(money1 == money3) // money1과 money3의 값이 같은지 확인 -> true
}