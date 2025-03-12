package travel.management.system;


import java.awt.*;
import java.sql.*;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class UpdateCustomer extends JFrame implements ActionListener {

    JLabel labeluserName,labelName,lblgender;
    JComboBox comboid;
    JTextField tfnumber,tfCountry,tfaddress,tfphone,tfemail,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;
    
    UpdateCustomer(String username){
        
        setBounds(500, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text=new JLabel("UPADATE CUSTOMER DETAILS");
        text.setBounds(50, 0, 300, 25);
        text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(text);
        
   
        JLabel lbluserName = new JLabel("Username");
       // lbluserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbluserName.setBounds(30, 50, 150, 25);
        add(lbluserName);
           
        labeluserName = new JLabel();
        //labeluserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        labeluserName.setBounds(220, 50, 150, 25);
        add(labeluserName);
          
        JLabel lblId = new JLabel("ID :");
        lblId.setBounds(30, 90, 150,25);
        add(lblId);
                
        tfid = new JTextField();
        tfid.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        tfid.setBounds(220, 90, 150, 25);
        add(tfid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 130, 150,25);
        add(lblnumber);
                 
        tfnumber = new JTextField();
        tfnumber.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);
        
        JLabel lblName = new JLabel("Name");
       // lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblName.setBounds(30,170, 150, 25);
        add(lblName);
           
        labelName = new JLabel();
        //labelName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labelName.setBounds(220, 170, 150, 25);
        add(labelName);	
        
         lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 210, 150,25);
         add(lblgender);   
         
        tfgender = new JTextField();
        tfgender.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        tfgender.setBounds(220, 210, 150, 25);
        add(tfgender);        
        
        JLabel lblCountry = new JLabel("Country");
        lblCountry.setBounds(30, 250, 150,25);
        add(lblCountry);
                 
        tfCountry = new JTextField();
        tfCountry.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        tfCountry.setBounds(220, 250, 150, 25);
        add(tfCountry);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30, 290, 150,25);
        add(lbladdress);
                 
        tfaddress = new JTextField();
        tfaddress.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        tfaddress.setBounds(220, 290, 150, 25);
        add(tfaddress);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30, 330, 150,25);
        add(lblphone);
                 
        tfphone = new JTextField();
        tfphone.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        tfphone.setBounds(220, 330, 150, 25);
        add(tfphone);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30, 370, 150,25);
        add(lblemail);
                 
        tfemail = new JTextField();
        tfemail.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        tfemail.setBounds(220, 370, 150, 25);
        add(tfemail);
        
        add =new JButton("Update");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);
        
        back =new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i3 = i1.getImage().getScaledInstance(450, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(450,100,450,300);
        add(l1);
        
         try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = 'm2'");
                    while(rs.next()){
                          labeluserName.setText(rs.getString("username"));  
                           labelName.setText(rs.getString("name"));
                           tfid.setText(rs.getString("id"));
                           tfnumber.setText(rs.getString("number"));
                           tfgender.setText(rs.getString("gender"));
                           tfCountry.setText(rs.getString("country"));
                           tfaddress.setText(rs.getString("address"));
                           tfphone.setText(rs.getString("phone"));
                           tfemail.setText(rs.getString("email"));
                    }
                }catch(Exception e){
                e.printStackTrace();
                }
        

        setVisible(true);      
     }
    
    public void actionPerformed(ActionEvent ae) {
              if(ae.getSource()==add){
                  String username = labeluserName.getText();
                  String id=tfid.getText();
                  String number = tfnumber.getText();
                  String name = labelName.getText();
                  String gender= tfgender.getText();
                 String country = tfCountry.getText(); 
                 String address = tfaddress.getText(); 
                 String phone = tfphone.getText(); 
                 String email = tfemail.getText(); 
                 
                 try{
                 Conn c=new Conn();
                  String query= "update  customer set username='"+username+"',id= '"+id+"',number = '"+number+"',name= '"+name+"',gender = '"+gender+"',country = '"+country+"',address= '"+address+"',phone = '"+phone+"',email='"+email+"'";
                   c.s.executeUpdate(query);
                   
                   JOptionPane.showMessageDialog(null, "Customer Updated Successfully");
                                setVisible(false);
                 } catch(Exception e){
                     e.printStackTrace();
                 }
                }else{                this.dispose(); // Close the current window
                 // setVisible(false);
              }
         }

  public static void main(String[] args) {
        new UpdateCustomer("");
	}
}



