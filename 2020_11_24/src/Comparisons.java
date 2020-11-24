import java.util.ArrayList;

public class Comparisons {

    /*

    |Test |X |X |X |X |X |X |X |X |X |X |X |X |X |X |Test |
    |1    |2 |3 |4 |5 |6 |7 |8 |9 |10|11|12|13|14|15|16   |
     ^                                               ^
     a
     c

    ==
    .equals
     */


    public static void main(String[] args) {
        Comparisons c = new Comparisons();

//        c.strings();
//        c.objects();
        c.complex();
//        c.standard();

        OtherMistakes o = new OtherMistakes();
        o.strings();
    }

    void strings() {
        topic("Strings");
        String a = new String("test");
        String b = new String("test");

        print("a.equals(b)", a.equals(b));      // a)
        print("a == b", a == b);             // b)

        String c = a;
        print("a.equals(c)", a.equals(c));      // c)
        print("a == b", a == c);             // d)
    }

    void objects() {
        topic("Objects");
        int a = 10;
        int b = 10;

        print("a == b", a == b);                // a)

        MyNumber a1 = new MyNumber(10);
        MyNumber b1 = new MyNumber(10);

        print("a1.equals(b1)", a1.equals(b1));     // b)
        print("a1 == b1", a1 == b1);            // c)
        Integer k = new Integer(10);
        print("a1.equals(10)", a1.equals(k));     // d)
    }

    void complex() {
        topic("Complex");
        MyNumber num1 = new MyNumber(10);
        MyNumber num2 = new MyNumber(10);

        MyCoolerNumber a = new MyCoolerNumber(num1);
        MyCoolerNumber b = new MyCoolerNumber(num2);

        print("a == b", a == b);                // a)
        print("a.equals(b)", a.equals(b));         // b)
    }

    void standard() {
        // https://github.com/elastic/elasticsearch/search?q=%22return+null%22
        topic("Standard");
        AClass a = new AClass();
        MyNumber x = new MyNumber(10);
        print("x.equals(a.getMyNumber())", x.equals(a.getMyNumber()));  // a)

        AClass b = new AClass(x);
        AClass c = new AClass(x);

        MyNumber q = b.getMyNumber();
        if (q != null) {
            print("q.equals(c.getMyNumber())", q.equals(c.getMyNumber()));  // b)
        }
    }


    void print(String s, boolean x) {
        System.out.printf("%15s: %b%n", s, x);
    }

    void topic(String s) {
        String underline = "=";    // :
        for (int i = 0; i < s.length(); i++) {
            underline += "=";
        }
        System.out.println("\n" + s + ": \n" + underline);
    }
}
