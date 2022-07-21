package collections.linkedlist;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args)
    {
        LinkList list = new LinkList();
        list.insert(19);
        list.insert(89);
        list.insert(76);
        list.insertAtStart(1);
        list.insertAt(1,2);
        list.insertAt(0,55);

        list.delete(1);
        list.show();
    }
}
