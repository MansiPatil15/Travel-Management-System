package travel.management.system;


import java.awt.*;
import java.sql.*;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener {

    JLabel labeluserName,labelName,lblgender;
    JComboBox comboid;
    JTextField tfnumber,tfCountry,tfaddress,tfphone,tfemail;
    JRadioButton rmale,rfemale;
    JButton add,back;
    
    AddCustomer(String username){
        
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
   
        JLabel lbluserName = new JLabel("Username");
        lbluserName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lbluserName.setBounds(30, 50, 150, 25);
        add(lbluserName);
           
        labeluserName = new JLabel();
        labeluserName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labeluserName.setBounds(220, 50, 150, 25);
        add(labeluserName);
          
        JLabel lblId = new JLabel("ID :");
        lblId.setBounds(30, 90, 150,25);
        add(lblId);
                
        comboid = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
        comboid.setBounds(220, 90, 150, 25);
        add(comboid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 130, 150,25);
        add(lblnumber);
                 
        tfnumber = new JTextField();
        tfnumber.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);
        
        JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblName.setBounds(30,170, 150, 25);
        add(lblName);
           
        labelName = new JLabel();
        labelName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        labelName.setBounds(220, 170, 150, 25);
        add(labelName);	
        
         lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 210, 150,25);
         add(lblgender);   
         
                rmale = new JRadioButton("Male");
                rmale.setFont(new Font("Raleway", Font.BOLD, 14));
                rmale.setBackground(Color.WHITE);
                rmale.setBounds(220, 210, 70, 25);
                 add(rmale);
                
                rfemale = new JRadioButton("Female");
                rfemale.setFont(new Font("Raleway", Font.BOLD, 13));
                rfemale.setBackground(Color.WHITE);
                rfemale.setBounds(300, 210, 70, 25);
		add(rfemale);
                
                ButtonGroup bg=new ButtonGroup();
                bg.add(rmale);
                bg.add(rfemale);
        
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
        
        add =new JButton("Add");
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
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i3 = i1.getImage().getScaledInstance(450, 500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(450,40,450,420);
        add(l1);
        
         try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from account where username = 'm2'");
                    while(rs.next()){
                          labeluserName.setText(rs.getString("username"));  
                           labelName.setText(rs.getString("name"));
                    }
                }catch(Exception e){
                e.printStackTrace();
                }
        

        setVisible(true);      
     }
    
    public void actionPerformed(ActionEvent ae) {
              if(ae.getSource()==add){
                  String username = labeluserName.getText();
                  String id=(String) comboid.getSelectedItem();
                  String number = tfnumber.getText();
                  String name = labelName.getText();
                  String gender= null;
                  if(rmale.isSelected()){
                  gender="Male";
                    }   else {gender="Female";
                  }

                
                 String country = tfCountry.getText(); 
                 String address = tfaddress.getText(); 
                 String phone = tfphone.getText(); 
                 String email = tfemail.getText(); 
                 
                 try{
                 Conn c=new Conn();
                  String query= "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                   c.s.executeUpdate(query);
                   
                   JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                                setVisible(false);
                 } catch(Exception e){
                     e.printStackTrace();
                 }
                }else{                this.dispose(); // Close the current window
                 // setVisible(false);
              }
         }

  public static void main(String[] args) {
        new AddCustomer("");
	}
}
