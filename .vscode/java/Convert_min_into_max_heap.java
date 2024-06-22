import java.util.*;

public class Convert_min_into_max_heap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            //add at last idx
            arr.add(data);

            int x = arr.size()-1;//x is child index
            int par = (x-1)/2;//par index

            while(arr.get(x) > arr.get(par)) {//we convert < into > this for max heap
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                //tese 2 line is added for delete
                x = par;
                par = (x-1)/2;
            }
        }

        public int peek() {
            return arr.get(0);
        }


        //from her the Delete of node code will start
        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int maxIdx = i;

            if(left < arr.size() && arr.get(maxIdx) > arr.get(left)) {//we conver arr.get(minIdx) > arr.get(left) this condition in arr.get(minIdx) < arr.get(left) in his for max heap
                maxIdx = left;
            }

            if(right < arr.size() && arr.get(maxIdx) < arr.get(right)) {//here also change the condition like same as we do above in left
                maxIdx = right;
            }

            if(maxIdx !=i) {//if root is not min after inserting a new node then we fix it
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(maxIdx));
                arr.set(maxIdx, temp);

                heapify(maxIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

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

        public boolean isEmpty() {
            return arr.size() == 0;
        }

    }

    public static void main(String args[]) {
        
        Heap pq = new Heap();
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

