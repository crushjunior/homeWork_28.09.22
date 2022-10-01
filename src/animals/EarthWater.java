package animals;

import java.util.Objects;

public class EarthWater extends Animal {
    private final String livingEnvironment;

    public EarthWater(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment != null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "default";
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    protected void eat() {
        System.out.println("Я люблю охотиться!");
    }

    @Override
    protected void go() {
        System.out.println("Я люблю плавать!");
    }

    public String toString() {
        return "Класс: " + getClass() + ", " +
                "кличка: " + getName() +
                ", возраст: " + getAge() + ", " +
                "среда проживания: " + getLivingEnvironment() +".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EarthWater that = (EarthWater) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
