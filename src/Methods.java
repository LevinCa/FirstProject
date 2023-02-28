public class Methods {
    public static void main(String[] args) {

        String testString = "isdfhgirghjnothkefancykfjgeprjego";

        System.out.println(bothTrue(testString));
    }

    public static boolean stringBigger20(String s) {
        return s.length() > 20;
    }

    public static boolean stringContainsFancy(String s) {
        return s.contains("fancy");
    }

    public static boolean bothTrue(String s) {
        return stringBigger20(s) && stringContainsFancy(s);
    }

}
