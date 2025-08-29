package lec19

fun main() {

    val number = 10

    fun getNumberOrNull(): Int? {
        return if (number <= 0) {
            null
        } else {
            number
        }
    }

    fun getNumberOrNullV2(): Int? {
        return number.takeIf { n -> n >= 0 }
    }

    fun getNumberOrNullV3(): Int? {
        return number.takeUnless { n -> n <= 0 }
    }
}