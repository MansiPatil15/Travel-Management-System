////package travel.management.system;
////
////import java.sql.*;
////
////public class Conn  {
////    
////    Connection c;
////    
////    Statement s;
////    
////    Conn(){
////        
////        try{
////        Class.forName("com.mysql.cj.jdbc.Driver");
////        c=DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","root");
////        s=c.createStatement(); 
////        
////        }
////        
////        catch(Exception e){
////        e.printStackTrace();
////        }
////    }
////    
////}

package travel.management.system;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///tms","root","root"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  