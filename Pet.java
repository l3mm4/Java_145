public class Pet {

    // Declare variables - states and attributes
    private String petType;                     // Pet type
    private String petName;                     // Pet name
    private int petAge;                         // Pet Age
    private int dogSpaces;                      // Spaces for dogs
    private int catSpaces;                      // Spaces for cats
    private int daysStay;                       // Days that pet stays
    private double amountDue;                   // Total amount due for stay and/ or grooming

    public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces,
               int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    // Getter and setter methods for pet type
    public String getPetType() {
        return petType;
    }
    public void setPetType(String petType) {
        this.petType = petType;
    }

    // Getter and setter methods for pet name
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }

    // Getter and setter methods for pet age
    public int getPetAge() {
        return petAge;
    }
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    // Getter and setter methods for dog spaces available
    public int getDogSpaces() {
        return dogSpaces;
    }
    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    // Getter and setter methods for cat spaces available
    public int getCatSpaces() {
        return catSpaces;
    }
    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    // Getter and setter methods for days pet stays
    public int getDaysStay() {
        return daysStay;
    }
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    // Getter and setter methods for amount due
    public double getAmountDue() {
        return amountDue;
    }
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;}
}
