
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class addproduct_frame {
    connection con = new connection();
    public int addproduct(String prname, int prqty, int prprice){
    int z = 0;
    String sql= "insert into product_info values (null,?,?,?)";
    try{
        Class.forName(con.driver);
        Connection conn = DriverManager.getConnection(con.url,con.username,con.password);
        PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, prname);
        ps.setInt(2, prqty);
        ps.setInt(3, prprice);
        ps.executeUpdate();
    
    
        
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(addproduct_frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addproduct_frame.class.getName()).log(Level.SEVERE, null, ex);
        }return z;
    }
    public void deleteprod(int id){
        try{
            Class.forName(con.driver);
            Connection conn = DriverManager.getConnection(con.url,con.username,con.password);
            PreparedStatement pstmt = conn.prepareStatement("Delete from product where id =?");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addproduct_frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addproduct_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    

