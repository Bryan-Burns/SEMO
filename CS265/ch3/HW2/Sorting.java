import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            list.add(Integer.parseInt(keyboard.next()));
        }
        sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        for (int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            list.add(Integer.parseInt(keyboard.next()));
        }
        removeDuplicate(list);
        System.out.println(list);

    }

    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
    }

}
