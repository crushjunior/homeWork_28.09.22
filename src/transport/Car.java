package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String gear;
    private final String typeOfBody;
    private String regNumber;
    private final int countSeat;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;


    Car(String brand, String model, int maxSpeed, Double engineVolume, String color, Integer productionYear, String productionCountry, String gear, Integer countSeat, String regNumber, String typeOfBody, boolean summerTyres, Key key, Insurance insurance) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (gear == null) {
            this.gear = "МКПП";
        } else {
            this.gear = gear;
        }

        if (countSeat == 0) {
            this.countSeat = 5;
        } else {
            this.countSeat = countSeat;
        }

        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }

        if (typeOfBody == null) {
            this.typeOfBody = "Седан";
        } else {
            this.typeOfBody = typeOfBody;
        }

        this.summerTyres = summerTyres;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public Car(String brand, String model, int maxSpeed, Double engineVolume, String color, Integer productionYear, String productionCountry) {
        this(brand, model, maxSpeed, engineVolume, color, productionYear, productionCountry, "МКПП", 5, "х000хх000", "Седан", true, new Key(), new Insurance());
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if (gear == null) {
            this.gear = "МКПП";
        } else {
            this.gear = gear;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getCountSeat() {
        return countSeat;
    }

    public void carInfo() {
        System.out.println(getBrand() + " " + getModel() + ", "
                + getProductionYear() + " год выпуска, сборка " + getProductionCountry() + ", "
                + getColor() + " цвет, объем двигателя - " + getEngineVolume() + ", "
                + "Максимальная скорость: " + getMaxSpeed() + ", "
                + "Коробка передач: " + getGear() + ", "
                + "Количество мест: " + getCountSeat() + ", "
                + "Тип кузова: " + getTypeOfBody() + ", "
                + "Рег номер: " + getRegNumber() + ", "
                + "Летняя резина: " + isSummerTyres() + ", "
                + "Номер страховки: " + getInsurance().getNumber() + ", "
                + "Безключевой доступ: " + getKey().isWithoutKeyAccess() + ", "
                + "Удаленный запуск: " + getKey().isEngineStart() + ", "
                + "Стоимость страховки: " + getInsurance().getCost() + ", "
                + "Срок действия страховки: " + getInsurance().getExpireDate() + ", "
        );
    }

    public void changeTyre() {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] number = regNumber.toCharArray();
        if (!Character.isAlphabetic(number[0]) || !Character.isAlphabetic(number[4]) || !Character.isAlphabetic(number[5])) {
            return false;
        }
        if (Character.isDigit(number[1]) || Character.isDigit(number[2]) || Character.isDigit(number[3]) || Character.isDigit(number[6]) || Character.isDigit(number[7]) || Character.isDigit(number[8])) {
            return false;
        }
        return true;
    }

    public static class Key {
        private final boolean engineStart;
        private final boolean withoutKeyAccess;

        public Key(boolean engineStart, boolean withoutKeyAccess) {
            this.engineStart = engineStart;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isEngineStart() {
            return engineStart;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final  double cost;
        private  final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }

            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }

            if (cost <= 0) {
                this.cost = 15;
            } else {
                this.cost = cost;
            }
        }

        public Insurance() {
            this(null, 15, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Делай страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки неверный!");
            }
        }
    }
}