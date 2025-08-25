package lec08;

public class Lec08Main {
    public static void main(String[] args) {
        String[] strArr = {"A, B, C"};
        printAll(strArr);
        printAll("A, B, C");
    }

    public static void printAll(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public void repeat(String str, int num, boolean userNewLine) {
        for (int i = 1; i <= num; i++) {
            if (userNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    // 오버로딩 활용 - userNewLine이 항상 true
    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    // 오버로딩 활용 - userNewLine이 항상 true이고 반복횟수가 3으로 고정
    public void repeat(String str) {
        repeat(str, 3, true);
    }

}
