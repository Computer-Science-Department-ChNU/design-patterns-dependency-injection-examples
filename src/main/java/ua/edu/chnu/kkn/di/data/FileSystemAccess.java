package ua.edu.chnu.kkn.di.data;

public class FileSystemAccess {

    FilePreferences openFile() {
        System.out.println("Opening file with preferences...");
        return new FilePreferences();
    }

    void closeFile(FilePreferences filePreferences) {
        System.out.println("Closing file with preferences...");
        filePreferences = null;
    }
}
