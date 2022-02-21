public class MyInteger {

    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));
        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public boolean isEven(){
        return (value % 2) == 0;
    }

    public boolean isOdd(){
        return (value % 2) != 0;
    }

    public boolean isPrime(){
        if (value == 0 || value == 1){
            return false;
        }
        else{
            for (int i = 2; i < value/2; i++){
                if (value % i == 0){
                    return false;
                }
            }
            return true;
        }

    }

    public static boolean isEven(int value){
        return (value % 2) == 0;
    }

    public static boolean isOdd(int value){
        return (value % 2) != 0;
    }

    public static boolean isPrime(int value){
        if (value == 0 || value == 1){
            return false;
        }
        else{
            for (int i = 2; i < value/2; i++){
                if (value % i == 0){
                    return false;
                }
            }
            return true;
        }

    }

    public static boolean isEven(MyInteger value){
        return (value.get() % 2) == 0;
    }

    public static boolean isOdd(MyInteger value){
        return (value.get() % 2) != 0;
    }

    public boolean isPrime(MyInteger value){
        if (value.get() == 0 || value.get() == 1){
            return false;
        }
        else{
            for (int i = 2; i < value.get()/2; i++){
                if (value.get() % i == 0){
                    return false;
                }
            }
            return true;
        }

    }

    public boolean equals(int value){
        return this.value == value;
    }

    public boolean equals(MyInteger val){
        return val.get() == value;
    }

    public static int parseInt(char[] values){
        String vals = new String(values);
        return Integer.parseInt(vals);
    }

    public static int parseInt(String value){
        return Integer.parseInt(value);
    }
}
