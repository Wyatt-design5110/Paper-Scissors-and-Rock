/* Program name: Paper, Scissor and Rock Version 0.1
While developing the code for the game me and Mason contributed by helping with ideas on how to fix errors and run the code
effiently. I wrote the explanation of who did what and Mason wrote the code while I added and tested various methods to
fix the program from looping.

Initially created by Dr. Wenjia Li
Finished by Mason Kubiak and Wyatt Gaines
_   __(Today’s Date)______ 
*/

import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]) {
        //Variable declaration
        int yourChoice, computerChoice; //comment please!
        String yourInput; //comment please!
        boolean winTrue = false;
        String cont;
        int score = 0;

        //Welcome screen and show the basic rule to the user
        JOptionPane.showMessageDialog(null, "Welcome to Paper, Scissor and Rock");
        JOptionPane.showMessageDialog(null, "Let me remind you the rule first:\nScissor cuts paper, paper covers rock, and rock breaks scissors. ");
        JOptionPane.showMessageDialog(null, "0: Rock\n1: Paper\n2: Scissor");
        do {
            //Get your choice
            do {
                yourInput = JOptionPane.showInputDialog("Now tell me your choice!");
                yourChoice = Integer.parseInt(yourInput);


                if ((yourChoice < 0) || (yourChoice > 2)) {
                    JOptionPane.showMessageDialog(null, "Your choice is not valid! Please enter only 0, 1, or 2!");
                }


            } while ((yourChoice < 0) || (yourChoice > 2));


            //Get computer choice
            computerChoice = (int) (Math.random() * 10); //generate a random number
            computerChoice %= 3; //Why we need to modulus 3 here? Think about it.

            //Compare your Choice with computer’s choice and output the result
            //Case I: Both you and computer pick the same choice, then it’s a tie!
            if (yourChoice == computerChoice) {
                JOptionPane.showMessageDialog(null, "It's a tie!");
            }

            //Case II: You WIN :)
            if (yourChoice == 0 && computerChoice == 2) {
                winTrue = true;
                JOptionPane.showMessageDialog(null, "You win!");
            } else if (yourChoice == 1 && computerChoice == 0) {
                winTrue = true;
                JOptionPane.showMessageDialog(null, "You win!");
            } else if (yourChoice == 2 && computerChoice == 1) {
                winTrue = true;
                JOptionPane.showMessageDialog(null, "You win!");
            }

            //Case III: You lose :(
            if (yourChoice == 2 && computerChoice == 0) {
                winTrue = false;
                JOptionPane.showMessageDialog(null, "You lose!");
            } else if (yourChoice == 0 && computerChoice == 1) {
                winTrue = false;
                JOptionPane.showMessageDialog(null, "You lose!");
            } else if (yourChoice == 1 && computerChoice == 2) {
                winTrue = false;
                JOptionPane.showMessageDialog(null, "You lose!");
            }

            if (winTrue == true){
                score += 1;
            }

            cont = JOptionPane.showInputDialog("Another round, folks?\nCurrent score:" + score);


        }while(cont.equals("yes") || cont.equals("Yes"));
        JOptionPane.showMessageDialog(null, "Final score: " + score);
    }
}