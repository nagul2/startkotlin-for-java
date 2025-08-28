package lec18

data class Fruit(
    val id: Long,
    val name: String,
    val price: Long,
) {


    val isSamePrice: Boolean
        get() = price == 1000L
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)

