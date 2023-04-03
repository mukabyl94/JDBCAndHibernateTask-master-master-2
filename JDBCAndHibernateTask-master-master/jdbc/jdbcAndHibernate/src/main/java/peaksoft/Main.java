package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

import java.sql.SQLException;

import static peaksoft.util.Util.connection;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
//        Util.connection().close();
       UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
//       userDaoJdbc.createUsersTable();
//        userDaoJdbc.dropUsersTable();
//        userDaoJdbc.saveUser("Mukabyl","Daminov", (byte) 29);
//        userDaoJdbc.saveUser("Asan","Tairov", (byte) 20);
//        userDaoJdbc.saveUser("Uson","Kamylov", (byte) 22);
//        userDaoJdbc.saveUser("Bakyt","Latipov", (byte) 23);
//        userDaoJdbc.removeUserById(1);

//        for (User allUser : userDaoJdbc.getAllUsers()) {
//            System.out.println(allUser);
//        }
        userDaoJdbc.cleanUsersTable();


    }
}
