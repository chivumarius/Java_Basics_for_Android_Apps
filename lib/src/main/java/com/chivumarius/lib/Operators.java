/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "OPERATORS" IN "JAVA" ◄◄


    ♦ "Operators"
        → are Used to "Perform Operations"
        → on "Variables" and "Values".


    ♦ "Types" of "Operators":

        (I)   "Arithmetic" Operators (+, -, *, /, %, ++, --)


        (II)  "Assignment" Operators (=, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=)


        (III) "Comparison" Operators (==, !=, >, <, >=, <=)


        (IV)  "Logical" Operators (&&, ||, !)
                → Check "If Two Things"
                → are "True" in the "Same Time".


        (V)   "Bitwise" Operators (OR, |, AND, &, XOR, ^, ~)


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.lib;


import jdk.internal.org.jline.terminal.Size;

public class Operators {

    // ►► The "main()" Method → is the "Entry Point" for the "Program"
    public static void main(String[] args) {

        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (I)   "Arithmetic" Operators (+, -, *, /, %, ++, --)
        System.out.println("________________________");


        // (1) "Addition" ("+"):
        System.out.println("Addition: " + (1 + 2));


        // (2) "Subtraction" ("-"):
        System.out.println("Subtraction: " + (30 - 6));


        // (3) "Multiplication" ("*"):
        System.out.println("Multiplication: " + (5 * 3));


        // (4) "Division" ("/"):
        System.out.println("Division: " + (9 / 3));


        // (5) "Modulus" ("%"):
        //     ► Gives us the "Remaining Divisions"
        System.out.println("Modulus: " + (15 % 2));






        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (III) "Comparison" Operators (==, !=, >, <, >=, <=)
        System.out.println("________________________");

        int x = 10;


        // (1) "Equal To" ("==")
        //      → the "Comparison" between
        //      → the Value of "x"
        //      → and the Number "9"
        System.out.println("Equal To: " + (x == 8));  // ► The result is "false"
        System.out.println("Equal To: " + (x == 10));  // ► The result is "true"



        // (2) "Not Equal" ("!=")
        System.out.println("Not Equal: " + (x != 10));  // ► The result is "false"
        System.out.println("Not Equal: " + (x != 25));  // ► The result is "true"


        // (3) "Greater Than" (">")
        System.out.println("Greater Than: " + (10 > 45));  // ► The result is "false"


        // (4) "Less Than" ("<")
        System.out.println("Less Than: " + (10 < 30));  // ► The result is "true"


        // (5) "Greater Than or Equal To" (">=")
        System.out.println("Greater Than or Equal To: " + (10 >= 30));  // ► The result is "false"
        System.out.println("Greater Than or Equal To: " + (30 >= 30));  // ► The result is "true"


        // (6) "Less Than" ("<=")
        System.out.println("Less Than or Equal To: " + (10 <= 30));  // ► The result is "true"
        System.out.println("Less Than or Equal To: " + (310 <= 30));  // ► The result is "false"




        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (IV)  "Logical" Operators (&&, ||, !)
        System.out.println("________________________");

        // ► "Boolean" Variables:
        boolean isSunny = true;
        boolean needUmbrella = false;



        // (1) "And" ("&&")
        System.out.println("Go Outside: " + (isSunny && !needUmbrella));  // ► Display "true"
        System.out.println("Go Outside: " + (isSunny && needUmbrella));  // ► Display "false"
        System.out.println("Go Outside: " + (!isSunny && needUmbrella));  // ► Display "false"




        // (2) "Or" ("||")


        // (3) "Not" ("!")



        System.out.println("________________________");
    }

}