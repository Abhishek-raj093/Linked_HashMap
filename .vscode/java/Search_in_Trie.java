import java.util.*;

public class Search_in_Trie {
    static class Node {//here we store the data of children
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {//here we create a constructor and in tries we do't need any value in our tries because here we do't need to track the data because we track the data through the index i.e.Children[]
            for(int i=0; i<26; i++) {
                children[i] = null;//har gagha children ko null sa inatilize kar data ha
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

    //code for searching
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
    public static void main(String args[]) {
        String words[] = {"the", "a", "there", "their", "any", "three"};
        for(int i=0; i<words.length; i++) {
            insert(words[i]);//here we insert for my word 'i' one by one 
        }

        System.out.println(search("three"));
        System.out.println(search("thor"));
    }
}
//TC for searching is O(L)