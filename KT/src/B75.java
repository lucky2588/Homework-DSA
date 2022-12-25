public class B75 {
    public  void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0)
                red++;
            if (nums[i] == 1)
                white++;
            if (nums[i] == 2)
                blue++;
        }
        int i = 0;
        while (red > 0) {
            nums[i] = 0;
            i++;
            red--;
        }
        i=1;
        while (white > 0) {
            nums[i] = 1;
            i++;
            white--;
        }
        i = 2;
        while (blue > 0) {
            nums[i] = 2;
            i++;
            blue--;
        }
    }
}
