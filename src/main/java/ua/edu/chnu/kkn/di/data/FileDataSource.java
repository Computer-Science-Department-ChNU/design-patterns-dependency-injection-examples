package ua.edu.chnu.kkn.di.data;

public class FileDataSource {
    
    private final FileSystemAccess fileSystemAccess;
    
    private final JsonConverter jsonConverter;

    public FileDataSource(
            FileSystemAccess fileSystemAccess,
            JsonConverter jsonConverter
    ) {
        this.fileSystemAccess = fileSystemAccess;
        this.jsonConverter = jsonConverter;
    }
}
