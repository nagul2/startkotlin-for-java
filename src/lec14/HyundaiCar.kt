package lec14

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 3_000L)
class Sonata : HyundaiCar("소나타", 4_000L)
class Grandeur : HyundaiCar("그랜저", 5_000L)

fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}