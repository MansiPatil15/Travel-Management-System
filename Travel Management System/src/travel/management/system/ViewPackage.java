package travel.management.system;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import travel.management.system.Conn;
public class ViewPackage extends JFrame implements ActionListener {
    
    JButton back;
	//private JPanel contentPane;
       // Choice c1;
public ViewPackage(String username)  {	
            setBounds(450, 200, 900, 450);
            setLayout(null);
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);
    
            JLabel text = new JLabel("VIEW PACKAGE DETAILS");
	    text.setFont(new Font("Tahamo", Font.PLAIN, 20));
            text.setBounds(100, 0, 400, 40);
	    add(text);
            
             JLabel lblusernanme = new JLabel("Username :");
		lblusernanme.setBounds(35, 70, 200, 14);
		add(lblusernanme);
                
                JLabel labelusername = new JLabel();
		labelusername.setBounds(271, 70, 200, 14);
		add(labelusername);
                
                JLabel lblpackage = new JLabel("Package :");
		lblpackage.setBounds(35, 110, 200, 14);
		add(lblpackage);
                
                JLabel labelpackage = new JLabel();
		labelpackage.setBounds(271, 110, 200, 14);
		add(labelpackage);
                
                JLabel lblperson = new JLabel("Number of Persons :");
		lblperson.setBounds(35, 150, 200, 14);
		add(lblperson);
                
                JLabel labelperson = new JLabel();
		labelperson.setBounds(271, 150, 200, 14);
		add(labelperson);
		
		JLabel lblid = new JLabel("ID :");
		lblid.setBounds(35, 190, 200, 14);
		add(lblid);
		
		JLabel labelid = new JLabel();
		labelid.setBounds(271, 190, 200, 14);
		add(labelid);

                
		JLabel lblnumber = new JLabel("Number :");
		lblnumber.setBounds(35, 230, 200, 14);
		add(lblnumber);
                
                JLabel labelnumber = new JLabel();
		labelnumber.setBounds(271, 230, 200, 14);
		add(labelnumber);
                
		JLabel lblphone = new JLabel("Phone :");
		lblphone.setBounds(35, 270, 200, 14);
		add(lblphone);
                
                JLabel labelphone = new JLabel();
		labelphone.setBounds(271, 270, 200, 14);
		add(labelphone);
		
		JLabel lblprice = new JLabel("Price :");
		lblprice.setBounds(35, 310, 200, 14);
		add(lblprice);
                
                JLabel labelprice = new JLabel();
		labelprice.setBounds(271, 310, 200, 14);
		add(labelprice);
            
            
                back =new JButton("Back");
                back.setBackground(Color.BLACK);
                back.setForeground(Color.WHITE);
                back.setBounds(130,360,100,25);
                back.addActionListener(this);
                add(back);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 350,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,40,350,350);
                add(la1);
                
                
                
        
        try{
                    Conn c = new Conn();
                        String query = "select * from bookpackage where username='m2'";
                        ResultSet rs = c.s.executeQuery(query);
                        while(rs.next()){
                             labelusername.setText(rs.getString("username"));  
                             labelid.setText(rs.getString("id"));
                             labelnumber.setText(rs.getString("number"));
                             labelpackage.setText(rs.getString("package"));
                             labelprice.setText(rs.getString("price"));
                             labelperson.setText(rs.getString("persons"));
                             
                             labelphone.setText(rs.getString("phone"));
                             
                           
                             
                             
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
        new ViewPackage("");
      }

    }
    