//parameterized summation of n numbers
// import java.util.Scanner;
// class Recursion{
//     static int sum(int i,int sum){
//         if(i==0){
//             return sum;
//         }
//         return sum(i-1,sum+i);
//     }
// }
// public class Summation{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=scanner.nextInt();
//         int result=Recursion.sum(n,0);
//         System.out.println("the sum of the first" + n + "number is: " +result);
//     }
// }


//fu7nctional summation
// import java.util.Scanner;
// public class Summation{
//     static int n;
//     public static void main(String[] args){
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("Enter your number: ");
//         n=scanner.nextInt();
//          System.out.println(func(n));
//     }
//     static int func(int n){
//         if(n==0){
//             return 0;
//         }
//     return n + func(n-1);
//     }
// }