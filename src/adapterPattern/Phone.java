package adapterPattern;

public class Phone {
    
    public void charing(Ivoltage5V volt){
        if(volt.output5V()==5){
            System.out.println("电压为5V,可以充电");
        }else
            System.out.println("电压不支持充电");

    }
}
