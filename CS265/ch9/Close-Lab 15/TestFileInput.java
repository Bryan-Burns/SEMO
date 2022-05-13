import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileInput {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("clab15.txt"));

        HashTable hashTable = new HashTable(11);

        String string = reader.readLine();
        do {
            String[] line = string.split(" ");
            for (int i = 0; i < line.length; i++) {
                hashTable.add(line[i]);
            }
            string = reader.readLine();
        } while (string != null);

        hashTable.display();
        reader.close();
    }
}
