package lec04;

public class Lec04Main2 {
	public static void main(String[] args) {
		JavaMoney money1 = new JavaMoney(3_000L);
		JavaMoney money2 = money1;
		JavaMoney money3 = new JavaMoney(3_000L);

		System.out.println(money1 == money2); // money1과 money2의 주소를 비교 -> true
		System.out.println(money1 == money3); // money1과 money3의 주소를 비교 -> false

		// JavaMoney에 equals가 오버라이딩 되어있음
		System.out.println(money1.equals(money3)); // money1과 money3이 같은지 비교 -> true


	}
}
