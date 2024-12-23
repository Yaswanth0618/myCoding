// .nextInt = returns the next token as an integer
// .nextLine = String
// .nextLong90 = Long
// .nextFloat = float
// .... for other data types
// .next() = just reads a word from the user

// import java.util.*
// For example, * imports everything from the util

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        // int 1big = 0; : ILLEGAL
        // int :big = 0; : ILLEGAL
        // int -big = 0; : ILLEGAL
        // int .big = 0; : ILLEGAL
        // int big# = 0; : ILLEGAL
        int $big = 0; // works
        int _big = 0;  // works
        int big = 0; //works
        


        // java is hella case sensitive, int foo and int Foo are different!

        Scanner sc = new Scanner(System.in); // keyboard
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("You entered "+n);

        System.out.print("Enter a name: ");
        String name = sc.next();
        System.out.println("You entered "+name);
        
        // an example of gaining access of other packages ----
        List<String> names = new ArrayList<>();


    }
}