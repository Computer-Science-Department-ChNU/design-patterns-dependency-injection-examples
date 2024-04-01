package ua.edu.chnu.kkn.di.data;

import java.util.ArrayList;
import java.util.List;

public class JsonConverter {

    public List<User> parseUsers(String httpResponse) {
        System.out.println("Parsing all users GET request...");
        var allUsers = new ArrayList<User>();
        allUsers.add(new User(1, "User 1"));
        allUsers.add(new User(2, "User 2"));
        allUsers.add(new User(3, "User 3"));
        allUsers.add(new User(4, "User 4"));
        return allUsers;
    }
}
