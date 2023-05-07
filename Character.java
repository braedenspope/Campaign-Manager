import java.util.*;

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
}
