public class B1089 {
    public static void main(String[] args) {
        int[] list = new int[]{1, 0, 5, 0, 6, 6};
        duplicateZeros(list);
        for (int a : list) {
            System.out.println(a);
        }
    }


    public static void duplicateZeros(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N-1; i++){
            if (arr[i] == 0) {
                for (int j = N - 2; j >= i + 1; j--){
                    arr[j+1] = arr[j];
                }
                arr[i + 1] = 0;
                i++;
            }
        }
    }
}
