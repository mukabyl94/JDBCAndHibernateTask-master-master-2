package peaksoft.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String URL = "jdbc:postgresql://localhost:5432/userdao";
    private static final String user_name = "postgres";
    private static final String password = "00001";

    public static Connection connection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, user_name, password);
            System.out.println("Connection to the postgresql successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }



}
