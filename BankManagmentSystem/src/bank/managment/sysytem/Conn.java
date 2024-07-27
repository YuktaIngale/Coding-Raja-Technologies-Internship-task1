
package bank.managment.sysytem;


import java.sql.*;


public class Conn {

    Connection c; 
    Statement s;
    public Conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root", "yukta2003");
            s = c.createStatement();
            
        } catch (Exception e) {
            System.out.print(e);
        }
        
        
    }
   
}
