package iterator_pattern.example1;

import java.util.List;

public class ProductIterator implements AbstractIterator{
    private ProductList productList;
    private List products;
    private int index1; //正向游标
    private int index2; //逆向游标
    public ProductIterator(ProductList list){
        this.productList = list;
        this.products = list.getObjects();
        index1 = 0;
        index2 = products.size()-1;
    }
    @Override
    public void next() {
        if (index1 <= products.size()-1){
            index1++;
        }
    }

    @Override
    public void previous() {
        if (index2 >= 0){
            index2--;
        }
    }

    @Override
    public boolean isFirst() {
        return index2 == -1;
    }

    @Override
    public boolean isLast() {
        return index1==products.size();
    }

    @Override
    public Object getNextItem() {
        return products.get(index1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(index2);
    }
}
