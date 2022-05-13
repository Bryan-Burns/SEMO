import java.util.ArrayList;

public class Exam1Test {

    public static void main(String[] args) {

        Electronics eGCard = new Electronics();
        Electronics eIphone = new Electronics(75639, 2583, 799.99,
                10, "iPhone 13", true, 99.99);

        eGCard.setElectronics(38591, 3382, 1999.99,
                25, "Nvidia GeForce RTX 3080 Ti Graphics Card", false, 0.00);

        System.out.println("Sale Price of eGCard: " + eGCard.salePrice());
        System.out.println("Sale Price of eIphone: " + eIphone.salePrice());
        System.out.println("eGCard: " + eGCard);
        System.out.println("eIphone: " + eIphone);
        System.out.println();

        Electronics e1 = new Electronics(getRandomProductID(), 2583, 499.99,
                15, "xBox1s", true, 99.99);
        Electronics e2 = new Electronics(getRandomProductID(), 2583, 199.99,
                2.5, "Wii", false, 0);
        Electronics e3 = new Electronics(getRandomProductID(), 2583, 299.99,
                10, "Nintendo Switch", true, 79.99);
        Electronics e4 = new Electronics(getRandomProductID(), 2583, 299.99,
                5, "PS4", false, 0);
        Electronics e5 = new Electronics(getRandomProductID(), 2583, 499.99,
                15, "PS5", true, 99.99);

        ArrayList<Electronics> electronics = new ArrayList<>();
        electronics.add(e1);
        electronics.add(e2);
        electronics.add(e3);
        electronics.add(e4);
        electronics.add(e5);
        Electronics lowest = getLowestProductID(electronics);
        System.out.println(lowest);
        System.out.println();
        System.out.println(e1);
        System.out.println();
        System.out.println(e2);
        System.out.println();
        System.out.println(e3);
        System.out.println();
        System.out.println(e4);
        System.out.println();
        System.out.println(e5);

    }

    public static int getRandomProductID() {
        return (int)(Math.random() * 99999);
    }

    public static Electronics getLowestProductID(ArrayList<Electronics> electronics) {
        Electronics electronic = electronics.get(0);
        for (int i = 1; i < electronics.size(); i++) {
            if (!electronic.lessThan(electronics.get(i))) {
                electronic = electronics.get(i);
            }
        }
        return electronic;
    }

}