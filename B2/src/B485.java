public class B485 {
    public static void main(String[] args) {
        int[] list = new int[]{1,0,1,1,0};

        System.out.println( findMaxConsecutiveOnes(list));
    }
    public static int findMaxConsecutiveOnes(int[] nums){
       int isCheck = 0;
       int toTal = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == 0 ){
                toTal =0;
            }else{
                toTal++;
                isCheck = (toTal > isCheck) ? toTal : isCheck;
            }
        }
        return isCheck;
    }
}

