package lec13

fun main() {

}


class House(
    private var address: String,
    private var livingRoom: LivingRoom,
) {

    inner class LivingRoom(
        private var area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}
