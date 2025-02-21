//factorial using recursion
// import java.util.Scanner;
// class Recursion{
//     static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         return n * fact(n-1);
//     }
// }
// public class Factorial{
//     public static void main(String[] args){
//         Scanner scanner=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n =scanner.nextInt();
//         int result=Recursion.fact(n);
//         System.out.println("The factorial of " + n + " : " +result);
//     }
// }

//factorial using parameterized
import java.util.Scanner;
class Recursion{
    static int fact(int n,int result){
        if(n==0){
            return result;
        }
        return fact(n-1, result*n);
    }
}
public class Factorial{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =scanner.nextInt();
        int result=Recursion.fact(n,1);
        System.out.println("The factorial of " + n + " : " +result);
    }
}