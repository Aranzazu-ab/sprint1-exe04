package L2;

public class Reptiles {
    private String name;

    public Reptiles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Reptile:  " + name + ".";
    }
}
