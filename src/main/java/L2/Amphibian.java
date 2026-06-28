package L2;

public class Amphibian {
    private String name;

    public Amphibian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Amphibian: " + name + ".";
    }
}
