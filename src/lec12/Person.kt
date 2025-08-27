package lec12


class Person private constructor(
    var name: String,
    var age: Int,
) {

    // 자바의 static 영역의 변수나 메서드를 선언하는 블럭
    companion object : Log {

        private val MIN_AGE1 = 1        // 런타임 시 변수가 할당됨
        private const val MIN_AGE2 = 1  // 컴파일 시 변수가 할당됨

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE1)
        }

        override fun log() {
            println("인터페이스를 구현한 Person 동행 객체 출력")
        }

    }

}

