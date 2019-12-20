package ayman.problemsolving.com;

public class SortArrayByParity {

    // https://leetcode.com/problems/sort-array-by-parity/

    public static void main(String... args) {
//        int[] arr = sortArrayByParity(new int[]{1,2,3,4,5,6,7,8});
        int[] arr = sortArrayByParity(new int[]{3,1,2,4});
        for (int n : arr){
            System.out.print(n + ", ");
        }
    }

    public static int[] sortArrayByParity(int[] a) {
        for (int i = 0; i < a.length -1; i++) {
            for (int j = 0; j < a.length -1 ; j++) {
                if (a[j] % 2 == 1) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

}
