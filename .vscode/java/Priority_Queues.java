/*import java.util.PriorityQueue;
import java.util.*;

public class Priority_Queues {
    public static void main(String args[]) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>();//in this we remove in assending order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//Comparator.reverseOrder() this will sort the array in reverse order this is actualy a function which will reverse our order and comparator are the interface in java which will define the logic of comparison
        pq.add(3);//time taken in each add is O(logn) here n is that number which already exist in our priority queue
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());//bydefault peek and remove will apply on the highest priority element //TC O(1)
            pq.remove();//TC O(logn)
        }
    }
} */

//Now we write Code to store Obj in Priority Queue
import java.util.PriorityQueue;
import java.util.*;

public class Priority_Queues {
    static class Student implements Comparable<Student> {//here we implements Comparable to compare the Student class obj and in java Comparable interfase is inbuild and due this now student class can compare on the basis of any thing like name, rank
        String name;
        int rank;

        public Student(String name, int rank) {//This is a Constructor
            this.name = name;
            this.rank = rank;
        }

        @Override//this Overriding will help in if a fun is present in parent class and our child class also want to use that fun then we do this with the help of Overriding
        public int compareTo(Student s2) {
            return this.rank - s2.rank;//here we are comparing on the basis of rank
        }
    }
    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();//in this we remove in assending order
        //PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 4));//time taken in each add is O(logn) here n is that number which already exist in our priority queue
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);//bydefault peek and remove will apply on the highest priority element //TC O(1)
            pq.remove();//TC O(logn)
        }
    }
}
