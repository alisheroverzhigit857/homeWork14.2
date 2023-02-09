public class Banana extends Fruits {
    private  String vitamins;

    public Banana(String name, String color, String daamy, String vitamins) {
        super(name, color, daamy);
        this.vitamins = vitamins;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "vitamins='" + vitamins + '\'' +
                '}';
    }
}
