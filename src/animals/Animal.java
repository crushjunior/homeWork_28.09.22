package animals;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private final int age;

    public Animal(String name, int age) {
        setName(name);
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Кличка";
        }
    }

    protected abstract void eat();

    protected abstract void go();

    public void sleep() {
        System.out.println("Люблю крепко спать!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
