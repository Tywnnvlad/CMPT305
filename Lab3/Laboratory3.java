import javax.swing.*;
public class Laboratory3{
    
    public static void main(String[] args){
        userPrompt();

        }
    
    public static void userPrompt(){
        String word = JOptionPane.showInputDialog("Enter a word to check if its a palindrome: ");
        String checkExit = word.toLowerCase();
        System.out.println(word);
        System.out.println(checkExit);
        
        if(checkExit.equals("exit")){
            System.out.println("This should print");
            System.exit(1);
        }
        System.out.println("HERE");
        
    } 
}