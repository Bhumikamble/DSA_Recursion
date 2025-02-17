// //print from 1 to n
// import java.util.Scanner;
// class Recursion{
//    static int count=1;
//    static void recursion(int n) {
//     if (count < n){
//     return;
//     }
//     System.out.println(count);
//     count++;
//     recursion(n);
// }
// }
// public class linearPrint {
//     public static void main(String [] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         Recursion.recursion(n);
//     }
// }




// print from n to 1
// import java.util.Scanner;

// class Recursion {
//      static void recursion(int count, int n) {
//         if (count < 1) {  
//             return;
//         }
//         System.out.println(count);  
//         recursion(count - 1, n);  
//     }
// }

// public class linearPrint {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//          Recursion.recursion(n, n); 
//         scanner.close();
//     }
// }




// 1 to n backtracking
// import java.util.Scanner;
// class Recursion{
//     static void recursion(int i,int n){
//     if(i>n){
//         return;
//     }
//     System.out.println(i);
//     recursion(i+1,n);
//  }
// }
// public class linearPrint {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=scanner.nextInt();
//         Recursion.recursion(1,n);
//     }
// }




//print from n to 1 using backtracking
// import java.util.Scanner;
// class Recursion{
//     static void recursion(int i,int n){
//     if(i<1){
//         return;
//     }
//     System.out.println(i);
//     recursion(i-1,n);
//  }
// }
// public class linearPrint {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n=scanner.nextInt();
//         Recursion.recursion(n,n);
//     }
// }
