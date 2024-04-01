package ua.edu.chnu.kkn.di.data;

import java.util.ArrayList;
import java.util.List;

public class ResultSetConverter {

    public List<User> toUserList(ResultSet resultSet) {
        System.out.println("Converting result set to list of users...");
        var allUsers = new ArrayList<User>();
        allUsers.add(new User(1, "User 1"));
        allUsers.add(new User(2, "User 2"));
        allUsers.add(new User(3, "User 3"));
        allUsers.add(new User(4, "User 4"));
        return allUsers;
    }
}
