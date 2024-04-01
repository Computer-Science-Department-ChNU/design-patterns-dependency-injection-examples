package ua.edu.chnu.kkn.di.data;

import javax.inject.Inject;

public class FileDataSource {
    
    private final FileSystemAccess fileSystemAccess;
    
    private final JsonConverter jsonConverter;

    @Inject
    public FileDataSource(
            FileSystemAccess fileSystemAccess,
            JsonConverter jsonConverter
    ) {
        this.fileSystemAccess = fileSystemAccess;
        this.jsonConverter = jsonConverter;
    }
}
