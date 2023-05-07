import java.util.*;
import java.io.*;

// Class to run the Campaign Manager
public class Main {
    public static void main(String args[]) {
        System.out.println("Welcome to the Campaign Manager!");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        Campaign campaign = new Campaign();
        
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
                campaign.addCharacter(hero);
            } else if (choice == 4) {
                campaign.removeCharacter();
            } else if (choice == 5) {
                saveCampaign(campaign);
            } else if (choice == 6) {
                campaign = loadCampaign();
            }
        }
    }

    // Reads Campaign and Character Information from a file.
    public static Campaign loadCampaign() {
        Campaign campaign = new Campaign();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the filename? ");
        String filename = scanner.nextLine();
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String[] data = reader.nextLine().split(",");
                if (data.length == 4) {
                    campaign.loadCampaign(data);
                } else {
                    Character hero = new Character(data);
                    campaign.addCharacter(hero);
                } 
            }
            reader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Reading Failed.");
        }
        return campaign;
    }

    // Writes Campaign and Character Information to a file.
    public static boolean saveCampaign(Campaign campaign) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the filename? ");
        String filename = scanner.nextLine();
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(campaign.getFileString());
            for (int i = 0; i < campaign.characters.size(); i++) {
                Character hero = campaign.characters.get(i);
                writer.append("\n" + hero.getFileString());
            }
            writer.close();
        } catch (IOException exception) {
            System.out.println("Failed.");
        }
        return true;
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