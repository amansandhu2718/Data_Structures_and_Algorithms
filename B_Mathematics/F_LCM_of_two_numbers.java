package B_Mathematics;

public class F_LCM_of_two_numbers {
public static void main(String[] args) {
    int a=4,b=6;
    System.out.println("Res1 : "+NaiveApproach(a, b));
    System.out.println("Res2 : "+BetterApproach(a, b));
}    

public static int NaiveApproach(int a , int b){
    int res=a;
    if(b>a){
        res=b;
    }
    while (true){
        if(res%a==0 && res%b==0){
            break;
        }
        res++;
    }
    return res;
}

public static int BetterApproach(int a , int b){
    /** better approach is using formula 
     * formula : a*b = gcd(a,b) * lcm(a,b)
     * using formula, lcm(a,b) = a*b / gcd(a,b)
     */
     int gcd=E_Euclidean_GCD_HCF.best_getGCD(a,b);
     int res=(a*b)/gcd;
     return res;
}


}
