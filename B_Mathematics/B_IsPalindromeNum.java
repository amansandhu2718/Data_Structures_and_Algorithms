package B_Mathematics;
/** Pragrom for checking a number is palindrome or not (Positive Integers only) */
public class B_IsPalindromeNum {
    public static void main(String[] args) {
        // int n=123;
        int n=12321;
        int rev=0;
        int temp=n;

        while (temp>0) {
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
            System.out.println("rem:"+temp);
        }
        System.out.println(""+rev);

        if(rev==n){
            System.out.println("Is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }
}
