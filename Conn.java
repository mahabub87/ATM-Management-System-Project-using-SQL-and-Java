
package atm.management.system.project;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
        try {
        
            c = DriverManager.getConnection("jdbc:mysql:///atmmanagementsystem","root","ATMmanagementsystem");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
