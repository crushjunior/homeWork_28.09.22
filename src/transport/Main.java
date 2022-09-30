package transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 160, 1.7, "Жёлтый", 2015, "Россия");
        lada.setGear("Автомат");
        lada.setRegNumber("e123rr1223");
        System.out.println(lada.isCorrectNumber());
        lada.changeTyre();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 240, 3.0, "Чёрный", 2020, "Германия");
        audi.setKey(new Car.Key(true,true));
        Car bmw = new Car("BMW", "Z8", 260, 3.0, "Чёрный", 2021, "Германия");
        bmw.setInsurance(new Car.Insurance(LocalDate.now(), 9_000, "1244"));
        Car kia = new Car("KIA", "Sportage", 200, 2.4, "Красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 180, 1.6, "Оранжевый", 2016, "Южная Корея");



        lada.carInfo();
        audi.carInfo();
        bmw.carInfo();
        kia.carInfo();
        hyundai.carInfo();
        System.out.println();
        bmw.getInsurance().checkExpireDate();
        bmw.getInsurance().checkNumber();
    }
}
