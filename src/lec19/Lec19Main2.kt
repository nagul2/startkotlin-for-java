package lec19

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val person = Person("이름", 10)
    val (name, age) = person
    println("이름 : $name, 나이 : $age")


    val map = mapOf(1 to "A", 2 to "B")
    for ((k, v) in map.entries) {
        // ...
    }

}