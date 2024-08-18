//package jm.task.core.jdbc.dao;
//
//import jm.task.core.jdbc.model.User;
//import jm.task.core.jdbc.util.Util;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserDaoJDBCImpl implements UserDao {
//    private static final Connection connection = Util.getConnection();
//
//    public UserDaoJDBCImpl() {
//    }
//    public void createUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS new_table1 " +
//                    "(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40), " +
//                    "lastName VARCHAR(40), age TINYINT)");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void dropUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.execute("DROP TABLE IF EXISTS new_table1");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void saveUser(String name, String lastName, byte age) {
//        try (PreparedStatement preparedStatement = connection.prepareStatement
//                ("INSERT INTO new_table1 (name, lastName, age) VALUES (?, ?, ?)")) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void removeUserById(long id) {
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement = connection.prepareStatement("DELETE FROM new_table1 ADDRESS WHERE ID=?");
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        Statement statement = null;
//        try {
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM new_table1");
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("ID"));
//                user.setName(resultSet.getString("NAME"));
//                user.setLastName(resultSet.getString("LASTNAME"));
//                user.setAge(resultSet.getByte("AGE"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        }
//        return users;
//    }
//    public void cleanUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.execute("TRUNCATE TABLE new_table1");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
