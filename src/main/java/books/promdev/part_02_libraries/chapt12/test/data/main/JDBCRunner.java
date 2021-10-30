package books.promdev.part_02_libraries.chapt12.test.data.main;

import books.promdev.part_02_libraries.chapt12.connect.ConnectorDB;
import books.promdev.part_02_libraries.chapt12.test.subject.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCRunner {
    public static void main(String[] args) {
        Connection cn = null;
        try {   // block try 1
            cn = ConnectorDB.getConnection();
            Statement st = null;
            try {   // block try 2
                st = cn.createStatement();
                ResultSet rs = null;
                try {   // block try 3
                    String sql = "SELECT * FROM users";
                    rs = st.executeQuery(sql);
                    ArrayList<User> list = new ArrayList<>();
                        while (rs.next()) {
                            int id = rs.getInt(1);
                            int age = rs.getInt(3);
                            String name = rs.getString(2);
                            list.add(new User(name, age, id));
                        }
                        if (list.size() > 0) {
                            System.out.println(list);
                        } else {
                            System.err.println("Not found");
                        }
                } finally {
                    if (rs != null) {
                        rs.close();
                    } else {
                        System.err.println("Oops! error read from DB!");
                    }
                }
            } finally {     // to the block 2
                if (st != null) {
                    st.close();
                } else {
                    System.err.println("Oops! Statement dont create!");
                }
            }
        } catch (SQLException e) {
            System.err.println("DB connection error: " + e);
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.err.println("Connection close error: " + e);
                }
            }
        }
    }
}
