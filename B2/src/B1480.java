public class B1480 {
    //1480. Running Sum of 1d Array link

public  int[] runningSum(int[] nums){
    for (int i = 1; i <nums.length ; i++){
        nums[i] += nums[i-1];
    }
    return nums;
}
}
