public class HashTable {

    private final LinkedList<String>[] linkedList;
    private final int tableSize;

    public HashTable(int tableSize) {
        this.tableSize = tableSize;
        linkedList = new LinkedList[tableSize];
    }

    public HashTable() {
        this(11);
    }

    public void add(String str) {
        int total = 0;
        if (str.length() < 3) {
            for (int i = 0; i < str.length(); i++) {
                total += str.charAt(i);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                total += str.charAt(i);
            }
        }

        if (linkedList[total%tableSize] == null) {
            linkedList[total%tableSize] = new LinkedList<String>();
        }

        linkedList[total%tableSize].insert(str);
    }

    public void display() {
        // Checking if the whole Hash Table is empty
        int count = 0;
        for (LinkedList l : linkedList) {
            if (l == null) {
                count++;
            }
        }

        if (count == linkedList.length) {
            System.out.println("The Hash Table is empty.");
        } else {
            System.out.println("Hash Table: ");
            for (int i = 0; i < linkedList.length; i++) {
                LinkedList<String> l = linkedList[i];
                if (l == null) {
                    System.out.println("Empty Table Part.");
                } else {
                    System.out.println(l.toString());
                }
            }
        }
    }
}
