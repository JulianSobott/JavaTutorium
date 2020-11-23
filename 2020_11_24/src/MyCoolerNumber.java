public class MyCoolerNumber {

    MyNumber i;

    public MyCoolerNumber(MyNumber i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyCoolerNumber that = (MyCoolerNumber) o;

        if (i != null ? !i.equals(that.i) : that.i != null) return false;

        return true;
    }

}
