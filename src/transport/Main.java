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



        Train swallow = new Train("Ласточка", "B-901", 2011, "Россия", 301, "Белорусскй вокзал", "Минск-Пассажирский", 11, 3500, 8);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, 1700, 2);
        System.out.println();
        getInfoTrain(swallow);
        getInfoTrain(leningrad);

        Bus paz = new Bus("Паз", "32053-70", 2005, "Россия", "Белый", 90);
        Bus mers = new Bus("Mersedes", "V-class", 2018, "Германия", "Синий", 190);
        Bus fiat = new Bus("Fiat", "Doblo", 2016, "Франция", "Черный", 130);
        System.out.println();
        getInfoBus(paz);
        getInfoBus(mers);
        getInfoBus(fiat);
    }

    public static void getInfoTrain(Train train) {
        System.out.println(train.getBrand() + " " + train.getModel()
                        + ", " + "Год выпуска: " + train.getProductionYear()
                        + ", " + "Страна производства: " + train.getProductionCountry()
                + ", " + "Максимальная скорость: " + train.getMaxSpeed() + " км/ч"
                + ", " + "Станция отбытия: " + train.getStartStation()
                + ", " + "Конечная остановка: " + train.getFinishStation()
                + ", " + "Количество вагонов: " + train.getCountCarriage()
                + ", " + "Стоимость поездки: " + train.getCostRide()
                + ", " + "Время в пути: " + train.getTimeRide() + " ч."
        );
    }

    public static void getInfoBus(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel()
                + ", " + "Год выпуска: " + bus.getProductionYear()
                + ", " + "Страна производства: " + bus.getProductionCountry()
                + ", " + "Максимальная скорость: " + bus.getMaxSpeed() + " км/ч"
                + ", " + "Цвет кузова: " + bus.getColor()
        );
    }
}
