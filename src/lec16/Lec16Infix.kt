package lec16

fun Int.add(other: Int): Int {
    return this + other
}

// 중위 함수
infix fun Int.add2(other: Int): Int {
    return this + other
}

fun main() {
    3.add(4)    // 일반 함수 호출

    3.add2(4)   // 중위 함수도 일반호출 처럼 사용 가능
    3 add2 5 // 중위 함수 호출

}
