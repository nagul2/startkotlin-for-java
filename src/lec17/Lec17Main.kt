package lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 1000),
        Fruit("바나나", 1500),
        Fruit("바나나", 2000),
        Fruit("수박", 30000)
    )

    // 람다를 만드는 방법1
    val isApple1 = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법1
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과"}


    // 람다를 직접 호출하는 방법1
    isApple1(fruits[0])

    // 람다를 직접 호출하는 방법2 - 명시적으로 invoke 사용
    isApple2.invoke(fruits[0])


    filterFruits(fruits, isApple1)

    // 소괄호 다음 중괄호 안에 바로 람다를 작성할 수 있다
    // 중괄호의 본문이 메서드의 가장 마지막 파라미터로 들어가게됨
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과"}

    // 타입을 알고 있으므로 타입도 생략이 가능하며, 이름도 변경가능함
    filterFruits(fruits) { f -> f.name == "사과"}

    // 람다에서 사용하는 파라미터가 한 개인 경우 it 키워드 작성 가능
    filterFruits(fruits) { it.name == "사과"}

    filterFruits(fruits) { f ->
        println("출력")
        f.name == "사과"
    }

    var targetFruits = "바나나"
    targetFruits = "수박"
    filterFruits(fruits) {it.name == targetFruits}
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            result.add(fruit)
        }
    }
    return result
}