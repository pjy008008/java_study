package basic.poly.car1;

public class Driver {
    Car car;
    public void setCar(Car car) {
        System.out.println("자동차 설정: "+car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차 운전");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
