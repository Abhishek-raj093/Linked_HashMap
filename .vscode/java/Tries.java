import java.util.*;

public class Tries {
    static class Node {//here we store the data of children
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {//here we create a constructor and in tries we do't need any value in our tries because here we do't need to track the data because we track the data through the index i.e.Children[]
            for(int i=0; i<26; i++) {
                children[i] = null;//har gagha children ko null sa inatilize kar data ha
            }
        }
    }

    public static Node root = new Node();//ya mara trie ki root banna wali ha jiss ko hum starting ma he inatilze kar data ha and this node is alwaya vacent by defaultiss ma koi(root ma) koi valid data storee nahi hotaha uss ma bas apana child ki info store hoti ha taki root ka next level sa hum apna word ko store karwana suru kar da

    public static void main(String args[]) {
        String words[] = {"the", "a", "there", "their", "any", "three"};
    }
}
