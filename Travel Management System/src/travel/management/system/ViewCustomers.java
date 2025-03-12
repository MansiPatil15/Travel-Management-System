package travel.management.system;


import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ViewCustomers extends JFrame implements ActionListener{
    
  //  JLabel labeluserName;
    JButton back;
    
    ViewCustomers(String username){
        setBounds(450, 180, 870, 625);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
        JLabel lbluserName = new JLabel("Username");
        //lbluserName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lbluserName.setBounds(30, 50, 150, 25);
        add(lbluserName);
        
        JLabel  labeluserName = new JLabel();
        //labeluserName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labeluserName.setBounds(220, 50, 150, 25);
        add(labeluserName);
        
        JLabel lblid = new JLabel("ID :");
        lblid.setBounds(30, 110, 150,25);
        add(lblid);
        
        JLabel labelid = new JLabel();
        //labelid.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labelid.setBounds(220, 110, 150, 25);
        add(labelid);
     
        JLabel lblnumber = new JLabel("Number :");
        lblnumber.setBounds(30, 170, 150,25);
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        //labelid.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labelnumber.setBounds(220, 170, 150, 25);
        add(labelnumber);

        JLabel lblName = new JLabel("Name");
        //lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblName.setBounds(30, 230, 150, 25);
        add(lblName);
        
        JLabel labelName = new JLabel();
        //labelName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labelName.setBounds(220, 230, 150, 25);
        add(labelName);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 290, 150,25);
        add(lblgender);
        
        JLabel labelgender = new JLabel();
        //labelgender.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labelgender.setBounds(220, 290, 150, 25);
        add(labelgender);
        
        JLabel  lblcountry= new JLabel("Country");
        lblcountry.setBounds(500, 50, 150,25);
        add(lblcountry);
        
        JLabel labelcountry = new JLabel();
        //labelcountry.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labelcountry.setBounds(690, 50, 150, 25);
        add(labelcountry);
        
        JLabel  lbladdress= new JLabel("Address");
        lbladdress.setBounds(500, 110, 150,25);
        add(lbladdress);
        
        JLabel labeladdress = new JLabel();
        //labeladdress.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labeladdress.setBounds(690, 110, 150, 25);
        add(labeladdress);
        
        JLabel  lblphone= new JLabel("Phone");
        lblphone.setBounds(500, 170, 150,25);
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        //labelphone.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labelphone.setBounds(690, 170, 150, 25);
        add(labelphone);
        
        JLabel  lblemail= new JLabel("Email");
        lblemail.setBounds(500, 230, 150,25);
        add(lblemail);
        
        JLabel labelemail = new JLabel();
        //labelemail.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labelemail.setBounds(690, 230, 150, 25);
        add(labelemail);
        
        back =new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i3 = i1.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(20,400,600,200);
        add(l1);
        
        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(600,400,600,200);
        add(l2);
    
        try{
                    Conn c = new Conn();
                        String query = "select * from customer where username='m2'";
                        ResultSet rs = c.s.executeQuery(query);
                        while(rs.next()){
                             labeluserName.setText(rs.getString("username"));  
                             labelid.setText(rs.getString("id"));
                             labelnumber.setText(rs.getString("number"));
                             labelName.setText(rs.getString("name"));
                             labelgender.setText(rs.getString("gender"));
                             labelcountry.setText(rs.getString("country"));
                             labeladdress.setText(rs.getString("address"));
                             labelphone.setText(rs.getString("phone"));
                             labelemail.setText(rs.getString("email"));
                           
                             
                             
                        }
                } catch(Exception e){
                      //  e1.printStackTrace();
                }
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
            setVisible(false);
    }
    
    
    public static void main(String[] args) {
        new ViewCustomers("m1");
      }

    }
    
