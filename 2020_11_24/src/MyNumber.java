public class MyNumber {

    private int i = 10;

    public MyNumber(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyNumber myNumber = (MyNumber) o;

        if (i != myNumber.i) return false;

        return true;
    }
}
