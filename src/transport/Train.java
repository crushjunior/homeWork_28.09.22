package transport;

public class Train extends Transport {
    private double costRide;
    private final double timeRide;
    private final String startStation;
    private final String finishStation;
    private int countCarriage;

    public void refill() {
        System.out.println(getBrand() + " " + getModel() + " вид топлива: " + getFuel());
    }

    public Train(String brand, String model, int productionYear, String productionCountry, int maxSpeed, String fuel, String startStation, String finishStation, int countCarriage, double costRide, double timeRide) {
        super(brand, model, productionYear, productionCountry, maxSpeed, fuel);
        setCostRide(costRide);

        setCountCarriage(countCarriage);

        if (Double.compare(timeRide, 0) == 0) {
            this.timeRide = 8_00;
        } else {
            this.timeRide = timeRide;
        }

        if (startStation == null) {
            this.startStation = "default";
        } else {
            this.startStation = startStation;
        }

        if (finishStation == null) {
            this.finishStation = "default";
        } else {
            this.finishStation = finishStation;
        }
    }

    public double getTimeRide() {
        return timeRide;
    }

    public String getStartStation() {
        return startStation;
    }

    public String getFinishStation() {
        return finishStation;
    }

    public double getCostRide() {
        return costRide;
    }

    public void setCostRide(double costRide) {
        if (Double.compare(costRide, 0) == 0) {
            this.costRide = 5_000;
        } else {
            this.costRide = costRide;
        }
    }

    public int getCountCarriage() {
        return countCarriage;
    }

    public void setCountCarriage(int countCarriage) {
        if (countCarriage <= 0) {
            this.countCarriage = 3;
        } else {
            this.countCarriage = countCarriage;
        }
    }
}
