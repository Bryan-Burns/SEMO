//Mailboxes.java
public class Mailboxes
{
    public static void main(String[] args)
    {
        int numBoxes = 151;
        boolean[] booleanList = initialize(numBoxes);
        doorMovement(booleanList);
        printDoorsClosed(booleanList);



    }

    private static boolean[] initialize(int numBoxes){
        boolean[] booleanList = new boolean[numBoxes];
        for (int i = 0; i < numBoxes; i++){
            booleanList[i] = false;
        }
        return booleanList;
    }

    private static void doorMovement(boolean[] booleanList){
        for (int i = 2; i < booleanList.length; i++){
            for (int j = 1; j < booleanList.length; j++){
                if (j % i == 0){
                    booleanList[j] = !booleanList[j];
                }
            }
        }
    }

    private static void printDoorsClosed(boolean[] booleanList){
        for (int i = 1; i < booleanList.length; i++){
            if (!booleanList[i]){
                System.out.println("Door " + i + " is closed");
            }
        }
    }
}


