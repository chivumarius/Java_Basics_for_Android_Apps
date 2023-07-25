/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "DATA TYPES" IN "JAVA" ◄◄


    ♦ "Data Types"
        → are Used to "Define"
        → the "Type" of "Data"
        → that a "Variable" can "Hold".



    ♦ "Data Types" in "Java":

        (I) "Primitive" ("Basic")
                → represent "Simple Values".

            1. Int
                1.1 Byte    <1 byte>  (-128 to 127)
                1.2 Short   <2 byte>  (-32,768 to 32,767)
                1.3 Int     <4 byte>  (-2,147,483,648 to 2,147,483,647)
                1.4 Long    <8 byte>  (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)


            2. Float
                2.1 Float   <4 bytes>
                2.2 Double  <8 bytes>

            3. Char         <2 bytes>  (between: 0-255)

            4. Boolean      <1 bit>  (true, false)





        (II) "Non Primitive" or "Reference"
                → are "Used" to "Refer" to "Objects".


            1. String
                → are Used to "Store"
                → a "Sequence" of "Characters" ("Text").

                → They ar "Objects"
                → from "java.lang.String" Class.


            2.1 Array
                → are Used to "Store Multiple Values"
                → in a "Single Variable".

                → they are "Containers"
                → that "Hold" a "Fixed Number" of "Elements"
                → and "Each Element" of the "Array"
                → can be "Accessed"
                → using an "Index".



                ♦ "SYNTAX":
                  ---------------------------------------------------------------
                        dataType[] arrayName = new dataType[arraySize];
                  ---------------------------------------------------------------



                ♦ The "Index"
                    → represents the "Position"
                    → of the an "Element"
                     → in an "Array"

                     → and the "1st Position"
                     → "Starts" from "0".




            2.2 Multi-Dimensional Arrays
                → is an "Array" of "Arrays".

                • Are "Useful" when you want to "Store Data"
                    → as a "Tabular Form",
                    → like a "Table"
                    → with "Rows" and "Columns".


                • To "Create" a "Two-Dimensional Array",
                    → "Add" Each "Array"
                    → within its Own "Set" of "Curly Braces".



                ♦ "SYNTAX" → "2D Arrays":
                  -------------------------------------------------------------------------------------------------
                        arrayDataType[][] arrayName = new arrayDataType[arrayRowsNumber] [arrayColumnsNumber];
                  -------------------------------------------------------------------------------------------------


            3. Class
                → are "User-Defined Reference" Data Types
                → which "Allow" the "Creation" of "Objects"
                → with their Own "Properties" and "Members" ("Methods").

            4. etc.




    ♦ The "+" Sign
        → is the "Concatenation" ("Union") Operator
        → that Allows "Strings"
        → to be "Concatenated".



    ♦ The "new" Keyword
        →  creates anew Array, Objects.

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.lib;


import jdk.internal.org.jline.terminal.Size;

public class DataTypes {

    // ►► The "main()" Method → is the "Entry Point" for the "Program"
    public static void main(String[] args){

        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ►►  (I) "PRIMITIVE" DATA TYPES   ◄◄
        System.out.println("________________________");

        // (1) "Byte" (-128 to 127)
        byte x = 127;
        //byte x2 = 128;    // ► We Get "Error"
        System.out.println("Byte: " + x);


        // (2) "Short"  (-32,768 to 32,767)
        short y = 32767;
        //short y2 = 32768;  // ► We Get "Error"
        System.out.println("Short: " + y);


        // (3) "Int" (-2,147,483,648 to 2,147,483,647)
       int z =  2147483647;
       //int z2 =  2147483648; // ► We Get "Error"
       System.out.println("Int: " + z);


        // (4) "Long" (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long w =  9223372036854775807L;
        //long w2 =  9223372036854775808L; // ► We Get "Error"
        System.out.println("Long: " + w);


        // (5) "Float"  ("4 bytes")
        float pi = 3.14F;
        //float pi2 = 3.14;   // ► Without Adding the Letter "f"/F" → We Get "Error"
        System.out.println("Float: " + pi);


        // (6) "Double"  ("8 bytes")
        double pi3 = 3.14159;
        System.out.println("Double: " + pi3);



        // (7) "Boolean"
        boolean isRaining = false;
        boolean allCoinsCollected = true;
        System.out.println("Boolean: " + isRaining + "\n" + "Boolean: " + allCoinsCollected);


        // ♦ "Reassigning" the "Value" of the :
        isRaining = true;



        // (8) "Character"  ("2 bytes")
        char myLetter = 'A';
        char myNumber = '9';
        char mySymbol = '$';
        char newLine = '\n';
        char tab = '\t';
        System.out.println(
                "Char: " + myLetter + "\n"
                + "Char: " + myNumber  + "\n"
                + "Char: " + mySymbol + "\n"
                + "Char: " + newLine + "\n"
                + "Char: " + tab + "\n"
        );








        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ►►  (II) "NON PRIMITIVE" / "REFERENCE" DATA TYPES   ◄◄
        System.out.println("________________________");


        // (1) "String" Object
        String seyHello = "Hello my Friends!";
        System.out.println(seyHello);



        // (A) "Strings Concatenation":
        String hello = "Hello ";
        String name = "Jeanine";
        String exclamation = "!";
        System.out.println(hello + name + exclamation);



        // (B) "Strings Length"
        //      → by Calling ".length()" Method:
        int length = name.length();
        System.out.println("The 'Name' Length: " + length);





        System.out.println("________________________");

        // (2-1) "Arrays"

        // ▼ Specifying the "Array Data Type" & the "Array Size":
        int[] numberArray = new int[5];


        // ▼ "Storing"/"Adding"  the "Elements Values" in the "Array":
        numberArray[0] = 10;  // ► "1st" Position (1 - 1 = 0)
        numberArray[1] = 20;  // ► "2nd" Position (2 - 1 = 1)
        numberArray[2] = 30;  // ► "3rd" Position (3 - 1 = 2)
        numberArray[3] = 40;  // ► "4th" Position (4 - 1 = 3)
        numberArray[4] = 50;  // ► "5th" Position (5 - 1 = 4)


        // ▼ Accessing the "Values" of the "Array Elements":
        System.out.println("Element at 'Index 0': " + numberArray[0]);
        System.out.println("Element at 'Index 1': " + numberArray[1]);
        System.out.println("Element at 'Index 2': " + numberArray[2]);
        System.out.println("Element at 'Index 3': " + numberArray[3]);
        System.out.println("Element at 'Index 4': " + numberArray[4]);



        /* ▼ "For-Each" ("For*()" Loop
                → for "Accessing" Only the "Values" of the "Array Elements":  */
        for( int num: numberArray ){

            /* ▼ "Code" to be "Executed"
                    → for "Each Element"
                    → in the "Collection": */
            System.out.println(num);
        }





        System.out.println("________________________");

     //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (2-2A) "Multi-Dimensional Arrays"

        // ▼ "2D Array" (with "3 Rows" & "3 Columns"):
        int[][] towDimArray = new  int[3][3];


        // ▼ "Storing"/"Adding"  the "Elements Values" in the"2D Array":
        towDimArray[0][0] = 1;  // ► The "Position": "Row 0" & "Column 0"
        towDimArray[0][1] = 2;  // ► The "Position": "Row 0" & "Column 1"
        towDimArray[0][2] = 3;  // ► The "Position": "Row 0" & "Column 2"

        towDimArray[1][0] = 4;
        towDimArray[1][1] = 5;
        towDimArray[1][2] = 6;

        towDimArray[2][0] = 7;
        towDimArray[2][1] = 8;
        towDimArray[2][2] = 9;



        // ▼ Accessing the "Values" of the "2D Array Elements":
        System.out.println(towDimArray[0][0]);  // ► will Display "1"
        System.out.println(towDimArray[0][1]);  // ► will Display "2"
        System.out.println(towDimArray[0][2]);  // ► will Display "3"

        System.out.println(towDimArray[1][0]);  // ► will Display "4"
        System.out.println(towDimArray[1][1]);  // ► will Display "5"
        System.out.println(towDimArray[1][2]);  // ► will Display "6"

        System.out.println(towDimArray[2][0]);  // ► will Display "7"
        System.out.println(towDimArray[2][1]);  // ► will Display "8"
        System.out.println(towDimArray[2][2]);  // ► will Display "9"





     System.out.println("________________________");

     //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
     /* (2-2B) "Multi-Dimensional Arrays"
                → the "2nd Way" of "Creation" and "Initialize" Data,
                → with "{ {}, {}, {} }"
                → by "Predefined Array":
                → with "Predefined Values": */

     // ▼ "2D Array" ("Predefined Values")
     //     → "Creation" and "Initialize" Data:
     int[][] towDimArray2 = {
             {10, 20, 30},
             {40, 50, 60},
             {70, 80, 90},
     };



     // ▼ Accessing the "Values" of the "2D Predefined Array Elements":
     System.out.println(towDimArray2[0][0]);  // ► will Display "1"
     System.out.println(towDimArray2[0][1]);  // ► will Display "2"
     System.out.println(towDimArray2[0][2]);  // ► will Display "3"

     System.out.println(towDimArray2[1][0]);  // ► will Display "4"
     System.out.println(towDimArray2[1][1]);  // ► will Display "5"
     System.out.println(towDimArray2[1][2]);  // ► will Display "6"

     System.out.println(towDimArray2[2][0]);  // ► will Display "7"
     System.out.println(towDimArray2[2][1]);  // ► will Display "8"
     System.out.println(towDimArray2[2][2]);  // ► will Display "9"



     System.out.println("________________________");
    }
}
