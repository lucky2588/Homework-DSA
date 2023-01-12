import java.util.Arrays;

public class B1748 {
    public static void main(String[] args) {
        // Hàm Test
        int[] nums = {1, 2, 5, 2};
        System.out.println(sumOfUnique(nums));

    }
    public static int sumOfUnique(int[] nums) {
        int[] arr = new int[101]; // ==>> khởi tạo cố định phạm vị nên là độ phực tạp bộ nhớ là O(1)
        // vì độ dài và giá trị của mảng trong khoảng 100 đơn vị nên khởi tạo 1 mảng có 101 phần tử
        for (int i : nums) {
            arr[i]++; // đếm số lần xuất hiện của các chữ số , các số nào trong khoảng 1 đến 100 là đc đánh dấu là 1 , số trùng là 2
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++){ // Duyệt từ đầu đến cuối mảng ==> O(n)
            if (arr[i] == 1) // loại bỏ phần tử có số đánh dấu là 2 (là phần tử trùng) và  0 là ko xuất hiện
                total += i;
        }
        return total;
    }
}
