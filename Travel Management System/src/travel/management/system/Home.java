package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import travel.management.system.CheckPackage;


public class Home extends JFrame implements ActionListener{
    String username;
    JButton AddDetails,UpdateDetails, ViewDeatils, DeleteDetails, CheckPackages, BookPackage, ViewPackage, ViewHotels, BookHotels, ViewBookHotels, Destinations, payment, Calculator, Notpad, About;
    
    
  /*  
    public static void main(String[] args) {
        new Home("").setVisible(true);
    }
    */
     Home(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        //setVisible(true);
    /*    super("Travel and Tourism Management System");
	this.username = username;
        setForeground(Color.CYAN);
        setLayout(null); */
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        
        JLabel l1 = new JLabel("Travel and Tourism Management System");
	l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 55));
	l1.setBounds(500, 60, 1000, 100);
	NewLabel.add(l1);
        
        AddDetails=new JButton("Add Personal Details");
        AddDetails.setBounds(0,10,300,50);
        AddDetails.setBackground(new Color(0,0,102));
        AddDetails.setForeground(Color.WHITE);
        AddDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        AddDetails.setMargin(new Insets(0,0,0,30));
        AddDetails.addActionListener(this);
        p2.add(AddDetails);
        
        UpdateDetails=new JButton("Update Personal Details");
        UpdateDetails.setBounds(0,50,300,50);
        UpdateDetails.setBackground(new Color(0,0,102));
        UpdateDetails.setForeground(Color.WHITE);
        UpdateDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        UpdateDetails.setMargin(new Insets(0,0,0,30));
        UpdateDetails.addActionListener(this);
        p2.add(UpdateDetails);
        
        ViewDeatils=new JButton("View Deatils");
        ViewDeatils.setBounds(0,100,300,50);
        ViewDeatils.setBackground(new Color(0,0,102));
        ViewDeatils.setForeground(Color.WHITE);
        ViewDeatils.setFont(new Font("Tahoma", Font.PLAIN, 20));
        ViewDeatils.setMargin(new Insets(0,0,0,130));
        ViewDeatils.addActionListener(this);
        p2.add(ViewDeatils);
                
        DeleteDetails=new JButton("Delete Personal Details");
        DeleteDetails.setBounds(0,150,300,50);      
        DeleteDetails.setBackground(new Color(0,0,102));
        DeleteDetails.setForeground(Color.WHITE);
        DeleteDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        DeleteDetails.setMargin(new Insets(0,0,0,40));
        DeleteDetails.addActionListener(this);
        p2.add(DeleteDetails);
        
        CheckPackages=new JButton("Check Packages");
        CheckPackages.setBounds(0,200,300,50);      
        CheckPackages.setBackground(new Color(0,0,102));
        CheckPackages.setForeground(Color.WHITE);
        CheckPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        CheckPackages.setMargin(new Insets(0,0,0,110));
        CheckPackages.addActionListener(this);
        p2.add(CheckPackages);
        
        BookPackage=new JButton("Book Package");
        BookPackage.setBounds(0,250,300,50);      
        BookPackage.setBackground(new Color(0,0,102));
        BookPackage.setForeground(Color.WHITE);
        BookPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BookPackage.setMargin(new Insets(0,0,0,120));
        BookPackage.addActionListener(this);
        p2.add(BookPackage);
        
         ViewPackage=new JButton("View Package");
        ViewPackage.setBounds(0,300,300,50);      
        ViewPackage.setBackground(new Color(0,0,102));
        ViewPackage.setForeground(Color.WHITE);
        ViewPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        ViewPackage.setMargin(new Insets(0,0,0,120));
        ViewPackage.addActionListener(this);
        p2.add(ViewPackage);
        
          ViewHotels=new JButton("View Hotels");
        ViewHotels.setBounds(0,350,300,50);      
        ViewHotels.setBackground(new Color(0,0,102));
        ViewHotels.setForeground(Color.WHITE);
        ViewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        ViewHotels.setMargin(new Insets(0,0,0,140));
        ViewHotels.addActionListener(this);
        p2.add(ViewHotels);
        
          BookHotels=new JButton("Book Hotels");
        BookHotels.setBounds(0,400,300,50);      
        BookHotels.setBackground(new Color(0,0,102));
        BookHotels.setForeground(Color.WHITE);
        BookHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BookHotels.setMargin(new Insets(0,0,0,140));
        BookHotels.addActionListener(this);
        p2.add(BookHotels);
        
          ViewBookHotels=new JButton(" View Book Hotels");
        ViewBookHotels.setBounds(0,450,300,50);      
        ViewBookHotels.setBackground(new Color(0,0,102));
        ViewBookHotels.setForeground(Color.WHITE);
        ViewBookHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        ViewBookHotels.setMargin(new Insets(0,0,0,120));
        ViewBookHotels.addActionListener(this);
        p2.add(ViewBookHotels);
        
         Destinations=new JButton(" Destinations");
        Destinations.setBounds(0,500,300,50);      
        Destinations.setBackground(new Color(0,0,102));
        Destinations.setForeground(Color.WHITE);
        Destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Destinations.setMargin(new Insets(0,0,0,140));
        Destinations.addActionListener(this);
        p2.add(Destinations);
        
        payment=new JButton(" Payment");
        payment.setBounds(0,550,300,50);      
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payment.setMargin(new Insets(0,0,0,160));
        payment.addActionListener(this);
        p2.add(payment);
        
         Calculator=new JButton("Calculator");
        Calculator.setBounds(0,600,300,50);      
        Calculator.setBackground(new Color(0,0,102));
        Calculator.setForeground(Color.WHITE);
        Calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Calculator.setMargin(new Insets(0,0,0,150));
        Calculator.addActionListener(this);
        p2.add(Calculator);
        
         Notpad=new JButton("Notpad");
        Notpad.setBounds(0,650,300,50);      
        Notpad.setBackground(new Color(0,0,102));
        Notpad.setForeground(Color.WHITE);
        Notpad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Notpad.setMargin(new Insets(0,0,0,150));
        Notpad.addActionListener(this);
        p2.add(Notpad);
        
         About=new JButton("About");
        About.setBounds(0,700,300,50);      
        About.setBackground(new Color(0,0,102));
        About.setForeground(Color.WHITE);
        About.setFont(new Font("Tahoma", Font.PLAIN, 20));
        About.setMargin(new Insets(0,0,0,160));
        About.addActionListener(this);
        p2.add(About);
        
        
        setVisible(true);
        
    }
     
     public void actionPerformed(ActionEvent ae) {
     if(ae.getSource()==AddDetails){
         new AddCustomer(username);
     }else if(ae.getSource()==ViewDeatils){
                  new ViewCustomers(username);
                   } else if (ae.getSource() == DeleteDetails) {
            new DeleteCustomer(username); 
        
             } else if(ae.getSource()==UpdateDetails){
                  new UpdateCustomer(username);
             }else if(ae.getSource()==CheckPackages){
                  new CheckPackage();
             }else if(ae.getSource()==BookPackage){
                  new BookPackage(username);
             }else if(ae.getSource()==ViewPackage){
                  new ViewPackage(username);
             }else if(ae.getSource()==ViewHotels){
                  new CheckHotels();
             }else if(ae.getSource()==Destinations){
                   new Destination();
              }else if(ae.getSource()==BookHotels){
                   new BookHotel(username); 
              } else if(ae.getSource()==ViewBookHotels){
                   new ViewBookedHotel(username); 
             }else if(ae.getSource()==payment){
                   new Payment();     
             }else if(ae.getSource()==Calculator){
                 try{
                     Runtime.getRuntime().exec("calc.exe");
                 }catch(Exception e){
                 e.printStackTrace();
                 }
             }else if(ae.getSource()==Notpad){
                 try{
                     Runtime.getRuntime().exec("notepad.exe");
           }catch(Exception e){
                 e.printStackTrace();
           }
        }else if(ae.getSource()==About){
                  new About();
        }
     
    
     }
             
 public static void main(String[] args) {
        new Home("m1");
 }
 
}