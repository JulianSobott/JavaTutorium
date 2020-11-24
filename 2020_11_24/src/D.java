import java.util.Objects;

public class D {

    private int iInt;
    private String aString;
    private MyNumber bNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        D d = (D) o;
        return iInt == d.iInt &&
                Objects.equals(aString, d.aString) &&
                Objects.equals(bNumber, d.bNumber);
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        D d = (D) o;
//
//        if (iInt != d.iInt) return false;
//        if (aString != null ? !aString.equals(d.aString) : d.aString != null) return false;
//        if (bNumber != null ? !bNumber.equals(d.bNumber) : d.bNumber != null) return false;
//
//        return true;
//    }

    //    public boolean equals(Object o) {
//        if (o == this) {
//            return true;
//        }
////        if (o == null) {
////            return false;
////
////       }
//        if (!(o instanceof D)) {
//            return false;
//        }
//        D that = (D) o;
//
////        if (aString == null) {
////            if (that.aString != null) {
////                return false;
////            }
////        } else {
////            if (!aString.equals(that.aString)) {
////                return false;
////            }
////        }
//        return iInt == that.iInt && Objects.equals(aString, that.aString) && bNumber.equals(that.bNumber);
//    }
}
