import java.util.Scanner;

public class TestUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashTable hashTable = new HashTable(11);

        int check;

        do {
            System.out.print("Enter a word: ");
            String str = scanner.nextLine();
            hashTable.add(str);
            System.out.print("\nDo you want to keep adding words? (Yes: 1 No: 0) ");
            check = Integer.parseInt(scanner.nextLine());
        } while (check != 0);

        hashTable.display();
    }
}
