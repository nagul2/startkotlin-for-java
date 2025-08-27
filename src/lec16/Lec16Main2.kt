package lec16

fun main() {
    val person = Person("A", "B", 10)
    person.nextYearAge()
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}
