import java.util.LinkedList;

public class Question2 {

    public static void BuildLinkedLists(LinkedList<Integer>[] arrList, LinkedList<Integer> L) {
        if (arrList.length != 10) {
            return;
        }
        for (int i = 0; i < arrList.length; i++) {
            arrList[i] = new LinkedList<>();
        }

        for (Integer item : L) {
            int index = item % 10;
            arrList[index].add(item);
        }
    }
}
