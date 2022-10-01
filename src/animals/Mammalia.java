package animals;

import java.util.Objects;

public abstract class Mammalia extends Animal {
    private final String livingEnvironment;
    private final int speedGo;

    public Mammalia(String name, int age, String livingEnvironment, int speedGo) {
        super(name, age);

        if (livingEnvironment != null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "default";
        }

        if (speedGo <= 0) {
            this.speedGo = 1;
        } else {
            this.speedGo = speedGo;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeedGo() {
        return speedGo;
    }

    protected void go() {
        System.out.println("Я люблю гулять!");
    }

       @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammalia mammalia = (Mammalia) o;
        return speedGo == mammalia.speedGo && Objects.equals(livingEnvironment, mammalia.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speedGo);
    }
}
