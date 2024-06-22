public class Starts_With_problem {
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

    public static boolean startsWith(String prifix) {//O(L) for this whole fun
        Node curr = root;

        for(int i=0; i<prifix.length(); i++) {
            int idx = prifix.charAt(i) - 'a';//it will give the idx of the given char
            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];//here we update the value of curr
        }

        return true;
    }

public static void main(String args[]) {
    String words[] = {"apple", "app", "mango", "man", "women"};
    String prifix1 = "app";
    String prifix2 = "moon";

    for(int i=0; i<words.length; i++) {//here we insert the words in tries
        insert(words[i]);
    }

    System.out.println(startsWith(prifix1));//for this ans will be true
    System.out.println(startsWith(prifix2));//for this ans will be false
 }
}
