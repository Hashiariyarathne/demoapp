



import java.sql.Connection;
import java.sql.DriverManager;


public class mysqlConnector {
    public static Connection ConnectDB(){
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        return conn;
    
    }
    
    
}
