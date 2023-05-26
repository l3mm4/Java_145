public class Dog {
    // Declare variables - states and attributes
    private int dogSpaceNumber;     // The number of the dog's assigned space
    private double dogWeight;       // The weight of the dog
    private boolean grooming;       // Whether the dog needs grooming

    //constructor method that initializes values for all attributes
    public Dog(int dogSpaceNumber, double dogWeight, boolean grooming) {
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }
    // Getter method for dog space number
    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }
    // Setter method for dog space number
    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }
    // Getter method for dog's weight
    public double getDogWeight() {
        return dogWeight;
    }
    // Setter method for dog's weight
    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }
    // Getter method for dog grooming
    public boolean isGrooming() {
        return grooming;
    }
    // Setter method for dog grooming
    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}