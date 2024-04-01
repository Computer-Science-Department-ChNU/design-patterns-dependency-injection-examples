package ua.edu.chnu.kkn.di.data;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class AppUsersRepository implements UsersRepository {

    private final FileDataSource fileDataSource;

    private final DatabaseDataSource databaseDataSource;

    private final NetworkDataSource networkDataSource;

    @Inject
    public AppUsersRepository(
            FileDataSource fileDataSource,
            DatabaseDataSource databaseDataSource,
            NetworkDataSource networkDataSource
    ) {
        this.fileDataSource = fileDataSource;
        this.databaseDataSource = databaseDataSource;
        this.networkDataSource = networkDataSource;
    }

    @Override
    public List<User> allUsers() {
        var allUsers = networkDataSource.getUsers();
        if (allUsers.isEmpty()) {
            allUsers = databaseDataSource.selectAllUsers();
        }
        return allUsers.orElse(new ArrayList<>());
    }
}
