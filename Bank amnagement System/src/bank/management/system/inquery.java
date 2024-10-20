package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class inquery extends JFrame implements ActionListener {

    JLabel label2;
    JButton b;
    String pin;
    inquery(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550, 830);
        add(l3);

        JLabel label1 = new JLabel("YOUR CURRENT AMOUNT IS RS. ");
        label1.setFont(new Font("ink free",Font.BOLD,16));
        label1.setBounds(430, 180, 400, 35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("ink free",Font.BOLD,16));
        label2.setBounds(430, 220, 400, 35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        b = new JButton("Back");
        b.setFont(new Font("ink free", Font.BOLD,14));
        b.setBackground(new Color(10, 80, 108));
        b.setForeground(Color.white);
        b.setBounds(700,407,150,35);
        b.addActionListener(this);
        l3.add(b);

        int balance = 0;
        try{
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while(resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));

                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main(pin);
    }

    public static void main(String[] args) {
        new inquery("");
    }
}
