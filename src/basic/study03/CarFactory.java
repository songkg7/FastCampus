package basic.study03;

public class CarFactory {

    private static final CarFactory factory = new CarFactory();
    private static int serialNum = 10001;

    private CarFactory() {}

    public static CarFactory getInstance() {
        return factory;
    }

    public Car createCar() {
        Car car = new Car();
        car.setCarNum(serialNum);
        serialNum++;
        return car;
    }
}
