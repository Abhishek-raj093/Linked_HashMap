import java.util.*;

public class LinearSearch {
    public static int Linear_search(int numbers[], int key){

        for(int i=0; i<numbers.length; i++){
            if (numbers[i] == key){
                return i;
        }
    }

    return -1;
}

    public static void main(Stringvv args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        //String menu[] = {"dosa","chola bhature","Samosa"..}
        int key = 10;

        int index = Linear_search(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
        System.out.println("Key is at index : " +index);
    }
    
  }
}
