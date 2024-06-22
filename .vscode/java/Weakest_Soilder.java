import java.util.*;

public class Weakest_Soilder {
    static class Row implements Comparable<Row> {
        int soilders;
        int idx;

        public Row(int soilders, int idx) {//this is a constructor
            this.soilders = soilders;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if(this.soilders == r2.soilders) {
                return this.idx - r2.idx;//here if the num of soilder is equal then we compare on the basis of idx
            } else {
                return this.soilders - r2.soilders;//here we compre on the basis of num of soilders
            }
        }
    }

    public static void main(String args[]) {
        int army[][] = {{1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0}};
        int k=2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i=0; i<army.length; i++) {
            int count = 0;
            for(int j=0; j<army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;//here we we add 1 if the soilder value is 1 else we add 0 . hum yaha pa cahaya to if loop ka bhi use kar sakta ha par abhi hum na ternary operator ko use kiya h
            }
            pq.add(new Row(count, i));//bydefault it will print in ascending order
        }

        for(int i=0; i<k; i++) {
            System.out.println("R"+pq.remove().idx);
        }
    }
}
