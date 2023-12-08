import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static int moves = 1;
    static boolean Continue = true;
    static boolean roomDone = false;
    public static boolean start (String input) {
        Continue = input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
        return Continue;
    }
    /* public static String locationRandomizer() {
        return rooms.get((int)(Math.random() * rooms.size()) + 0);
    }
     */

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> rooms = new ArrayList<String>();
        System.out.println("Input elf name:");
        String elfName = input.nextLine();
        while(!roomDone) {
            System.out.println("Would you like to add a room to consider for creating shenanigans?");
            if(input.nextLine().equalsIgnoreCase("no") || input.nextLine().equalsIgnoreCase("n")) roomDone = true;
            System.out.println("Ok, please input a room in your house:");
            rooms.add(input.nextLine());
        }

        while(Continue) {
            System.out.println("Would you like a shenanigan idea?");
            if(start(input.nextLine())) {
                System.out.println("For shenanigan #" + moves + "," + elfName + " is washing dishes in the " + rooms.get((int) (Math.random() * rooms.size())));
                moves++;
            }
        }
        System.out.println("Good luck with the shenanigans!");
    }
}
