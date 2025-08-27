package lec13;

public class Lec13Main {
    public static void main(String[] args) {
        JavaHouse house = new JavaHouse("서울");
        System.out.println(house.getLivingRoom().getAddress());

        JavaHouse.LivingRoom2 staticHouse = new JavaHouse.LivingRoom2(10.5);
        System.out.println(staticHouse.getAddress());
    }
}
