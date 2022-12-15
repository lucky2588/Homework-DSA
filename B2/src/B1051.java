public class B1051 {
    public static void main(String[] args) {
        int[] list = new int[]{5, 1, 2, 3, 4};
        System.out.println(heightChecker(list));
    }

    public static int heightChecker(int[] heights) {
        int isCheck = 0;
        int[] list = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            list[i] = heights[i];
        }
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != list[i]) {
                isCheck += 1;
            }
        }
        return isCheck;
    }
}
