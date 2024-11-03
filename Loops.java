import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q: print numbers from 1 to 5
        // it takes too much time doing manually
        // so for saving time use LOOPS

        //for loops

        /*
        Syntax of for loops :

        for (initialization , condition , increment/decrement ) {
            // body
        }
         */
//        for (int num = 1 ; num <= 5 ; num+=1 ) {
//            System.out.println(num);
//        }

        //  Q: print number from 1 to 100
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 1 ; num <=n; num++) {
//            System.out.println("num");
//        }

        //print one piece is real 10 times
//        Scanner in  = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 1 ; num <= n ; num++) {
//            System.out.println("one piece is real");
//        }

        //while loop
        /*
         syntax:
             while() {
                 //body
                }
         */

        //  Q: print number from 1 to 10
//        int num = 1;
//        while (num <= 10) {
//            System.out.println(num);
//        num+= 1 ;
//        }

        // Q : print one piece is real 10 times
//        Scanner in = new Scanner(System.in);
//        int n = 1;
//        while(n <=10) {
//            System.out.println("one piece is real");
//            n+=1;
//        }

        /* we use while loop when we don't know how many times will the loop run,
        and we use for loop when we know the no. of times the loop is going to run
         */

        // do while loop

        /*
        syntax:
         do {
               // body
         } while (condition);

         */
        //print one piece is real 5 times
//        int n = 1 ;
//        do {
//            System.out.println("one piece is real");
//            n +=1;
//        } while ( n != 6);

        // print odd number from 3 to 20
//        int n = 3;
//        do {
//            System.out.println(n);
//            n+= 2;
//        } while (n <= 20 );

        /* differenece between while and do while is that in do while loop the output while will always
        minimum one type as condition comes at last
        */

        // and => (&&) , or => (||) , not equal to => (!=)

        // double condition in if loop

        // and condition

//             int A = 10;
//             int B = 30;
//             if (A==10 && B==30) {
//                 System.out.println("Onepiece is real");
//             } else {
//                 System.out.println("one piece");
//             }
        // or condition

//        int A = 10;
//        int B = 40;
//        if (A==10 || B==30) {
//            System.out.println("Onepiece is real");
//        } else {
//            System.out.println("one piece");
//        }

          // not equal to condition

//        int A = 220;
//        if (A != 10) {
//            System.out.println("Onepiece is real");
//        } else {
//            System.out.println("one piece");
//        }
    }
}
