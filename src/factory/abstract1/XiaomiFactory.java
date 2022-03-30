package factory.abstract1;

public class XiaomiFactory implements ProductFactory{
    @Override
    public PhoneProduct phoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new XiaoMiRouter();
    }
}
