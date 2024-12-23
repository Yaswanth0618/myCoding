// Static varibles can be used in static methods and instance methods.
// Static methods can only use static variables
// Instance methods can use both instance variables and static variables

public class ClassStructure {
    // class and instance variables go here
    static int count;   // class 
    int x;              // instance

    static {}   // static block
    {}          // instance block
    
 //   ClassStructure(){} // constructor
    
    public static void main(String[] args) {
        int a = 0;
        // System.out.println(x); : Error
        System.out.println(count); // works

    }
    
    public static void m1() {   // static
        count = 0;
    }

    public void m2() {         // instance
        x = 0;
    }
}