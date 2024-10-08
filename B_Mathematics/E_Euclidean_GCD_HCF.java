package B_Mathematics;
/** This program is for finding greater common divisor GCD / HCF of two numbers */

/** IMPORTANT : This program gets asked in interview as Tiling problem  or can be asked in another example but logic will be same. EUCLIDEAN ALGORITHM
 
  example :
  a=4;
  b=6

  matric  size will be 6*4
  you will have to find largest asquare tile size that fill the whole rectangle.
  OP of example = 2   
*/
public class E_Euclidean_GCD_HCF {
    public static void main(String[] args) {
        
        int n=100;
        int n2=2;
        System.out.println("RES 1:"+ NaiveApproach_getGCD(n, n2));
        System.out.println("RES 2 :"+ better_getGCD(n, n2));
        System.out.println("RES 3 :"+ best_getGCD(n, n2));


    }   

    public static int NaiveApproach_getGCD(int n1,int n2){ // this naive approach is not euclidean algorithm 
        int smaller=n1;
        if(n2<n1){
            smaller=n2;
        }
        while(smaller>0){
            if(n1%smaller==0 && n2%smaller==0){
                break;
            }
            smaller--;
        }
        return smaller;
    }
    public static int better_getGCD(int a,int b){
        
        /**
         * example if a=12 b = 15
         * sol:  i.e. repeadted subtraction
         * a=12 b=3
         * a=9 b =3 
         * a=6 b=3
         * a=3 b=3
         */

      while (a!=b) {                        
        if(b>a){
              b=b-a;
          }else{
              a=a-b;
          }
      }
        return a;
    }

    public static int best_getGCD(int a,int b){
        
        if(b==0){
            return a;
        }
        return best_getGCD(b,a%b);

    }

}
