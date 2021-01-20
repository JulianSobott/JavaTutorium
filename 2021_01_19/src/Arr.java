import java.util.ArrayList;
import java.util.function.Consumer;

public class Arr {


    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Hello");
        a.add("Test");
        a.add("jkkjfds jsdkfj s");
        System.out.println(a.toString());
        /*
         0 0 0 0 0
                   |
         */

        // toString()
        String s = "";
        for(int i = 0; i < a.size(); i++) {
            s += a.get(i) + ", ";
        }
        // return s
        System.out.println(s);


        String s1 = "ArrayList[";
        for(int i = 0; i < a.size() - 1; i++) {
            s1 += a.get(i) + ", ";
        }
        s1 += a.get(a.size() - 1);
        s1 += "]";
        // return s

        System.out.println(s1);
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
