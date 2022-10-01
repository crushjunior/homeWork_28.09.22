package animals;

import java.util.Objects;

public abstract class Bird extends Animal {
    private final String livingEnvironment;

    public Bird(String name, int age, String livingEnvironment) {
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

    @Override
    protected void eat() {
        System.out.println("Я люблю охотиться!");
    }

       @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(livingEnvironment, bird.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
