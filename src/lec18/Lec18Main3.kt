package lec18

fun main() {

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 1000),
            Fruit(2, "사과", 1200),
            Fruit(3, "사과", 1500),
        ),
        listOf(
            Fruit(4, "바나나", 1000),
            Fruit(5, "바나나", 1500),
            Fruit(6, "바나나", 2000),
        ),
        listOf(
            Fruit(7, "수박", 30000),
            Fruit(8, "수박", 35000)

        )
    )

    val samePriceFruits1 = fruitsInList.flatMap {
        list -> list.filter { fruit -> fruit.price == 1000L }
    }

    val samePriceFruits2 = fruitsInList.flatMap { list -> list.samePriceFilter}

}

