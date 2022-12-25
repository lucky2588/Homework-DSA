import java.util.Arrays;

public class B2404 {
    public static void main(String[] args) {
int[] list = {2,3,3,4,4,6,6};
        System.out.println(mostFrequentEven(list));

    }

    public static int mostFrequentEven(int[] nums){
        Arrays.sort(nums);
        int isCheck =0;
        int result =0;
        endPro:for (int i = 0; i <nums.length ; i++) {
            if(nums[i] % 2 ==0){
                 result = nums[i];
                for (int j = 0; j < nums.length ; j++){
                    if(result == nums[j] && i != j){
                        isCheck+=1;
                    }

                }
                if(isCheck ==1 || isCheck > 1){
                  break endPro;
                }
            }
        }
      if(isCheck >=1){
          return result;
      }
      return -1;
      }
    }






