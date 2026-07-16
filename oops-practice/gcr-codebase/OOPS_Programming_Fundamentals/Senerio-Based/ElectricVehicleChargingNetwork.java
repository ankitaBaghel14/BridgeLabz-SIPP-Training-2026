public class ElectricVehicleChargingNetwork {
    public static void main(String[] args) {
        ChargingStation.totalStations=50;
        ChargingStation.electricityRate=7.4;
        ChargingStation cs1=new ChargingStation(1,234.5);
        cs1.displayStationDetails();

    }
}

class ChargingStation{
    static int totalStations;
    static double electricityRate;
    int stationId;
    double unitsConsumed;

    ChargingStation(int stationId,double unitsConsumed){
        this.stationId=stationId;
        this.unitsConsumed=unitsConsumed;
    }
    void calculateBill(){
        double bill=electricityRate*unitsConsumed;
        System.out.println("Your bill: "+bill);
    }
    void displayStationDetails(){
        System.out.println("Station Id: "+stationId);
        System.out.println("units Consumed: "+stationId);
        System.out.println("Electicity Rate: "+stationId);
        calculateBill();
    }
}

