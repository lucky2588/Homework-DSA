import java.util.Arrays;

public class B88 {
// 88. Merge Sorted Array
    public static void main(String[] args) {
int[] list = {1,2,3,0,0,0}; int[] list2 ={2,8,6};
        int m =3; int n=3;
        merge(list,m,list2,n);
        for (int a: list) {
            System.out.println(a);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        for (int i = 0; i <nums1.length ; i++) {
            if(i == m){
                nums1[i] = nums2[i-n];
                m++;
            }
        }
        Arrays.sort(nums1);
    }
}
