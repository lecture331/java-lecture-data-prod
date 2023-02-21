package car;

public class PolyCar {
    public static void main(String[] args) {
        // 자동차 생산
        System.out.println("자동차 생산");
        Car car1 = PolyCar.manufactureCar("Gv80");
        System.out.println(car1.brand);
        System.out.println(car1.price);
        // 타이어의 BRAND는  Tier 추상 클래스에 없고 구현체에 상수로 존재
//        System.out.println(car1.tier.BRAND); // Error
        System.out.println(car1.tier.price);
        System.out.println();

        Car car2 = PolyCar.manufactureCar("R8");
        System.out.println(car2.brand);
        System.out.println(car2.price);
        System.out.println(new KiaTier().BRAND);
        System.out.println(car2.tier.price);
        System.out.println();

        Car car3 = PolyCar.manufactureCar("Sf90");
        System.out.println(car3.brand);
        System.out.println(car3.price);
        System.out.println(new HankookTier().BRAND);
        System.out.println(car3.tier.price);


        // 자동차 기능 테스트
        System.out.println("\n자동차 기능 테스트");
        CarFunction gv80Fnc = PolyCar.testFunc(new Gv80(
                "GV80",
                50000000,
                34,
                new HankookTier(),
                "gv sale"
        ));
        System.out.print("GV80: ");
        gv80Fnc.breakPedal();

        CarFunction r8Fnc = PolyCar.testFunc(new R8(
                "R8",
                120000000,
                34,
                new KiaTier(),
                "gv sale"
        ));
        System.out.print("R8: ");
        r8Fnc.gasPedal();

        CarFunction sf90Fnc = PolyCar.testFunc(new Sf90(
                "SF90",
                230000000,
                34,
                new HankookTier(),
                "gv sale"
        ));
        System.out.print("SF90: ");
        sf90Fnc.leftSignal();
        sf90Fnc.rightSignal();
    }

    static Car manufactureCar(String car) {
        if (car.equals("Gv80")) {
            return new Gv80(
                    "GV80",
                    50000000,
                    34,
                    new HankookTier(),
                    "gv sale"
            );
        } else if (car.equals("R8")) {
            return new R8(
                    "R8",
                    120000000,
                    34,
                    new KiaTier(),
                    "gv sale"
            );
        } else if (car.equals("Sf90")) {
            return new Sf90(
                    "SF90",
                    230000000,
                    34,
                    new HankookTier(),
                    "gv sale"
            );
        } else {
            return null;
        }
    }

    static CarFunction testFunc(CarFunction car) {
        return car;
    }
}

class Gv80 extends Car {
    String event;

    {
        super.frontLeftDoor = new Door("FrontLeft");
        super.frontRightDoor = new Door("FrontRight");
        super.backLeftDoor = new Door("BackLeft");
        super.backRightDoor = new Door("BackRight");
    }

    public Gv80(String brand, int price, int gasMileage, Tier tier, String event) {
        super(brand, price, gasMileage, tier);
        this.event = event;
    }

    @Override
    void event() {
        System.out.println("Gv80: " + event);
    }
}

class R8 extends Car {
    String event;

    {
        this.frontLeftDoor = new Door("FrontLeft");
        this.frontRightDoor = new Door("FrontRight");
        this.backLeftDoor = new Door("BackLeft");
        this.backRightDoor = new Door("BackRight");
    }

    public R8(String brand, int price, int gasMileage, Tier tier, String event) {
        super(brand, price, gasMileage, tier);
        this.event = event;
    }


    @Override
    void event() {
        System.out.println("R8: " + event);
    }
}

class Sf90 extends Car {
    String event;

    {
        this.frontLeftDoor = new Door("FrontLeft");
        this.frontRightDoor = new Door("FrontRight");
        this.backLeftDoor = new Door("BackLeft");
        this.backRightDoor = new Door("BackRight");
    }

    public Sf90(String brand, int price, int gasMileage, Tier tier, String event) {
        super(brand, price, gasMileage, tier);
        this.event = event;
    }


    @Override
    void event() {
        System.out.println("Sf90: " + event);
    }
}


abstract class Car implements CarFunction {
    String brand;
    int price;
    int gasMileage;

    Tier tier;
    Door frontLeftDoor;
    Door frontRightDoor;
    Door backLeftDoor;
    Door backRightDoor;

    public Car(String brand, int price, int gasMileage, Tier tier) {
        this.brand = brand;
        this.price = price;
        this.gasMileage = gasMileage;
        this.tier = tier;
    }

    abstract void event();

    @Override
    public void breakPedal() {
        System.out.println("브레이크!");
    }

    @Override
    public void gasPedal() {
        System.out.println("가속 중~");
    }

    @Override
    public void leftSignal() {
        System.out.println("왼쪽 깜빡이");
    }

    @Override
    public void rightSignal() {
        System.out.println("오른쪽 깜빡이");
    }
}

abstract class Tier { // 회사별 타이어 구분
    int price;
    int windage;
}

class HankookTier extends Tier {
    final String BRAND = "HANKOOK";

    public HankookTier() {
        super.price = 550000;
        super.windage = 36;
    }
}

class KiaTier extends Tier {
    final String BRAND = "KIA";

    public KiaTier() {
        super.price = 420000;
        super.windage = 29;
    }
}


interface CarFunction { // breakPedal, gasPedal, blinker
    void breakPedal();

    void gasPedal();

    void leftSignal();

    void rightSignal();
}

class Door {
    String position;

    public Door(String position) {
        this.position = position;
    }
}