package factory.abstract1;

public class HuaWeiRouter implements RouterProduct{
    @Override
    public void start() {
        System.out.println("华为路由器开启");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由wifi打开");
    }
}
