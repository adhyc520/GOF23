package factory.methods;

import factory.sample.CarFactroy;

public class Consumer {

    public static void main(String[] args) {
        Car car = new BYDFactory().getCar();
        car.name();
    }
}
