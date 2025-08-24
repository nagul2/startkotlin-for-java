package lec03

import lec03.Person

fun main() {
    val name = "이름"

    val trimIndent = """
        ABC
        123
        456
        $name
    """.trimIndent()
    print(trimIndent)
}

