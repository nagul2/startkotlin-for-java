package lec09

fun main() {

}

class Person3(
    name: String = "이름",
    var age: Int = 1
) {

    var name = name
        set(value) {
            field = value.uppercase()
        }



//    val name = name
//        get() = field.uppercase()

}

class Person4(
    val name: String = "이름",
    var age: Int = 1
) {

    // 함수 사용
    fun getUppercaseName(): String =
        this.name.uppercase()

    // custom getter
    val uppercaseName: String =
        this.name.uppercase()
}