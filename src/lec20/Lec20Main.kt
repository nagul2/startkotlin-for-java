package lec20

import lec19.Person

fun main() {

}

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPersonRefactor(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }

}