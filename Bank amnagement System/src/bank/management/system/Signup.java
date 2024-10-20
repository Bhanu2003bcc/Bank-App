package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textName, textFatherName, textAdd, textPhoneNum, textEmail,  passwordField;
    JDateChooser dateChooser;
    JRadioButton r1, r2, r3, r4;
   // JPasswordField passwordField;;
    JButton next;


    //Random for Application Numbers.
    Random ram = new Random();
    long first6 = (ram.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first6);
    Signup(){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100, 100);
        add(image);

        JLabel label1 = new JLabel("Application Form No."+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("ink free", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("ink free", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("ink free", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        // Create Name Label
        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(100, 190, 100, 30);
        labelName.setFont(new Font("ink free", Font.BOLD, 20));
        add(labelName);

        //Taking input as Name
        textName = new JTextField();
        textName.setFont(new Font("ink free", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        //Create Father's Name Label
        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setBounds(100, 240, 200, 30);
        labelFName.setFont(new Font("ink free", Font.BOLD, 20));
        add(labelFName);

        //Taking input as Father's Name
        textFatherName = new JTextField();
        textFatherName.setBounds(300, 240, 400, 30);
        textFatherName.setFont(new Font("ink free", Font.BOLD, 14));
        add(textFatherName);

        // Address Label
        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setBounds(100,290,300,30);
        labelAdd.setFont(new Font("ink Free", Font.BOLD, 20));
        add(labelAdd);

        //Address Input
        textAdd = new JTextField("");
        textAdd.setBounds(300, 290,400,30);
        textAdd.setFont(new Font("ink free", Font.BOLD,14));
        add(textAdd);

        //Phone Number
        JLabel labelPhone = new JLabel("Phone Number :");
        labelPhone.setBounds(100,340,300,30);
        labelPhone.setFont(new Font("ink Free", Font.BOLD, 20));
        add(labelPhone);

        // Phone Number
        textPhoneNum = new JTextField("");
        textPhoneNum.setBounds(300, 340, 400, 30);
        textPhoneNum.setFont(new Font("ink free", Font.BOLD, 14));
        add(textPhoneNum);

        //Date Chooser
        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setBounds(100,390,300,30);
        DOB.setFont(new Font("ink Free", Font.BOLD, 20));
        add(DOB);

        // DOB
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setFont(new Font("ink free", Font.BOLD, 14));
        dateChooser.setBounds(300, 390, 400,30);
        add(dateChooser);

        // Gender label
        JLabel Gender = new JLabel("Gender :");
        Gender.setBounds(100,440,300,30);
        Gender.setFont(new Font("ink Free", Font.BOLD, 20));
        add(Gender);

        // Radio Buttons
        r1 = new JRadioButton("Male");
        r1.setBounds(300, 440,100,30);
        r1.setFont(new Font("ink free", Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(450, 440,200,30);
        r2.setFont(new Font("ink free", Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        add(r2);
        // make seperate  buttons
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        // Email Address
        JLabel Email = new JLabel("Email :");
        Email.setBounds(100, 490, 400, 30);
        Email.setFont(new Font("ink free", Font.BOLD,20));
        add(Email);

        // Email Text
        textEmail = new JTextField();
        textEmail.setBounds(300, 490, 400, 30);
        textEmail.setFont(new Font("ink free", Font.BOLD, 14));
        add(textEmail);

        // Marital Status
        JLabel Ms = new JLabel("Marital Status :");
        Ms.setBounds(100,540,300,30);
        Ms.setFont(new Font("ink Free", Font.BOLD, 20));
        add(Ms);

        // Marital Buttons
        r3 = new JRadioButton("Married");
        r3.setBounds(300, 540,100,30);
        r3.setFont(new Font("ink free", Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setBounds(450, 540,200,30);
        r4.setFont(new Font("ink free", Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        add(r4);

        // make seperate  buttons
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

        // Pin code
        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setBounds(100,590,300,30);
        labelPin.setFont(new Font("ink Free", Font.BOLD, 20));
        add(labelPin);

        //PIN CODE
        passwordField  = new JPasswordField(15);
        passwordField.setFont(new Font("ink free" , Font.BOLD, 20));
        passwordField.setBounds(300,590,400,30);
        add(passwordField);

        //  next Button
        next = new JButton("Next");
        next.setBounds(620, 640, 80,30);
        next.setFont(new Font("ink free", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        // panel
        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String Fname = textFatherName.getText();
        String address =textAdd.getText();
        String mobile = textPhoneNum.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()) gender = "Female";
        String email = textEmail.getText();
        String marital = null;
        if(r3.isSelected()) marital =  "Married";
        else if(r4.isSelected()) marital = "Unmarried";
        String pin = passwordField.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Fileds");
            }else{
                Con con1 = new Con();
                String sql = "insert into signup values( '"+formno+ "', '"+name+ "', '"+Fname+ "', '"+address+ "', '"+mobile+ "', '"+dob+ "', '"+gender+ "', '"+email+ "', '"+marital+ "', '"+pin+ "' )";
                int i = con1.statement.executeUpdate(sql);
                new Signup2(first);  // first send info to signup2
                setVisible(false);
            }
        }catch(Exception E){
          E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Signup();
    }
}

