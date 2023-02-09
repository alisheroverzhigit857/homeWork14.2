public class Orange extends Fruits {
   private Banana banana ;


    public Orange(String name, String color, String daamy, Banana banana) {
        super(name, color, daamy);
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "banana=" + banana +
                '}';
    }
}
