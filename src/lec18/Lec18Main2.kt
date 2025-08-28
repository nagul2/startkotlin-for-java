package lec18

fun main() {

    val fruits = listOf(
        Fruit(1, "사과", 1000),
        Fruit(2, "사과", 1200),
        Fruit(3, "사과", 1500),
        Fruit(4, "바나나", 1000),
        Fruit(5, "바나나", 1500),
        Fruit(6, "바나나", 2000),
        Fruit(7, "수박", 30000)
    )

    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }

    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }

    val isExpensiveFruits = fruits.any { fruit -> fruit.price >= 10_000 }

    val fruitCount = fruits.count()

    val fruitsSortedByPriceAsc = fruits.sortedBy { fruit -> fruit.price }

    val fruitsSortedByPriceDesc = fruits.sortedByDescending { fruit -> fruit.price }

    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.price }
        .map { fruit -> fruit.name }


    fruits.first()
    fruits.firstOrNull()

    fruits.last()
    fruits.lastOrNull()

    // Value에 List<>
    val map1: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }


    val map3: Map<String, List<Long>> = fruits.groupBy(
        { fruit -> fruit.name },
        { fruit -> fruit.price }
    )

    // Value가 단일
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    val map4: Map<Long, Long> = fruits.associateBy(
        { fruit -> fruit.id },
        { fruit -> fruit.price }
    )
}