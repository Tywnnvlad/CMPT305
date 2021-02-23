import javax.swing.*; 
public class Laboratory2 {
    public static void main(String[] args) {


        //Ask the user for an input
        String streetnumber = JOptionPane.showInputDialog("What is your Street number?");
            if(streetnumber == null){
                System.exit(1);
                }            
        
        String street = JOptionPane.showInputDialog("What is your Street?");
            if(street == null){
                System.exit(1);
                }            
        String city = JOptionPane.showInputDialog("What is your City?");
            if(city == null){
                System.exit(1);
                }


        String province = JOptionPane.showInputDialog("What is your Province?");
            if(province == null){
                System.exit(1);
                }
    
        String postal = JOptionPane.showInputDialog("What is your Postal Code?");
            if(postal == null){
                System.exit(1);
                }
        String address = streetnumber+" "+street+" "+city+" "+province+", "+postal;
 
        //Show the message
            JOptionPane.showMessageDialog(null,
            address,
            "Your address is",
            JOptionPane.PLAIN_MESSAGE); 
    }
}
