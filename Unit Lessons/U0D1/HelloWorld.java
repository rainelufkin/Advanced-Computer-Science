public class HelloWorld {
    // A class is a collection of related attributes and behaviors

    public static void main(String[] args) {
        // main -> an entry point for your computer to start running code
        System.out.println("Hello World");
        System.out.println("My name is Raine");

        System.out.println("My favorite pasta type is alfredo sauce");
        System.out.println("My favorite caffinated drink are vanilla lattes");

        // 8 primitive data types
        int number = 5; // integer
        char letter = 'a'; // character
        boolean isTrue = true; // true or false
        float decimal = 50.0f; // 32 bit decimal
        double bigdecimal = 0.6; // 64 bit decimal numbers

        // 'int' alternatives
        byte age = 25;
        short population = 3200;
        long biginteger = 10000;

        String myName = "Raine"; // String is a CLASS, not a primitive data tyoe
        // a collection of PRIMITIVE characters to describe text

        // print out the length of the string using the length() method
        System.out.println(myName.length());

        // conditional statements
        // if this happens then that happens
        // conditions are always BOOLEAN meaning true/false
        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        boolean isCompSciFun = true;

        if (isCompSciFun == false) {
            System.out.println("Comp Sci Sucks");
        } else if (isCompSciFun == true) {
            System.out.println("Comp Sci is fun!");
        }

        if (isCompSciFun) {
            System.out.println("Comp Sci is really fun!");
        } else {
            System.out.println("Comp Sci stresses me out.");
        }

        // Challenge: Write a conditional if else statement where you do something if you ate 5
        // apples vs. 10

        int appleCount = 5;
        if (appleCount == 5) {
            System.out.println("You ate 5 apples!");
        } else if (appleCount == 10) {
            System.out.println("Wow, you ate 10 apples!");
        } else {
            System.out.println("You ate some other number of apples.");
        }

    }
}
