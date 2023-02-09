public class Apple extends Fruits {
    Banana banana ;

    public Apple(String name, String color, String daamy, Banana banana) {
        super(name, color, daamy);
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "banana=" + banana +
                '}';
    }
}
