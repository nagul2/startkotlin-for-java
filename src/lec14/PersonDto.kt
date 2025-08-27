package lec14


fun main() {
    val dto = PersonDto("이름1", 100)
    val dto2 = PersonDto("이름2", 200)
    println(dto == dto2)
    println(dto2)
}

data class PersonDto(
    val name: String,
    val age: Int
) {
}