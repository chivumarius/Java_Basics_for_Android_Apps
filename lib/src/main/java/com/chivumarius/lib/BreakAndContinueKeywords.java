/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "BREAK" & "CONTINUE" KEYWORDS ◄◄




    ♦  The "Break" Statement/ Keyword
        → can be used to "Jump Out"
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

public class BreakAndContinueKeywords {

    // ►► The "main()" Method → is the "Entry Point" for the "Program"
    public static void main(String[] args) {

        System.out.println("________________________");

       


        //▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
        // ▼ "For(){ }" Loop  with "Break" & "Continue" Keywords ▼

        for(int i = 0; i < 10; i++) {
            /* ▼ "Code" to be "Executed Repetitively"


           /* ▼ "Stopping Repetition" of the "Code Block"
                  → when the "Condition" is "Satisfied": */
           if( i == 4) {

//               break;

                /* ▼ "Continue Repeating" the "Block of Code"
                        →  for a "Specified Number" of "Times"
                        →  and "Continues" with the "Next Iteration/Repetition"
                        → in the "Loop"
                        → and the "Execution" of "4" is "Skipped":  */
               continue;
           }


           System.out.println(i);
        }



        System.out.println("________________________");
    }

}