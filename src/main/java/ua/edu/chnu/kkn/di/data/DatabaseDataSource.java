package ua.edu.chnu.kkn.di.data;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

public class DatabaseDataSource {

    private final Database dataBase;

    private final ResultSetConverter resultSetConverter;

    @Inject
    public DatabaseDataSource(
            Database dataBase,
            ResultSetConverter resultSetConverter
    ) {
        this.dataBase = dataBase;
        this.resultSetConverter = resultSetConverter;
    }

    Optional<List<User>> selectAllUsers() {
        var dbConnection = dataBase.open();
        var queryResult = dbConnection.executeQuery("SELECT * FROM users");
        dataBase.close(dbConnection);
        return Optional.of(resultSetConverter.toUserList(queryResult));
    }
}
