import java.util.*;

public class Campaign {
    String name;
    String campaignName;
    int playerCount;
    int level;
    List<Character> characters;

    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of the campaign? ");
        name = scanner.nextLine();
        System.out.println("Which campaign is being run? ");
        campaignName = scanner.nextLine();
        System.out.println("How many players are playing? ");
        playerCount = scanner.nextInt();
        System.out.println("What level are the characters? ");
        level = scanner.nextInt();
        System.out.println("Campaign " + name + " has been created!");
    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice == 0) {
            System.out.println("1. Campaign Name: " + name);
            System.out.println("2. Campaign Module: " + campaignName);
            System.out.println("3. Number of Players: " + playerCount);
            System.out.println("4. Character Level: " + level);
            System.out.print("\nPlease select an option: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("What is the new Campaign Name? ");
                name = scanner.nextLine();
            } else if (choice == 2) {
                System.out.println("What is the new Campaign Module? ");
                campaignName = scanner.nextLine();
            } else if (choice == 3) {
                System.out.println("What is the new number of players? ");
                playerCount = scanner.nextInt();
            } else if (choice == 4) {
                System.out.println("What is the new character level? ");
                level = scanner.nextInt();
            }
        }
    }

    public void display() {
        System.out.println("Campaign Name: " + name);
        System.out.println("Campaign Module: " + campaignName);
        System.out.println("Number of Players: " + playerCount);
        System.out.println("Character Level: " + level);
        if (characters.isEmpty()) {
            System.out.println("No Characters added.");
        } else {
            System.out.println("Characters:");
            for (int i = 0; i < characters.size(); i++) {
                Character hero = characters.get(i);
                System.out.println(hero.name);
            }
        }
        System.out.println("\n\n");
    }

}
