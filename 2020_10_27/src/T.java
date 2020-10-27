public class T {

    void x() {
        int[] array = {1, 2, 3};
        String[] array2 = {"1", "2", "3"};

        for (int i = 0; i < array.length; i++) {
            int j = array[i];

        }

        for (int j : array) {
        }

        for (String s : array2) {
            System.out.println(s);
        }
    }
}
