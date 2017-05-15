package entity;

import java.sql.*;
import java.util.*;

/**
 * Created by Дима on 14.01.2017.
 */
public class DAO {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "dima95");
    }

    public static List<Students> getStudents() throws SQLException, ClassNotFoundException {
        try (Connection c = getConnection();
             PreparedStatement ps = c.prepareStatement("SELECT id,name,surname,price,isPay FROM pay");

             ResultSet res = ps.executeQuery()) {
            ArrayList<Students>  list = new ArrayList<>();
            while (res.next()) {
                int id1 = res.getInt(1);
                String name1 = res.getString(2);
                String surname1 = res.getString(3);
                int price1 = res.getInt(4);
                String isPay1 = res.getString(5);
               list.add(new Students(id1, name1, surname1, price1, isPay1));
            }


            return list;
        }
    }

    public static void addStudent(String name, String surname, int price, String isPay) throws SQLException, ClassNotFoundException {
        try (Connection c = getConnection();
             PreparedStatement ps = c.prepareStatement("INSERT INTO pay(name, surname, price,isPay) VALUES (?,?,?,?) "))

        {

            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setInt(3, price);
            ps.setString(4, isPay);
            ps.executeUpdate();
        }

    }

    public static void deleteStudent(int id) throws SQLException, ClassNotFoundException {
        try (Connection c = getConnection();
             PreparedStatement ps = c.prepareStatement("DELETE FROM pay WHERE id = ? "))

        {

            ps.setInt(1, id);
            ps.executeUpdate();

        }
    }


}

