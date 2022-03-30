package factory.sample;

public class Consumer {

    public static void main(String[] args) {
        Car car = CarFactroy.getCar("BYD");
        car.name();
    }
}
