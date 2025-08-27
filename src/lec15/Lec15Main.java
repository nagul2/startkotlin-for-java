package lec15;

import java.util.List;

public class Lec15Main {


    public static void main(String[] args) {
        int[] array = {100, 200};

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s, %s", i, array[i]);
        }

        final List<Integer> numbers = List.of(100, 200);


        // 하나를 가져오기
        System.out.println(numbers.get(0));

        // For Each
        for (int number : numbers) {
            System.out.println(number);
        }

        // 전통적인 For문
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(i + ", " + numbers.get(i));

        }
    }

}
