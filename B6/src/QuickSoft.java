public class QuickSoft {
    public static void main(String[] args) {
        int[] list = {1, 6, 5, 9, 8, 2};
        QichkSort(list, 0, list.length - 1);
        for (int a : list) {
            System.out.println(a);
        }
    }

    public static int[] QichkSort(int[] A, int start, int end) {
        if (start >= end) return A;
        if (start < end) {
            int key = (start + end) / 2;
            int Key = A[key];
            int i = start;
            int j = end;
            // Chay khi (i < j)
            while (i < j) {
                while (A[i] < Key) {
                    i++;
                }
                while (A[j] > Key) {
                    j--;
                }
                if (i <= j) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                    i++;
                    j--;
                }
            }
            QichkSort(A, start, j);
            QichkSort(A, i, end);
            return A;
        }
        return A;
    }
}
