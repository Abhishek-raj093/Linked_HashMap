import java.util.*;

public class PrintSubarrays {
    //Print Subarrays
    
    public static void printSubarrays(int numbers[]){
        int ts = 0;//ts(Total Subarrays)
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){ //it will print only
                    System.out.print(numbers[k]+" "); //Subarray
                }
                ts++;
               System.out.println();
            }
            System.out.println();
        }
        System.out.println("Number of sub-arrays: "+ts);//total number of sub
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
