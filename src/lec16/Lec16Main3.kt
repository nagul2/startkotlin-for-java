package lec16

open class Train(
    val name: String = "새마을기차",
    val price: Int = 5_000,
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10_000
}


class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")
    return this.price >= 10_000
}

fun main() {
    val train: Train = Train()
    train.isExpensive() // Train의 확장함수 호출

    val srt1: Train = Srt() // Train의 확장함수 호출
    srt1.isExpensive()

    val srt2: Srt = Srt()   // Srt의 확장함수 호출
    srt2.isExpensive()
}
