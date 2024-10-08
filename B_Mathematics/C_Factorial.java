package B_Mathematics;
public class C_Factorial {
 public static void main(String[] args) {
    int n=26;

    // iterative approach

    int res=1;
    int temp=n;
    while (temp>0) {
        res=res*temp;
        temp--;
    }
    System.out.println("fact using Iterative: "+res);               // time complexity O(n) | space complexity O(1) // good
    System.out.println("fact using Recursive: "+Fatorial(n));       // time complexity O(n) | space complexity O(n) // worst


 }  

 public static int Fatorial(int n){
    if(n==0) return 1;
    int fact=n*Fatorial(n-1);
    return fact;
 }
}
