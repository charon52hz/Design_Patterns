package iterator_pattern.example1;

public interface AbstractIterator {
    public void next();
    public void previous();
    public boolean isFirst();
    public boolean isLast();
    public Object getNextItem();
    public Object getPreviousItem();
}
