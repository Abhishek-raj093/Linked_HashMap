import java.util.*;
  public class MultiplicationTable{
    public static void printMultiplicationTable(int num){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(n +" * "+ i +" =" + n*i);
        }
    }
    public static void main(Strings args[]) {
        printMultiplicationTable(5);//we can write any number insted of '5' because we need a actual parameter to pass here
    }
}