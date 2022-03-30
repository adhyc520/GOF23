package factory.abstract1;

public class HuaWeiFactory implements ProductFactory{
    @Override
    public PhoneProduct phoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new HuaWeiRouter();
    }
}
