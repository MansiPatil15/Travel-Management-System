package travel.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame implements ActionListener{
  
    Paytm(){
        setBounds(500,200,800,600);
        
        JEditorPane j = new JEditorPane();
        j.setEditable(false);   

        try {
            j.setPage("https://paytm.com/rent-payment");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        } 

        JScrollPane scrollPane = new JScrollPane(j);     
        getContentPane().add(scrollPane);
      
        JButton back=new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        j.add(back);
        

       setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae){
        
        setVisible(false);
        new Payment();
       
    }
    
    public static void main(String[] args){
        new Paytm();
    }
}


