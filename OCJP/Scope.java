public class Scope {
    // class and instance variables go here
    static int count;   // class 
    int x;              // instance
    
    public static void main(String[] args) {
        // local variables are method parameters and variables within methods

        count = 3; // works
        int a=1;
        
        a=2;
        
        { // this is the start of the block of code
            a=3;
            int b=0;
            b++;
            {
                b++;
                a++;
                int c = 0;
            }
            // c = 1; : Error cuz out of scope
            a = 3; // works 
        } // this is the end of the block of code
//        b++; // error out of scope 
        
        
    }
    
    public static void m1() {   // static
//    	a=4;
        count = 1; // works
        // x = 1; : Doesn't work cuz static methods can only use static variables
    }
    public void m2() {          // instance
//    	a=4;
        count = 3; // works
        x = 3; // work
    }
}
















