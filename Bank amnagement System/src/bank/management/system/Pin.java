package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Pin extends JFrame implements ActionListener {

    String pin, Pin1, Pin2;
    JButton  b, b2;
    JPasswordField p1, p2;
    Pin(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3); // l3 = background Label
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel label1 = new JLabel("CHANGE PIN ");
        label1.setFont(new Font("ink free",Font.BOLD,16));
        label1.setBounds(430, 180, 400, 35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2 = new JLabel("New Pin");
        label2.setFont(new Font("ink free",Font.BOLD,16));
        label2.setBounds(430, 220, 400, 35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBounds(590,220,250,30);
        p1.setFont(new Font("ink free", Font.BOLD,16));
        l3.add(p1);

        JLabel label3 = new JLabel("Re - Enter New Pin");
        label3.setFont(new Font("ink free",Font.BOLD,16));
        label3.setBounds(430, 260, 400, 35);
        label3.setForeground(Color.WHITE);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBounds(590,260,250,30);
        p2.setFont(new Font("ink free", Font.BOLD,16));
        l3.add(p2);

        b = new JButton("Save");
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

        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            Pin1 = p1.getText();
            Pin2 = p2.getText();

            if (e.getSource() == b2) {
                new main(pin);
                setVisible(false);
            }

           else if (!Pin1.equals(Pin2)) {
                JOptionPane.showMessageDialog(null, "Enter Same Pin");
                return;
            }
                if (e.getSource()==b) {
                    if(p1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter New Password ");
                    return;
                    }
                    if (p2.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Re-Enter New Password ");
                        return;
                    }

                    Con c = new Con();
                    String q1 = "update bank set pin = '" + Pin1 + "' where pin = '" + pin + "' ";
                    String q2 = "update logi set pin = '" + Pin1 + "' where pin = '" + pin + "' ";
                    String q3 = "update signupthre set pin = '" + Pin1 + "' where pin = '" + pin + "' ";

                    c.statement.executeUpdate(q1);
                    c.statement.executeUpdate(q2);
                    c.statement.executeUpdate(q3);

                    JOptionPane.showMessageDialog(null,"Pin Successfully Changed");
                    setVisible(false);
                    new main(pin);

                }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
