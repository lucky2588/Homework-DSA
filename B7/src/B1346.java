public class B1346 {
    public static void main(String[] args) {

    }

    public boolean checkIfExist(int[] arr){
        boolean isCheck = false;
        endPro:for (int i = 0; i <arr.length ; i++) {
            int tmp = arr[i];                       // Vòng Đầu trỏ vào phần tử i , duyệt từ đầu đến hết mảng ==>> N lần
            for (int j = 0; j <arr.length ; j++) {
                if(tmp == arr[j] * 2 && i != j){ // trong mỗi lần chạy M , coi các phép gắn là 1 đơn vị ==>
                    isCheck = true; // so sánh j < arr.lengt M lần , tăng j M lần , so sánh bằng trong if 4M
                    break endPro; // tổng 6M+1+1 = 6M+2
                }
            } // tổng N x (6M+2) = 6NM + 12 = NM = O(n^2);
        }
        return isCheck;
    }
}
