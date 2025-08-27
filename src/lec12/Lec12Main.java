package lec12;

public class Lec12Main {
    public static void main(String[] args) {

        // companion object의 이름이 없을 때는 Companion으로 접근
        Person.Companion.newBaby("ABC");

        // companion object의 있을 때는 이름으로 접근
        Person2.Factory.newBaby("BCD");

        // companion object의 메서드에 @JvmStatic이 붙어있는 경우
        Person2.Factory.newBaby("FFF");
    }
}
