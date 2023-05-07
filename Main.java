import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Welcome to the Campaign Manager!");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        Campaign campaign = new Campaign();
        // Loops through as the user chooses an option.
        while (choice != 7) {
            displayMenu();
            if (campaign.campaignName == null) {
                System.out.println("\nNo Campaign Loaded.");
            } else {
                System.out.println("\nCampaign: " + campaign.campaignName);
            }
            System.out.print("\nPlease select an option: ");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                campaign.create();
            } else if (choice == 2) {
                campaign.display();
            } else if (choice == 3) {
                Character hero = new Character();
                campaign.characters.add(hero);
            }
        }
    }
    
    // Displays the Menu options.
    public static void displayMenu() {
        
        System.out.println("1. Create Campaign");
        System.out.println("2. Display Campaign");
        System.out.println("3. Add a Character");
        System.out.println("4. Remove a Character");
        System.out.println("5. Save a Campaign");
        System.out.println("6. Load a Campaign");
        System.out.println("7. Quit");
    }
}