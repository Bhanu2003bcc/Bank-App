package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class fastCash extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;
    fastCash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550, 830);
        add(l3);

        JLabel l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.white);
        l1.setBounds(500,180,700,35);
        l1.setFont(new Font("ink free", Font.BOLD,16));
        l3.add(l1);

        b1 = new JButton("Rs. -100");
        b1.setBackground(new Color(55, 171, 255));
        b1.setForeground(Color.black);
        b1.setFont(new Font("ink free", Font.BOLD,12));
        b1.setBounds(410, 270,150, 30);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs.  -500");
        b2.setBackground(new Color(55, 171, 255));
        b2.setForeground(Color.black);
        b2.setFont(new Font("ink free", Font.BOLD,12));
        b2.setBounds(410, 315,150, 30);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Rs. -2000");
        b3.setBackground(new Color(55, 171, 255));
        b3.setForeground(Color.black);
        b3.setFont(new Font("ink free", Font.BOLD,12));
        b3.setBounds(410, 365,150, 30);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Rs. -5000");
        b4.setBackground(new Color(55, 171, 255));
        b4.setForeground(Color.black);
        b4.setFont(new Font("ink free", Font.BOLD,12));
        b4.setBounds(410, 415,150, 30);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("Rs. -10000");
        b5.setBackground(new Color(55, 171, 255));
        b5.setForeground(Color.black);
        b5.setFont(new Font("ink free", Font.BOLD,12));
        b5.setBounds(700, 270,150, 30);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Rs. -20000");
        b6.setBackground(new Color(55, 171, 255));
        b6.setForeground(Color.black);
        b6.setFont(new Font("ink free", Font.BOLD,12));
        b6.setBounds(700, 315,150, 30);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("Back");
        b7.setBackground(new Color(55, 171, 255));
        b7.setForeground(Color.black);
        b7.setFont(new Font("ink free", Font.BOLD,12));
        b7.setBounds(700, 365,150, 30);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b7){
            setVisible(false);
            new main(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Con c = new Con();
            Date date = new Date();
            try{
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" +pin+ "' ");
                int balance = 0;
                while(resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                String num= "17";
                if((e.getSource() != b7) && (balance < Integer.parseInt(amount))){
                    JOptionPane.showMessageDialog(null,"Choose the correct Option");
                    return;
                }
                int i = c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "',  'withdrawl ', '" + amount + "')");
                JOptionPane.showMessageDialog(null,"Rs" +amount+ "Debited  Successfully ");

            }catch(Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main(pin);
        }
    }

    public static void main(String[] args) {
        new fastCash("");
    }
}
