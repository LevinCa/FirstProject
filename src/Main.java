public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int a = 5;
        int b = 7;

        System.out.println("Summe: " + (a + b));

        System.out.println(a < b);

        float af = 2.3f;
        float bf = 2.5f;

        double ad = 3.7;
        double bd = 2.5;

        System.out.println(bf == bd);

        if (ad == af) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }

        String weekday = "saturday";

        switch(weekday) {
            case "monday" -> System.out.println("Rice");
            case "tuesday" -> System.out.println("Schnitzel");
            case "wednesday" -> System.out.println("Pasta");
            case "thursday" -> System.out.println("Lasagna");
            case "friday" -> System.out.println("Fish");
            default -> System.out.println("Mensa closed");
        }

    }
}
