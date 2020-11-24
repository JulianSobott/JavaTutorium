public class MyNumber {

    private int i = 10;
    private String name = "kjj";

    public MyNumber(int i) {
        this.i = i;
    }

    public String blb() {
        return "blb";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyNumber myNumber = (MyNumber) o;

        return i == myNumber.i;
    }
}
