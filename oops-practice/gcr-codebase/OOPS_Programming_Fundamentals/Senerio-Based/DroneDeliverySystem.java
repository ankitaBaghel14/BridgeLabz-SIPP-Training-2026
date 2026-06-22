public class DroneDeliverySystem {
    public static void main(String[] args) {
        Drone d1=new Drone(1,50);
        Drone.companyName="Crompton";
        Drone.companyName="Philiphs";
        d1.displayStatus();


    }
}

class Drone{
    int droneId;
    int batteryPercentange;
    static String companyName;

    Drone(int droneId,int batteryPercentange){
        this.droneId=droneId;
        this.batteryPercentange=batteryPercentange;

    }

    void startDelivery(){
        if(batteryPercentange>30){
            System.out.print("DeliveryStarted");
        }else{
            System.out.print("Not Ready to Start Delivery");
        }
    }
    void displayStatus(){
        System.out.println("Drone ID: "+droneId);
        System.out.println("Battery Percentage: "+batteryPercentange);
        System.out.println("Company Name: "+companyName);
    }
}