package factory.abstract1;

public class HuaWeiPhone implements PhoneProduct{
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为手机关闭");
    }
}
