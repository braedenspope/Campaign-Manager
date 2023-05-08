import java.util.*;

// Stores information about a D&D campaign.
public class Campaign {
    String name;
    String campaignName;
    int playerCount;
    int level;
    ArrayList<Character> characters = new ArrayList<>();

    // Prompts the user for information on the campaign.
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

    public void displayCharacter() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= characters.size(); i++) {
            Character hero = characters.get(i-1);
            System.out.println(i + ". " + hero.name + " (" + hero.characterClass + ")");
        }
        System.out.print("Which Character would you like to view? ");
        int choice = scanner.nextInt() - 1;
        characters.get(choice).display();
    }

    // Adds a Character to the Campaign's list.
    public void addCharacter(Character hero) {
        characters.add(hero);
    }

    // Removes a Character from the Campaign's list.
    public void removeCharacter() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= characters.size(); i++) {
            Character hero = characters.get(i-1);
            System.out.println(i + ". " + hero.name + " (" + hero.characterClass + ")");
        }
        System.out.print("Which Character would you like to remove? ");
        int choice = scanner.nextInt() - 1;
        characters.remove(choice);
    }

    // Creates a string to be written to a file with the campaign information.
    public String getFileString() {
        String fileString = String.join(",", name, campaignName, Integer.toString(playerCount), Integer.toString(level));
        return fileString;
    }

    // Populates the member variables from a list retrieved from a fileReader.
    public void loadCampaign(String[] data) {
        name = data[0];
        campaignName = data[1];
        playerCount = Integer.parseInt(data[2]);
        level = Integer.parseInt(data[3]);
    }

    // Displays the Campaign Information, including a short description for the characters.
    public void display() {
        System.out.println("Campaign Name: " + name);
        System.out.println("Campaign Module: " + campaignName);
        System.out.println("Number of Players: " + playerCount);
        System.out.println("Character Level: " + level);
        if (characters == null || characters.isEmpty()) {
            System.out.println("No Characters added.");
        } else {
            System.out.println("Characters:");
            for (int i = 0; i < characters.size(); i++) {
                Character hero = characters.get(i);
                if (hero.subclass != "None") {
                    System.out.println(hero.name + " (" + hero.subclass + " " + hero.characterClass + ")");
                } else {
                    System.out.println(hero.name + " (" + hero.characterClass + ")");
                }  
            }
        }
        System.out.println("\n\n");
    }
}
