public class Car extends Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public Car() {
        this.company = "Lada";
        this.model = "Granta";
        this.yearRelease = 2024;
        this.numWheels = 4;
        this.speed = 0;
    }

    public void testDrive() {
        this.speed = 60;
    }

    public void park() {
        this.speed = 0;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public String toString() {
        return "This car is a “ + year + “ “ + make + “ “ + model + ";
    }
}