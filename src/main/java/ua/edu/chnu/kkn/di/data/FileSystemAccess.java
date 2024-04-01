package ua.edu.chnu.kkn.di.data;

import javax.inject.Inject;

public class FileSystemAccess {

    @Inject
    public FileSystemAccess() {
    }

    FilePreferences openFile() {
        System.out.println("Opening file with preferences...");
        return new FilePreferences();
    }

    void closeFile(FilePreferences filePreferences) {
        System.out.println("Closing file with preferences...");
        filePreferences = null;
    }
}
