public class Word_Break_Problem {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

       public Node() {//this is a constructor in which we inatilize all the child node by null
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();//ya mara trie ki root banna wali ha jiss ko hum starting ma he inatilze kar data ha and this node is alwaya vacent by defaultiss ma koi(root ma) koi valid data storee nahi hotaha uss ma bas apana child ki info store hoti ha taki root ka next level sa hum apna word ko store karwana suru kar da

    public static void insert(String word) {//only this loop is taking time i.e. O(L)
        Node curr = root;
        for(int level=0; level<word.length(); level++) {//level will be equal to character which is present in word 
            int idx = word.charAt(level) - 'a';//here we find the index of character
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();//if the character is not present then we create a new
            }
            curr = curr.children[idx];//here we move to the next level
        }
        curr.eow = true;//here we mark the end of word
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int level=0; level<key.length(); level++) {//level will be equal to character which is present in word 
            int idx = key.charAt(level) - 'a';//here we find the index of character
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];//here we move to the next level
        }
        return curr.eow == true;//matlap humara jo curr node ha or us ka undar jo word store ha wo mari key ka last letter ha then return true else return false iss ka matlab ha pora key exist nahi karta uss ka koi chota part exist karta ha
    }  
    
    public static boolean wordBreak(String key) {
        if(key.length() == 0) {
            return true;
        }
        for(int i=1; i<=key.length(); i++) {
            //substring(beg idx(0), last idx(1))in this last idx is an exclusive index
           if (search(key.substring(0, i)) &&//this is our first part so for this we call for search
            wordBreak(key.substring(i))){//java will treat this i as our bigning index//this is our second part recursively we call our wordBreak 
                return true;
            }
        }

        return false;
    }
    public static void main(String args[]) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i=0; i<arr.length; i++) {//here we insert all sting in our tries
            insert(arr[i]);
        }

        String key = "ilikesamsung";//for this key we have to do partation and check that after doing all partation we have to check that our all substring which formed is exist in our array or not
        System.out.println(wordBreak(key));
    }
}
//TC is O(L) so this is a linear TC