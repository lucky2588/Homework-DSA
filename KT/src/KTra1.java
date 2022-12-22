public class KTra1 {
    //B75 : sortColor
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int i = 0; i < nums.length; i++) {
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
        i = 1;
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

    // B202 : Happy Numbers
    public int count = 0;

    public boolean isHappy(int n) {
        int sum = 0;
        if (n == 1)
            return true;
        else {
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
        }
        if (sum == 1)
            return true;
        else {
            count++;
            if (count < 10)
                return isHappy(sum);
            else
                return false;
        }
    }

    //B1512 : Cặp Số Đẹp
    public int numIdenticalPairs(int[] nums) {
        int isCheck = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (tmp == nums[j] && i != j)
                    if (i < j)
                        isCheck += 1;
            }
        }
        return isCheck;
    }


    //B2418 : SortPeople
    public static void main(String[] args) {
        String[] list = {"Thang", "San", "Trung"};
        int[] list2 = {190, 165, 185};
        String[] numsCheck = sortPeople(list, list2);
        for (String a : numsCheck) {
            System.out.println(a);
        }
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        Sort(names, heights, 0, heights.length - 1);
        return names;
    }

    private static void Sort(String[] names, int[] heights, int low, int high) {
        if (low >= high) {
            return;
        }
        int begin = low;
        int end = high;
        int mid = begin + (end - begin) / 2;
        int valueMid = heights[mid];

        while (begin < end) {
            while (heights[begin] > valueMid) {
                begin++;
            }
            while (heights[end] < valueMid) {
                end--;
            }
            int tmp = heights[begin];
            heights[begin] = heights[end];
            heights[end] = tmp;
            String tmp1 = names[begin];
            names[begin] = names[end];
            names[end] = tmp1;
        }
        Sort(names, heights, low, end - 1);
        Sort(names, heights, begin + 1, high);
    }

    // B888 : Fair Candy Swap
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < aliceSizes.length; i++)
            sum1 += aliceSizes[i];
        for (int i = 0; i < bobSizes.length; i++)
            sum2 += bobSizes[i];
        int tb = (sum1 - sum2) / 2;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] - bobSizes[j] == tb)
                    return new int[]{aliceSizes[i], bobSizes[j]};
            }
        }
        return null;
    }
}




