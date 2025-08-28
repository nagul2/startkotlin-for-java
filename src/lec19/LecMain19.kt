package lec19

import lec19.a.print as printA
import lec19.b.print as printB


fun main() {
    printA()
    printB()
}


fun filterFruits1(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return listOf()
}

typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits2(fruits: List<Fruit>, filter: FruitFilter): List<Fruit> {
    return listOf()
}


data class UltraSuperGuardianTribe(
    val name: String,
)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>

