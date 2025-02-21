//reverse array using recursion
import java.util.*;
public class reverseArray {
    static int i,n,arr[];
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    n=scanner.nextInt();
    arr=new int[n];
    System.out.println("Enter an array: ");
    for(int i=0;i<n;i++){
        arr[i]=scanner.nextInt();
    }
  reverse(0,arr,n);
  System.out.println("Reversed array: " +Arrays.toString(arr));
 
  scanner.close();
}
static void reverse(int i,int arr[],int n){
    if (i >= n / 2) return; // Base condition
      
    int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverse(i + 1, arr, n);
   }
}
