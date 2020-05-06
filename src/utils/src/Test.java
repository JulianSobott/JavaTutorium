public class Test {

    public static void main(String[] args) {
        // String
        String s1 = Input.readLine();
        System.out.println(s1);

        String s2 = Input.readLine("Enter a String: ");
        System.out.println(s2);

        // int
        int i1 = Input.readInt();
        System.out.println(i1);

        int i2 = Input.readInt("Enter a number");
        System.out.println(i2);
    }
}
