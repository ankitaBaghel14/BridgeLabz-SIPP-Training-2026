public class SmartParkingManagement {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("DL01", "Rahul", "Car");
        vehicles[1] = new Vehicle("DL02", "Priya", "Bike");
        vehicles[2] = new Vehicle("DL03", "Amit", "Car");
        vehicles[3] = new Vehicle("DL04", "Neha", "Bike");
        vehicles[4] = new Vehicle("DL05", "Rohan", "Car");
        vehicles[5] = new Vehicle("DL06", "Anjali", "Bike");
        vehicles[6] = new Vehicle("DL07", "Vikas", "Car");
        vehicles[7] = new Vehicle("DL08", "Sneha", "Bike");
        vehicles[8] = new Vehicle("DL09", "Arjun", "Car");
        vehicles[9] = new Vehicle("DL10", "Pooja", "Bike");

        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equals("Car")) {
                v.displayDetails();
            }
        }

        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equals("Bike")) {
                v.displayDetails();
            }
        }

    }
}
class Vehicle{
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }
}
