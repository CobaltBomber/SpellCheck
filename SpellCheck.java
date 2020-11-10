/* *****************************************************************************
 *  Name:    Ada Lovelace
 *  NetID:   alovelace
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.TST;

public class SpellCheck {





    public static void main(String[] args) {

        In myIn = new In(args[0]);

        TST<Integer> myTST = new TST<Integer>();

        int tick = 0;

        while (myIn.hasNextLine()) {
            String myString = myIn.readLine();
            myTST.put(myString, tick);
            tick++;
        }

        In myFileIn = new In(args[1]);

        while (myFileIn.hasNextChar()) {
            while ()
            char myChar = myFileIn.readChar();
            if (myFileIn.readChar()) {

            }


        }









    }
}
