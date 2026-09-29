package src.main.java.dsa.hashtable;

public class HashtTableMain {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 1000);
        hashTable.set("screws", 500);
        hashTable.set("tape", 500);
        hashTable.set("nuts", 500);
        hashTable.set("scale", 500);
        hashTable.set("steel", 500);
        hashTable.set("tip", 500);

        hashTable.printTable();

    }
}
