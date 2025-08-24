package lec03

import lec03.Person


fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)

        // as Person은 생략이 가능해서 아래처럼 코드를 작성할 수 있다
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any) {
    if (obj !is Person) {
        println(obj.toString())
    }
}

fun printAgeIfPerson3(obj: Any?) {
    val person = obj as Person  // 바로 형변환해서 변수에 저장
    println(person.age)
}

fun printAgeIfPerson4(obj: Any?) {
    val person = obj as? Person  // as?를 사용하여 컴파일단계에서 NPE가 발생할 수 있음을 확인할 수 있음
    println(person?.age)         // safe call로 null이 들어올 경우 null을 반환하도록 작성
}


fun main() {
    printAgeIfPerson4(Person("김구리", 10)) // null을 인자로 전달 -> NPE 발생
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}