// 1. Two Sum
class B1{
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        endPro: for (int i = 0; i < nums.length ; i++) {
            boolean isCheck = true;
            for (int j = 0; j < nums.length ; j++) {
                if( nums[i] + nums[j] == target){
                    if(i != j)
                        isCheck = false;
                    result[0] = i;
                    result[1] = j;
                }
            }
            if(!isCheck){
                break endPro;
            }
        }
        return result;
    }
}