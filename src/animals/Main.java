package animals;

public class Main {
    public static void main(String[] args) {
        GrassEater gazelle = new GrassEater("Света", 4, "Африка", 97, "растения");
        GrassEater giraffe = new GrassEater("Виталик", 3, "Южная Африка", 54, "растения");
        GrassEater horse = new GrassEater("Игорь", 5, "Россия", 88, "корма");
        GrassEater gazelle2 = new GrassEater("Света", 4, "Африка", 97, "растения");

        Hunter hyena = new Hunter("Галя", 6, "Африка, Азия", 64, "падаль");
        Hunter tiger = new Hunter("Тайсон", 8, "Китай, Россия", 65, "крупные травоядные");
        Hunter bear = new Hunter("Миша", 2, "Россия", 56, "мёд");
        Hunter hyena2 = new Hunter("Галя", 6, "Африка, Азия", 64, "падаль");

        EarthWater frog = new EarthWater("Crazy Frog", 0, "Европа");
        EarthWater snakeFreshwater = new EarthWater("Ужик", 0, "Европа, Азия");
        EarthWater frog2 = new EarthWater("Crazy Frog", 0, "Европа");

        NotFly peacock = new NotFly("Паша", 3, "Индия", "пешком");
        NotFly penguin = new NotFly("Лоло", 9, "Антарктида", "ползком, плавать");
        NotFly dodo = new NotFly("Пицца", 7, "остров Маврикий", "пешком");
        NotFly dodo2 = new NotFly("Пицца", 7, "остров Маврикий", "пешком");

        Fly gull = new Fly("Чайка", 5, "Россия", "летать");
        Fly albatross = new Fly("Алик", 2, "Индийский океан", "летать");
        Fly falcon = new Fly("Пират", 4, "Россия", "летать");
        Fly gull2 = new Fly("Чайка", 5, "Россия", "летать");


        getGrassEaterInfo(gazelle);
        getGrassEaterInfo(giraffe);
        getGrassEaterInfo(horse);
        gazelle.sleep();
        gazelle.go();
        gazelle.eat();
        System.out.println(gazelle.equals(gazelle2));
        System.out.println(gazelle.equals(horse));
        System.out.println();
        getHunterInfo(bear);
        getHunterInfo(tiger);
        getHunterInfo(hyena);
        bear.sleep();
        bear.go();
        bear.eat();
        System.out.println(hyena.equals(bear));
        System.out.println(hyena.equals(hyena2));
        System.out.println();
        getEarthWaterInfo(frog);
        getEarthWaterInfo(snakeFreshwater);
        frog.sleep();
        frog.go();
        frog.eat();
        System.out.println(snakeFreshwater.equals(bear));
        System.out.println(frog2.equals(frog));
        System.out.println();
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        dodo.sleep();
        dodo.go();
        dodo.eat();
        System.out.println(penguin.equals(peacock));
        System.out.println(dodo.equals(dodo2));
        System.out.println();
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
        gull.sleep();
        albatross.go();
        falcon.eat();
        System.out.println(falcon.equals(albatross));
        System.out.println(gull.equals(gull2));
    }

    public static void getGrassEaterInfo(GrassEater animal) {
        System.out.println("Класс: травоядные, " +
        "кличка животного: " + animal.getName() + ", " +
        "возраст: " + animal.getAge() + ", " +
        "среда проживания: " + animal.getLivingEnvironment() + ", " +
        "скорость перемещения: " + animal.getSpeedGo() + ", " +
        "тип пищи: " + animal.getTypeFood() + "."
        );
    }

    public static void getHunterInfo(Hunter animal) {
        System.out.println("Класс: хищники, " +
        "кличка животного: " + animal.getName() + ", " +
        "возраст: " + animal.getAge() + ", " +
        "среда проживания: " + animal.getLivingEnvironment() + ", " +
        "скорость перемещения: " + animal.getSpeedGo() + ", " +
        "тип пищи: " + animal.getTypeFood() + "."
        );
    }

    public static void getEarthWaterInfo(EarthWater animal) {
        System.out.println("Класс: земноводные, " +
                "кличка животного: " + animal.getName() + ", " +
                        "возраст: " + animal.getAge() + ", " +
                        "среда проживания: " + animal.getLivingEnvironment() + "."
        );
    }
}
