package simpleFactory1;

public class ProductFactory {
    public static AbstractProduct getPayMethod(String ags){

        AbstractProduct product = null;

        if (ags.equalsIgnoreCase("A")){
            product = new ProductA();
        }else if (ags.equalsIgnoreCase("B")){
            product =  new ProductB();
        }
        return product;
    }
}
