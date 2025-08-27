package lec12;

public class Lec12Main2 {
    public static void main(String[] args) {
        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("움직움직");
            }

            @Override
            public void fly() {
                System.out.println("날날");
            }
        });

    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }
}


