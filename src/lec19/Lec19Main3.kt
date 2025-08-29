package lec19

class Person2(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {
    val person = Person2("Alice", 29)
    val (name, age) = person
    println("$name, $age")
}
