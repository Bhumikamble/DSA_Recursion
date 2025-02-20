//HashSet in java
//                      | Array  | Sorted Array |      BST           |
// Insert/Add-O(1)      |  O(n)  |    O(n)      |   O(n) O(n)        |
// Search/Contains-O(1) |  O(n)  |    O(logn)   |   O(n) O(n) O(logn)|
// Delete/Remove-O(1)   |  O(n)  |    O(n)      |   O(n) O(n)        |

import java.util.*;

public class Hashset {
    //creating
    public static void main(String [] args){
        HashSet<Integer> set = new HashSet<>();


        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//list.add(el)
        System.out.println(set);

        System.out.println("size of set is : " + set.size());

        //Search-contains
        if(set.contains(1)) {
            System.out.println("set contains 1");
        }
        if(set.contains(0)) {
            System.out.println("doesn't contains");
        }

        //Deletion
        set.remove(1);
        System.out.println(set);
        if(!set.contains(1)) {
            System.out.println("does not contain 1 -removed");
        }
      
        //iterator ----> before iterating it point to null
        //it.next()---->true/false
        
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
