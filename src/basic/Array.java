package basic;

public class Array {
    void max(int[] a) {
        int max = a[0];
        for (int j : a) {
            if (j >= max) {
                max = j;
            }
        }
        System.out.println("Max = " + max);
    }
    int max2(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] >= max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "T";
        arr[1] = "H";
        arr[2] = "A";
        arr[3] = "N";
        arr[4] = "H";
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
        String[] arr2 = {"T", "H", "A", "N", "H"};
        for (String s : arr2) {
            System.out.print(s + " ");
        }
        System.out.println();
        int[] a = {5, 15, 25, 1, 0};
        Array max = new Array();
        max.max(a);

        System.out.println("Max2 = " + max.max2(a));
    }
}
