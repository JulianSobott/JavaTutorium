public class Main4 {

    public static void main(String[] args) {
        Baum baum1 = new Baum();

        Baum baum2 = baum1.t1();
        Baum baum3 = baum1.t1();
        Baum baum4 = baum1.t1();

        System.out.println(baum1 == baum2);

        System.out.println(baum1);

        baum1.t(baum1);
        Baum[] wald = new Baum[20];

        BlattBaum b1 = new BlattBaum();
        wald[0] = new BlattBaum();
        wald[1] = new BlattBaum();
        wald[2] = new BlattBaum();

        for(int i = 0; i < wald.length; i++) {
            if(wald[i] instanceof BlattBaum) {
                ((BlattBaum)wald[i]).herbst();
            }
            wald[i].altern();
        }

        System.out.println();
        baum1.t(b1);
        baum1.t("name");
        baum1.t(10);
        baum1.t(null);
        baum1.t(baum2);
    }
}
