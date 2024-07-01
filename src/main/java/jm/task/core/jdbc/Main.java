package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable(); // Создание таблицы User(ов)

        userService.saveUser("Christian", "Bale", (byte) 50); // Добавление 4 User(ов) в таблицу с данными на свой выбор.
        userService.saveUser("Javier", "Bardem", (byte) 55);
        userService.saveUser("Malcolm", "McDowell", (byte) 81);
        userService.saveUser("Anthony", "Hopkins", (byte) 86);

        List<User> allUsers = userService.getAllUsers(); // Получение всех User из базы
        System.out.println(allUsers); // и вывод в консоль

        userService.cleanUsersTable(); // Очистка таблицы User(ов)

        userService.dropUsersTable(); // Удаление таблицы

    }
}