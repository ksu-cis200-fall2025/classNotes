public class Vehicle {
    private int year;
    private int wheels;

    public Vehicle(int y, int w) {
        year = y;
        wheels = w;
    }

    public String getName() {
        return "Vehicle";
    }

    public String toString() {
        return String.format("%s, year: %d, wheels: %d", getName(), year, wheels);
    }

    public int getYear() {
        return year;
    }
}