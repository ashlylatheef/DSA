package src.main.java.dsa.linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(10);

        list.append(20);
        list.prepend(5);
        list.printList();
        list.insert(1, 0);
        System.out.println("new list");
        list.printList();
        list.reverse();
        System.out.println("reversed list");
        list.printList();
    }
}