import java.util.*;

// Stores information about a D&D character.
public class Character {
    String name;
    String characterClass;
    String subclass;
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    // Prompts the user for information about the Character.
    public Character() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of the Character? ");
        name = scanner.nextLine();
        System.out.println("What is the class of the Character? ");
        characterClass = scanner.nextLine();
        System.out.println("What is the subclass of the Character? (Enter None if None) ");
        subclass = scanner.nextLine();
        System.out.println("What is the Strength score of the Character? ");
        strength = scanner.nextInt();
        System.out.println("What is the Dexterity score of the Character? ");
        dexterity = scanner.nextInt();
        System.out.println("What is the Consitution score of the Character? ");
        constitution = scanner.nextInt();
        System.out.println("What is the Intelligence score of the Character? ");
        intelligence = scanner.nextInt();
        System.out.println("What is the Wisdom score of the Character? ");
        wisdom = scanner.nextInt();
        System.out.println("What is the Charisma score of the Character? ");
        charisma = scanner.nextInt();
    }

    // Non-default constructor to populate variables with an array from a FileReader.
    public Character(String[] data) {
        name = data[0];
        characterClass = data[1];
        subclass = data[2];
        strength = Integer.parseInt(data[3]);
        dexterity = Integer.parseInt(data[4]);
        constitution = Integer.parseInt(data[5]);
        intelligence = Integer.parseInt(data[6]);
        wisdom = Integer.parseInt(data[7]);
        charisma = Integer.parseInt(data[8]);
    }

    public void display() {
        System.out.println("\nName: " + name);
        System.out.println("Class: " + characterClass);
        System.out.println("Subclass: " + subclass);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Constitution: " + constitution);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Charisma: " + charisma);
        System.out.println("\n");

    }

    // Generates a string of all Character information.
    public String getFileString() {
        String fileString = String.join(",", name, characterClass, subclass, Integer.toString(strength), Integer.toString(dexterity), Integer.toString(constitution), Integer.toString(intelligence), Integer.toString(wisdom), Integer.toString(charisma));
        return fileString; 
        
    }
}
