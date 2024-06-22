import java.util.*;


public class Insert_in_heap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {//final TC of this code is O(logn)
            //add at last idx
            arr.add(data);

            int x = arr.size()-1;//x is child index
            int par = (x-1)/2;//par index

            while(arr.get(x) < arr.get(par)) {//O(logn) because in thiis while loop we are going towards the parent and maximum we can go jitna mara levels ha
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                //tese 2 line is added for delete
                x = par;
                par = (x-1)/2;
            }
        }

        public int peek() {//these 2 lines are for the Get min in heap
            return arr.get(0);
        }


        //from her the Delete of node code will start
        private void heapify(int i) {//heapify will fix our heap it will take that index for which he has ti=o fix the node
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {//heare we check the left subtree exist or not using left < arr.size()
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx !=i) {//if root is not min after inserting a new node then we fix it
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);//hum na ek node ko to fix kar diya par ho sakta ha ki iss ka wajah sa koi or nicha wali node kharab ho gayi ho to iss liya hum heapify ko call karanga
            }
        }

        //heere we rite the code to delete a heap we detete those node which we peek above i.e. index:0
        public int remove() {
            int data = arr.get(0);//yaha pa hum na wo data nikala ha jisha huma remove karna ha

            //step1 - swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));//yaha jo last idx pa value store hgi wo zero pa aa jaya gi
            arr.set(arr.size()-1, temp);//or ya pa last idx pa aa jaya gi 0th idx wali value

            //step2 - delete last
            arr.remove(arr.size()-1);

            //step3 - heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {//yaha hum check ka ranga ki kya hamara heap khali to nahi ha
            return arr.size() == 0;
        }

    }

    public static void main(String args[]) {
        //these line for delete for insertion there is no line here
        Heap pq = new Heap();//hum agar pq ka gagah pa h rakh ta phir bhi same ans aa ta
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
    
}
