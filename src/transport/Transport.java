package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }

        setColor(color);

        setMaxSpeed(maxSpeed);
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }

        setMaxSpeed(maxSpeed);
    }

    public Transport(String brand, String model, int productionYear, String productionCountry) {
        this(brand, model, productionYear, productionCountry, "белый", 100);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}
