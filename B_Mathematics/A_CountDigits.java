package B_Mathematics;
/** Program to count Digits of a number */
public class A_CountDigits {
    public static void main(String[] args) {
        int n=9235;
        int count=0;
        while (n>0){
            // int quo=n/10; // quotient 
            // int rem=n%10; // remainder
            n=n/10;
            count++;
        }
        System.out.println("Res: "+count);
    }
}
