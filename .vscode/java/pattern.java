import java.util.*;

public class pattern {
    public static void main(Strings[] args) {
    // (1.)    int n = 4;
    //     int m = 5;

    //     //Outer loop
    //     for(int i=1; i<n; i++){
    //     //Inner loop
    //     for (int j=1; j<m; j++){
    //     System.out.print("*"+ " ");
    // }
    //     System.out.println();
    // }


// (2.)    int n = 4;
//     int m = 5;

//     //Outer loop
//     for (int i = 1; i<=n; i++){
//     //inner loop
//     for(int j = 1; j<=m; j++){
//     if(i == 1 || j == 1 || i == n || j == m ) { // || -> it means or 
//         System.out.print("*");
//     }else {
//         System.out.print(" ");
//     }
// }
//     System.out.println();
// }

        // (7.)  int n = 5;

        // //Outer loop
        // for(int i=1; i<=n; i++) {
        //     //inner loop 
        //     for(int j=1; j<n-i+1; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //(3.) int n = 4;
        // //Outer loop
        // for(int i = 1; i<=n; i++) {
        //     //Inner loop
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*"+" ");
        //     }
        //         System.out.println();
        // }

        //(4.) int n = 4;
        // //Outer loop
        // for(int i = n; i>=1; i--) {
        //     //Inner loop
        //     for (int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //(5.) int n = 4;
        // //Outer loop
        // for(int i=n; i>=1; i--) {
        //     //Inner loop
        //     for(int j=1; j<i; j++) {
        //         System.out.print(" ");
        //     }

        //     for(int j=0; j<=n-i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //(6.)     int n = 5;
        //    // Outer loop
        //     for(int i=1; i<=n; i++) {
        //         //inner loop 
        //         for(int j=1; j<=i; j++) {
        //             System.out.print(j);
        //         }
        //         System.out.println();
        //     }

        //(8.) int n = 5;            
        // int number = 1;
        // //Outer loop
        // for(int i =1; i<=n; i++) {
        //     //Inner loop
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // (9.) int n=5;
        //  //Outer loop
        //  for(int i=1; i<=n; i++) {
        //     //Inner loop
        // for(int j=1; j<=i;j++){
        //     int sum = i+j;
        //     if(sum %2==0){
        //         System.out.print("1 ");
        //     }else {
        //         System.out.print("0 ");
        //     }
        // }
        // System.out.println();
        //  }



        //(10.) int n = 5;

        // //Outer loop
        // for(int i=1; i<=n; i++){
        //     //1st Part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     //Spaces
        //     int spaces = 2 * (n-i);
        //     for (int j=1; j<=spaces; j++) {
        //         System.out.print(" ");
        //     }

        //     //2nd part
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //  //Outer loop
        //  for(int i=n; i>=1; i--){
        //     //1st Part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     //Spaces
        //     int spaces = 2 * (n-i);
        //     for (int j=1; j<=spaces; j++) {
        //         System.out.print(" ");
        //     }

        //     //2nd part
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



    //(11.)    int n=5;
    //    //Outer loop
    // for(int i=1; i<=n; i++){
    //     //Spaces
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     //Stars
    //     for(int j=1; j<=5; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // } 

    //(12.) int n=5;
    // for(int i=1; i<=n; i++){
    //     //Spaces
    //     for(int j=1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     //number - >print row no, row no times
    //     for(int j=1; j<=i; j++) {
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // }

    //(13.) int n = 5;
    // for (int i=1; i<=n; i++){
    //     //Spaces
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }

    //     //1st half
    //     for(int j=i; j>=1; j--) {
    //         System.out.print(j );
    //     }

    //     //2nd half
    //     for(int j=2; j<=i; j++) {
    //         System.out.print(j );
    //     }
    //     System.out.println();
    // }
     
    //(14.) int n=4;
    // for(int i=1; i<=n; i++) {
    //     //Spaces
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     //1st half
    //     for(int j=1; j<=2*i-1; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // for(int i=n; i>=1; i--) {
    //     //Spaces
    //     for(int j=1; j<=n-i; j++) {
    //         System.out.print(" ");
    //     }
    //     //1st half
    //     for(int j=1; j<=2*i-1; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    
    }
}