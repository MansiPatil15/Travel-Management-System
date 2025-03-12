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

public class BookHotel extends JFrame implements ActionListener{
	//private JPanel contentPane;
        JTextField tfpersons,tfdays;
        Choice chotel,cac,cfood;
        String username;
        JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
        JButton bookhotel,bookpackage,back,checkprice;
        
        BookHotel(String username ){
             this.username=username;
            setBounds(350, 200, 1100, 600);
            setLayout(null);
            
            JLabel text = new JLabel("BOOK HOTEL");
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
            
            JLabel lblpackage = new JLabel("Select Hotel");
	    lblpackage.setFont(new Font("Tahamo", Font.PLAIN, 16));
            lblpackage.setBounds(40, 110, 150, 20);
	    add(lblpackage);
            
            chotel=new Choice();
            chotel.setBounds(250, 110, 200, 20);
            add(chotel);    
            
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hotel");
                    while(rs.next()){
                        chotel.add(rs.getString("name"));
                    }
                
            }catch(Exception e){
              e.printStackTrace();
        }
            
            JLabel lblpersons = new JLabel("Total Persons");
            lblpersons.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lblpersons.setBounds(40, 150, 150, 25);
	    add(lblpersons);
            
            tfpersons =new JTextField("1");
            tfpersons.setBounds(250, 150, 200, 25);
	    add(tfpersons);
            
            JLabel lbldays = new JLabel("Total No of Days");
            lbldays.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lbldays.setBounds(40, 190, 150, 25);
	    add(lbldays);
            
            tfdays =new JTextField("1");
            tfdays.setBounds(250, 190, 200, 25);
	    add(tfdays);
            
            JLabel lblac = new JLabel("AC/ Non-AC");
            lblac.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lblac.setBounds(40, 230, 150, 25);
            
            cac=new Choice();
            cac.add("AC");
            cac.add("Non-AC");
            cac.setBounds(250, 230, 200, 20);
            add(cac); 
            
            JLabel lblfood = new JLabel(" Food Included");
            lblfood.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lblfood.setBounds(40, 270, 150, 25);
            
            cfood=new Choice();
            cfood.add("Yes");
            cfood.add("No");
            cfood.setBounds(250, 270, 200, 20);
            add(cfood); 
            
            JLabel lblid = new JLabel("Id");
	    lblid.setFont(new Font("Tahamo", Font.PLAIN, 16));
            lblid.setBounds(40, 310, 150, 20);
	    add(lblid);
            
            labelid = new JLabel();
	    labelid.setFont(new Font("Tahamo", Font.PLAIN, 16));
            labelid.setBounds(250, 310, 200, 20);
	    add(labelid);
            
             JLabel lblnumber = new JLabel("Number");
            lblnumber.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lblnumber.setBounds(40, 350, 150, 25);
	    add(lblnumber);
            
            labelnumber = new JLabel();
	    labelnumber.setFont(new Font("Tahamo", Font.PLAIN, 16));
            labelnumber.setBounds(250, 350, 150, 20);
	    add(labelnumber);
            
            JLabel lblphone = new JLabel("phone");
            lblphone.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lblphone.setBounds(40, 390, 150, 20);
	    add(lblphone);
            
            labelphone = new JLabel();
	    labelphone.setFont(new Font("Tahamo", Font.PLAIN, 16));
            labelphone.setBounds(250, 390, 200, 25);
	    add(labelphone);
            
            JLabel lbltotal = new JLabel("Total Price");
            lbltotal.setFont(new Font("Tahamo", Font.PLAIN, 16));
	    lbltotal.setBounds(40, 430, 150, 20);
	    add(lbltotal);
            
            JLabel labeltotal = new JLabel();
	    labeltotal.setFont(new Font("Tahamo", Font.PLAIN, 16));
            labeltotal.setBounds(250, 430, 200, 25);
	    add(labeltotal);
            
             try{
                    Conn c = new Conn();
                        String query = "select * from customer where username='"+username+"'";
                        ResultSet rs = c.s.executeQuery(query);
                        while(rs.next()){
                             labelusername.setText(rs.getString("username"));  
                             labelid.setText(rs.getString("id"));
                             labelnumber.setText(rs.getString("number"));
                             
                             
                             
                        }
                } catch(Exception e){
                       e.printStackTrace();
                }
             
        bookhotel =new JButton("Book Hotel");
        bookhotel.setBackground(Color.BLACK);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBounds(60,490,120,25);
        bookhotel.addActionListener(this);
        add(bookhotel);     
          
        checkprice =new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(200,490,120,25);
        checkprice.addActionListener(this);
        add(checkprice);  
             
        back =new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340,490,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i3 = i1.getImage().getScaledInstance(600, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(550,50,600,300);
        add(la1);
             
             setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == checkprice) {
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel where name='" + chotel.getSelectedItem() + "'");
            while (rs.next()) {
                int cost = Integer.parseInt(rs.getString("costperperson"));
                int food = Integer.parseInt(rs.getString("foodincluded"));
                int ac = Integer.parseInt(rs.getString("acroom"));

                int persons = Integer.parseInt(tfpersons.getText());
                int days = Integer.parseInt(tfdays.getText());

                String acselected = cac.getSelectedItem();
                String foodselected = cfood.getSelectedItem();

                if (persons * days > 0) {
                    int total = 0;
                    total += acselected.equals("AC") ? ac : 0;
                    total += foodselected.equals("Yes") ? food : 0;
                    total += cost;
                    total = total * persons * days;
                    checkprice.setText("Rs" + total);
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else if (ae.getSource() == bookhotel) {
        try {
            Conn c = new Conn();
            c.s.executeUpdate("insert into bookhotel values('" + labelusername.getText() + "','" + chotel.getSelectedItem() + "','" + tfpersons.getText() + "','" + tfdays.getText() + "','" + cac.getSelectedItem() + "','" + cfood.getSelectedItem() + "','" + labelid.getText() + "','" + labelnumber.getText() + "','" + labelphone.getText() + "','" + labelprice.getText() + "')");

            JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        setVisible(false);
    }
} 

       public static void main(String[] args) {
        new BookHotel("m1");
 }
}
*/

package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener {
    JTextField tfpersons, tfdays;
    Choice chotel, cac, cfood;
    String username;
    JLabel labelusername, labelid, labelnumber, labelphone, labelprice;
    JButton bookhotel, bookpackage, back, checkprice;

    BookHotel(String username) {
        this.username = username;
        setBounds(350, 200, 1100, 600);
        setLayout(null);

        JLabel text = new JLabel("BOOK HOTEL");
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

        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setFont(new Font("Tahamo", Font.PLAIN, 16));
        lblpackage.setBounds(40, 110, 150, 20);
        add(lblpackage);

        chotel = new Choice();
        chotel.setBounds(250, 110, 200, 20);
        add(chotel);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            while (rs.next()) {
                chotel.add(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setFont(new Font("Tahamo", Font.PLAIN, 16));
        lblpersons.setBounds(40, 150, 150, 25);
        add(lblpersons);

        tfpersons = new JTextField("1");
        tfpersons.setBounds(250, 150, 200, 25);
        add(tfpersons);

        JLabel lbldays = new JLabel("Total No of Days");
        lbldays.setFont(new Font("Tahamo", Font.PLAIN, 16));
        lbldays.setBounds(40, 190, 150, 25);
        add(lbldays);

        tfdays = new JTextField("1");
        tfdays.setBounds(250, 190, 200, 25);
        add(tfdays);

        JLabel lblac = new JLabel("AC/ Non-AC");
        lblac.setFont(new Font("Tahamo", Font.PLAIN, 16));
        lblac.setBounds(40, 230, 150, 25);
        add(lblac);

        cac = new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250, 230, 200, 20);
        add(cac);

        JLabel lblfood = new JLabel("Food Included");
        lblfood.setFont(new Font("Tahamo", Font.PLAIN, 16));
        lblfood.setBounds(40, 270, 150, 25);
        add(lblfood);

        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250, 270, 200, 20);
        add(cfood);

        JLabel lblid = new JLabel("Id");
        lblid.setFont(new Font("Tahamo", Font.PLAIN, 16));
        lblid.setBounds(40, 310, 150, 20);
        add(lblid);

        labelid = new JLabel();
        labelid.setFont(new Font("Tahamo", Font.PLAIN, 16));
        labelid.setBounds(250, 310, 200, 20);
        add(labelid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Tahamo", Font.PLAIN, 16));
        lblnumber.setBounds(40, 350, 150, 25);
        add(lblnumber);

        labelnumber = new JLabel();
        labelnumber.setFont(new Font("Tahamo", Font.PLAIN, 16));
        labelnumber.setBounds(250, 350, 150, 20);
        add(labelnumber);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font("Tahamo", Font.PLAIN, 16));
        lblphone.setBounds(40, 390, 150, 20);
        add(lblphone);

        labelphone = new JLabel();
        labelphone.setFont(new Font("Tahamo", Font.PLAIN, 16));
        labelphone.setBounds(250, 390, 200, 25);
        add(labelphone);

        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahamo", Font.PLAIN, 16));
        lbltotal.setBounds(40, 430, 150, 20);
        add(lbltotal);

        labelprice = new JLabel(); // Initialize labelprice
        labelprice.setFont(new Font("Tahamo", Font.PLAIN, 16));
        labelprice.setBounds(250, 430, 200, 25);
        add(labelprice);

        try {
            Conn c = new Conn();
            String query = "select * from customer where username='" + username + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone")); // Add this line if phone is in the database
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        bookhotel = new JButton("Book Hotel");
        bookhotel.setBackground(Color.BLACK);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBounds(60, 490, 120, 25);
        bookhotel.addActionListener(this);
        add(bookhotel);

        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(200, 490, 120, 25);
        checkprice.addActionListener(this);
        add(checkprice);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340, 490, 100, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i3 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(550, 50, 600, 300);
        add(la1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == checkprice) {
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hotel where name='" + chotel.getSelectedItem() + "'");
                while (rs.next()) {
                    int cost = Integer.parseInt(rs.getString("costperperson"));
                    int food = Integer.parseInt(rs.getString("foodincluded"));
                    int ac = Integer.parseInt(rs.getString("acroom"));

                    int persons = Integer.parseInt(tfpersons.getText());
                    int days = Integer.parseInt(tfdays.getText());

                    String acselected = cac.getSelectedItem();
                    String foodselected = cfood.getSelectedItem();

                    if (persons * days > 0) {
                        int total = 0;
                        total += acselected.equals("AC") ? ac : 0;
                        total += foodselected.equals("Yes") ? food : 0;
                        total += cost;
                        total = total * persons * days;
                        labelprice.setText("Rs " + total); // Update labelprice instead of checkprice button
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == bookhotel) {
            try {
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel values('" + labelusername.getText() + "','" + chotel.getSelectedItem() + "','" + tfpersons.getText() + "','" + tfdays.getText() + "','" + cac.getSelectedItem() + "','" + cfood.getSelectedItem() + "','" + labelid.getText() + "','" + labelnumber.getText() + "','" + labelphone.getText() + "','" + labelprice.getText() + "')");

                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BookHotel("m1");
    }
}