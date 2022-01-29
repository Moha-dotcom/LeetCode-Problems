package Com.LeetCode.String;

public class Recurion {

    public static void main(String[] args) {


//        System.out.println(sumPositiveDigits(342));
//        System.out.println(PowerofNumber(2,4));
//        System.out.println(gcd(48, 18));
//        System.out.println(DecimalToBinary(10));


//        System.out.println(factorial(7));

        int A[] = {1,2,2};
        int N = A.length - 1;
//        System.out.println(N);
//        System.out.println(productofArray(A, N));

//        System.out.println(recursiveRange(6));

//        System.out.println(fib(6));


//        System.out.println("A" + "B");
//
//
//        System.out.println(isPalindrome("racecar"));


        System.out.println(FirstUpperCaseLetter("mPhameDs"));
        String [] words = {"notapalindrome","racecar"};
        System.out.println(firstPalindrome(words));

    }


    /*
    Question 1
     Sum of positive number

     */


    public static String firstPalindrome(String[] words) {

        if(words.length == 0)
            return "";

        for(int i = 0; i< words.length; i++){
            String word = words[i];
            if(word.equals(reverse(word)))
                return word;

        }

        return "";

    }



    //First UpperCase Letter

    public static char FirstUpperCaseLetter(String str){

        if(str.isEmpty())
            return ' ';
        if(Character.isUpperCase(str.charAt(0)))
            return str.charAt(0);

        return FirstUpperCaseLetter(str.substring(1, str.length()));



    }

    public static boolean isPalindrome(String s){
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));
        return false;

    }


    public static String reverse(String str){

        if(str.isEmpty()){
            return str;
        }




        return reverse(str.substring(1))  + str.charAt(0);
        /*
            OHAMED - >  M
            HAMED - > O
            AMED  - > H
            MED -> A
            ED  - > M
            D -> E
            D - > D


         */

}


    public static int recursiveRange(int n){

        if(n <= 0){
            return 0;
        }

        return n + recursiveRange(n -1);

    }

    public static int fib(int n) {
        if (n<0) {
            return -1;
        }
        if (n==0 || n==1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }




    public static int productofArray(int A[], int N)
    {
        //   TODO
        if(N == 0){
            return 1;
        }


        return A[N] + productofArray(A, N-1);
    }



    public static int factorial(int n){

        if( n == 0){
            return 1;
        }

        return n * factorial(n -1);

    }


    public  static int sumPositiveDigits(int n){


        if(n == 0 || n < 0){
            return 0;
        }


        return n % 10 + sumPositiveDigits(n/10);

    }


    //Question 2
    // Calculate Power of a number using Recursion

    public static int PowerofNumber(int base, int exp){

        if(exp < 0 ){
            return -1;

        }
        if(exp == 0){
            return 1;
        }
        System.out.println(exp  );

        return base * PowerofNumber(base,  exp - 1);
    }


    /*
    Question 3

    GCD using Euclidean Alogrithm
     */

    public static int gcd(int a, int b){

        if(a < 0 || b < 0){
            return 0;

        }

        if(b == 0){
            return a;
        }

        return gcd(b, a % b);
    }



    /*
    Question 4
    Convert a number from Decimal to Binary using recursion
     */


    public static  int DecimalToBinary(int n){

        if(n < 0){
            return -1;
        }

        if(n == 0){
            return 0;
        }

        return n % 2 + 10 * DecimalToBinary(n / 2);
    }



}
