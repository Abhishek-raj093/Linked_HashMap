import java.util.*;

public class Implementation_HashMap {
    static class HashMap<K,V> {//in this class we do all the internal implementation of the HashMap and here <K,V> is a generic and in java janarics are parameterized values means we use it here because right now for us the type of Key, Value is not fix so thats why we use generic here K=key,V=value
        private class Node {// this Node ja ha wo hashmap ka har bucket ka under jo linked list ki node ha un ka type yaha pa store karta ha we make it private kyo ki bahar kishi ko issa use karna ki jarurat nahi ha
            K key;
            V value;

            public Node (K key, V value) {
                this.key = key;
                this.value = value;
            }
        } 
            private int n;//size(n) is the total number of nodes which exist in our hash map and it is represrnted as small 'n'
            private int N;
            private LinkedList<Node> buckets[];//bucket is an array of LL and its type is LinkedList which Means it stores LinkedList of Node and it is represented by capital 'N' and N = buckets.length


            @SuppressWarnings("unchecked")//ya warning kodaba daga jo uncheked aata h actuly java ka kuch version ma aasa hota h ki hum direct LinkedList nahi likh sak ta ha huma LL ka type bata na paraga to ushe liya hum iss ka use karta h
            public HashMap() {//this is a HashMap constructor in the HashMap Class
                this.N = 4;
                this.buckets = new LinkedList[4];//at starting the size of our bucket is equal to 4 
                for(int i=0; i<4; i++) {//yaha pa hum ek ek index pa jaaka LL ko create kiya h
                    this.buckets[i] = new LinkedList<>();//jab tak hum LL kocreate nahi karanga tab tak humara pass ek khali array bachaga or jasa he hum na LL create kar diya humara pass ek khali LL aaja yaga hue ek index par
                }
            }

            private int hashFunction(K key) {
                int hc = key.hashCode();//hc = hash code
               return Math.abs(hc) % N;//it will give the absolute value of hashcode menas if it is positive then return +ve or if it is -ve then make it +ve and then we take its modulo with size taki iss ki range 0 to 3 ka beach ma he raha. bucket.length is equal to capiral 'N'
            }

            private int SearchInLL(K key, int bi){//it will also return the index so thats why its return type is int and here we use bi taki iss sa huma pata chal gaya ga ki kon sa index wali LL huma approach karni ha
                LinkedList<Node> ll = buckets[bi];// dere we store all bi in the variable ll
                int di = 0;

                for(int i=0; i<ll.size(); i++) {
                    Node node = ll.get(i);
                    if(node.key == key) {
                        return di;
                    }
                    di++;
                }

                return -1;
            }

            @SuppressWarnings("unchecked")
            private void rehash() {
                LinkedList<Node> oldBuck[] = buckets;
                buckets = new LinkedList[N*2];
                N = 2*N;
                for(int i=0; i<buckets.length; i++) {//here we inatilize all buckets by a empty LL
                    buckets[i] = new LinkedList<> ();
                }

                //nodes -> add in bucket
                for(int i=0; i<oldBuck.length; i++) {
                    LinkedList<Node> ll = oldBuck[i];
                    for(int j=0; j<ll.size(); j++) {
                        Node node = ll.remove();//here we remove all the nodes from old buckets
                        put(node.key, node.value);//here we put all the node of old buckets in new buckets
                    }
                }
            }
            //Here put,containskey,remove,get and keySet these all function work in constant time
            public void put(K key, V value) {//TC of put is o(lambda) or kyu ki lambda ki value humasa const value sa chota rahta ha to this wii be constant time i.e. O(1)
                int bi = hashFunction(key);//hashfunction will give us the bucket index and here the value of index should be in 0 to size-1 in this range  for this case it is 0 to 3
                int di = SearchInLL(key, bi);//after giving bi the hashfunction will search on LL and return the index of the Data i.e. di and in this tere are two posible cases if the key already exist then return a valid indix and if key not exist thenteturn -1 and add that key in LL
            
                if(di != -1) {
                    Node node = buckets[bi].get(di);// here in bucket at bi Index in our array ew find index then in LL at di index we find out the node and then update that node
                    node.value = value;
                }else {
                    buckets[bi].add(new Node(key, value));//here we add the new node in LL
                    n++;
                }

                double lambda = (double)n/N;
                if(lambda > 2.0) { //here 2.0 is the threshHold value

                }
            }

            public boolean containskey(K key) {// ya find out kara ga ki koi bhi key humara hashmap ka undar ha ya nhai h in this first we find the bi then find di if the key exist then di return valid value(true) and if not then return -1(false) . TC of containsKey is O(1)
                int bi = hashFunction(key);
                int di = SearchInLL(key, bi);
                if(di != -1) {//valid value
                    return true;
                }else {
                    return false;
                }

            }

            public V remove(K key) {//here we remove the key ka carrosponding ka nodes ko. TC of remoc=ve fun is O(1)
                //fist we find out that key value pair
                int bi = hashFunction(key);
                int di = SearchInLL(key, bi);
                if(di != -1) {//valid value
                    Node node = buckets[bi].remove(di);
                    n--;
                    return node.value;//yaha pa hum return kar ta ha uss node a value ko jisha hum remove karna wala ha
                }else {
                    return null;//return null if the node do't exist
                }
            
            }

            public V get(K key) {//ya jaha par bhi key exist karti hogi uss ka value return karaga get function. TC of get fum is O(1)
                int bi = hashFunction(key);
                int di = SearchInLL(key, bi);
                if(di != -1) {//valid value
                    Node node = buckets[bi].get(di);
                    return node.value;
                }else {
                    return null;
                }
                
            }

            public ArrayList<K> keySet() {//here keySet will store all the key in ArrayList and then return the ArreyList of all keys
                ArrayList<K> keys = new ArrayList<>();//here 'K' is the type of ArrayList because our Keys has not a fixed type

                //ab huma ek ek kar ka  sara ka sara keys pa ja ka unha triverse karna ha or un keys ko apna ArryList ka under store karwana ha
                for(int i=0; i<buckets.length; i++) {
                    LinkedList<Node> ll = buckets[i];
                    for(Node node : ll) {
                        keys.add(node.key);
                    }
                }
                return keys;
            }

            public boolean isEmpty() {//it wil tell us that our HashMap is empty or not
                return n == 0;// if n==0 then it means our HashMap is empty and for empty it eill return true or if it's not empty then return false

            }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();//here we do't use the inbuild hashmap here we use the hasmap class which we created earlier
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("India"));//here we try to access the value of that key which we pass here
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
