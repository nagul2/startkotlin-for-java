package lec03

import lec03.Person

fun main() {
    val person = Person("개발자", 40)
    println("사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다")

    // {} 생략
    val name = "개발자"
    val age = 40
    println("사람의 이름은 $name 이고 나이는 $age 세 입니다")

}

