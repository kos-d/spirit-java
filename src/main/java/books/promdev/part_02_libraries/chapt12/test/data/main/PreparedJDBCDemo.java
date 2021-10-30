package books.promdev.part_02_libraries.chapt12.test.data.main;

import books.promdev.part_02_libraries.chapt12.test.connect.DBHelper;
import books.promdev.part_02_libraries.chapt12.test.subject.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PreparedJDBCDemo {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>() {
            {
                add(new User("Igor", 33, 1));
                add(new User("Ivan", 32, 2));
                add(new User("Kolja", 31, 3));
                add(new User("Vasja", 30, 4));
            }
        };
        DBHelper helper = null;
        PreparedStatement statement = null;
        try {
            helper = new DBHelper();
            statement = helper.getPreparedStatement();
            for (User users : list) {
                helper.insertUser(statement, users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            helper.closeStatement(statement);
        }
        
    }
}
