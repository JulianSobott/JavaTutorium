import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main42  {

    public static void main(String[] args) {

        // Equals objects and primitives
        int x1 = 10;
        int x2 = 10;
        System.out.println(x1 == x2);

        String s1 = "He";
        String s2 = "He";
        System.out.println(s1.equals(s2));

        Integer x3 = new Integer(10);
        Integer x4 = new Integer(10);
        System.out.println(x3.equals(x4));

        // equals arrays
        int nums1[] = new int[20];
        int nums2[] = new int[20];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i - 1;
            nums2[i] = i;
        }

        System.out.println(nums1.equals(nums2));
        System.out.println(nums1 == nums2);

        System.out.print("Arrays eq: ");
        System.out.println(eqArray(nums1, nums2));

        // lists
        Integer[] n = new Integer[10];
        List<Integer> e = Arrays.asList(n);
        ArrayList<Integer> e1 = new ArrayList();
        e1.add(10);

        // copy array
        int[] nums3 = copyArray(nums1);
        System.out.println("Copy 1");
        System.out.println(nums3 == nums1);
        System.out.println("nums3: " + nums3.hashCode() + ", nums1: " + nums1.hashCode());
        System.out.println(eqArray(nums3, nums1));

        System.out.println("Same reference");
        int[] nums4 = nums1;
        System.out.println(nums4 == nums1);
        System.out.println("nums4: " + nums4.hashCode() + ", nums1: " + nums1.hashCode());
        System.out.println(eqArray(nums4, nums1));
    }

    static boolean eqArray(int[] nums1, int[] nums2) {
        boolean eq;
        if(nums1 == nums2) {
            return true;
        }

        if(nums1 == null || nums2 == null) {
            return false;
        }

        if(nums1.length == nums2.length) {
            eq = true;
            for (int i = 0; i < nums1.length; i++) {
                if(nums1[i] != nums2[i]) {
                    eq = false;
                    break;
                }
            }
        } else {
            eq = false;
        }
        return eq;
    }

    static boolean eqArray(String[] nums1, String[] nums2) {
        boolean eq;
        if(nums1.length == nums2.length) {
            eq = true;
            for (int i = 0; i < nums1.length; i++) {
                if(nums1[i].equals(nums2[i])) {
                    eq = false;
                    break;
                }
            }
        } else {
            eq = false;
        }
        return eq;
    }

    static int[] copyArray(int[] n) {
        int[] cop = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            cop[i] = n[i];
        }
        return cop;
    }
}
