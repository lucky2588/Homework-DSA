public class B766 {
    public static void main(String[] args) {
       int[][] matrix = new int[5][6];
        System.out.println(matrix[0].length);
        System.out.println(matrix.length);
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i <matrix.length-1; i++){ // Vòng đầu tiền phải chạy N lần ( hết chiều dài của mảng )
            for (int j = 1; j <matrix[i].length-1; j++) { // Vòng tiếp theo phải chạy hết chiều rộng của mảng M lần
                if(matrix[i][j] != matrix[i-1][j-1] ) // các phép tính gắn vs + - quy là 1 mỗi 1 (M+1)
                    return false;
                // Tổng chạy 2 vòng lòng : N X (M+1) = NxM + N == NxM =>> O(n^2);
            }
        }
        return true;
    }


}



