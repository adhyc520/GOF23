package factory.sample;

public class CarFactroy {
    //下方代码不用自己去new对象，使用工厂来创建对象，还可以处理细节。
    //弊端当要新添加类型时，需要去改变原有代码结构
    public static Car getCar(String name){
        if (name.equals("BYD")){
            return new BYD();
        }else if (name.equals("Tesla")){
            return new Tesla();
        }
        return null;
    }
}
