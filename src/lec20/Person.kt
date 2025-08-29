package lec20

class Person(
    var name: String,
    var age: Int
) {
    var hobby: String = ""

    fun growOld() {
        age += 1
    }
}

class PersonRepository {
    fun save(person: Person) {
        mutableListOf<Person>()
            .add(person)
    }
}


fun createPerson(
    name: String,
    age: Int,
    hobby: String,
): Person {
    return Person(
        name = name,
        age = age,
    ).apply {
        this.hobby = hobby
    }
}

fun main() {
    val person = Person("사람", 100)

    // 가능은 하지만 잘 사용하지 않음
    person.apply { this.growOld() }
        .let { println(it) }
}