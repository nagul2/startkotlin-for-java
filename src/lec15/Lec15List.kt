package lec15

fun main() {
    // 불변 리스트 생성
    val numbers = listOf(100, 200)

    // 빈 리스트 생성, <타입>으로 타입을 명시해 주어야 함
    val emptyList = emptyList<Int>()

    // emptyList를 사용할 때 타입 추론이 가능하면 <타입>을 생략할 수 있음
    println(printNumbers(emptyList()))


    // 하나를 가져오기
    println(numbers.get(0))  // 비권장
    println(numbers[0])      // 권장


    // For Each
    for (number in numbers) {
        println(number)
    }

    // 인덱스와 값을 한번에 가져오기
    for ((idx, value) in numbers.withIndex()) {
        println("$idx, $value")
    }

    val mutableNumbers = mutableListOf(100, 200) // 가변 리스트
    mutableNumbers.add(300) // 요소 추가
}

private fun printNumbers(numbers: List<Int>) {

}
