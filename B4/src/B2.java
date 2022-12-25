public class B2 {
    public static void main(String[] args) {
        if(isPowerOfTwo(12)){
            System.out.println("Y");
        }else {
            System.out.println("N");
        }
    }

    public static boolean isPowerOfTwo(int n) {
         if(Ischeck(n) == 1){
             return true;
         }
         return false;

    }
    public static int Ischeck(int n){
    if(n % 2 != 0){
        return -1;
    }





}
