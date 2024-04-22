import java.time.LocalDate;

public class Bears extends Animal {

    private String growlSound; // Unique field for the Bear class
    private static int numOfBears = 0; // Static field to count the number of Bears

    // Constructor with default values
    public Bears() {
        // Call the parent's default constructor
        super("", 0, "male", "Bear", "", "", 0.0, "");
        this.growlSound = "Grr"; // Default growl sound
        numOfBears++; // Increment the count of Bears
        System.out.println("A new Bear has been added to the zoo.");
    }

    // Getter for the growlSound
    public String getGrowlSound() {
        return growlSound;
    }

    // Setter for the growlSound
    public void setGrowlSound(String growlSound) {
        this.growlSound = growlSound;
    }

    // Method to simulate the Bear's growl
    public void growl() {
        System.out.println(getName() + " says " + growlSound + "!");
    }

    // Public static getter for numOfBears
    public static int getNumOfBears() {
        return numOfBears;
    }
}

