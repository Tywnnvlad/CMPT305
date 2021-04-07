/**
 * Gregory Edward Cal
 * 180232
 * 
 * A program that will check if a word from the user is a palindrome.
 */

import javax.swing.*;
public class Laboratory3{

    public static String word = "";
    public static String checkExit = "";


    public static void main(String[] args){
        initialize();
    
    }
    public static void initialize(){
        if(isPalindrome()){
            JOptionPane.showMessageDialog(null,"The word "+word+" is a palindrome!","Palindrome Checker",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"The word "+word+" is NOT a palindrome!","Palindrome Checker",JOptionPane.INFORMATION_MESSAGE);
        }
    }        
    public static boolean isPalindrome(){
        userPrompt();
        StringBuilder reversedWord = new StringBuilder();
        char[] key =  word.toCharArray();
        for (int i = key.length -1; i >= 0; i--){
            reversedWord.append(key[i]);
        }
        if(reversedWord.equals(key)){
            return true;
        }
        else return false;
    }
    public static void userPrompt(){
        word = JOptionPane.showInputDialog(null,"Enter a word to check if its a palindrome: ","Palindrome Checker",JOptionPane.QUESTION_MESSAGE);
        checkExit = word.toLowerCase();
        // System.out.println(word);
        // System.out.println(checkExit);
        if(checkExit.equals("exit")){
            System.exit(1);
        }        
    } 

    
}