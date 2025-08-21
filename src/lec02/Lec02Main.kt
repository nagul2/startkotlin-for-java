package lec02

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

/*
fun errorStartsWithA4(str: String?): Boolean {
    // 코틀린에서는 파라미터에 null이 들어올 수 있으면 바로 메서드 호출을 할 수 없도록 컴파일 에러가 발생한다
//    return str.startsWith("A")
}
*/

/*
fun main() {
    val str: String? = "ABC"
//    str.length  // 불가능
    str?.length     // 가능

    val str2: String? = null
    println(str2?.length)
}
*/


fun starsWithA1After(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2After(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3After(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA(str: String?): Boolean {
    return str!!.startsWith("A")
}


fun main() {
    val person = Person(null)
    startsWithB(person.name)
}

fun startsWithB(str: String): Boolean {
    return str.startsWith("B")
}
