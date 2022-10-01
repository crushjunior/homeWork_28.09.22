package animals;

import java.util.Objects;

public class Fly extends Bird {
    private final String typeGo;

    public Fly(String name, int age, String livingEnvironment, String typeGo) {
        super(name, age, livingEnvironment);
        if (typeGo != null || !typeGo.isEmpty() || !typeGo.isBlank()) {
            this.typeGo = typeGo;
        } else {
            this.typeGo = "default";
        }
    }

    public String getTypeGo() {
        return typeGo;
    }

    protected void go() {
        System.out.println("Я люблю летать!");
    }

    public String toString() {
        return "Класс: " + getClass() + ", " +
                "кличка животного: " + getName() + ", " +
                "возраст: " + getAge() + ", " +
                "среда проживания: " + getLivingEnvironment() + ", " +
                "тип передвижения: " + getTypeGo() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fly fly = (Fly) o;
        return Objects.equals(typeGo, fly.typeGo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeGo);
    }
}
