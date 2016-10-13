
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hashi Ariyarathne
 */
public class Loginuser
{
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public void user(String user,String pass)
    {
        try
        {
            conn = mysqlConnector.ConnectDB();
            pst = conn.prepareStatement("select * from student where fname=? and password=?");
            pst.setString(1,user);
            pst.setString(2, pass);
            rs =pst.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Login sucsess!!");
                StudentRegistration win = new StudentRegistration();
                win.setVisible(true);
            }else
            {
                JOptionPane.showMessageDialog(null, "password or First name is incorrect");
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
