package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame  implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton next, cancle;
    String formno;

    Signup3(String first){
        super("SignUp 3 ");

        this.formno = first;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3 :");
        l1.setBounds(280, 40, 400, 40);
        l1.setFont(new Font("ink free", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Account Details : ");
        l2.setBounds(280, 70, 400, 40);
        l2.setFont(new Font("ink free", Font.BOLD, 22));
        add(l2);

        JLabel l3 = new JLabel("Account Type : ");
        l3.setBounds(100, 140, 200, 30);
        l3.setFont(new Font("ink free", Font.BOLD, 18));
        add(l3);

        r1 = new JRadioButton("Saving ");
        r1.setBounds(300, 140, 100, 30);
        r1.setFont(new Font("ink free", Font.BOLD, 18));
        r1.setBackground(new Color(104, 236, 213));;
        add(r1);

        r2 = new JRadioButton("Current ");
        r2.setBounds(400, 140, 100, 30);
        r2.setFont(new Font("ink free", Font.BOLD, 18));
        r2.setBackground(new Color(104, 236, 213));
        add(r2);

        r3 = new JRadioButton("Fixed");
        r3.setBounds(500, 140, 100, 30);
        r3.setFont(new Font("ink free", Font.BOLD, 18));

        r3.setBackground(new Color(104, 236, 213));
        add(r3);

        r4 = new JRadioButton("Recurrent Deposit ");
        r4.setBounds(600, 140, 200, 30);
        r4.setFont(new Font("ink free", Font.BOLD, 18));
        r4.setBackground(new Color(104, 236, 213));
        add(r4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        JLabel l4 = new JLabel("Card No. : ");
        l4.setBounds(100, 190, 200, 30);
        l4.setFont(new Font("ink free", Font.BOLD, 18));
        add(l4);

        JLabel l6 = new JLabel("xxxx-xxxx-xxxx-4169");
        l6.setBounds(310, 190, 450, 30);
        l6.setFont(new Font("ink free", Font.BOLD, 18));
        add(l6);

        JLabel l5 = new JLabel("(Your 16-digit card No.)");
        l5.setBounds(100, 210, 250, 30);
        l5.setFont(new Font("ink free", Font.BOLD, 12));
        add(l5);

        JLabel l7 = new JLabel("(It would appear on atm/cheque book or statement)");
        l7.setBounds(310, 210, 450, 30);
        l7.setFont(new Font("ink free", Font.BOLD, 12));
        add(l7);

        JLabel l8 = new JLabel("PIN : ");
        l8.setBounds(100, 260, 450, 30);
        l8.setFont(new Font("ink free", Font.BOLD, 18));

        add(l8);

        JLabel l9 = new JLabel("xxxx");
        l9.setBounds(310, 260, 450, 30);
        l9.setFont(new Font("ink free", Font.BOLD, 18));
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setBounds(100, 280, 450, 30);
        l10.setFont(new Font("ink free", Font.BOLD, 12));
        add(l10);

        JLabel l11 = new JLabel("Services Required :");
        l11.setBounds(100, 330, 300, 30);
        l11.setFont(new Font("ink free", Font.BOLD, 18));
        add(l11);

        c1 = new JCheckBox("ATM CARD ");
        c1.setBounds(300, 370, 300, 30);
        c1.setBackground(new Color(104, 236, 213));
        c1.setFont(new Font("ink free", Font.BOLD, 16));
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(104, 236, 213));
        c2.setFont(new Font("ink free", Font.BOLD, 16));
        c2.setBounds(600, 370, 300, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(104, 236, 213));
        c3.setFont(new Font("ink free", Font.BOLD, 16));
        c3.setBounds(300, 410, 300, 30);
        add(c3);

        c4 = new JCheckBox("Cheque Book");
        c4.setBackground(new Color(104, 236, 213));
        c4.setFont(new Font("ink free", Font.BOLD, 16));
        c4.setBounds(600, 410, 300, 30);
        add(c4);

        c5 = new JCheckBox("Email Alerts");
        c5.setBackground(new Color(104, 236, 213));
        c5.setFont(new Font("ink free", Font.BOLD, 16));
        c5.setBounds(300, 450, 300, 30);
        add(c5);

        c6 = new JCheckBox("E Statement");
        c6.setBackground(new Color(104, 236, 213));
        c6.setFont(new Font("ink free", Font.BOLD, 16));
        c6.setBounds(600, 450, 300, 30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to the best of my knowledge. ");
        c7.setBackground(new Color(104, 236, 213));
        c7.setFont(new Font("ink free", Font.BOLD, 16));
        c7.setBounds(100, 500, 800, 30);
        add(c7);

        next = new JButton("Submit");
        next.setFont(new Font("ink free", Font.BOLD, 18));
        next.setBounds(300, 600, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
       // next.setBackground(new Color(104, 236, 213));
        add(next);

        cancle = new JButton("Cancle");
        cancle.setFont(new Font("ink free", Font.BOLD, 18));
        cancle.setBounds(500, 600, 100, 30);
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.addActionListener(this);
       // cancle.setBackground(new Color(104, 236, 213));
        add(cancle);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("ink free", Font.BOLD, 14));
        l12.setBounds(680, 10, 140, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("ink free", Font.BOLD, 14));
        l13.setBounds(760, 10, 80, 30);
        add(l13);

        setLayout(null);
        setSize(850,800);
        setLocation(400, 20);
        getContentPane().setBackground(new Color(104, 236, 213));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null; // for cheakbox
        if((r1.isSelected())){
            atype = "Saving";
        }else if((r2.isSelected())){
            atype = "Current";
        }else if((r3.isSelected())){
            atype = "Fixed";
        }else if((r4.isSelected())){
            atype = "Recurrent Deposit";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong()% 90000000L) + 1409963000000000L;
        String cardno  = " "+ Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = ""+Math.abs(first3);

        String fac = " ";
        if(c1.isSelected()){
            fac += "ATM CARD";
        }else if(c2.isSelected()){
            fac += "Internet Banking";
        }else if(c3.isSelected()){
            fac += "Mobile Banking";
        }else if(c4.isSelected()){
            fac += "Cheque Book";
        }else if(c5.isSelected()){
            fac += "Email Alerts";
        }else if(c6.isSelected()){
            fac +="E Statement";
        }
        try{

            if(e.getSource() == next){
                if(atype.equals(" ")){
                    JOptionPane.showMessageDialog(null, "Fill all the Fields");
                }else{
                    Con con1 = new Con();
                    String q1 = "insert into signupthre values('"+formno+ "', '"+atype+ "', '"+cardno+ "',  '"+pin+ "', '"+fac+ "')";
                    String q2 = "insert into logi values('"+formno+ "', '"+cardno+ "',  '"+pin+ "')";
                    int i = con1.statement.executeUpdate(q1);
                    int j = con1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number :"+cardno+"\n Pin : " +pin );
                    new Diposite(pin);
                    setVisible(false);
                }
            }else if(e.getSource() == cancle){
                System.exit(0);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3(" ");
    }

}
