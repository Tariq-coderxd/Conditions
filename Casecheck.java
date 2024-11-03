import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        char ch = in.next().trim().charAt(0);   // as for char nextChar dont exist we use string
//        in.next() use for taking word
//         .trim() remove space between word if any
//        charAt() gives character from index
//         0 = 1st letter , 1 = 2nd letter , 2 = 3rd letter and so on
//        System.out.println(ch);

        //  Q: check the letter is lower case or upper case
         char ch = in.next().trim().charAt(0);
         if(ch >= 'a' && ch <= 'z') {
             System.out.println("lowercase");
         } else {
             System.out.println("uppercase");
         }
    }
}
