package lec19

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // 전통 적인 반복문
    for (n in numbers) {
        println(n)
    }

    // 자바의 스트림 처럼 .filter, .map 과 같이 쓰고싶을 때는 .forEach를 사용
    // 그러나 여기에는 일반적으로 continue, break를 사용할 수 없음
    numbers
        .map { n -> n + 1 }
        .filter { n -> n % 2 == 0 }
        .forEach { n -> println(n) }


    // 강제로 사용하고 싶을 때, run { ... return@run } = break
    run {
        numbers.forEach { n ->
            if (n % 2 == 0) {
                return@run
            }
            println(n)
        }
    }



    // 강제로 사용하고 싶을 때, { ... return@forEach } = continue
    numbers.forEach { n ->
        if (n % 2 == 0) {
            return@forEach
        }
        println(n)
    }

}