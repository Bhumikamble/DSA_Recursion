//to print name 5 times
// class Recursion{
  
//    static void recursion(int count) {
//     if (count == 5){
//     return;
//     }
//     System.out.println("Bhumi");
//     count++;
//     recursion(count);
// }
// }
// public class printNumber {
//     public static void main(String [] args){
//         Recursion.recursion(0);
//     }
// }

//using scanner
import java.util.Scanner;
public class  printNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        for(int i=0;i<5;i++){
            System.out.println(name);
        }
    }
}
