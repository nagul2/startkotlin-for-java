package lec12

fun main() {

    // 바로 싱글톤 클래스 이름으로 접근할 수 있다
    println(SingletonClass.a)
    SingletonClass.a = 1
    println(SingletonClass.a)

}

object SingletonClass {
    var a: Int = 0
}