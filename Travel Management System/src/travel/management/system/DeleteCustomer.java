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


public class DeleteCustomer extends JFrame implements ActionListener{
    
  //  JLabel labeluserName;
    String username;
    JButton back;
    
    DeleteCustomer(String username){
        this.username=username;
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
        
        back =new JButton("Delete");
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
                        String query = "select * from customer where username='"+username+"'";
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
            try{
                 Conn c=new Conn();
                 c.s.executeUpdate("delete from account where username = '"+username+"'");
                 c.s.executeUpdate("delete from customer where username = '"+username+"'");
                 c.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
                 c.s.executeUpdate("delete from bookhotel where username = '"+username+"'");

	    JOptionPane.showMessageDialog(null, "Customer Detail Deleted Successfully");

              System.exit(0);
            }catch(Exception e){
            e.printStackTrace();
            }
    }
    
    
    public static void main(String[] args) {
        new DeleteCustomer("m2");
      }

    }
    




















/*package travel.management.system;


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
public class DeleteCustomer extends JFrame {
	private JPanel contentPane;
        Choice c1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteCustomer frame = new DeleteCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DeleteCustomer() throws SQLException {
		setBounds(580, 220, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
                Image i3 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(500,100,300,300);
                add(l1);
		
		JLabel lblName = new JLabel("DELETE CUSTOMER DETAILS");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 300, 53);
		contentPane.add(lblName);
                
                JLabel lb3 = new JLabel("Username :");
		lb3.setBounds(35, 70, 200, 14);
		contentPane.add(lb3);
                
                c1 = new Choice();
                Conn c = new Conn();
                try{

                    ResultSet rs = c.s.executeQuery("select * from customer");
                    while(rs.next()){
                        c1.add(rs.getString("username"));
                    }

                    rs.close();
                }catch(SQLException e){}

                c1.setBounds(271, 70, 150, 30);
                add(c1);
                
                JLabel lblId = new JLabel("ID :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                JLabel l2 = new JLabel();
		l2.setBounds(271, 110, 200, 14);
		contentPane.add(l2);
                
                JLabel lb2 = new JLabel("Number :");
		lb2.setBounds(35, 150, 200, 14);
		contentPane.add(lb2);
                
                JLabel l3 = new JLabel();
		l3.setBounds(271, 150, 200, 14);
		contentPane.add(l3);
		
		JLabel lblName_1 = new JLabel("Name :");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);
		
		JLabel l4 = new JLabel();
		l4.setBounds(271, 190, 200, 14);
		contentPane.add(l4);

                
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                JLabel l5 = new JLabel();
		l5.setBounds(271, 230, 200, 14);
		contentPane.add(l5);
                
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);
                
                JLabel l6 = new JLabel();
		l6.setBounds(271, 270, 200, 14);
		contentPane.add(l6);
		
		JLabel lblReserveRoomNumber = new JLabel("Permanent Address :");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                JLabel l7 = new JLabel();
		l7.setBounds(271, 310, 200, 14);
		contentPane.add(l7);
           	
		JLabel lblCheckInStatus = new JLabel("Phone :");
		lblCheckInStatus.setBounds(35, 350, 200, 14);
		contentPane.add(lblCheckInStatus);
                
                JLabel l8 = new JLabel();
		l8.setBounds(271, 350, 200, 14);
		contentPane.add(l8);

		
		JLabel lblDeposite = new JLabel("Email :");
		lblDeposite.setBounds(35, 390, 200, 14);
		contentPane.add(lblDeposite);
		
		JLabel l9 = new JLabel();
		l9.setBounds(271, 390, 200, 14);
		contentPane.add(l9);

		
		JButton b1 = new JButton("Check");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                            try{
                                ResultSet rs = c.s.executeQuery("select * from customer where username = 'rajanrai'");
                                if(rs.next()){
                                    l2.setText(rs.getString(2));  
                                    l3.setText(rs.getString(3));
                                    l4.setText(rs.getString(4));  
                                    l5.setText(rs.getString(5));
                                    l6.setText(rs.getString(6));  
                                    l7.setText(rs.getString(7));
                                    l8.setText(rs.getString(8));  
                                    l9.setText(rs.getString(9));
                                }
                            }catch(Exception ee){ }
                        }
		});
		b1.setBounds(425, 70, 80, 22);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		

		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                          
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "update from customer where username = '"+s1+"'";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Customer Detail Deleted Successfully");
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}
*/