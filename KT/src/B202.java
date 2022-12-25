public class B202 {
    public int count=0;
    public boolean isHappy(int n){
        int sum=0;
        if(n==1)
            return true;
        else
        {
            while(n>0)
            {
                sum+=Math.pow(n%10, 2);
                n=n/10;
            }
        }
        if(sum==1)
            return true;
        else
        {
            count++;
            if(count<10)
                return isHappy(sum);
            else
                return false;
        }
    }
}
