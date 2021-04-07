import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/**
 * Lock
 * 
 */
public class Lock2 extends JFrame{
        private JButton bNum1;
        private JButton bNum2;
        private JButton bNum3;
        private JButton bNum4;
        private JButton bNum5;
        private JButton bNum6;
        private JButton bNum7;
        private JButton bNum8;
        private JButton bNum9;
        private JButton bNum0;
        private JButton bEnter;
        private JButton bDelete;
        public JTextField jtextfield;

        Boolean enterBool = false;
        Boolean deleteBool = false;

        String display = "";

        

    /**
     * JavaLock
     */
    public Lock2 (){
        //FRAME
        JFrame frame = new JFrame("Lock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());
        Dimension d = new Dimension(100,100);
        Dimension x = new Dimension(150,100);
        setPreferredSize(d);
        //Button Panels
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,3));
        p1.add(bNum8 = new JButton("8"));
        p1.add(bNum7 = new JButton("7"));
        p1.add(bNum9 = new JButton("9"));
        p1.add(bNum4 = new JButton("4"));
        p1.add(bNum5 = new JButton("5"));
        p1.add(bNum6 = new JButton("6"));
        p1.add(bNum1 = new JButton("1"));
        p1.add(bNum2 = new JButton("2"));
        p1.add(bNum3 = new JButton("3"));        
        bNum7.getPreferredSize();
        bNum8.getPreferredSize();
        bNum9.getPreferredSize();
        bNum4.getPreferredSize();
        bNum5.getPreferredSize();
        bNum6.getPreferredSize();
        bNum1.getPreferredSize();
        bNum2.getPreferredSize();
        bNum3.getPreferredSize();

        //StringBar
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jtextfield = new JTextField(30));
        jtextfield.setHorizontalAlignment(JTextField.RIGHT);
        jtextfield.setEditable(false);
        //Bottom Panel
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1,2));
        p3.add(bEnter = new JButton("Enter"));
        p3.add(bDelete = new JButton("Delete"));       
        bEnter.setPreferredSize(x);
        bDelete.setPreferredSize(x);       

        frame.add(p2,BorderLayout.NORTH);
        frame.add(p1,BorderLayout.CENTER);
        frame.add(p3,BorderLayout.SOUTH);
        frame.setVisible(true);           
        bNum7.addActionListener(new ListenNum7());
        bNum8.addActionListener(new ListenNum8());
        bNum9.addActionListener(new ListenNum9());
        bNum4.addActionListener(new ListenNum4());
        bNum5.addActionListener(new ListenNum5());
        bNum6.addActionListener(new ListenNum6());
        bNum1.addActionListener(new ListenNum1());
        bNum2.addActionListener(new ListenNum2());
        bNum3.addActionListener(new ListenNum3());    
        bEnter.addActionListener(new ListenEnter());
        bDelete.addActionListener(new ListenDelete());

            
    }
    public static void main(String[] args) {
        Lock jlock = new Lock();
        jlock.pack();
        //jlock.setVisible(true);
        System.out.println("x");
     }
     ///////////
     ///////////
     class ListenNum1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = jtextfield.getText();
            jtextfield.setText(display+"1");
        }
        
    }
    class ListenNum2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = jtextfield.getText();
            jtextfield.setText(display+"2");
        }
        
    }
    class ListenNum3 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = jtextfield.getText();
            jtextfield.setText(display+"3");
        }
        
    }
    class ListenNum4 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = jtextfield.getText();
            jtextfield.setText(display+"4");
        }
        
    }
    class ListenNum5 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = jtextfield.getText();
            jtextfield.setText(display+"5");
        }
        
    }
    class ListenNum6 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = jtextfield.getText();
            jtextfield.setText(display+"6");
        }
        
    }
    class ListenNum7 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = jtextfield.getText();
            jtextfield.setText(display+"7");
        }
        
    }
    class ListenNum8 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = jtextfield.getText();
            jtextfield.setText(display+"8");
        }
        
    }
    class ListenNum9 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = jtextfield.getText();
            jtextfield.setText(display+"9");
        }
        
    }
     class ListenEnter implements ActionListener{
        public void actionPerformed(ActionEvent e){
            display = jtextfield.getText();
            jtextfield.setText(display+"ENTER");
        }
    }
    class ListenDelete implements ActionListener{
            public void actionPerformed(ActionEvent e){
                display = jtextfield.getText();
                jtextfield.setText(display+"DELETE");
        }
    }
}