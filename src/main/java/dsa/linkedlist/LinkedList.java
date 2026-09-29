package src.main.java.dsa.linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        } else {
            Node temp = head;
            Node pre = head;

            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            pre.next = null;
            tail = pre;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public void prepend(int value) {
        Node newValNode = new Node(value);
        if (length == 0) {
            head = newValNode;
            tail = newValNode;
        } else {
            Node temp = head;
            head = newValNode;
            head.next = temp;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index > length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Boolean set(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        Node temp = get(index);
        temp.value = value;
        return true;
    }

    public void insert(int index, int value) {
        if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node newNode = new Node(value);
            Node prev = get(index - 1);
            Node temp = prev.next;
            prev.next = newNode;
            newNode.next = temp;
            length++;
        }
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        tail = head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }
}