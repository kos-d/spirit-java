package books.promdev.part_02_libraries.chapt12;

import books.promdev.part_02_libraries.chapt12.subject.Abonent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PreparedJDBCRunner {
    public static void main(String[] args) {
        ArrayList<Abonent> list = new ArrayList<Abonent>() {
            {
                add(new Abonent(87, 1715848, "Dmitry"));
                add(new Abonent(51, 8855711, "Alex"));
            }
        };
        DataBaseHelper helper = null;
        PreparedStatement statement = null;
        try {
            helper = new DataBaseHelper();
            statement = helper.getPreparedStatement();
            for (Abonent abonent : list) {
                helper.insertAbonent(statement, abonent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            helper.closeStatement(statement);
        }
    }
}