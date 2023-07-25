/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "LOOPS" IN "JAVA" ◄◄



    ♦ "Types" of "Loops":        

        (I) "While(){ }" Loop
                → allows "Iterating"/ "Repeating" a "Block" of "Code"
                → as "Long" as a "Specified Condition"
                → is "True".

                → The "loop" will "Keep Executing" the "Code"
                → until the "Condition" Becomes "False".



        (II) "For(){ }" Loop
                → allows  "Iterating"/ "Repeating" a "Block" of "Code"
                → of "Specified Number" of "Times".


                ♦ The "for()" Loop Consists of "3 Parts":
                    1 - "Initialization",
                    2 - "Condition" and
                    3 - "Update"


                ♦ "SYNTAX":

                    for(Initialization; Condition: Update){

                    }




        (III) "For-Each" ("For*(") Loop
                → also known as the Enhance "for()" Loop
                → provides a Convenient and Precise Way
                → to "Iterate" through "Elements"
                → in an "Array" or "Collection"
                → for "Getting" Only the "Values"
                → of the "Array Elements".

                → It "Simplifies"
                → the "Process" of "Traversing" the "Elements"
                → and is "Useful" when we "do not Need"
                → to "Access" the "Index" of the "Elements"
                → and "Want" to "Focus"
                → on "Each Individual Element" by "Itself".



                ♦ "SYNTAX":

                    for( dataType elementName: collection ){

                         ▼ "Code" to be "Executed"
                                → for "Each Element"
                                → in the "Collection":

                    }




    ♦  The "Break" Statement/ Keyword
        → can be used to Jump Out
        → of a "Condition" or a "Loop".




    ♦ The "Continue" Statement/ Keyword
        → "Breaks One Iteration" in the "Loop",
        → if a "Specified Condition Occurs"
        → and "Continues" with the "Next Iteration/Repetition"
        → in the "Loop".



▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.lib;


import org.graalvm.compiler.core.common.cfg.Loop;

import jdk.internal.org.jline.terminal.Size;

public class Loops {

    // ►► The "main()" Method → is the "Entry Point" for the "Program"
    public static void main(String[] args) {

        System.out.println("________________________");

        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (I) "While" Loop:

        int number = 1;

        while (number <= 5){
            /* ▼ "Code" to be "Executed Repetitively"
                    → as "Long" as "Condition" is "True" */
            System.out.println("The number is " + number);
            number++;
//

            /* Note:
                • If we do not have the "Increment",
                    → the Loop is "Executed Indefinitely"
                    → and to can "Stop It"
                    → by "Adding" the "break" Keyword! */
        }



         System.out.println("________________________");

        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (II) "For(){ }" Loop

        for(int i = 0; i <= 7; i++) {
            /* ▼ "Code" to be "Executed Repetitively"
                    → of "Specific Number" of "Times" */
            System.out.println("The 'i' is " + i);
        }





        System.out.println("________________________");

        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (III) "For-Each" ("For*()" Loop

        // ▼ Creating "Array Data Type" & the "Array Size":
        int[] numberArrayTwo = new int[5];

        // ▼ "Adding" / "Storing" the "Elements Values" in the "Array":
        numberArrayTwo[0] = 100;  // ► "1st" Position (1 - 1 = 0)
        numberArrayTwo[1] = 202;  // ► "2nd" Position (2 - 1 = 0)
        numberArrayTwo[2] = 303;  // ► "3rd" Position (3 - 1 = 0)
        numberArrayTwo[3] = 400;  // ► "4th" Position (5 - 1 = 0)
        numberArrayTwo[4] = 505;  // ► "5th" Position (5 - 1 = 0)


        // ▼ "Accessing" Only the "Values" of the "Array Elements":
        for( int num: numberArrayTwo ){

            /* ▼ "Code" to be "Executed"
                    → for "Each Element"
                    → in the "Collection": */
            System.out.println(num);
        }



        System.out.println("________________________");
    }

}