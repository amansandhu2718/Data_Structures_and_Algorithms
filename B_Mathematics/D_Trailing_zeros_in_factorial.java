package B_Mathematics;
public class D_Trailing_zeros_in_factorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Res: "+CountTrailingZeroes(n));
    }
    public static int CountTrailingZeroes(int n){
        int res=0;
        for (int i = 5; i <= n; i=i*5) {
            res=res+n/i;
        }
        return res;
    }
}
