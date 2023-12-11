import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    static int moves = 1;
    static boolean Continue = true;
    static boolean roomDone = false;
    public static boolean start (String input) {
        Continue = input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
        return Continue;
    }
    //This method returns a random value from a list 'rooms' which contains rooms from the user's house
    /* public static String locationRandomizer() {
        return rooms.get((int)(Math.random() * rooms.size()) + 0);
        }
     */
    public static String shenanigan() {
        String[] shenanigans = {
                "washing dishes",
                "eating apple pie",
                "creating an entire video game based on the Sopranos television series",
                "doing business with the family dog",
                "eating gabagool",
                "watching tv"

        };
        Random rand = new Random();
        rand.nextInt(shenanigans.length);
        int theShenanigan = rand.nextInt(shenanigans.length);
        return shenanigans[theShenanigan];
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> rooms = new ArrayList<String>();
        System.out.println("Input elf name:");
        String elfName = input.nextLine();
        Elf elf1 = new Elf(elfName);
        while(!roomDone) {
            System.out.println("Would you like to add a room to consider for creating shenanigans?");
            if(input.nextLine().equalsIgnoreCase("no") || input.nextLine().equalsIgnoreCase("n")) roomDone = true;
            else {
                System.out.println("Ok, please input a room in your house:");
                rooms.add(input.nextLine());
            }
        }

        while(Continue) {
            System.out.println("Would you like a shenanigan idea for " + elf1.getName() + "?");
            if(start(input.nextLine())) {
                //Unable to call room randomizer for some reason so went ahead and added the whole of the method to run without a call
                System.out.println("For shenanigan #" + moves + "," + elf1.getName() + " is "  + shenanigan() + " in " + rooms.get((int) (Math.random() * rooms.size())));
                moves++;

            }
        }
        System.out.println("Good luck with the shenanigans!");
    }
}
