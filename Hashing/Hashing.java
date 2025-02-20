
import java.util.Scanner;


public class Hashing {
   
    public static void main(String[] args){
        int n,q;
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        n=sc.nextInt();
        arr=new int[n];//array initialisation
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //precompute
        int [] hash = new int[1000000000];//14 error array size out of bound[0,1,2,3,4,....12]   -->inside main if more  it will show segmentation fault
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
