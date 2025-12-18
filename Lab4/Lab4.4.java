import java.util.Scanner;

class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(Location other) {
        this.latitude = other.latitude;
        this.longitude = other.longitude;
    }

    public void setLatitude(double newLat) {
        this.latitude = newLat;
    }

    public void displayInfo() {
        System.out.println("Lat: " + latitude + ", Lon: " + longitude);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startLat = scanner.nextDouble();
        double startLon = scanner.nextDouble();
        double newLat = scanner.nextDouble();

        Location loc1 = new Location(startLat, startLon);
        Location loc2 = new Location(loc1);

        loc1.setLatitude(newLat);

        loc1.displayInfo();
        loc2.displayInfo();
        
        scanner.close();
    }
}
