package ua.edu.chnu.kkn.di.data;

public class Database {

    DatabaseConnection open() {
        System.out.println("Opening data base...");
        return new DatabaseConnection();
    }

    void close(DatabaseConnection databaseConnection) {
        System.out.println("Closing data base...");
        databaseConnection = null;
    }
}
