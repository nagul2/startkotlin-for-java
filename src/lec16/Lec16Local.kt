package lec16

fun createPerson(firstName: String, lastName: String): Person {

    if (firstName.isEmpty()) {
        throw IllegalArgumentException("First name is empty, now: $firstName")
    }

    if (lastName.isEmpty()) {
        throw IllegalArgumentException("Last name is empty, now: $lastName")
    }

    return Person(firstName, lastName, 1)
}

fun createPersonLocal(firstName: String, lastName: String): Person {
    fun validateName(name: String, filedName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${filedName} is empty, now: $name")
        }
    }
    validateName(firstName, lastName)
    validateName(lastName, firstName)
    return Person(firstName, lastName, 2)
}