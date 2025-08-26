package lec10

interface Swimmable {

    val swimAbility: Int

    fun act() {
        println(swimAbility)
        println("어푸 어푸")
    }

    val swimAbility2: Int
        get() = 2
}