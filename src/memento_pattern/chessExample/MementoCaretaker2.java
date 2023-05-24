package memento_pattern.chessExample;

import java.util.ArrayList;

public class MementoCaretaker2 {
    private ArrayList<ChessmanMemento> mementoList = new ArrayList<ChessmanMemento>();

    public ChessmanMemento getMemento(int i) {
        return mementoList.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementoList.add(memento);
    }
}
