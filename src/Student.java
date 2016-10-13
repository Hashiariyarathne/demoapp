
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class Student
{
                  Connection conn;
                  PreparedStatement pst;
    public void student_details(String fname,String lname, String year,String month, String date, String gender,String address,String p)
    {
        try
       {
                conn = mysqlConnector.ConnectDB();
                pst = conn.prepareStatement("insert into student(fname,lname,year,month,date,gender,address) values(?,?,?,?,?,?,?,?)");
                pst.setString(1,fname);
                pst.setString(2,lname);
                pst.setString(3,year);
                pst.setString(4,month);
                pst.setString(5,date);
                pst.setString(6,gender);
                pst.setString(7,address);
                pst.setString(8, p);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Data saved !!");
        
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }

    }
}
