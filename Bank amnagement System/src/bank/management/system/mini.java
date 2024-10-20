//package bank.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//
//public class mini extends JFrame implements ActionListener {
//    String pin;
//
//    JButton b1;
//    mini(String pin){
//        this.pin = pin;
//
//        getContentPane().setBackground(new Color(246, 142, 242));
//        setSize(400, 600);
//        setLocation(20,20);
//        setLayout(null);
//
//        JLabel l1 = new JLabel("UnderGround Bank");
//        l1.setBounds(20,140,400,20);
//        add(l1);
//
//        JLabel l2 = new JLabel();
//        l2.setBounds(150,20,200,20);
//        add(l2);
//
//        JLabel l3 = new JLabel();
//        l3.setBounds(20,80,300, 20);
//        add(l3);
//
//        JLabel l4 = new JLabel();
//        l4.setBounds(20,400,300,20);
//        add(l4);
//
//        try{
//
//
//            Con c =new Con();
//            ResultSet resultSet = c.statement.executeQuery("select * from logi where pin = '"+pin+"' ");
//            while(resultSet.next()){
//                l3.setText("Card Number : "+resultSet.getString("cardno").substring(0, 4)+" xxxxxxxxxxxx"+resultSet.getString("cardno").substring(12));
//
//            }
//        }catch(Exception E){
//            E.printStackTrace();
//        }
//        try{
//            int balance = 0;
//            Con c = new Con();
//            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" +pin+ "' ");
//             while(resultSet.next()){
//                 l1.setText(l1.getText() +"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+resultSet.getString("amount")+"<br><br><html/>");
//                if (resultSet.getString("type").equals("Deposit")){
//                    balance += Integer.parseInt(resultSet.getString("amount"));
//                }else{
//                    balance -= Integer.parseInt(resultSet.getString("amount"));
//                }
//            }
//             l4.setText("Your Total balance is Rs "+balance);
//        }catch(Exception E){
//            E.printStackTrace();
//        }
//        b1 =  new JButton("Exit");
//        b1.setFont(new Font("ink free",Font.BOLD,18));
//        b1.setBounds(20,500,100,25);
//        add(b1);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        setVisible(false);
//    }
//
//    public static void main(String[] args) {
//        new mini("");
//    }
//}