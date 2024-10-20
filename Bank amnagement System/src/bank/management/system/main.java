package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;
    main(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550, 830);
        add(l3);

        JLabel l1 = new JLabel("PLEASE SELECT YOUR TRANSACTION");
        l1.setForeground(Color.white);
        l1.setBounds(480,180,700,35);
        l1.setFont(new Font("ink free", Font.BOLD,16));
        l3.add(l1);

        b1 = new JButton("DEPOSIT");
        b1.setBackground(new Color(55, 171, 255));
        b1.setForeground(Color.black);
        b1.setFont(new Font("ink free", Font.BOLD,12));
        b1.setBounds(410, 270,150, 30);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("FAST CASH");
        b2.setBackground(new Color(55, 171, 255));
        b2.setForeground(Color.black);
        b2.setFont(new Font("ink free", Font.BOLD,12));
        b2.setBounds(410, 315,150, 30);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("PIN CHANGE");
        b3.setBackground(new Color(55, 171, 255));
        b3.setForeground(Color.black);
        b3.setFont(new Font("ink free", Font.BOLD,12));
        b3.setBounds(410, 365,150, 30);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("EXIT");
        b4.setBackground(new Color(55, 171, 255));
        b4.setForeground(Color.black);
        b4.setFont(new Font("ink free", Font.BOLD,12));
        b4.setBounds(410, 415,150, 30);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("CASH WITHDRAWL");
        b5.setBackground(new Color(55, 171, 255));
        b5.setForeground(Color.black);
        b5.setFont(new Font("ink free", Font.BOLD,12));
        b5.setBounds(700, 270,150, 30);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("MINI STATEMENT");
        b6.setBackground(new Color(55, 171, 255));
        b6.setForeground(Color.black);
        b6.setFont(new Font("ink free", Font.BOLD,12));
        b6.setBounds(700, 315,150, 30);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("BALANCE ENQUARY");
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
        try{
            if(e.getSource()== b1){
                new Diposite(pin);
                setVisible(false);
            }
            else if(e.getSource() == b2){
                setVisible(false);
                new fastCash(pin);

            }
            else if(e.getSource()==b4){
                System.exit(0); //close the program
                //setVisible(false);
            }
            else if (e.getSource()==b5){
                new withdrawl(pin);
                setVisible(false);

            }else if(e.getSource() == b7){
              new inquery(pin);
                setVisible(false);
            } else if (e.getSource()==b3) {
                new Pin(pin);
                setVisible(false);
            } else if (e.getSource() == b6) {
                new mini(pin);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new main("");
    }
}
