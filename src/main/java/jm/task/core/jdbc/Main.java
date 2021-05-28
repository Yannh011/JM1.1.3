package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Donald", "Tramp", (byte) 56);
        userService.saveUser("Benya","Netanyahu", (byte) 60);
        userService.saveUser("Vova", "Chuma", (byte) 65);
        userService.saveUser("Dima", "Slaboumie", (byte) 65);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
