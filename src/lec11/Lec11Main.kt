package lec11

val a = 3
private val c = 4

fun add(a: Int, b: Int): Int {
    println(c)
    return a + b
}

class Cat()

class Dog private constructor(
    val count: Int
)

class Car(
    // getter, setter 한 번에 접근 지시어를 지정
    internal val name: String,
    private var owner: String,

    _price: Int
) {
    // setter에만 별도로 지정
    var price = _price
        private set
}