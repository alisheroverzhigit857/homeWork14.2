public class Fruits {
private String name ;
private  String color ;
private  String daamy;

    public Fruits(String name, String color, String daamy) {
        this.name = name;
        this.color = color;
        this.daamy = daamy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDaamy() {
        return daamy;
    }

    public void setDaamy(String daamy) {
        this.daamy = daamy;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", daamy='" + daamy + '\'' +
                '}';
    }
}
