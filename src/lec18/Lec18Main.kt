package lec18

import lec17.Fruit

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

    val apples = fruits.filter { f -> f.name == "사과" }
    val applesWithIndex = fruits.filterIndexed { idx, fruit ->
        println("$idx, $fruit")
        fruit.name == "바나나"
    }

    val fruitsPrice1 = fruits.map { f -> f.price }
    val fruitsPriceWithIndex = fruits.mapIndexed { idx, fruit ->
        println("$idx: $fruit")
        fruit.price
    }

    val values = fruits.mapNotNull { fruit ->
        fruit.name
    }


}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter { fruit -> filter(fruit) }
}