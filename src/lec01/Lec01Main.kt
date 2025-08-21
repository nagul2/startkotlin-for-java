package lec01

fun main() {
    var number1 = 10L   // 가변
    number1 = 20L       // 가능

    val number2 = 10L   // 불변 -> java의 final 변수
//    number2 = 10L       // 에러

    // 변수면 뒤에 :을 붙여서 타입 지정도 가능함
    var number3: Long = 10L
    val number4: Long = 20L
}

fun main2() {
//    var number  // 컴파일 에러
    var number: Long    // 타입을 선언하면 에러가 발생하지 않음

//    println(number) // 그러나 변수에 값을 초기화 하지 않고 사용하려고 하면 컴파일 에러 발생

    number = 10L
    println(number) // 정상 동작
}

fun main3() {
    var number3 = 10L
    val number4 = 1_000L
}

fun main4() {
    var number1 = 1000L
//    number1 = null    // 이미 number1 변수는 기본형으로 동작하기 때문에 null을 할당할 수 없다

    var number2: Long?  // null을 허용하려면 타입에 ?을 붙여야 함
    number2 = null

    var number3 = null  // null만 담을 수 있는 Nothing? 타입이 되어버림
}

fun main5() {
    var person = Person("사람")
}