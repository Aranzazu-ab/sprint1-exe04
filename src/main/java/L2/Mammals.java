package L2;

public class Mammals {
    private String name;

    public Mammals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mammal: " + name + ".";
    }
}
