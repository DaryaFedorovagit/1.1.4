package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Darya", "Fedorova", (byte) 35);
        userService.saveUser("Ivan", "Sidorov", (byte) 25);
        userService.saveUser("Anna", "Ivanova", (byte) 30);
        userService.saveUser("Petr", "Petrov", (byte) 20);
        userService.removeUserById(1);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
