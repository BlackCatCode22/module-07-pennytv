import java.time.LocalDate;

public class Tigers extends Animal {

    private static String mewSound; // Unique field for the Tiger class
    private static int numOfTigers = 0; // Static field to count the number of Tigers

    // Constructor that includes the mewSound parameter
    public Tigers(String name, String sex, String color, String id, String origin, int weight,
                 LocalDate birthDate, LocalDate arrivalDate, String mewSound) {
        super(name, color, id, origin, weight, birthDate, arrivalDate);
        this.mewSound = mewSound; // Initialize the unique Tiger mew sound
        numOfTigers++; // Increment the count of Tigers
        System.out.println("A new Tiger has been added to the zoo.");
    }


        // Constructor with parameters
        public Tigers(String name, String color, String origin, double weight) {
            super(name, 0, "male", "Tiger", "", color, weight, origin);
            this.mewSound = "Mew"; // Default mew sound
            numOfTigers++; // Increment the count of Tigers
            System.out.println("A new Tiger has been added to the zoo.");
        }


    // Getter for the mewSound
    public String getMewSound() {
        return mewSound;
    }

    // Setter for the mewSound
    public void setMewSound(String mewSound) {
        this.mewSound = mewSound;
    }

    // Method to simulate the Tiger's mew
    public static void mew() {
        System.out.println(getName() + " says " + mewSound + "!");
    }

    // Public static getter for numOfTigers
    public static int getNumOfTigers() {
        return numOfTigers;
    }
}