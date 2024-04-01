package ua.edu.chnu.kkn.di.presention;

import ua.edu.chnu.kkn.di.data.*;

public class Main {
    public static void main(String[] args) {
        String baseUrl = "https://startup.com";
        JsonConverter jsonConverter = new JsonConverter();
        HttpClient httpClient = new HttpClient(baseUrl);
        NetworkDataSource networkDataSource = new NetworkDataSource(jsonConverter, httpClient);
        Database database = new Database();
        ResultSetConverter resultSetConverter = new ResultSetConverter();
        DatabaseDataSource databaseDataSource = new DatabaseDataSource(database, resultSetConverter);
        FileSystemAccess fileSystemAccess = new FileSystemAccess();
        FileDataSource fileDataSource = new FileDataSource(fileSystemAccess, jsonConverter);
        UsersRepository usersRepository = new AppUsersRepository(fileDataSource, databaseDataSource, networkDataSource);
        var allUsers = usersRepository.allUsers();
        allUsers.forEach(user -> System.out.println(user.toString()));
    }
}
