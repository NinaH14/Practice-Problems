import java.util.Scanner;

public class decisionnimaking {
    public static void main(String[] args) { 

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine(); //can include spaces and user must presses Enter.

        System.out.println("Hello, " + name + "!"); // what ever is typed for name will be the name used
        System.out.println("You're a Bronx Science student.");

        System.out.println("You have a test tomorrow.");
        System.out.println("What do you do?");
        System.out.println("1. Study till you fall asleep");
        System.out.println("2. Play some games and study later");
        System.out.println("3. Go on social media");
        System.out.println("4. Call and study with friends");
        System.out.println("5. Study till you feel tired and rest");

        System.out.print("Enter choice: ");
        int choice1 = in.nextInt(); // only accepts integers

        in.nextLine();  

        if (choice1 == 2 || choice1 == 3) {
            System.out.println("You realized time flew by and it's already bedtime.");
        } else if (choice1 == 1) {
            System.out.println("zzzzZZZ");
        } else if (choice1 == 4) {
            System.out.println("You spend too much time yapping and must go to bed.");
        } else if (choice1 == 5) {
            System.out.println("You rest peacefully and fall asleep.");
        } else {
            System.out.println("Invalid choice. Game over.");
            in.close();
            return; //die
        }

        // DREAM SEQUENCE
        System.out.println("\nYou start to dream...");
        System.out.println("In the dream you are a cockroach.");
        System.out.println("You say, \"Ahhh! Where am I?!\"");
        System.out.println("A mysterious person says, \"Finally found you!\"");
        System.out.println("You look up and see an ugly, wrinkled old lady.");
        System.out.println("Do you run or freeze on the spot? (run/freeze)");

        String choice2 = in.nextLine().trim().toLowerCase(); //reads the entire line of text user typed until they hit Enter, cuts off any accidental spaces at the beginning or end, and turns every letter into lowercase.

        if (choice2.equals("freeze")) {
            System.out.println("You get stepped on and die. Game over.");
            return; //die
        } 
        else if (choice2.equals("run")) {
            System.out.println("You scurry away and fly out an open window!");
        } 
        else {
            System.out.println("Invalid choice. Game over.");
            in.close();
            return; //die
        }

        System.out.println("You reach a storm drain glowing with a strange blue light.");
        System.out.println("Do you go inside?");
        System.out.println("1. Enter the glowing drain");
        System.out.println("2. Hide behind a leaf");
        System.out.println("3. Do nothing");
        System.out.print("Enter choice: ");
        int choice3 = in.nextInt(); // only accepts integers
        in.nextLine();

        if (choice3 == 1) {
            System.out.println("You are sucked into a glowing vortex!");
        } 
        
        else if (choice3 == 2) {
    System.out.println("You hide behind a leaf.");
    System.out.println("The old lady stomps around but eventually gives up and leaves.");
}
else if (choice3 == 3) {
    System.out.println("You stand completely still…");
    System.out.println("The old lady slowly turns toward you.");
    System.out.println("\"Huh? Is that a cockroach just… watching me?\"");
    System.out.println("Her shadow grows larger as her shoe rises into the air.");
    System.out.println("You suddenly regret EVERYTHING.");
    System.out.println("SPLAT.");
    System.out.println("You have died. Game over.");
    in.close();
    return; //die
}
else {
    System.out.println("You hesitate. The world flickers like a broken TV.");
    System.out.println("The dream collapses. Everything turns white.");
    System.out.println("Game over.");
    in.close();
    return;  //die
}
        System.out.println("\nA roach wearing a tiny candy-wrapper cape appears.");
        System.out.println("\"You are the chosen one. Only YOU can defeat the Old Lady Witch.\"");
        System.out.println("Do you accept your destiny?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter choice: ");
        int choice4 = in.nextInt(); // only accepts integers
        in.nextLine();

        if (choice4 == 1) {
            System.out.println("You receive a heroic toothpick sword!");
             System.out.println("Boosted with ego you flew to the whitch");
              System.out.println("Before you realized, you.. ");
        } 
        else if (choice4 == 2) {
            System.out.println("The roach leaves sadly. Game over.");
            in.close();
            return; //die
        }

        // WAKING UP
        System.out.println("You wake up gasping. It's morning.");
        System.out.println("You rush to school and realized today is your finals day.");
        System.out.println("When the scores come out...");

        
        if (choice1 == 2 || choice1 == 3) {
            System.out.println("\nYou get a big fat ZERO. But you still survive.");
        } 
        else if (choice1 == 1 || choice1 == 5) {
            System.out.println("\nYou get a 100! YOU WIN!");
        } 
        else {
            System.out.println("You pass… barely.");
        }

        System.out.println("Good job, " + name + ". Bye for now!");

        in.close();
    }
}