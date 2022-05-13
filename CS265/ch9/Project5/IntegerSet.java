import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Bryan Burns and Ethan Brazzle
 * Date: 4/24/2022
 * Purpose: This program writes an IntegerSet class with fields, constructors, and methods.
 */

public class IntegerSet {
    private int size;
    private final LinkedList<Integer> set;

    public IntegerSet(int size) {
        this.size = size;
        set = new LinkedList<>();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean isMember(int item) {
        String[] strings = set.toString().split(", ");
        for (String string : strings) {
            if (string.equals(item + "")) {
                return true;
            }
        }
        return false;
    }

    public boolean add(int item) {
        try {
            set.insert(item);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public boolean remove(int item) {
        try {
            set.remove(item);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public boolean isSubset(IntegerSet set2) {
        String[] strings = set2.toString().split(", ");

        for (String string : strings) {
            if (!set.toString().contains(string)) {
                return false;
            }
        }
        return true;
    }

    public IntegerSet intersection(IntegerSet set2) {
        IntegerSet result;
        String[] strings1 = set.toString().split(", ");
        String[] strings2 = set2.set.toString().split(", ");

        ArrayList<Integer> ints = new ArrayList<>();

        for (String string : strings1) {
            if (ints.contains(Integer.parseInt(string))) {
                continue;
            }
            for (String string2 : strings2) {
                if (string.equals(string2)) {
                    ints.add(Integer.parseInt(string));
                    break;
                }
            }
        }

        result = new IntegerSet(ints.size());
        for (int i : ints) {
            result.add(i);
        }
        return result;
    }

    public IntegerSet union(IntegerSet set2) {
        IntegerSet result;
        String[] strings1 = set.toString().split(", ");
        String[] strings2 = set2.set.toString().split(", ");

        ArrayList<Integer> ints = new ArrayList<>();

        for (String string : strings1) {
            if (ints.contains(Integer.parseInt(string))) {
                continue;
            }
            ints.add(Integer.parseInt(string));
        }

        for (String string2 : strings2) {
            if (ints.contains(Integer.parseInt(string2))) {
                continue;
            }
            ints.add(Integer.parseInt(string2));
        }

        result = new IntegerSet(ints.size());
        for (int i : ints) {
            result.add(i);
        }
        return result;
    }

    public IntegerSet difference(IntegerSet set2) {
        IntegerSet result;
        String[] strings1 = set.toString().split(", ");
        String[] strings2 = set2.set.toString().split(", ");

        ArrayList<Integer> ints = new ArrayList<>();

        for (String string : strings1) {
            boolean isInSet2 = false;
            if (ints.contains(Integer.parseInt(string))) {
                continue;
            }
            for (String string2 : strings2) {
                if (string.equals(string2)) {
                    isInSet2 = true;
                    break;
                }
            }
            if (!isInSet2) {
                ints.add(Integer.parseInt(string));
            }
        }

        result = new IntegerSet(ints.size());
        for (int i : ints) {
            result.add(i);
        }
        return result;
    }

    public void display() {
        System.out.println(set.toString());
    }
}