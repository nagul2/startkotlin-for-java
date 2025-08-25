package lec08

fun main() {
    // 메서드 호출 시 인자의 위치를 잘못 입력하여도 컴파일러가 잡아내지 못한다.
    printNameAndGender("FEMALE", "이름")

    // named argument를 사용하면 이러한 실수를 미연에 방지할 수 있다
    printNameAndGender(name = "이름", gender = "FEMALE")


    val lec08Main = Lec08Main()
//    lec08Main.repeat(str = "A") // 컴파일 에러 발생
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}