package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {

    String pin;
    JButton  b, b2;
    JTextField t1;

    withdrawl(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550, 830);
        add(l3);

        JLabel label1 = new JLabel("Enter amount you want  to withdrawl");
        label1.setFont(new Font("ink free",Font.BOLD,16));
        label1.setBounds(480, 180, 400, 35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        t1 = new JTextField();
        t1.setBounds(480,230,250,35);
        t1.setFont(new Font("ink free", Font.BOLD,16));
        l3.add(t1);

        b = new JButton("Withdraw");
        b.setFont(new Font("ink free", Font.BOLD,14));
        b.setBackground(new Color(10, 80, 108));
        b.setForeground(Color.white);
        b.setBounds(700,360,130,30);
        b.addActionListener(this);
        l3.add(b);

        b2 = new JButton("Back");
        b2.setFont(new Font("ink free", Font.BOLD,14));
        b2.setBackground(new Color(10, 80, 108));
        b2.setForeground(Color.white);
        b2.setBounds(700,410,130,30);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0,0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount = t1.getText();
            Date date = new Date();

            if(e.getSource()==b2){
                setVisible(false);
                new main(pin);
            }

            else if(t1.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter the valid Amount");
            }
            else if(e.getSource()==b){
                Con c = new Con();
                ResultSet resultSet =c.statement.executeQuery("select * from bank where pin = '" +pin+"' ");
                int balance = 0;
                while(resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));

                   }else {// if(balance >= Integer.parseInt(amount))                                   //////////////////////////////////////////////
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if (balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'withdrawl',  '"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs."+amount+ " Debited Successfully");
                setVisible(false);
                new main(pin);
            }


        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new withdrawl("");
    }
}
