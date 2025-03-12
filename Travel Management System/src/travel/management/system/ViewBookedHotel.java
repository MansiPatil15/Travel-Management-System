
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
public class ViewBookedHotel extends JFrame implements ActionListener {
    
    JButton back;
	//private JPanel contentPane;
       // Choice c1;
public ViewBookedHotel(String username)  {	
            setBounds(450, 200, 1000,600);
            //setLayout(null);
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);
    
            JLabel lblName = new JLabel("VIEW BOOKED HOTEL DETAILS");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(88, 11, 350, 53);
		add(lblName);
                
                JLabel lblusername = new JLabel("Username :");
		lblusername.setBounds(35, 70, 200, 14);
		add(lblusername);
                
                JLabel labelusername = new JLabel();
		labelusername.setBounds(271, 70, 200, 14);
		add(labelusername);
                
                JLabel lblname = new JLabel("Name :");
		lblname.setBounds(35, 110, 200, 14);
		add(lblname);
                
                JLabel labelname = new JLabel();
		labelname.setBounds(271, 110, 200, 14);
		add(labelname);
                
                JLabel lblperson = new JLabel("Number of Persons :");
		lblperson.setBounds(35, 150, 200, 14);
		add(lblperson);
                
                JLabel labelperson = new JLabel();
		labelperson.setBounds(271, 150, 200, 14);
		add(labelperson);
		
		JLabel lbldays = new JLabel("Number of Days :");
		lbldays.setBounds(35, 190, 200, 14);
		add(lbldays);
		
		JLabel labeldays = new JLabel();
		labeldays.setBounds(271, 190, 200, 14);
		add(labeldays);

                
		JLabel lblac = new JLabel("AC / Non-AC :");
		lblac.setBounds(35, 230, 200, 14);
		add(lblac);
                
                JLabel labelac = new JLabel();
		labelac.setBounds(271, 230, 200, 14);
		add(labelac);
                
		JLabel lblfood = new JLabel("Food Included (Yes/No) :");
		lblfood.setBounds(35, 270, 200, 14);
		add(lblfood);
                
                JLabel labelfood = new JLabel();
		labelfood.setBounds(271, 270, 200, 14);
		add(labelfood);
		
		JLabel lblid = new JLabel("ID :");
		lblid.setBounds(35, 310, 200, 14);
		add(lblid);
                
                JLabel labelid = new JLabel();
		labelid.setBounds(271, 310, 200, 14);
		add(labelid);
           	
		JLabel lblnumber = new JLabel("Number :");
		lblnumber.setBounds(35, 350, 200, 14);
		add(lblnumber);
                
                JLabel labelnumber = new JLabel();
		labelnumber.setBounds(271, 350, 200, 14);
		add(labelnumber);

		
		JLabel lblphone = new JLabel("Phone :");
		lblphone.setBounds(35, 390, 200, 14);
		add(lblphone);
		
		JLabel labelphone = new JLabel();
		labelphone.setBounds(271, 390, 200, 14);
		add(labelphone);
                
                JLabel lblprice = new JLabel("price :");
		lblprice.setBounds(35, 430, 200, 14);
		add(lblprice);
		
		JLabel labelprice = new JLabel();
		labelprice.setBounds(271, 430, 200, 14);
		add(labelprice);
            
            
                back =new JButton("Back");
                back.setBackground(Color.BLACK);
                back.setForeground(Color.WHITE);
                back.setBounds(130,480,100,25);
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
                        String query = "select * from bookpackage where username='"+username+"'";
                        ResultSet rs = c.s.executeQuery(query);
                        while(rs.next()){
                             labelusername.setText(rs.getString("username"));  
                             labelusername.setText(rs.getString("id"));
                             labelnumber.setText(rs.getString("number"));
                             labelname.setText(rs.getString("name"));
                             labelprice.setText(rs.getString("price"));
                             labelperson.setText(rs.getString("persons"));
                             labelfood.setText(rs.getString("food"));
                             labelphone.setText(rs.getString("phone"));
                             labelac.setText(rs.getString("ac"));
                             labeldays.setText(rs.getString("days"));
                            // labelphone.setText(rs.getString("phone"));
                             
                           
                             
                             
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
        new ViewBookedHotel("m1");
      }

    }
   