public class testAnimal {

    public static void main(String[] args) {
        Cat e1 = new Cat();
        Cat e2 = new Cat(false, "cows", 4, "Orange and Black");

        e1.setAnimal(true, "grass", 2);
        e1.setColor("Green");

        System.out.println(e1);
        System.out.println();
        System.out.println(e2);
    }

}