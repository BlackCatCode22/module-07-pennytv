import java.time.LocalDate;

public class Lions extends Animal {

    private String roarSound; // Unique field for the Lion class
    private static int numOfLions = 0; // Static field to count the number of Lions

    // Constructor that includes the roarSound parameter
    private Lions(String name, String sex, String color, String id, String origin, int weight,
                  LocalDate birthDate, LocalDate arrivalDate, String mewSound) {
        super(name, color, id, origin, weight, birthDate, arrivalDate);
        this.roarSound = roarSound; // Initialize the unique Lion roar sound
        numOfLions++; // Increment the count of Lions
        System.out.println("A new Lion has been added to the zoo.");
    }

    // Default constructor
    public Lions() {
        // Call the parent's default constructor
        super("", 0, "male", "Lion", "", "", 0.0, "");
        this.roarSound = "Roar"; // Default roar sound
        numOfLions++; // Increment the count of Lions
        System.out.println("A new Lion has been added to the zoo.");
    }

    public static Lions createLions(String name, String sex, String color, String id, String origin, int weight,
                                    LocalDate birthDate, LocalDate arrivalDate, String mewSound)
    {
        return new Lions(name, sex, color, id, origin, weight, birthDate, arrivalDate, mewSound);
    }

    // Getter for the roarSound
    public String getRoarSound() {
        return roarSound;
    }

    // Setter for the roarSound
    public void setRoarSound(String roarSound) {
        this.roarSound = roarSound;
    }

    // Method to simulate the Lion's roar
    public void roar() {
        System.out.println(getName() + " says " + roarSound + "!");
    }

    // Public static getter for numOfLions
    public static int getNumOfLions() {
        return numOfLions;
    }
}