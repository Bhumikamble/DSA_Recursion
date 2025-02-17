
import java.util.Scanner;


public class Hashing {
   
    public static void main(String[] args){
        int n,q;
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //precompute
        int [] hash = new int[13];
        for(int i=0;i<n; i++){
            hash[arr[i]]+= 1;
        }
        

        //query
        System.out.println("Enter the number of query: ");
        q=sc.nextInt();
        while(q>0){
            int num;
            System.out.println("Enter your query: ");
            num = sc.nextInt();
            System.out.println("the number of" + num + " present are " + hash [num]);
            q--;
        }
        sc.close();
      }
}
