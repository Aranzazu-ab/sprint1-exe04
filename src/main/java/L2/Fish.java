package L2;

public class Fish {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fish: " + name + ".";
    }
}
