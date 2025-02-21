import java.util.*;
public class Hashmap1 {
    static class HashMap<K,V>{  //generics means kuch toh type hoga which we dont know
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
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }
        private int searchInLL(K key,int bi){
            LinkedList<Node> ll = 
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di=searchInLL(key, bi);//bi=bucket index di=data index

            if(di == -1){
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else{
                Node node=buckets[bi].get(di);
                node.value=value;
            }

            double lambda ={double}n/N ;       
            if(lambda>2.0){
                //rehashing
            }
        }

        public boolean containsKey(K key){
            return false;
        }

        public V remove (K key){
            return null;
        }

        public V get(K key){
            return null;
        }

        public ArrayList<K> keySet() {
            return null;
        }

        public boolean isEmpty(){
            return false;
        }
    }
}
