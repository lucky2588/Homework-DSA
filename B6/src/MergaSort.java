public class MergaSort {

    public static void main(String[] args) {
        int[] listA = {1, 2, 3, 4};
        int[] listB = {5, 6, 7, 8};
        int[] listC = new int[listA.length + listB.length];
        sortB1(listA, listB, listC, listA.length, listB.length);
        for (int a : listC) {
            System.out.println(a);
        }
    }

    public static void sortB1(int[] A, int[] B, int[] C, int n, int m) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (A[i] > B[j]) {
                C[k] = B[j];
                j++;
                k++;
            }
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
                k++;
            }
            if (j < m) {
                while (j < m) {
                    C[k] = B[j];
                    k++;
                    j++;
                }
            }
            if (i < n) {
                while (i < n) {
                    C[k] = A[i];
                    k++;
                    i++;
                }
            }
        }
    }

    public int[] MergaSort(int[] A, int[] C, int start, int end) {
        if (start <= end) return C;
        if (start < end) {
            int mid = (start + end) / 2;
//            MergaSort(A,start,mid);
//            MergaSort(A,mid+1,end);
            int i = start;
            int j = mid + 1;
            int k = start;
            while (i <= mid && j <= end) {
                if (A[i] > A[j]) {
                    C[k] = A[j];
                    k++;
                    j++;
                }
            }
            if (A[i] <= A[j]) {
                C[k] = A[i];
                k++;
                i++;
            }
            if (i <= mid) {
                while (i <= mid) {
                    C[k] = A[i];
                    k++;
                    i++;
                }
            }
            if (j <= end){
                while (j <= end){
                    C[k] = A[j];
                    k++;
                    j++;
                }
            }
            return C;

        }


    }
}
