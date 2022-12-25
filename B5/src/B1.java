public class B1 {

    public static void main(String[] args) {
        int[] list ={6,5,1,2,9};
        sortAsc(list);
        for (int a: list) {
            System.out.println(a);
        }
        //C1 : dùng đệ quyy
//        if(BinachSreach(list,0,list.length-1,8) == -1){
//            System.out.println("Ko Co ");
//        }else{
//            System.out.println("Co");
//            System.out.println(BinachSreach(list,0,list.length-1,8));
//        }
        // Cách 2 : Dòng vòng for
        if(SreachFor(list,0,list.length-1,9)==-1){
            System.out.println("Ko CO");
        }else {
            System.out.println("CO");
            System.out.println(SreachFor(list,0,list.length-1,9));
        }

    }

    public static int BinachSreach(int[] nums, int left, int right, int result) {
        if (left <= right) {
            int mid = (right + left)/2;
            if (nums[mid] == result){
                return mid;
            }
            if (result < nums[mid]) {
                return BinachSreach(nums, left, mid - 1, result);
            } else {
                return BinachSreach(nums, mid + 1, nums.length-1, result);
            }
        }
        return -1;
    }

    public static void sortAsc(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
    }
    // tạo fuction dùng While
    public static int SreachFor(int[] nums,int start , int end, int result){
        while (start <= end){
            int mid = (start+end) / 2;
            if(result == nums[mid]){
                return mid;
            }
            if(result < nums[mid]){
                end = mid -1;
            }
            if(result > nums[mid]){
                start = mid +1;
                end = nums.length-1;
            }
        }
        return -1;
    }

}
