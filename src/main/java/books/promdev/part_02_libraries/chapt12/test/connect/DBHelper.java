package books.promdev.part_02_libraries.chapt12.test.connect;

import books.promdev.part_02_libraries.chapt12.connect.ConnectorDB;
import books.promdev.part_02_libraries.chapt12.test.subject.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHelper {
    private final static String SQL_INSERT = "INSERT INTO users(id, name, age) VALUES(?, ?, ?)";
    
    private Connection connect;
    
    public DBHelper() throws SQLException {
        connect = ConnectorDB.getConnection();
    }
    public PreparedStatement getPreparedStatement() {
        PreparedStatement ps = null;
        try {
            ps = connect.prepareStatement(SQL_INSERT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }
    
    public boolean insertUser(PreparedStatement ps, User us) {
        boolean flag = false;
        try {
            ps.setInt(1, us.getId());
            ps.setString(2, us.getName());
            ps.setInt(3, us.getAge());
            ps.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
    public void closeStatement(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
