package lec09

fun main() {

}

class Person(
    val name: String = "이름",
    var age: Int = 1
) {

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // 자바의 메서드 처럼 작성(함수 작성)
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // 커스텀 getter(프로퍼티 처럼 보이게 할 수 있음)
    val isAdultGetter: Boolean
        get() = this.age >= 20

    // 중괄호를 활용할 수도 있음
    val isAdultGetter2: Boolean
        get() {
            return this.age >= 20
        }
}