// import java.util.*;
// public class HashMap {
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a length of the array: ");
//         int n=sc.nextInt();
//         int arr[] =


//         //precomputation
//         map=int, int=mpp;
//         for(int i=0;i=n;i++){
            
//         }
//     }
// }

import java.util.*;

public class Hashmap {
    public static void main(String [] args){

        //country{key} , popoulation{value}
        HashMap <String, Integer> map = new HashMap<>();

        //insertion
        map.put("India" , 30);
        map.put("Us" , 120);
            
        System.out.println(map);
        map.put("India" , 100);
        System.out.println(map);

        //containskey--->key exists--->true
        //containskey--->key doesnts exits--->false
        
        if(map.containsKey("India")){
            System.out.println("Key is present");
        }
        else{
            System.out.println("key is not present");
        }
    
        if(map.containsKey("Indonesia")){
            System.out.println("key exists");
        }
        else{
            System.out.println("key does not exist");
        }

        System.out.println(map.get("India"));//.get-->key exists--->value
        System.out.println(map.get("indonesia"));//.get-->key doesn't exists--->null



        int arr[] = {12,10,14};
        for(int i=0;i<3;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();





        //entryset
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+ " " + map.get(key));
        }

        //to remove a pair
        map.remove("US");
        System.out.println(map);
    }
}
