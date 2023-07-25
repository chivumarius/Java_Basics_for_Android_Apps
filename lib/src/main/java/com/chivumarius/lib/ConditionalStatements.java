/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "CONDITIONAL  STATEMENTS" IN "JAVA" ◄◄



    ♦ "Conditional Statements"
        → allows us to make "Decisions" in "Code"
        → based on "Certain Conditions",

        → "Helping" the "Program"
        → to Choose "Different Patterns"
        → and "Execute" Specific "Blocks" of "Code",
        → Depending on whether the "Condition"
        → is "True" or "False".



    ♦ "Types" of "Conditional Statements":

        (I)   The "if(){} else{}" Statement
                → It "Checks" a "Condition",
                → and "If" the "Condition" is "True",
                → then it "Executes" a "Specific Block" of "Code".


        (II)  The "else if(){}" Statement


        (III) The "Switch" Statement
                → is used when we have "Multiple Cases"
                → and we "Want" to "Perform Different Actions"
                → based on the "Value" of the "Variable".



    ♦  The "Break" Statement/ Keyword
        → can be used to Jump Out
        → of a "Condition" or a "Loop".


▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.lib;


import jdk.internal.org.jline.terminal.Size;

public class ConditionalStatements {

    // ►► The "main()" Method → is the "Entry Point" for the "Program"
    public static void main(String[] args) {

        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        System.out.println("________________________");

        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (I) The "if(){} else{}" Statement:
        int age = 60;

        if(age >= 18){
            // ▼ "True"
            System.out.println("You are an Adult");
        }

        // (II) The "else if(){} else{}" Statement:
        else if (age == 60){
            // ▼ "True"
            System.out.println("You are an Senior");
        } else {
            // ▼ "False"
            System.out.println("You are an Minor");
        }





        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // (III) The "switch()" Statement
        System.out.println("________________________");

        int dayOfWeek = 4;

        switch (dayOfWeek) {
            case 1:
                    System.out.println("It's Monday");
                    break;
            case 2:
                    System.out.println("It's Tuesday");
                    break;
            case 3: System.out.println("It's Wednesday");
                    break;
            default: System.out.println("Unknown Day");
                     break;
        }



        System.out.println("________________________");
    }

}