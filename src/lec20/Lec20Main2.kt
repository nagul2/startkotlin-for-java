package lec20

import lec19.Person


fun main() {

    val person = Person("사람", 10)

    val value1 = person.let {   // age 반환, it 사용
        it.age
    }

    val value2 = person.run {   // age 반환, this를 사용
        this.age
    }

    val value3 = person.also {  // person 반환(객체 그 자체), it을 사용
        it.age
    }

    val value = person.apply {  // person 반환(객체 그 자체), this를 사용
        this.age
    }

    with(person) {
        println(name)
        println(this.age)
    }
}