package memento_pattern.chessExample;

/**
 * Chessman:原发器类，是一个普通类，可以创建一个备忘录，存储它的历史状态，也可以使用备忘录来恢复其历史状态
 * ChessmanMemento：备忘录类，存储原发器的内部状态，根据原发器决定保存哪些内部状态
 * 需要注意：除了原发器本身与负责人类之外，备忘录对象不能直接供其他类使用
 * MementoCaretaker：负责人，负责保管备忘录，但不能对备忘录的内容进行操作和检查，它只负责存储对象，而不能修改对象，也无须知道对象的实现细节。
 *
 * 由于在备忘录中存储的是原发器的中间状态，因此需要防止原发器以外的其他对象访问备忘录，特别是不允许其他对象来修改备忘录。
 */
public class Client {
    private static int index = -1;  //记录当前状态所在备忘录的位置
    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        Chessman chessman = new Chessman("马", 2, 1);
        mementoCaretaker.setMemento(chessman.save());
        System.out.println("起始位置："+chessman);
        //下棋
        chessman.setX(3); chessman.setY(3);
        System.out.println("下棋之后："+chessman);
        //悔棋
        chessman.restore(mementoCaretaker.getMemento());
        System.out.println("悔棋之后"+chessman);
//        Chessman chessman = new Chessman("马", 2, 1);
//        MementoCaretaker2 mementoCaretaker2 = new MementoCaretaker2();
//        mementoCaretaker2.setMemento(chessman.save());index++;  //保存棋子原始位置
//        chessman.setX(3);chessman.setY(3);  //下棋
//        mementoCaretaker2.setMemento(chessman.save());index++;  //保存棋子位置
//        chessman.setX(4);chessman.setY(5);  //下棋
//        mementoCaretaker2.setMemento(chessman.save());index++;  //保存
//        System.out.println(chessman);
//
//        try {
//            chessman.restore(mementoCaretaker2.getMemento(--index));  //悔棋
//            System.out.println(chessman);
//            chessman.restore(mementoCaretaker2.getMemento(--index));  //悔棋
//            System.out.println(chessman);
//            chessman.restore(mementoCaretaker2.getMemento(--index));  //悔棋
//            System.out.println(chessman);
//        } catch (Exception e) {
//            index++;
//            System.out.println("到达起始位置，不能再悔棋了");
//        }
//        try {
//            chessman.restore(mementoCaretaker2.getMemento(++index));    //撤销悔棋
//            System.out.println(chessman);
//            chessman.restore(mementoCaretaker2.getMemento(++index));    //撤销悔棋
//            System.out.println(chessman);
//            chessman.restore(mementoCaretaker2.getMemento(++index));    //撤销悔棋
//            System.out.println(chessman);
//        } catch (Exception e) {
//            index--;
//            System.out.println("已经到达最新位置");
//        }
    }
}
