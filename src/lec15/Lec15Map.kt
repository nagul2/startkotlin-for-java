package lec15

fun main() {
    val map = mutableMapOf<Int, String>()

    map.put(5, "D") // 자바 처럼도 사용 가능하다
    map[3] = "A"
    map[4] = "B"

    // 맵 생성과 동시에 값을 입력할 때는 to를 사용
    val map2 = mapOf(1 to "A", 2 to "B")    // 불변


    // key만 가져오기
    for (key in map.keys) {
        println(key)        // key

        println(map.get(key))       // value
        println(map.getValue(key))  // value
        println(map[key])           // value
    }

    // key-value 쌍으로 가져오기
    for ((key, value) in map2.entries) {
        println("$key, $value")
    }

}