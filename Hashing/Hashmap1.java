// functions of hashmap
// put()
// get()
// containsKey()
// remove()
// size()
// keySet()



import java.util.*;
public class Hashmap1 {
    static class HashMap<K,V>{  //generics means kuch toh type hoga which we dont know (jaha key ka type chahiye waha k use hoga)
        private class Node{
            K key;
            V value;
            public node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;//number of nodes
        private int N;//number of buckets
        private LinkedList<Node> buckets[];//N-Bucket.length//will store all data//it is actually a hashmap

        
        @SuppressWarnings("unchecked")
        public HashMap() {  //constructor of hashmap class
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bi = key.hashCode();   //return positive and negative values and we want positive value so will use math.absolute
            return Math.abs(bi) % N;   //bi=bucket index
        }



        private int searchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di=0;
            for(int i=0;i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i; //di
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList <Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }


        public void put(K key, V value){
            int bi = hashFunction(key);
            int di=searchInLL(key, bi);//bi=bucket index di=data index

            if(di == -1){ //key doesnt exists
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else{ //key exists 
                Node node =buckets[bi].get(di);
                node.value=value;
            }

            double lambda ={double}n/N ;       
            if(lambda>2.0){
                //rehashing
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di=searchInLL(key, bi);//bi=bucket index di=data index

            if(di == -1){ //key doesnt exists
               return false;
            }
            else{ //key exists 
               return true;
            }
        }




        public V remove (K key){
            return null;
        }





        public V get(K key){
            int bi = hashFunction(key);
            int di=searchInLL(key, bi);//bi=bucket index di=data index

            if(di == -1){ //key doesnt exists
               return null;
            }
            else{ //key exists 
                Node node =buckets[bi].get(di);
                node.value=value;
            }
        }



        public ArrayList<K> keySet() {
            return null;
        }

        public boolean isEmpty(){
            return false;
        }
    }

    public static void main(String args[]){
        HashMap<String, Integer> rap = new HashMap<>();
        map.put("India" , 190);
        map.put("China" , 200);
        map.put("US" , 50);
        map.put("Nepal" , 5);
    }
}
