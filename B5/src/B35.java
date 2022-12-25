public class B35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid = 0;
        int flag = 0;
        while(start<end){
            mid = start + (end - start)/2;
            if(nums[mid]>target){
                end = mid;
                flag = 0;
            }
            else if(nums[mid]<target){
                start=mid+1;
                flag = 1;
            }
            else
                return mid;
        }
        if(flag==0)
            return mid;
        else
            return mid+1;
    }
}
