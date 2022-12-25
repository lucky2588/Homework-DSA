public class B1512 {




    public int numIdenticalPairs(int[] nums) {
      int isCheck = 0;
        for (int i = 0; i <nums.length ; i++) {
            int tmp = nums[i];
            for (int j = 0; j <nums.length ; j++) {
                if(tmp == nums[j] && i != j )
                    if(i < j)
                    isCheck +=1;
            }
        }
        return isCheck;
    }
}
