package atm.management.system.project;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, districtTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser ;

    SignupOne() {

        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO" + random);
        formno.setFont(new Font("Railway", Font.BOLD, 30));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personDetails = new JLabel("Page 01 Personal Details");
        personDetails.setFont(new Font("Railway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Railway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Railway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Railway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Railway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date Of Birth: ");
        dob.setFont(new Font("Railway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

         dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Railway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

         male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

         female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Railway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Railway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Railway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

         married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

         unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

         other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Railway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel district = new JLabel("District: ");
        district.setFont(new Font("Railway", Font.BOLD, 20));
        district.setBounds(100, 490, 200, 30);
        add(district);

        districtTextField = new JTextField();
        districtTextField.setFont(new Font("Railway", Font.BOLD, 14));
        districtTextField.setBounds(300, 490, 400, 30);
        add(districtTextField);

        JLabel state = new JLabel("Upazila: ");
        state.setFont(new Font("Railway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Railway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Railway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Railway", Font.BOLD, 14));
        pinTextField.setBounds(300, 590, 200, 30);
        add(pinTextField);

         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway", Font.BOLD, 14));
        next.setBounds(670,590,100,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
      String formno = "" + random;  
      String name = nameTextField.getText();
      String fname = fnameTextField.getText();
      String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
      String gender = null;
      if(male.isSelected()){
          gender = "Male";
      }else if (female.isSelected()){
          gender = "Female";
      }
      
      String email = emailTextField.getText();
      String marital = null;
      if(married.isSelected()){
          marital = "Married";
      }else if(unmarried.isSelected()){
          marital = "Unmarried";
      }else if(other.isSelected()){
          marital = "Other";
      }
      
      String address = addressTextField.getText();
      String district = districtTextField.getText();
      String state = stateTextField.getText();
      String pin = pinTextField.getText();
      
      try{
         if(name.equals("")){
             JOptionPane.showMessageDialog(null, "Name is Required");
         }else{
             Conn c = new Conn();
             String query = "insert into signupone values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"','"+district+"','"+pin+"','"+state+"')";
             
             c.s.executeUpdate(query);
             
             setVisible(false);
             new SignupTwo(formno).setVisible(true);
         } 
          
      }catch(Exception e) {
          System.out.println(e);
      }
    }
    


    public static void main(String args[]) {

        new SignupOne();
    }
}
