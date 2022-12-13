public class B387 {

    public static void main(String[] args) {
        String s = "bbccdd";
//        System.out.println(firstUniqChar(s));
    }

    public  int firstUniqChar(String s) {
        int check = 0;
        int result = -1;
       endPro: for (int i = 0; i < s.length(); i++) {
            check = 0;
            char c = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c && i != j){
                    check += 1;
                }
            }
                if(check == 0){
                    result = i;
                    break endPro;
                }
        }
        return result;
    }
}
