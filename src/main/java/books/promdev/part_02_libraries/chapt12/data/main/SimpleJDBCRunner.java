package books.promdev.part_02_libraries.chapt12.data.main;

//import com.mysql.jdbc.Driver;
import books.promdev.part_02_libraries.chapt12.subject.Abonent;
import books.promdev.part_02_libraries.chapt12.connect.ConnectorDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class SimpleJDBCRunner {
    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/testphones";
//        Properties prop = new Properties();
//        prop.put("user", "root");
//        prop.put("password", "pass");
//        prop.put("autoReconnect", "true");
//        prop.put("characterEncoding", "UTF-8");
//        prop.put("useUnicode", "true");
        Connection cn = null;
        
//        try {
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        } catch (SQLException e) {
//            System.err.println("Dont create new Driver");
//            e.printStackTrace();
//        }
        try {
//            cn = DriverManager.getConnection(url, prop);
            cn = ConnectorDB.getConnection();
            Statement st = null;
            try {
                st = cn.createStatement();
                ResultSet rs = null;
                try {
                    rs = st.executeQuery("SELECT * FROM phonebook");
                    ArrayList<Abonent> lst = new ArrayList<>();
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        int phone = rs.getInt(3);
                        String name = rs.getString(2);
                        lst.add(new Abonent(id, phone, name));
                    }
                    if (lst.size() > 0) {
                        System.out.println(lst);
                    } else {
                        System.out.println("Not found");
                    }
                } finally {
                    if (rs != null) {
                        rs.close();
                    } else {
                        System.err.println("ошибка во время чтения из БД");
                    }
                }
            } finally {
                if (st != null) {
                    st.close();
                } else {
                    System.err.println("Statement не создан");
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
