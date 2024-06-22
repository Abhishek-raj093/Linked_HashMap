import java.util.*;

public class Union_And_Intersection_of_2_arrays_UsingSet {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();

        //union
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("union = " + set.size());

        //Intersection
        set.clear();//here we cleare the above set because we already counted the union now we do't need that set
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i=0; i<arr2.length; i++) {
            if(set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);//here we remove ele from set so that ki wo dubara kisi orr num sa interset na ksr jaa ya 
            }
        }

        System.out.println("Intersection = " + count);
    }
}
//we can print the element of union and Intersection as well and this is for HomeWork