public class B283 {
    public static void main(String[] args) {
        int[] list = {0, 0, 1, 3, 12};
        MoveZores(list);
        for (int a : list) {
            System.out.println(a);
        }
    }

    public static void MoveZores(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
           if(nums[i] == 0){
               int j = i;
               while(nums[j] < nums.length){
                   if(nums[j+1] == 0){
                       j++;
                   }
                   int tmp = nums[j+1];
                   nums[j] = nums[i];
                   nums[i] = tmp;
                   j++;
               }
           }


        }
    }
}
