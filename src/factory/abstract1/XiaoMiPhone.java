package factory.abstract1;

public class XiaoMiPhone implements PhoneProduct{
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关闭");
    }
}
