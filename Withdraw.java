package atm.management.system.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdraw extends JFrame implements ActionListener {
    
    JTextField amount;
    JButton withdraw,back;
    String pinnumber;

    Withdraw(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
         amount = new JTextField();
        amount.setFont(new Font("Railway", Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
         withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
           back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
         
         if(ae.getSource()==withdraw){
             
             String number = amount.getText();
             Date date = new Date();
             if(number.equals("")){
                 JOptionPane.showMessageDialog(null, "Please Enter the amount you want to withdraw");
             }else{
                 try{
                 Conn conn = new Conn();
                 String query = "Insert into bank values('"+pinnumber+"', '"+date+"', 'Withdraw', '"+number+"')";
                 conn.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null, "Taka "+number+"Withdraw Successfully");
                 setVisible(false);
                 new Transactions(pinnumber).setVisible(true);
                 }catch(Exception e){
                     System.out.println(e);
                     
                 }
             }
            
         }else if(ae.getSource()==back){
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
         }
     }


    public static void main(String args[]) {

        new Withdraw("");
    }

}
