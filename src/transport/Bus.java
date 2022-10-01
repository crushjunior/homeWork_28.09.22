package transport;

public class Bus extends Transport{

    public void refill() {
        System.out.println(getBrand() + " " + getModel() + " вид топлива: " + getFuel());
    }
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuel);
    }
}
