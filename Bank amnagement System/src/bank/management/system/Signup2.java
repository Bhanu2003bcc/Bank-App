package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    String first;
    JRadioButton r1, r2, e1, e2;
    JButton button;

    Signup2(String first){  // string first receve the info of  first signup;

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100, 100);
        add(image);

        this.first = first;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("ink free",  Font.BOLD, 22));
        l1.setBounds(330, 70, 600, 30);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("ink free", Font.BOLD, 22));
        l2.setBounds(290, 90, 600, 30);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("ink free", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String Religion []= {"Hindu", "Muslim", "Sikh", "Cristian", "Other"};
        comboBox = new JComboBox(Religion);
        comboBox.setBackground(new Color(134, 203, 246));
        comboBox.setFont(new Font("ink free", Font.BOLD, 14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("ink free", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String Category[]= {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(134, 203, 246));
        comboBox2.setFont(new Font("ink free", Font.BOLD, 14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("ink free", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        String Income[]= {">2,400,00", ">5,000,00", ">7,500,00", ">12,000,00", "<12,000,00"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(134, 203, 246));
        comboBox3.setFont(new Font("ink free", Font.BOLD, 14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("ink free", Font.BOLD, 18));
        l6.setBounds(100, 270, 140, 30);
        add(l6);

        String Educational[]= {"10th", "12th", "Diploma", "UG", "PG", "Doctrate", "Other"};
        comboBox4 = new JComboBox(Educational);
        comboBox4.setBackground(new Color(134, 203, 246));
        comboBox4.setFont(new Font("ink free", Font.BOLD, 14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occcupation :");
        l7.setFont(new Font("ink free", Font.BOLD, 18));
        l7.setBounds(100, 320, 140, 30);
        add(l7);

        String Occcupation[]= {"Salaried", "Self Emplioyed", "Business", "Student", "Retired", "Teacher", "Other"};
        comboBox5 = new JComboBox(Occcupation);
        comboBox5.setBackground(new Color(134, 203, 246));
        comboBox5.setFont(new Font("ink free", Font.BOLD, 14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN No. :");
        l8.setFont(new Font("ink free", Font.BOLD, 18));
        l8.setBounds(100, 370, 140, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setBackground(new Color(134, 203, 246));
        textPan.setFont(new Font("ink free", Font.BOLD, 14));
        textPan.setBounds(350,370,320,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar No. :");
        l9.setFont(new Font("ink free", Font.BOLD, 18));
        l9.setBounds(100, 420, 140, 30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setBackground(new Color(134, 203, 246));
        textAadhar.setFont(new Font("ink free", Font.BOLD, 14));
        textAadhar.setBounds(350,420,320,30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("ink free", Font.BOLD, 18));
        l10.setBounds(100, 470, 140, 30);
        add(l10);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("ink free", Font.BOLD, 18));
        r1.setBackground(new Color(134, 203, 246));
        r1.setBounds(350, 470, 70, 30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("ink free", Font.BOLD, 18));
        r2.setBackground(new Color(134, 203, 246));
        r2.setBounds(500, 470, 70, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("ink free", Font.BOLD, 18));
        l11.setBounds(100, 520, 140, 30);
        add(l11);

        e1 = new JRadioButton("YES");
        e1.setFont(new Font("ink free", Font.BOLD, 18));
        e1.setBackground(new Color(134, 203, 246));
        e1.setBounds(350, 520, 70, 30);
        add(e1);

        e2 = new JRadioButton("NO");
        e2.setFont(new Font("ink free", Font.BOLD, 18));
        e2.setBackground(new Color(134, 203, 246));
        e2.setBounds(500, 520, 70, 30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("ink free", Font.BOLD, 14));
        l12.setBounds(680, 10, 140, 30);
        add(l12);

        JLabel l13 = new JLabel(first);
        l13.setFont(new Font("ink free", Font.BOLD, 14));
        l13.setBounds(760, 10, 80, 30);
        add(l13);

        button = new JButton("Next");
        button.setFont(new Font("ink free", Font.BOLD, 14));
        button.setBounds(570, 640, 100,30);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);

        setLayout(null);
        setSize(850,750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(134, 203, 246));
        setVisible(true);
    }
    // Used  to listen the
    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String incom = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occup = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String adhar = textAadhar.getText();

        String Scetizion = " ";
        if((r1.isSelected())){
            Scetizion = "Yes";
        } else if (r2.isSelected()) {
            Scetizion = "No";
        }

        String preAccount = " ";
        if((e1.isSelected())){
            preAccount = "Yes";
        } else if (e2.isSelected()) {
            preAccount = "No";
        }
     try{
         if(textAadhar.getText().equals("")  || textPan.getText().equals("")){
             JOptionPane.showMessageDialog(null,"fill all the fields");
         }else{
             Con  c1 =new Con();
             String sql = "insert  into signuptwo values('"+first+ "', '"+rel+ "', '"+cate+ "',  '"+incom+ "', '"+edu+ "', '"+pan+ "', '"+adhar+ "', '"+Scetizion+ "', '"+preAccount+ "')";
            int i = c1.statement.executeUpdate(sql); // insert all these data into data base
             new Signup3(first); // if all data save in database successfully then new page open through it
             setVisible(false);
         }
     }catch(Exception E){
         E.printStackTrace();
     }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
