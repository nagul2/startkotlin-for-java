package lec15

fun main() {
    val array = arrayOf(100, 200)

    // 배열의 인덱스를 활용
    for (i in array.indices) {
        println("$i, ${array[i]}")
    }

    // 인덱스와 value를 한 번에 받음
    for ((idx, value) in array.withIndex()) {
        println("$idx, $value")
    }

    // 배열에 값 추가
    array.plus(100)

}

