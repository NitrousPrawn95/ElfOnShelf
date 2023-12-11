import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {
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
                "creating an entire video game based on the Sopranos television series",
                "running a high stakes gambling ring",
                "eating gabagool",
                "watching television",
                "sabotaging the fuse box",
                "getting audited by the IRS",
                "activating nuclear launch codes before they expire",
                "falsifying medical records",
                "ordering a new dust filter for his Hoover MaxExtract PressurePro model 60"

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
            String answer = input.nextLine();
            if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) roomDone = true;
            else {
                System.out.println("Ok, please input a room in your house:");
                rooms.add(input.nextLine());
            }
        }

        while(Continue) {
            System.out.println("Would you like a shenanigan idea for " + elf1.getName() + "?");
            if(start(input.nextLine())) {
                //Unable to call room randomizer for some reason so went ahead and added the whole of the method to run without a call
                System.out.println("For shenanigan #" + elf1.getMoves() + ", " + elf1.getName() + " is "  + shenanigan() + " in the " + rooms.get((int)(Math.random() * rooms.size())) + "!");
                elf1.setMoves(elf1.getMoves() + 1);

            }
        }
        System.out.println("Ok then, good luck with the shenanigans!");
    }
}
