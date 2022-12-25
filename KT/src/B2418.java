public class B2418 {
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
}

