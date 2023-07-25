/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "TYPES CASTING" IN "JAVA" ◄◄


    ♦ "Types Casting" ("Data Types Casting")
        → is the "Process" 
        → of "Converting" a "Value"
        → from "One Data Type"
        → to "Another".



   ♦ Java Supports "2 Types" of "Type Casting":

        (1) "Implicit" Type Casting
                → which is the "Automatic Type Casting"
                → and it "Happens" when the "Conversion"
                → is "Safe"
                → and does not "Result" in "Any Data Loss".


        (2) "Explicit" Type Casting
                → which is the "Manual Type Casting"

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.lib;


import jdk.internal.org.jline.terminal.Size;

public class TypeCasting {

    // ►► The "main()" Method → is the "Entry Point" for the "Program"
    public static void main(String[] args){

        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (1) "Implicit" Type Casting ("Automatic")

        // ▼ "Int" Variable
        int numInt = 10;


        // ▼ "Casting" the "Int" → into a "Double":
        //    ► The "Value" of "numInt" → Become Implicit "10.0"
        //    ► and the "Conversion" is "Automatic".
        double numDouble = numInt;





        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (2) "Explicit" Type Casting ("Manual")

        // ▼ "Double" Variable
        double pi = 3.14;


        // ▼ The "Explicit Conversion" of "Double" into an "Int"
        //      → by Adding the "(int)" Data Type
        //      → "Before" the "Variable Name":
        int numPi = (int) pi;   // ► Only the Value "3" will be "Stored"




        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ♦♦ "Type Casting" Between "Different Data Types"  ♦♦


        // ▼ "Int" Variable
        int myInt = 5;


        // ▼ "Adding" a "Number" to a "Character":
        //   ► In "ASCII" the "Value" of the "A" Character is "65"
        //   ► "Explicit Conversion" of "Int" into an "Char"
        char myChar = (char) (myInt + 'A');  // ► The Result will be "F" (65 + 5 = "70")

        // ► "Display" in the "Terminal":
        System.out.print(myChar);
    }
}
