public class Auto {

    int nummer;
    int nummer2;

    static int i = 0;

    public Auto() {
        int j = 0;
        this.nummer = 1000 + i;
        this.nummer2 = 1000 + j;
        i++;
        j++;
    }
}
