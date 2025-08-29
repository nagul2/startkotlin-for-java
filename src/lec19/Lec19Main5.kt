package lec19


fun main() {
    // 라벨 사용
    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            return println(i)
        }
    }
}