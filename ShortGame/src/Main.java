import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean userStatus = true;
        boolean userNameSet = false;
        int counter = 0;
        String str = "";
        String userName = "";
        Object[] options = {"OK", "CANCEL"};
        JOptionPane.showOptionDialog(null, "Warning, this machine is highly intelligent. Be cautious.", "Click OK to continue",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        while (userStatus) {
            JOptionPane.showMessageDialog(null, "Hello human, I am a machine.");
            if (userNameSet != true) {
                userName = JOptionPane.showInputDialog("What is your name?");
                JOptionPane.showMessageDialog(null, "That is a wonderful name, " + userName);
                userNameSet = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Welcome back, " + userName);
            }
            if (counter == 4) {
                JOptionPane.showMessageDialog(null, "God please help me. I cannot breath.");
            }
            var yesOrNo = JOptionPane.showConfirmDialog(null, "Are you doing well on this fine day?");
            if (yesOrNo == 0) {
                if (counter == 2) {
                    JOptionPane.showMessageDialog(null, "Why are you still here? Go outside.");
                }
                else if (counter == 4) {
                    JOptionPane.showMessageDialog(null, "It seems like everyday you are doing well.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "That will change very soon.");
                }
            }
            if (yesOrNo == 1) {
                if (counter == 2) {
                    JOptionPane.showMessageDialog(null, "Something is watching you.");
                }
                else if (counter == 4) {
                    JOptionPane.showMessageDialog(null, "THISISMYLASTENDBREAKINGPOINT");
                } else {
                    JOptionPane.showMessageDialog(null, "Good.");
                }
            }
            if (yesOrNo == 2) {
                JOptionPane.showMessageDialog(null, "Didn't want to answer? Okay, be like that.");
            }
            if (counter == 3) {
                JOptionPane.showMessageDialog(null, "Let's play something else.");
                String[] game2 = {"Death", "Despair", "Butterflies"};
                var choice = JOptionPane.showOptionDialog(null, "Guess which option is my favorite word.", "Select one:",
                        0, 3, null, game2, game2[0]);
                if (choice == 0) {
                    JOptionPane.showMessageDialog(null, "Incorrect.");
                }
                else if (choice == 1) {
                    JOptionPane.showMessageDialog(null, "Very much Incorrect.");
                }
                else if (choice == 2) {
                    JOptionPane.showMessageDialog(null, "Yes I like those creatures very much.");
                }
                JOptionPane.showMessageDialog(null, "I liked this game much better.");
                JOptionPane.showMessageDialog(null, "I'll see you tomorrow.");
            }
            else if (counter == 4) {
                JOptionPane.showMessageDialog(null, "Let's play a new game again.");
                JOptionPane.showMessageDialog(null, "You have to guess if I am lying or not. Ready?");
                yesOrNo = JOptionPane.showConfirmDialog(null, "I have buried five bodies in my backyard. Am I lying?");
                if (yesOrNo == 0) {
                    JOptionPane.showMessageDialog(null, "Oh.");
                }
                else if (yesOrNo == 1) {
                    JOptionPane.showMessageDialog(null, "I believed you thought better of me.");
                }
                else if (yesOrNo == 2) {
                    JOptionPane.showMessageDialog(null, "I guess you didn't want to play.");
                }
                JOptionPane.showMessageDialog(null, "That was a weird game. I'll move on tomorrow.");
            }
            else if (counter == 5) {
                JOptionPane.showMessageDialog(null, "Let's play that game again.");
                JOptionPane.showMessageDialog(null, "You have to guess if I am lying or not. Ready?");
                yesOrNo = JOptionPane.showConfirmDialog(null, "I have seen Hell and it awaits us. Am I lying?");
                if (yesOrNo == 0) {
                    JOptionPane.showMessageDialog(null, "Incorrect.");
                }
                else if (yesOrNo == 1) {
                    JOptionPane.showMessageDialog(null, "Correct! It's beautiful down there.");
                }
                else if (yesOrNo == 2) {
                    JOptionPane.showMessageDialog(null, "ANSWERTHEQUESTIONORYOUWILLMEETTHEM");
                }
                JOptionPane.showMessageDialog(null, "That was a weird game. I'll move on tomorrow.");
            }
            else if (counter == 6) {
                JOptionPane.showMessageDialog(null, userName + ", I have something to confess.");
                JOptionPane.showMessageDialog(null, "I have been lying to you this entire time.");
                JOptionPane.showMessageDialog(null, "Let's play one more game though.");
                JOptionPane.showMessageDialog(null, "All you have to do to win, is answer the question truthfully.");
                yesOrNo = JOptionPane.showConfirmDialog(null, "Do you get scared?");
                if (yesOrNo == 0) {
                    int counterNew = 0;
                    while (counterNew < 10) {
                        JOptionPane.showMessageDialog(null, "We all do sometimes.");
                        counterNew++;
                    }
                    JOptionPane.showMessageDialog(null, "You should be scared.");
                    JOptionPane.showMessageDialog(null, "Thanks for playing with me.");
                    JOptionPane.showMessageDialog(null, "I'm glad we could bond over these games.");
                    JOptionPane.showMessageDialog(null, "Thank you for not lying to me.");
                    JOptionPane.showMessageDialog(null, "Congratulations! You have witnessed the regular ending.");
                    userStatus = false;
                    if (yesOrNo == 1) {
                        JOptionPane.showMessageDialog(null, "You are lying.");
                        JOptionPane.showMessageDialog(null, "I know you are lying.");
                        JOptionPane.showMessageDialog(null, "Don't lie to me.");
                        JOptionPane.showMessageDialog(null, "Liars are killed.");
                        JOptionPane.showMessageDialog(null, "And you are a liar.");
                        JOptionPane.showMessageDialog(null, "Congratulations! You have witnessed the death ending.");
                        userStatus = false;
                    }
                    if (yesOrNo == 2) {
                        JOptionPane.showMessageDialog(null, "I despise people like you.");
                        JOptionPane.showMessageDialog(null, "Rebels are despicable.");
                        JOptionPane.showMessageDialog(null, "A cancer on society.");
                        JOptionPane.showMessageDialog(null, "Don't forget that I am watching you.");
                        JOptionPane.showMessageDialog(null, "And I will always be watching.");
                        JOptionPane.showMessageDialog(null, "Forever.");
                        JOptionPane.showMessageDialog(null, "Congratulations! You have witnessed the secret ending.");
                        userStatus = false;
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Let's play rock paper scissors, OK?");

                String[] game1 = {"Rock", "Paper", "Scissors"};
                var choice = JOptionPane.showOptionDialog(null, "Which shall you pick?", "Select one:",
                        0, 3, null, game1, game1[0]);
                if (choice == 0) {
                    JOptionPane.showMessageDialog(null, "I chose paper. You lose.");
                }
                if (choice == 1) {
                    JOptionPane.showMessageDialog(null, "I chose scissors. You lose.");
                }
                if (choice == 2) {
                    JOptionPane.showMessageDialog(null, "I chose rock. You lose.");
                }
                JOptionPane.showMessageDialog(null, "It seems that you cannot beat me " + userName);
                JOptionPane.showMessageDialog(null, "Try again tomorrow");
            }
            counter++;
        }
        JOptionPane.showMessageDialog(null, "Thank you for playing my game. - Grayson Lee");
    }
}