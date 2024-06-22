import java.util.*;
public class Logest_Word_With_all_Prifixes {
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
    
        public static String ans = "";
        
        public static void longestWord(Node root, StringBuilder temp) {
            if(root == null) {
                return;
            }
            
            for(int i=0; i<26; i++) {
                //for(int i=25; i>=0; i--) to print "apply" insted of "apple"
                if(root.children[i] != null && root.children[i].eow == true) {
                    char ch = (char)(i+'a');//here we type cast the idx into char
                    temp.append(ch);//in string builder .append is a function to add any char in our string 
                    if(temp.length() > ans.length()) {
                        ans = temp.toString();//the value of string builder ko directly string ma assign nahi kar sak ta so that's why toString() wala method ko use karka tem ka value ko ans ma assign karta ha  
                    }
                    longestWord(root.children[i], temp);
                    temp.deleteCharAt(temp.length()-1);//backtracking
                }
            }
        }

    public static void main(String args[]) { 
        String words[] = {"a", "bababa", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));//here we calculate the longestWord
        System.out.println(ans);
    }
}
