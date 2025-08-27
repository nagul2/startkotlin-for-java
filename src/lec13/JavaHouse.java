package lec13;

public class JavaHouse {
    private String address;
    private LivingRoom livingRoom;

    public JavaHouse(String address) {
        this.address = address;
        this.livingRoom = new LivingRoom(10);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public class LivingRoom {
        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }

        public String getAddress() {
            return JavaHouse.this.address;  // 바깥 클래스와 연결되어 있다
        }

    }

    public static class LivingRoom2 {
        private double area;

        public LivingRoom2(double area) {
            this.area = area;
        }

        public String getAddress() {
            // return JavaHouse2.this.address;  // 바깥 클래스를 바로 불러올 수 없다
            return null;
        }

    }
}
