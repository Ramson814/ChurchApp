 
package churchApplication;
 
import java.sql.*;

public class Conn {
  Connection connect;
  Statement stmt;  
   
    
   public Conn(){
       
   
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","ramson#warE123");
    stmt=connect.createStatement();
}
    catch(Exception e){
    System.out.println(e);
}
    }  
}
