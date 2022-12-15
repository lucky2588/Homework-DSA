import java.util.Arrays;

public class B217 {
    public static void main(String[] args) {
        int[] list = new int[]{1,3,6,5,8};
        if(containsDuplicate(list)){
            System.out.println("Y");
        }else {
            System.out.println("N");
        }
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1 ; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

