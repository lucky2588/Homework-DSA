// B136 : Single Number
public class B136 {
    public static int singleNumber(int[] nums){
        int isCheck = 0;
        int result = 0;
       endPro: for (int i = 0; i <nums.length ; i++) {
             result = nums[i];
            for (int j = 0; j <nums.length ; j++){
                if(result != nums[j]){
                    if (i != j) {
                        isCheck += 1;
                    }
                }
            }
            if(isCheck != nums.length-1){
                isCheck =0;
            }
            if(isCheck == nums.length -1){
                break endPro;
            }
        }
        return  result;
    }
}
