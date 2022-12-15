// 1920. Build Array from Permutation
public class B1920 {
    public static void main(String[] args) {
        int[] a = new int[3];
    }
    public int[] buildArray(int[] nums) {
       int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void sortArray(int[] nums1 , int m ,int[] nums2 , int n  ){
        for (int i = 0; i < nums1.length ; i++) {
            for (int j = 0; j < nums2.length ; j++) {
                if(nums1[i]== 0){

                }
            }

        }

    }
}
