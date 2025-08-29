package lec20

fun main() {
    val strings = listOf("AAAA", "BB", "CCCCC", "D")

    // 하나 이상의 함수를 call chain 결과로 호출 할 때
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println) // let { lengths -> println(length) }와 동일


    // non-null 값에 대해서만 code-block을 실행시킬 때 - 가장 많이 사용
    val str = "valvalwhatval"

    val result = str?.let {
        println(it.uppercase())
        it.length
    }

    // 일회성으로 제한된 영역에 지역 변수를 만들 때
    val numbers = listOf("one", "two", "three", "four")

    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()

    println(modifiedFirstItem)

}