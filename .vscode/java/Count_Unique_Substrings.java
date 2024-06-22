import java.util.*;

public class Count_Unique_Substrings {
        static class Node {
            Node[] children = new Node[26];
            boolean eow;
    
            public Node() {//this is a constructor
                for(int i=0; i<26; i++) {
                    children[i] = null;
                }
            }
        }
    
        public static Node root = new Node();
    
        public static void insert(String word) {//O(n)
            int level = 0;
            int len = word.length();
            int idx = 0;
    
            Node curr = root;
            for(; level<len; level++) {
                idx = word.charAt(level) - 'a';
                if(curr.children[idx] == null) {
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }
            curr.eow = true;
        }
    
        public static boolean search(String key) {//O(n)
            int level = 0;
            int len = key.length();
            int idx = 0;
    
            Node curr = root;
            for(; level<len; level++) {
                idx = key.charAt(level) - 'a';
                if(curr.children[idx] == null) {
                    return false;
                }
                curr = curr.children[idx];
            }
            return curr.eow == true;
        }
    
        public static int countNodes(Node root) {
            if(root == null) {
                return 0;
            }

            int count = 0;
            for(int i=0; i<26; i++) {
                if(root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count+1;//we do +1 for selfe node like we already did this in BST
    }
    
    public static void main(String args[]) {
        String str = "ababa";//ans = 10

        //fist find all suffix -> and then insert it in tries
        for(int i=0; i<str.length(); i++) {
            String suffix = str.substring(i);// here 'i'says that i sa start karanga or last tak jayan ga to suruaat wala idx aap na jaha bhi liya waha ek tarika sa cut lug gaya or suru wala sara char hut gaya
            insert(suffix);
        }

        System.out.println(countNodes(root));
     }
    }
    
