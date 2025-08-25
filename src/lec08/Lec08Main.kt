package lec08

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun max2(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }

fun max3(a: Int, b: Int) = if (a > b) a else b


fun main() {
    repeat("Hello World", 3, true)
    repeat("Hello World", 3)
    repeat("Hello World")


    repeat("Hello World", 3, false)
    repeat("Hello World", userNewLine = false)
}

fun repeat(
    str: String,
    num: Int = 3,
    userNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}