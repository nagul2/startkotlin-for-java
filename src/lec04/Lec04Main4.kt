package lec04

fun main() {
    val money1 = Money(1_000L)
    val money2 = Money(1_000L)
    println(money1 + money2)    // Money 클래스의 plus 메서드가 호출됨
}