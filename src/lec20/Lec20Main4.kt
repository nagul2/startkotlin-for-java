package lec20


fun main() {
    val personRepository = PersonRepository()
    val person = Person("사람", 10)
        .run(personRepository::save)

    // 응용 버전
    val newPerson = Person("저사람", 12).run {
        hobby = ""
        personRepository.save(this)
    }

}