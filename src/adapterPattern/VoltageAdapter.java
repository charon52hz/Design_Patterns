package adapterPattern;

public class VoltageAdapter implements Ivoltage5V{
    private Voltage220V voltage220v;

    public VoltageAdapter(Voltage220V voltage220v){
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5V(){
        int src = voltage220v.output220V();
        int des = src/44;
        return des;
    }
    
}
