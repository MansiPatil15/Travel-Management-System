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

public class BookPackage extends JFrame implements ActionListener{
	//private JPanel contentPane;
        JTextField tfpersons;
        Choice cpackage;
        String username;
        JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
        JButton checkprice,bookpackage,back;
        
        BookPackage(String username ){
            this.username=username;
            setBounds(350, 200, 1100, 500);
            setLayout(null);
            
            JLabel text = new JLabel("BOOK PACKAGE");
	    text.setFont(new Font("Tahamo", Font.PLAIN, 20));
            text.setBounds(100, 10, 200, 30);
	    add(text);
            
            JLabel lblusername = new JLabel("Username");
	    lblusername.setFont(new Font("Tahamo", Font.PLAIN, 16));
            lblusername.setBounds(40, 70, 200, 30);
	    add(lblusername);
            
            labelusername = new JLabel();
	    labelusername.setFont(new Font("Tahamo", Font.PLAIN, 16));
            labelusername.setBounds(250, 70, 200, 20);
	    add(labelusername);
            
            JLabel lblpackage = new JLabel("Select Package");
	    lblpackage.setFont(new Font("Tahamo", Font.PLAIN, 16));
            lblpackage.setBounds(40, 110, 150, 20);
	    add(lblpackage);
            
            cpackage=new Choice();
            cpackage.add("Gold Package");
            cpackage.add("Silver Package");
            cpackage.add("Beonze Package");
            cpackage.setBounds(250, 110, 200, 20);
            add(cpackage);        
            
            JLabel lblpersons = new JLabel("Total Persons");
            lblpersons.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lblpersons.setBounds(40, 150, 150, 25);
	    add(lblpersons);
            
            tfpersons =new JTextField("1");
            tfpersons.setBounds(250, 150, 200, 25);
	    add(tfpersons);
            
            
            JLabel lblid = new JLabel("Id");
	    lblid.setFont(new Font("Tahamo", Font.PLAIN, 16));
            lblid.setBounds(40, 190, 150, 20);
	    add(lblid);
            
            labelid = new JLabel();
	    labelid.setFont(new Font("Tahamo", Font.PLAIN, 16));
            labelid.setBounds(250, 190, 200, 20);
	    add(labelid);
            
             JLabel lblnumber = new JLabel("Number");
            lblnumber.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lblnumber.setBounds(40, 230, 150, 25);
	    add(lblnumber);
            
            labelnumber = new JLabel();
	    labelnumber.setFont(new Font("Tahamo", Font.PLAIN, 16));
            labelnumber.setBounds(250, 230, 150, 20);
	    add(labelnumber);
            
            JLabel lblphone = new JLabel("phone");
            lblphone.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lblphone.setBounds(40, 270, 150, 20);
	    add(lblphone);
            
            labelphone = new JLabel();
	    labelphone.setFont(new Font("Tahamo", Font.PLAIN, 16));
            labelphone.setBounds(250, 270, 200, 25);
	    add(labelphone);
            
            JLabel lblprice = new JLabel("Total Price");
            lblprice.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lblprice.setBounds(40, 310, 150, 20);
	    add(lblprice);
            
            labelprice = new JLabel();
	    labelprice.setFont(new Font("Tahamo", Font.PLAIN, 16));
            labelprice.setBounds(250, 310, 200, 25);
	    add(labelprice);
            
             try{
                    Conn c = new Conn();
                        String query = "select * from customer where username='"+username+"'";
                        ResultSet rs = c.s.executeQuery(query);
                        while(rs.next()){
                             labelusername.setText(rs.getString("username"));  
                             labelid.setText(rs.getString("id"));
                             labelnumber.setText(rs.getString("number"));
                            
                             String phoneValue = rs.getString("phone");
        if (phoneValue == null || phoneValue.trim().isEmpty()) {
            phoneValue = "0";  // Set a default phone number if missing
        }
        labelphone.setText(phoneValue);
                             
                             
                        }
                } catch(Exception e){
                       e.printStackTrace();
                }
             
        checkprice =new JButton("Book Package");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(60,380,120,25);
        checkprice.addActionListener(this);
        add(checkprice);     
          
        bookpackage =new JButton("Check Price");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(200,380,120,25);
        bookpackage.addActionListener(this);
        add(bookpackage);  
             
        back =new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340,350,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(550,50,500,300);
        add(la1);
             
             setVisible(true);
}
        public void actionPerformed(ActionEvent ae) {
          if(ae.getSource()==checkprice){
           String pack=cpackage.getSelectedItem();
             int cost=0;
            if(pack.equals("Gold Package")){
              cost+=12000;
           }else if(pack.equals("Silver Package")){
                cost+=25000;
         // }else (pack.equals("Bronze package")){
          }else{
                  cost+=32000;
                 }   
            int persons=Integer.parseInt(tfpersons.getText());
             cost *=persons;
             labelprice.setText("Rs"+cost);
         } else if(ae.getSource()==bookpackage){
               try{
                   Conn c=new Conn();
                   c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfpersons.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
               
                   JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                                setVisible(false);
               
               }catch(Exception e)  {
               e.printStackTrace();
               }    
             }else{
                setVisible(false);
            }
     
        }
        
        
        
	public static void main(String[] args) {
            new BookPackage("m2");
  }

}