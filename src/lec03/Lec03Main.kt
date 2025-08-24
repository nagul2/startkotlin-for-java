package lec03

fun main() {
    val number1 = 4
//    val number2: Long = number1 // Type mismatch 컴파일 에러
    val number2: Long = number1.toLong()

    println(number1 + number2)

    val number3 = 3
    val number4 = 5
    val result = number1 / number2.toDouble()
    println(result)


    val number5: Int? = 3
//    val number6: Long = number5.toLong()  // 컴파일 에러 발생

    // Safe Call 혹은 Elvis 연산자 등을 통해 null 처리를 해주어야 함
    val number6: Long? = number5?.toLong(); // Safe Call을 통해 null 반환 처리 허용
    val number7: Long = number5?.toLong() ?: 0L // Elvis 연산자를 통해 null이 들어올 경우 0L으로 반환되도록 처리
}