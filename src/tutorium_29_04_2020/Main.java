package tutorium_29_04_2020;

public class Main {

    public static void main(String[] args) {
        Tier[] zoo = new Tier[10];
        for (int i = 0; i < zoo.length; i++) {
            Tier t;
            double p = Math.random();
            if(p > 0.5) {
                t = new Loewe();
            }else {
                t = new Giraffe();
            }
            zoo[i] = t;
        }

        for(int j = 0; j < zoo.length; j++) {
            Tier t1 = zoo[j];
            t1.makeNoise();
        }
    }
}
