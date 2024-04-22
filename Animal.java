import java.time.LocalDate;
import java.time.Period;

public class Animal {

    public static String name;
    public String sex;
    public String color;
    public String id;
    public String origin;
    public int weight;
    public LocalDate birthDate;
    public String arrivalDate;

    public static int numOfAnimals = 0;

    public Animal(String name, int sex, String color, String id, String origin, int weight,
                  double birthDate, String arrivalDate) {
        this.name = name;
        this.color = color;
        this.id = id;
        this.origin = origin;
        this.weight = weight;
        this.arrivalDate = String.valueOf(LocalDate.parse(arrivalDate));
        int i = numOfAnimals++;
        System.out.println("\n A new Animal object was created.\n");
    }

    public Animal() {
        numOfAnimals++;
        System.out.println("\n A new Animal object was created.\n");
    }

    public Animal(String name, String color, String id, String origin, int weight, LocalDate birthDate, LocalDate arrivalDate)
    {
    }

    public Animal(String name, int sex, String male, String bear, String origin, String s, double birthDate, String arrivalDate)
    {
    }

    // Name
    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Sex
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // Color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // ID
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Origin
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    // Weight
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // BirthDate
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // ArrivalDate
    public String getArrivalDate() {
        String arrivalDate1 = arrivalDate;
        return arrivalDate1;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        LocalDate date = LocalDate.now(); // Example LocalDate object
        String dateString = date.toString(); // Convert LocalDate to String
    }

    // Number of Animals
    // Here we only have a Getter because the only place we "set" a number of animals is in the
    //   Animal class constructor. Notice that this method is static because the field (numOfAnimals) is also static.
    public static int getNumOfAnimals() {
        return numOfAnimals;
    }


    // Age calculation based on birthDate and current date
    //  the getAge method calculates the age of the animal based on its birthdate and the current date.
    //  This is more accurate than setting age directly, as the age needs to update automatically as time
    //  progresses. Note that there's no setter for age since it's derived from birthDate and the
    //  current date, not set directly.
    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }
}