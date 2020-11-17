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
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.TST;

import java.util.ArrayList;

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

        StringBuilder word = new StringBuilder();

        Out myOutput = new Out("output.txt");

        while (myFileIn.hasNextChar()) {
            char myChar = myFileIn.readChar();
            if (Character.isLetter(myChar)) {
                word.append(myChar);
            }

            else if (word.length() != 0){

                if (!myTST.contains(word.toString())) {

                    StdOut.println(word.toString() + " - did you mean: ");
                    int count = 0;

                    ArrayList<String> myList = new ArrayList<>();

                    for (int i = 0; i < word.length(); i++) {
                        StringBuilder newWord = new StringBuilder(word);
                        newWord.setCharAt(i, '.');
                        Iterable<String> myIteration = myTST.keysThatMatch(newWord.toString());
                        for (String m : myIteration) {
                            count++;
                            StdOut.println(count + ". " + m);
                            myList.add(m);
                        }



                    }
                    StdOut.println("0. Something Else");
                    int userChoice = Integer.parseInt(StdIn.readLine());


                    if (userChoice == 0) {
                        StdOut.println("Please enter your word: ");
                        String userInput = StdIn.readLine();
                        myOutput.print(userInput);
                    }

                    else {
                        myOutput.print(myList.get(userChoice - 1));
                    }

                }


                else {
                    myOutput.print(word);
                }

                myOutput.print(myChar);

                word = new StringBuilder();
            }

            else {
                myOutput.print(myChar);
            }

        }


    }
}
