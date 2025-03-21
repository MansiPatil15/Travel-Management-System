package travel.management.system;

//import java.sql.*;
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class CheckPackage extends JFrame{
    
    CheckPackage() {    
        setBounds(450, 220, 900, 600);  
        
//        String[] package1=("GOLD PACKAGE","6 days and 7 nights","Airport Assistance");
//        String[] package2=("SILVER PACKAGE","3 days and 4 nights","Toll Free And Free Tickets");
//        String[] package3=("BRONZE PACKAGE","2 days and 3 nights","Airport Assistance");
        
       String[] package1 = new String[]{"GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet",  "BOOK NOW", "Rs 12000 only","package1.jpg"};
      String[] package2 = new String[]{"SILVER PACKAGE","4 days and 3 Nights", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari",  "Cruise with Dinner", "BOOK NOW","Rs 25000 only","package2.jpg"};
      String[] package3 = new String[]{"BRONZE PACKAGE","6 days and 5 Nights",  "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet",  "BBQ Dinner", "BOOK NOW", "Rs 32000 only","package3.jpg"};
      
        
        JTabbedPane tab = new JTabbedPane();
        //JPanel p1 = createPackage(package1);
        //tab.addTab("Package 1", null, p1);
      
        JPanel p1=createPackage(package1);
        tab.addTab("Package1", null, p1);
       
        JPanel p2=createPackage(package2);
        tab.addTab("Package2", null, p2);
        
        JPanel p3=createPackage(package3);
        tab.addTab("Package3", null, p3);
    
         add(tab);
         
       setVisible(true);
    }
    
    public JPanel createPackage(String[] pack){
        
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50, 5, 300, 30);
        l1.setForeground(Color.YELLOW);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(l1);
    
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30, 60, 300, 30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30, 110, 300, 30);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30, 160, 300, 30);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30, 210, 300, 30);
        l5.setForeground(Color.RED);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30, 260, 300, 30);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l6);
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(60, 430, 300, 30);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 25));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(500, 430, 300, 30);
        l8.setForeground(Color.CYAN);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 25));
        p1.add(l8);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[8]));
        Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l9= new JLabel(i2);
        l9.setBounds(350,20,500,300);
        p1.add(l9);
        
        return p1;
    }
    
    public static void main(String[] args) {
        new CheckPackage();
    }
}
    
   