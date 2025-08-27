package lec16

inline fun Int.inlineAdd(other: Int): Int {
    return this + other
}

fun main() {
    3.inlineAdd(4)
}
