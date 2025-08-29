package lec20

fun main() {

    // 리스트를 출력 후 값을 추가1
    mutableListOf("one", "two", "three", "four")
        .also { println("The list elements before adding new one: $it")}
        .add("five")

    // 리스트를 출력 후 값을 추가2
    val numbers = mutableListOf("one", "two", "three", "four")
    println("The list elements before adding new two: $numbers")
    numbers.add("five")

}