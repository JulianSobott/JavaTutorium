public class Test {

    private String name;

    public Test(String name) {
        this.name = name;
    }

    void printMe() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Test t1 = new Test("Objekt1");
        Test t2 = new Test("Objekt2");
        t1.printMe();
        t2.printMe();

        new VorsichtigeBank(100, null);


    }
}
