public class B69 {


    public int mySqrt(int x) {
        int i=0;
        int total = 2^31 -1;
        for (i = 0; i <total ; i++) {
           while(i <total/2 ){
               if(i*i == x ){
                   total=2;
               }
           }
        }
        return i;
    }
}
