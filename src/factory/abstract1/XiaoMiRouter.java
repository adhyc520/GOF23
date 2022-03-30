package factory.abstract1;

public class XiaoMiRouter implements RouterProduct{
    @Override
    public void start() {
        System.out.println("小米路由器开启");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由wifi打开");
    }
}
