package B_Mathematics;
public class G_IsPrime {
    public static void main(String[] args) {
        System.out.println("Res1: "+Naive_IsPrime(4));
        System.out.println("Res2: "+Better_IsPrime(4));
        System.out.println("Res3: "+Best_IsPrime(4));
    }
    public static boolean Naive_IsPrime(int n){

        boolean res=true;
        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                res=false;
                break;
            }
        }
        return res;
    }
    public static boolean Better_IsPrime(int n){

        boolean res=true;
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0){
                res=false;
                break;
            }
        }
        return res;
    }

    public static boolean Best_IsPrime(int n){

        boolean res=true;
        if(n==1)    {
            res=false;
        }else if( n==2 || n==3){
            res = true;
        }else if(n%2==0 || n%3==0){
            res=false;
        }else{
            for (int i = 5; i*i <=n ; i=i+6) {
                if(n%i==0|| n%(i+2)==0){
                    res=false;
                    break;
                }
            }
        }
   
        return res;
    }
}
