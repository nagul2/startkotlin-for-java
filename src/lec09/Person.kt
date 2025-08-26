package lec09

fun main() {
//    val person3 = Person("너구리", 20)
//    println(person3.name)   // getter 사용
//
//    person3.age = 30;       // setter 사용
//    println(person3.age)    // getter 사용
//
//    val javaPerson = JavaPerson("자바사람", 10)
//    println(javaPerson.name)
//
//    javaPerson.age = 10
//    println(javaPerson.age)

    val person = Person("이름만 넣기")
    val person2 = Person()
}

//public class Person constructor(name: String, age: Int) {
//    val name: String = name
//    var age: Int = age
//}
//
//
//class Person2(name: String, age: Int) {
//    val name: String = name
//    var age: Int = age
//}

class Person1(
    val name: String,
    var age: Int
) {
    // 초기화 시점에 한 번 호출되는 블록
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor(): this("그냥 만든 생성자") {
        println("두 번째 부생성자")
    }
}
