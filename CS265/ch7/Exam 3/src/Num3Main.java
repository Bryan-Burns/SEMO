public class Num3Main {

    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 90, -30, -20, -10};
        System.out.println(checkArraySym(a1, 0, a1.length - 1));
        int[] a2 = {10, 20, 30, 90, 30, 20, 10};
        System.out.println(checkArraySym(a2, 0, a2.length - 1));
    }

    public static boolean checkArraySym(int [] A, int first, int last) {
        // Base case
        if (first >= last) {
            return true;
        }

        // Recursive case
        if ((A[first] * -1) == A[last]) {
            checkArraySym(A, first + 1, last - 1);
        } else {
            return false;
        }

        return true;
    }
}
