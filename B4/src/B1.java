public class B1 {
    public static void main(String[] args) {
//        f(0);
//        System.out.println(GT(10));
        System.out.println(   Fibonacci(10));
    }

    public static void f(int n){
        if(n > 9){
            return;
        }
        System.out.println("Start : " +n);
        f(n+1);
        System.out.println("end "+n);
    }
    public static int GT(int n){
        if(n == 0){
            return 1;
        }
        return n*GT(n-1);
    }
    public static int Fibonacci(int n){
        if(n  < 2){
            return 2;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

}
