public class Main {
    public static void main(String[] args) {
     Banana banana = new Banana("Banan","Yellow","sweet","A");
     Orange orange = new Orange("Orange","Yellow","Kychlyl",banana);
     Apple apple = new Apple("Apple", "Red","Sweet",banana);
        System.out.println(banana);
        System.out.println(orange);
        System.out.println(apple);
    }
}