//character hashing ---> using array and ASCII

import java.util.*;
public class CharacterHash {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a string: ");    
         s=sc.nextLine();

         //precomputation
        int [] hash = new int[26];
        for(int i=0;i<s.length(); i++){
            hash[s.charAt(i) - 'a']+= 1;
        }

        int q;
        System.out.println("Enter the number of queries: ");
        q = sc.nextInt();
        
        while(q>0){
            char c;
            System.out.println("Enter queries: ");
            c = sc.next().charAt(0);
            //fetch
            System.out.println(hash[c -'a']);
            q--;
        }
        sc.close();
    }
}
