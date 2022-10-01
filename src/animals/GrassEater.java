package animals;

import java.util.Objects;

public class GrassEater extends Mammalia {
    private final String typeFood;

    public GrassEater(String name, int age, String livingEnvironment, int speedGo, String typeFood) {
        super(name, age, livingEnvironment, speedGo);
        if (typeFood != null || !typeFood.isEmpty() || !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "default";
        }
    }

    public String getTypeFood() {
        return typeFood;
    }

    protected void eat() {
        System.out.println("Я люблю пастись!");
    }

    @Override
    public String toString() {
        return "Класс: " + getClass() + ", " +
                "кличка: " + getName() +
                ", возраст: " + getAge() + ", " +
                "среда проживания: " + getLivingEnvironment() +
                ", скорость перемещения: " + getSpeedGo() + ", " +
                "тип пищи: " + getSpeedGo() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GrassEater that = (GrassEater) o;
        return Objects.equals(typeFood, that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
