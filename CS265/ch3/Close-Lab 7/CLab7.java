import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Author: Bryan Burns
Date: 2/21/2022
Purpose: A program that takes a filename/filepath of baby names, and tells
           the duplicate baby names, and how many.
*/

public class CLab7 {

    public static void main(String[] args) {

        ArrayList<String> listBoy = new ArrayList<>();
        ArrayList<String> listGirl = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a file name for baby name ranking: ");
        String filePath = keyboard.nextLine();

        try {
            File nameFile = new File(filePath);
            Scanner reader = new Scanner(nameFile);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String[] strSplit = line.split("\t");
                listBoy.add(strSplit[1]);
                listGirl.add(strSplit[3].substring(0, (strSplit[3].length() - 1)));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        int total = 0;
        ArrayList<String> duplicateNames = new ArrayList<>();

        for (String s : listBoy) {
            for (String s2 : listGirl) {
                if (s.equals(s2)) {
                    total++;
                    duplicateNames.add(s2);
                }
            }
        }

        System.out.println(total + " names used for both genders.");
        System.out.print("They are:");

        for (int i = 0; i < duplicateNames.size(); i++) {
            if ((i % 10) == 0) {
                System.out.print("\n");
            }
            System.out.print(duplicateNames.get(i) + " ");
        }
    }
}