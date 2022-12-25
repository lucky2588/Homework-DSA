public class B3 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 8};
        sortSelect(nums);
        for (int a : nums) {
            System.out.println(a);
        }


    }

    public static void sortSelect(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
          int minIndex =i;
            for (int j = i + 1; j < nums.length; j++) {
              if(nums[j] < nums[minIndex]  ){
                  minIndex = j;
              }
            }
            if(minIndex != i){
                int tmp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = tmp;

            }
        }
    }

}


