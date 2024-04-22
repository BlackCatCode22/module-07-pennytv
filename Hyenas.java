import java.time.LocalDate;

public class Hyenas extends Animal {

    private String laughSound; // Unique field for the Hyena class
    private static int numOfHyenas = 0; // Static field to count the number of Hyenas

    // Constructor that includes the laughSound parameter
    public Hyenas(String name, String color, String id, String origin, int weight,
                  LocalDate birthDate, LocalDate arrivalDate, String laughSound) {
        super(name, color, id, origin, weight, birthDate, arrivalDate);
        this.laughSound = laughSound; // Initialize the unique Hyena laugh sound
        numOfHyenas++; // Increment the count of Hyenas
        System.out.println("A new Hyena has been added to the zoo.");
    }

    // Default constructor
    public Hyenas(String name, String sex, String color, String id, String origin, int weight,
                  LocalDate birthDate, LocalDate arrivalDate, String mewSound) {
        super(name, color, id, origin, weight, birthDate, arrivalDate);
        this.laughSound = "HeHe"; // Default laugh sound
        numOfHyenas++; // Increment the count of Hyenas
        System.out.println("A new Hyena has been added to the zoo.");
    }

    // Getter for the laughSound
    public String getLaughSound() {
        return laughSound;
    }

    // Setter for the laughSound
    public void setLaughSound(String laughSound) {
        this.laughSound = laughSound;
    }

    // Method to simulate the Hyena's laugh
    public void laugh() {
        System.out.println(getName() + " says " + laughSound + "!");
    }

    // Public static getter for numOfHyenas
    public static int getNumOfHyenas() {
        return numOfHyenas;
    }
}