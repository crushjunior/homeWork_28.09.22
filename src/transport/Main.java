package transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 160, "Жёлтый", 2015, "Россия", "Бензин", 1.7);
        lada.setGear("Автомат");
        lada.setRegNumber("e123rr1223");
        System.out.println(lada.isCorrectNumber());
        lada.changeTyre();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 240, "Чёрный", 2020, "Германия", "Дизель", 3.0);
        audi.setKey(new Car.Key(true,true));
        Car bmw = new Car("BMW", "Z8", 260, "Чёрный", 2021, "Германия", "Бензин", 3.0);
        bmw.setInsurance(new Car.Insurance(LocalDate.now(), 9_000, "1244"));
        Car kia = new Car("KIA", "Sportage", 200, "Красный", 2018, "Южная Корея", "Бензин", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", 180, "Оранжевый", 2016, "Южная Корея", "Элекричество", 0.0);



        lada.carInfo();
        audi.carInfo();
        bmw.carInfo();
        kia.carInfo();
        hyundai.carInfo();
        System.out.println();
        bmw.getInsurance().checkExpireDate();
        bmw.getInsurance().checkNumber();
        lada.refill();
        hyundai.refill();
        audi.refill();



        Train swallow = new Train("Ласточка", "B-901", 2011, "Россия", 301, "Дизель", "Белорусскй вокзал", "Минск-Пассажирский", 11, 3500, 8);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270, "Дизель", "Ленинградский вокзал", "Ленинград-Пассажирский", 8, 1700, 2);
        System.out.println();
        getInfoTrain(swallow);
        getInfoTrain(leningrad);
        swallow.refill();

        Bus paz = new Bus("Паз", "32053-70", 2005, "Россия", "Белый", 90, "Дизель");
        Bus mers = new Bus("Mersedes", "V-class", 2018, "Германия", "Синий", 190, "Бензин");
        Bus fiat = new Bus("Fiat", "Doblo", 2016, "Франция", "Черный", 130, "Бензин");
        System.out.println();
        getInfoBus(paz);
        getInfoBus(mers);
        getInfoBus(fiat);
        mers.refill();
        paz.refill();
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
