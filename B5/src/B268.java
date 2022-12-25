public class B268 {
    public static void main(String[] args) {
        int[] list = {0, 1, 2, 4, 5};
        arraySort(list);
        for (int a : list) {
            System.out.println(a);
        }
        System.out.println(missingNumber(list));
    }

    public static int missingNumber(int[] nums) {
        int N = nums.length + 1;
        int isCheck=0;
        for (int i = 0; i < N; i++) {
            isCheck =i;
            if (checkResult(nums, 0, nums.length-1, i) == -1){
            } else {
               break;
            }
        }
        return isCheck;
    }

    public static int checkResult(int[] nums, int left, int right, int isCheck) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (isCheck == nums[mid]) {
                return -1;
            }
            if (isCheck < nums[mid]) {
                return checkResult(nums, 0, mid - 1, isCheck);
            } else {
                return checkResult(nums, mid + 1, nums.length - 1, isCheck);
            }
        }
        return 0;
    }


    public static void arraySort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int result = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] >= result) {
                int tmp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = tmp;
                j--;
            }
        }
    }
}
