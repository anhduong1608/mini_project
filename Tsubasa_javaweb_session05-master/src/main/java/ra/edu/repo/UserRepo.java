package ra.edu.repo;

import ra.edu.db.DBUtility;
import ra.edu.model.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepo {
    public Customer login(String username, String password) {
        Customer c = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        conn = DBUtility.openConnection();
        try {
            ps = conn.prepareStatement("select * from Customer where username=? and password=?");
            ps.setString(1,username);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if (rs.next()) {
                c = new Customer();
                c.setId(rs.getInt("id"));
                c.setUsername(rs.getString("username"));
                c.setPassword(rs.getString("password"));
                c.setEmail(rs.getString("email"));
                c.setAddress(rs.getString("address"));
                c.setGender(rs.getString("gender"));
                c.setPhone(rs.getString("phone"));
                c.setRole(rs.getString("role"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtility.closeConnection(conn);
        }
        return c;
    }

}
