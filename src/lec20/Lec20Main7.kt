package lec20

class Person3(
    var name: String,
    var age: Int
) {

    val isAdult: Boolean
        get() = age <= 20

}

class View {
    fun showPerson(person: Person3) {
        println("사람 출력: ${person.name}, ${person.age}세")
    }

    fun showError() {
        println("에러 발생: 잘못된 사람 정보")
    }
}

fun main() {
    val person = Person3("사람", 20)
    val view = View()

    // 1번 코드
    if (person != null && person.isAdult) {
        view.showPerson(person)
    } else {
        view.showError()
    }

    // 2번 코드
    person?.takeIf { it.isAdult }
        ?.let(view::showPerson)
        ?: view.showError()
}