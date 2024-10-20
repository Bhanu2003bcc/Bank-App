package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textfield2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;

    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100, 100);
        add(image); //to show image on the frame

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100, 100);
        add(iimage); //to show image on the frame

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.white); //set text color
        label1.setFont(new Font("ink free" , Font.BOLD, 38));
        label1.setBounds(230,125,450,40);
        add(label1);

        // Card Number
        label2 =  new JLabel("Card No:");
        label2.setFont(new Font("ink free" , Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375,30);
        add(label2);

        // TextField For Card Number
        textfield2 = new JTextField(15);
        textfield2.setBounds(325, 190, 230, 30);
        textfield2.setFont(new Font("ink free", Font.BOLD, 18));
        add(textfield2);

        // PIN Number
        label3 = new JLabel("PIN No:");
        label3.setFont(new Font("ink free", Font.BOLD, 18 ));
        label3.setForeground(Color.white);  // font color
        label3.setBounds(150, 250,375,30);
        add(label3);

        // Password
        passwordField3  = new JPasswordField(15);
        passwordField3.setFont(new Font("ink free" , Font.BOLD, 26));
        passwordField3.setBounds(325,250,230,30);
        add(passwordField3);

        //Buttons Sign in , CLEAR , SIGN UP
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("ink free", Font.BOLD, 14));
//        button1.setForeground(Color.white);
        button1.setBounds(280, 300, 100,  30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("ink free", Font.BOLD, 14));
//        button2.setForeground(Color.white);
        button2.setBounds(460, 300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("ink free", Font.BOLD, 14));
//        button3.setForeground(Color.white);
        button3.setBounds(370, 350, 100,30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850, 480);
        add(iiimage);

        setLayout(null);
        setSize(850, 500);
        setLocation(450, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){
                Con c = new Con();
                String cardno = textfield2.getText();
                String pin = passwordField3.getText();

                String q = "Select * from logi where card_no =  '"+cardno+"' and pin = '" +pin+ "' "; // fetch the query
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main(pin);
                } else{
                    JOptionPane.showMessageDialog(null,"You have entered wrong info...");
                }
            }else if(e.getSource() == button2){
                textfield2.setText("");
                passwordField3.setText("");

            }else if(e.getSource() == button3){
                new Signup();// to redirect to Signup page;
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();;
        }

    }

    public static void main(String[] args) {
        new Login();
    }


}
