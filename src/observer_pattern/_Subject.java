package observer_pattern;

import java.util.ArrayList;

public abstract class _Subject {
    protected ArrayList<_Observer> observers = new ArrayList<>();
    public abstract void sendMessage();
    public abstract void buy(_Observer observer);
}
