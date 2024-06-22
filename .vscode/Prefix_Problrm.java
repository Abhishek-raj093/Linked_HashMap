public class Prefix_Problrm {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {//this is a constructor
            for(int i=0; i<children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();
    //this our insert function
    public static void insert(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    //Tc of this below fun is O(L) and here L means the lavels in my trie and it will be equal to longest word in my tries
    public static void findPrefix(Node root, String ans) {//findPrifix is a recursive fun
        if(root == null) {
            return;
        }

        if(root.freq == 1) {
            System.out.println(ans);
            return;
        }
        //ab hum har ek root pa jakar ya check karanga ki current ka jo child wala arry ha usma dakhanga ki kaha kaha pa mara koi bhi word ya koi bhi prefix start ho raha ha
        for(int i=0; i<root.children.length; i++) {
            if(root.children[i] != null) {
                findPrefix(root.children[i], ans+(char)(i+'a'));//here in next level our root will becomr root ka children and in ans we add in the mean time apna charecter i+a like if i is 0 then add a, if i is 1 then add b like this and like this we call findPrifix for the next level 
            }
        }
    }

    public static void main(String args[]) {
        String arr[]  = {"zebra", "dog", "duck", "dove"};
        for(int i=0; i<arr.length; i++) {//here we insert all iur string one by one
            insert(arr[i]);
        }

        root.freq = -1;//we inatilize freq by -1 or ya hum na iss liya kiya kyo ki mujha waha pa ruckna ha jahapa humari freq 1 hojatiha or bydefault roo ka freq1 hojaya ga ja usa create kiya tha tab
        findPrefix(root, "");//it will print prifix in alphabitical order becaue bydefault humra jo chid node ha wo alphabaticl order ma data ko store karta ha
    }
}