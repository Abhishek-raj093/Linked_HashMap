//In a program, input 3 numbers : A, B and C. You have to output the average of
//these 3 numbers.
// import java.util.*;

// public class javabasics {
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int average = (a + b + c) /3;
//         System.out.println("average is " + average);
//     }
// }

/*Question 2: In a program, input the side of a square. You have to output the area of the
square*/

// import java.util.*;

// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int side = sc.nextInt();

//         int area = side * side;
//         System.out.println("ares of square is " + area);
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 10;
        //System.out.println(a == b);
        //System.out.println(a != b);
        //System.out.println(a > b);
        //System.out.println(a < b);
        //System.out.println(a >= b);
        //System.out.println(a <= b);
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println((2>1) && (3>2));
//         System.out.println((3>2) && (3>5));
//         System.out.println((3>4) && (4>2));
//         System.out.println((4>5) && (5>6));
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println((2>1) || (3>2));
//         System.out.println((3>2) || (3>5));
//         System.out.println((3>4) || (4>2));
//         System.out.println((4>5) || (5>6));
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println((2>1) &&! (3>2));
//         System.out.println((3>2) &&! (3>5));
//         System.out.println(!(3>4) && (4>2));
//         System.out.println(!(4>5) &&! (5>6));
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println(!(2>1));
//         System.out.println(!(3>2));
//         System.out.println(!(3>4));
//         System.out.println(!(4>5));
//     }
// }
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int A = 10;
//         //A = A + 10;
//          A += 10;
//         System.out.println(A);
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int B = 10;
//         //B = B - 10;
//          B -= 10;
//         System.out.println(B);
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int C = 10;
//         //C = C * 10;
//          C *= 10;
//         System.out.println(C);
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         int D = 10;
//         //D = D / 10;
//          D /= 10;
//         System.out.println(D);
//     }
// }

// public class javabasics {
//     public static void main(String[] args){
//         int x = 9, y = 12;
//         int a = 2, b = 4, c = 6;
//         int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
//         System.out.println(exp);
//     }
// }

// public class javabasics {
//     public static void main(String[] args){
//         int x = 10, y = 5;
//         int exp1 = (y * (x / y + x / y));
//         int exp2 = (y * x / y + y * x / y);
//         System.out.println(exp1);System.out.println(exp2);
//     }
// }


//Conditional Statement
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age >= 18){
//             System.out.println("Adult");
//              System.out.println("Drive");
//         }
            // if(age > 13 && age < 18) {
            //     System.out.println("Teenager");
            // }

//         else{
//             System.out.println("Child");
//         }
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//         int A = 1;
//         int B = 3;
//         if(A > B) {
//             System.out.println("A");
//         } 
//         else{
//             System.out.println("B");
//         }   
//  }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         if(A >= B) {
//             System.out.println("A is Largest of 2");
//         } 
//         else{
//             System.out.println("B is Largest of 2");
//         }   
//  }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if(number % 2 == 0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age >= 18){
//             System.out.println("Adult");
//         }
//         else if(age > 13 && age < 18) {
//             System.out.println("Teenager");
//         }
//         else {
//             System.out.println("Baby");
//         }
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;

//         if(income < 500000){
//            tax =0;
//         }
//         else if(income >= 500000 && income < 1000000) {
//             tax = (int) (income*0.2);
//         }
//         else {
//             tax=(int) (income*0.3);
//         }
//         System.out.println("your tax is :" + tax);
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();

//         if((A >= B) && (A >= C)){
//            System.out.println("A is the Largest of 3");
//         }
//         else if(B >= C) {
//         System.out.println("B is the Largest of 3");
//         }
//         else {
//            System.out.println("C is the Largest of 3");
//         }
//     }
// }

// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         int number = 5;

//         //Ternary operator
//         String type = ((number%2)==0)? "Even" : "Odd";
//         System.out.println(type);
//     }
// }

// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int marks = sc.nextInt();

//         //Ternary operator
//         String RC = (marks>=33)? "PASS" : "FAIL";
//         System.out.println(RC);
//     }
// }

// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         switch(number) {
//             case 1 : System.out.println("Samosa");
//                     break;
//             case 2 : System.out.println("Burger");
//                     break;
//             case 3 : System.out.println("Mango Shake");
//                      break;
//             default: System.out.println("Wake up to the Reality"); 
//         }
//     }
// }

// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a :");
//         int a = sc.nextInt();

//         System.out.println("Enter b :");
//         int b = sc.nextInt();
//          System.out.println("Enter Operator :");
//         char operator = sc.next().charAt(0);
        

//         switch(operator) {
//             case '+' : System.out.println(a+b);
//                     break;
//             case '-' : System.out.println(a-b);
//                     break;
//             case '*' : System.out.println(a*b);
//                      break;
//             case '/' : System.out.println(a/b);
//                      break;
//             case '%' : System.out.println(a%b);
//                      break;         
//             default: System.out.println("My Calculator is not Advanced "); 
//         }
//     }
// }

/*Write a Java program to get a number from the user and print whether it is
positive or negative*/
// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if(number >= 0){
//             System.out.println("Positive");
//         }
//         else{
//             System.out.println("Negative");
//         }
//     }
// }

// import java.util.*;
// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         //double temp = 103.5;
//         double temp = sc.nextInt();

//         if(temp >= 100){
//             System.out.println("You have a fever");
//         }
//         else{
//             System.out.println("You don't have a fever");
//         }
//     }
// }

/*Write a Java program to input week number(1-7) and print day of week name
using switch case.*/
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int Week = sc.nextInt();

//         switch(Week) {
//             case 1 : System.out.println("Sunday");
//                     break;
//             case 2 : System.out.println("Monday");
//                     break;
//             case 3 : System.out.println("Tuesday");
//                      break;
//             case 4 : System.out.println("Wensday");
//                      break;
//              case 5 : System.out.println("Thursday");
//                      break;
//             case 6 : System.out.println("Friday");
//                      break;
//             case 7 : System.out.println("Saturday");
//                      break;
//             default: System.out.println("Wake up to the Reality"); 
//         }
//     }
// }

/*Write a Java program that takes a year from the user and print whether that
year is a leap year or not.*/
// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input the year: ");
//         int year = sc.nextInt();
//         boolean x= (year % 4) ==0;
//         boolean y= (year % 100) !=0;
//         boolean z= ((year %100 == 0) && (year %400 == 0));
//         if(x&& (y||z)) {
//                 System.out.println(year+" is a leap year");
//         }
//         else{System.out.println(year+" is not a leapyear");
//       }
//     }
//    }


// import java.util.*;
// public class javabasics{
//      public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i = 0 ;
//         for (i= 0; i<n; i++) {
//                 System.out.println("Hello Hababi");
//         }
//      }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int counter = 0;

//                 while(counter < 100) {
//                         System.out.println("jai ho");
//                         counter ++ ;
//                 }
//               System.out.println("printed JH 100times");  
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int number = 1;

//                 while(number <= 10) {
//                         System.out.println(number);
//                         number ++ ;
//                 }  
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 int number = 1;

//                 while(number <= n) {
//                         System.out.println(number);
//                         number ++ ;
//                 }  
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 int number = 1;
//                 int sum  = 0;
//                 while(number <= n) {
//                         sum = sum + number;//sum += number;
//                         number ++ ;
//                 }  
//                 System.out.println(sum);
//         }
// }

// import  java.util.*;
// public class javabasics{
//         public static void main (String args[]) {
//                 int line = 1;
//                 // for (line = 1; line <= 4; line++){
//                 //         System.out.println("****");
//                 // }

//                 while(line <= 4){
//                         System.out.println("****");
//                         line++
//                 }
//         }
// }

// import  java.util.*;
// public class javabasics{
//         public static void main (String args[]) {
//            int n = 10899;

//            while(n > 0) {
//                 int lastDigit = n % 10;
//                 System.out.print(lastDigit);
//                 n = n/10; //n/=10;
//            }
//            System.out.println();
//         }
// }

// import  java.util.*;
// public class javabasics{
//         public static void main (String args[]) {
//         //int n = 1233 % 10;// it will remove the last digit
//         int n = 1233 / 10;//it will print only remainder
//         System.out.print(n);
//                }
// }

// import  java.util.*;
// public class javabasics{
//         public static void main (String args[]) {
//            int n = 10899;
//            int rev = 0;

//            while(n > 0) {
//                 int lastDigit = n % 10;
//                 rev = (rev * 10) + lastDigit;
//                 n = n/10; //n/=10;
//            }
//            System.out.println(rev);
//         }
// }
 
// import java.util.*;
// public class javabasics{
//         public static void main (String[]args) {
//                 int n = 1;
//                 do{
//                         System.out.println("Hello baby");
//                         n++;
//                 }while (n <= 10);
//                 }
//         }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 for(int i = 1; i <= 5; i++){
//                         if (i == 3) {
//                                 break;
//                         }
//                         System.out.println(i);
//                 }
//                 System.out.println(" i am out of the loop");
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);

//                 do {
//                         System.out.print("Enter your number :");
//                         int n = sc.nextInt();

//                         if (n % 10 == 0) {
//                                 break;
//                         }
//                         System.out.println(n);
//                 }while(true);
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int n = 10;
//                 for(int i = 0; i < n; i++){
//                         if(i == 3){
//                                 continue;
//                         }
//                         System.out.println(i);
//                 }
//         }
// }


// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);

//                 do {
//                         System.out.print("Enter your number :");
//                         int n = sc.nextInt();

//                         if (n % 10 == 0) {
//                                 continue;
//                         }
//                         System.out.println("your number was :" + n);
//                 }while(true);
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 for(int line = 1; line <= 4; line++){
//                  //one line
//                 for(int star = 1; star <= line; star++){
//                      System.out.print("*");   
//                 }
//                 System.out.println("");//used for next line
//              }
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 for(int line = 1; line <=4 ; line++){
//                  //one line
//                 for(int star = 4; star >= line; star--){
//                      System.out.print("*");   
//                 }
//                 System.out.println("");//used for next line
//              }
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 int n = 4;
//                 for(int i = 1; i <= n; i++){
//                  //one line
//                 for(int star = 1; star <=(n-i+1); star++){
//                      System.out.print("*");   
//                 }
//                 System.out.println("");//used for next line
//              }
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 for(int line = 1; line <= 4; line++){
//                  //numbers print
//                 for(int number = 1; number <= line; number++){
//                      System.out.print(number);
//                 }
//                 System.out.println("");//used for next line
//              }
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void main(String args[]){
//                 int n = 4;
//                 char ch = 'A';//use for initialization
//                 for(int line = 1; line <= n; line++){
//                  //numbers print
//                 for(int chars = 1; chars <= line; chars++){
//                      System.out.print(ch);
//                     ch++;   
//                 }
//                 System.out.println("");//used for next line
//              }
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void printHelloWorld() {
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//                 //return3;
//         }
//         public static void main(String args[]){
//                 //body of a function
//                 printHelloWorld();//we are calling the function to perform their task(Here printHelloWorld()is the name of that function)
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static void printHelloWorld() {
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//                 //return3;
//         }

//         public static int calculatesum(int a, int b) {//here int a, int b are the parameters or formal parameters
//                 int sum = a + b;
//                 return sum;
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();
//                 int sum = calculatesum(a,b);//if we not write a,b then it can't call that function because in above the function calculatesum wants two int a,b it is also called as arguments or actual parameters 
//                 System.out.println("The Sum is: " +sum );              
//                //printHelloWorld();
//         }
// }//in this cose we  create a class javabasics and created two functions in that class name(1).name void printHelloWorld or (2)int Claculatesum
//int sum= a+b or int sum = calculatesum both are different sum variable because both are written in different function we will study about this in Scopes

//What happens in Memory?
/*Afunction store or use memory in the form of callstack
main function is storing the all variables of a function
when we come back from return to sum the memory of sum will be free or after it will go to main and the memory of main function will be clean 
 */

 //Call by value                 Call by Referance
 /*java always calls by value */

// import java.util.*;
// public class javabasics{
//         public static void printHelloWorld() {
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//                 //return3;
//         }

//         public static int calculatesum(int a, int b) {//here int a, int b are the parameters or formal parameters
//                 int sum = a + b;
//                 return sum;
//         }

//         public static void swap(int a, int b){
//                //Swap
//                int temp = a;
//                a = b;
//                b = temp;
               
//                System.out.println("a = " + a);
//                System.out.println("b = " + b);
//         }
//         public static void main(String args[]){
//                //Swap - valuees exchange
//                int a = 5;
//                int b = 10;
//                swap(a,b);
//               //System.out.println("a = " + a);//it will print the original value of a because the swap can't swap value out side of the function its function is above for Swaping

//         //        //Swap
//         //        int temp = a;
//         //        a = b;
//         //        b = temp;
               
//         //        System.out.println("a = " + a);
//         //        System.out.println("b = " + b);
//         }
// }

// import java.util.*;
// public class javabasics{
//         public static int multiply(int a, int b){
//                 int product = a * b;
//                 return product;
//         }
//         public static void main(String args[]){
//                 int a = 3;
//                 int b = 5;
//                 int prod = multiply(a,b);
//                 System.out.println("a * b = " +prod);
//                 prod = multiply(10, 20);
//                 System.out.println("a * b = " +prod);
//         }

// }

// import java.util.*;
// public class javabasics{
//         public static int factorial(int n){
//                 int f = 1;

//                 for(int i =1; i<=n; i++){
//                         f = f * i;
//                 }
//              return f; // factorial of n  
//         }
//         public static void main(String args[]){
//              System.out.println(factorial(4));//here we are calling the value directly
               
//         }

// }

// import java.util.*;
// public class javabasics{
//         public static int factorial(int n){
//                 int f = 1;

//                 for(int i =1; i<=n; i++){
//                         f = f * i;
//                 }
//              return f; // factorial of n  
//         }
//         public static int binCoeff(int n, int r){
//               int fact_n = factorial(n);
//               int fact_r = factorial(r);
//               int fact_nmr = factorial(n-r);
              
//               int binCoeff = fact_n / (fact_r * fact_nmr);
//               return binCoeff; 
//         }
//         public static void main(String args[]){
//              System.out.println(binCoeff(5, 2));//here we are calling the value directly
               
//         }

// }

// import java.util.*;
// public class javabasics{

//         //function to calc sum of 2 nums
//         public static int sum(int a, int b){
//                 return a + b; 
//         }

//         //function to calculate sum of 3 nums
//         public static int sum(int a, int b, int c){
//                 return a + b + c; 
//         }
//         public static void main(String args[]){
//              System.out.println(sum(3, 5));//here we are calling the value directly
//              System.out.println(sum(5, 2, 1));  
//         }

// }

// import java.util.*;
// public class javabasics{

//         //function to calc int sum  
//         public static int sum(int a, int b){
//                 return a + b; 
//         }

//         //function to calculate float sum 
//         public static float sum(float a, float b){
//                 return a + b; 
//         }
//         public static void main(String args[]){
//              System.out.println(sum(3, 5));
//              System.out.println(sum(3.2f, 5.6f));  
//         }

// }

// import java.util.*;
// public class javabasics{

//         //only for n>=2
//         public static boolean isPrime(int n){

//                 //Corner Cases
//                 //2
//                 if(n == 2){
//                         return true;
//                 }

//                //boolean isPrime = true;
//                for(int i=2; i<=n-1; i++){
//                 if(n % i == 0) {//Completely dividing
//                        // isPrime = false;
//                        // break;
//                        return false;
//                 }
//                }
//                //return isPrime;
//                return true;

//         }

//         public static void main(String args[]){
//                System.out.println(isPrime(2));
//         }

// }

// import java.util.*;
// public class javabasics{

//         //only for n>=2
//         public static boolean isPrime(int n){
//                 if(n == 2) {
//                         return true;
//                 }
//                 for(int i = 2; i<=Math.sqrt(n); i++) {
//                         if(n % i == 0){
//                         return false;
//                         }
//                 }

//                 return true;
//         }

//         public static void main(String args[]){
//                System.out.println(isPrime(7));
//         }

// }


//To print all the prime numbers between 2 to n
// import java.util.*;
// public class javabasics{

//         public static boolean isPrime(int n){
//                 if(n == 2) {
//                         return true;
//                 }
//                 for(int i = 2; i<=Math.sqrt(n); i++) {
//                         if(n % i == 0){
//                         return false;
//                         }
//                 }

//                 return true;
//         }

//         public static void primesInRange(int n){
//                 for(int i = 2; i<=n; i++) {
//                         if(isPrime(i)) {//True
//                                 System.out.print(i+" ");
//                         }
//                 }
//                 System.out.println();
//         }

//         public static void main(String args[]){
//                primesInRange(16);//2 to 16
//         }

// }

//Program to Convert Binary Number into Decimal Number
// import java.util.*;
// public class javabasics{

//         public static void binToDec(int binNum) {
//                 int myNumber = binNum;
//                 int pow = 0;
//                 int decNum = 0;

//                 while(binNum > 0) {
//                         int lastDigit = binNum % 10;//the reminder will be the last digit
//                         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//                         pow++;
//                         binNum = binNum/10;//It will make our binary number Small
//                 }

//                 System.out.println("decimal of " + myNumber+ " = " + decNum);
//         }

//         public static void main(String args[]){
//                binToDec(101);
//         }

// }

// import java.util.*;
// public class javabasics{

//         public static void DecToBin(int n) {
//                 int myNum = n;
//                 int pow = 0;
//                 int binNum = 0;

//                 while(n > 0) {
//                         int rem = n % 2;
//                         binNum = binNum + (rem * (int)Math.pow(10, pow));

//                         pow++;
//                         n = n/2;
//                 }

//                 System.out.println("binary form of " + myNum + " = "+binNum);

//         }
//         public static void main(Strings args[]){
//               DecToBin(7);
//         }

// }
