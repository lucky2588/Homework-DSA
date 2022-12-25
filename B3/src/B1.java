public class B1 {
    public static void main(String[] args) {
        int[] list = new int[]{1, 3, 8, 2, 1};
        int N = list.length;
        boolean isCheck = true;
        for (int i = 0; i < N; i++) {
            isCheck = true;
            for (int j = 0; j <N-i-1; j++){
                if(list[j] > list[j+1]){
                 int kq = list[j];
                 list[j] = list[j+1];
                 list[j+1] = kq;
                 isCheck = false;
                }
            }
        if(isCheck){
            break;
        }
        }

        for (int a : list) {
            System.out.println(a);
        }


    }
}
