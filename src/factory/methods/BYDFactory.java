package factory.methods;

public class BYDFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BYD();
    }
}
