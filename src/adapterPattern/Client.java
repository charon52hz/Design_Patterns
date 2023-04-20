package adapterPattern;

/*
 * Phone类：客户类
 * Ivoltage5V类：Phone类需要用的特定的接口
 * Vlotage220V类：已经存在的接口，这个接口不能直接被客户类使用，需要进行适配
 * VoltageAdapter类：适配器类，作为一个转换器，把已有的220V转化为特定需要的5V，使得客户能够使用。
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charing(new VoltageAdapter(new Voltage220V()));
    }
    
}
