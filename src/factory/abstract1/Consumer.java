package factory.abstract1;

public class Consumer {
    public static void main(String[] args) {
        PhoneProduct phoneProduct = new XiaomiFactory().phoneProduct();
        phoneProduct.start();

    }
}
