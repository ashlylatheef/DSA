package src.main.java.dsa.hashtable;

public class HashTable {

    int size = 7;
    Node[] dataMap;

    class Node {
        int value;
        String key;
        Node next;

        Node(String key, int val, Node next) {
            this.key = key;
            this.value = val;
            this.next = next;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    private int hash(String key) {
        int hash = 0;
        char[] chars = key.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // getting the ascii vlaue of the character
            int asciiValue = chars[i];
            // multiplying it with a prime number and taking modulus by the length so
            // that the generated key will be in length range;
            hash = (hash + asciiValue * 23) % size;
        }
        return hash;

    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value, null);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index]; // first node of the linked list in this address
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("i : " + i);
                System.out.println("{" + temp.key + ":" + temp.value + "}");
                temp = temp.next;
            }
        }
    }
}
