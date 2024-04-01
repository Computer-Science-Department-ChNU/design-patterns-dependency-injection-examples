package ua.edu.chnu.kkn.di.presention;

import ua.edu.chnu.kkn.di.data.*;

public class Main {

    public static void main(String[] args) {
        AppComponent appComponent = DaggerAppComponent.create();
        UsersRepository usersRepository = appComponent.usersRepository();
        var allUsers = usersRepository.allUsers();
        allUsers.forEach(user -> System.out.println(user.toString()));
    }
}
