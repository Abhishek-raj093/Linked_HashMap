import java.util.*;

public class Nearby_cars {
    static class Point implements Comparable<Point> {//here we compare on the basis of point
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx) {//this is a constructor
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;//ascending order
        }
    }
    public static void main(String args[]) {
        int pts[] [] = {{3,3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++) {//here we store all the points one by one
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];//this is X^2 * Y^2
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));//here pts[i][0] this is x cordinate and pts[i][1] this is y cordinate
        }

        //nearest k cars
        for(int i=0; i<k; i++) {
            System.out.println("C"+ pq.remove().idx);//here we remove min element from priorty queue and the min will compre on the basis of distane ka square pa. we print .idx here
        }
    }
}
//thisis how we solve using priority Queue and sorting obj of class
