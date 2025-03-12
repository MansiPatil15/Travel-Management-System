/*package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Destination extends JFrame implements Runnable {

    Thread t1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JLabel[] label=new JLabel[]{l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};
    JLabel caption;
    
    public void run(){
        String[] text=new String[]{"JW Marriott Hotel","Mandarin Oriental Hotel","Four Seasons Hotel","Radisson Hotel","Classio Hotel","The Bay Club Hotel","Breeze Blows Hotel","Quick Stop Hotel","Happy Mornings Motel","Moss View Hotel"};
        try{
                for(int i=0;i<9;i++){
                label[i].setVisible(true);
                Thread.sleep(2000);
                label[i].setVisible(false);
                }
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
     
  Destination(){

        setBounds(500, 200, 800, 600);
        
        caption=new JLabel();
        caption.setBounds(50,500,1000,70);
        caption.setFont(new Font("Tahoma",Font.PLAIN,40));
        caption.setForeground(Color.WHITE);
        add(caption);
        
        ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
        ImageIcon[] image=new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};

        Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
        Image[] jimage=new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};

        ImageIcon k1=null,k2=null,k3=null,k4=null,k5=null,k6=null,k7=null,k8=null,k9=null,k10=null;
       ImageIcon[] kimage=new ImageIcon[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};
        
  for(int i=0;i<9;i++){
        image[i] = new ImageIcon(getClass().getResource("icons/dest"+(i+1)+".jpg"));
        jimage[i] = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        kimage[i] = new ImageIcon(jimage[i]);
        label[i]= new JLabel(kimage[i]);
        label[i].setBounds(0, 0, 800, 600);
        add(label[i]);
        }
  
          t1=new Thread(this);
          t1.start();
  
        setVisible(true);
  

}

    public static void main(String[] args) {
        new Destination();

    }

}*/

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Destination extends JFrame implements Runnable {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
    Thread th;

    public void run() {
        try {

            l2.setVisible(true);
            Thread.sleep(2800);
            l2.setVisible(false);
            l3.setVisible(true);
            l3.setVisible(true);
            Thread.sleep(2800);
            l3.setVisible(false);
            l4.setVisible(true);
            Thread.sleep(2800);
            l4.setVisible(false);
            l5.setVisible(true);
            Thread.sleep(2800);
            l5.setVisible(false);
            l6.setVisible(true);
            Thread.sleep(2800);
            l6.setVisible(false);
            l7.setVisible(true);
            Thread.sleep(2800);
            l7.setVisible(false);
            l8.setVisible(true);
            Thread.sleep(2800);
            l8.setVisible(false);
            l9.setVisible(true);
            Thread.sleep(2800);
            l9.setVisible(false);
            l10.setVisible(true);
            Thread.sleep(2800);
            l10.setVisible(false);
            l11.setVisible(true);
            Thread.sleep(2800);
            l11.setVisible(false);
            
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Destination() {

        setBounds(580, 220, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));
        
        th = new Thread(this);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dest1.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 700);
        add(l2);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/dest2.png"));
        Image i5 = i4.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(0, 0, 900, 700);
        add(l3);
        l3.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/dest3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 900, 700);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/dest4.jpg"));
        Image i11 = i10.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 900, 700);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/dest5.jpg"));
        Image i14 = i13.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 900, 700);
        add(l6);
        l6.setVisible(false);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icons/dest6.jpg"));
        Image i17 = i16.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(0, 0, 900, 700);
        add(l7);
        l7.setVisible(false);

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("icons/dest7.jpeg"));
        Image i20 = i19.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        l8 = new JLabel(i21);
        l8.setBounds(0, 0, 900, 700);
        add(l8);
        l8.setVisible(false);

        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icons/dest8.jpg"));
        Image i23 = i22.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        l9 = new JLabel(i24);
        l9.setBounds(0, 0, 900, 700);
        add(l9);
        l9.setVisible(false);

        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("icons/dest9.jpg"));
        Image i26 = i25.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        l10 = new JLabel(i27);
        l10.setBounds(0, 0, 900, 700);
        add(l10);
        l10.setVisible(false);

        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("icons/dest10.jpg"));
        Image i29 = i28.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i30 = new ImageIcon(i29);
        l11 = new JLabel(i30);
        l11.setBounds(0, 0, 900, 700);
        add(l11);
        l11.setVisible(false);

        th.start();
        
        setVisible(true);

    }

    public static void main(String args[]) {
        new Destination();//.setVisible(true);

    }

}