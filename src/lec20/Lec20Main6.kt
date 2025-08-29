package lec20

data class Person2(
    val name: String,
    val age: Int
)

class PersonDto(
    var name: String,
    var age: Int
)

fun main() {
    val person = Person2("사람", 10)

    return with(person) {
        PersonDto(
            name = name,
            age = age
        )
    }
}