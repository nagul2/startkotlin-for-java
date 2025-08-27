package lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

// 문자열에 존재하는 가장 마지막 문자를 가져오는 확장 함수
fun String.lastChar(): Char {
    return this[this.length - 1]
}

val String.lastChar: Char
    get() = this[length - 1]