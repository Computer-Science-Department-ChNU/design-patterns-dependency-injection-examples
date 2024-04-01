package ua.edu.chnu.kkn.di.data;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class AppModule {

    @Provides
    @Named("baseUrl")
    String provideBaseUrl() {
        return "https://startup.com";
    }

    @Provides
    @Singleton
    UsersRepository providesUserRepository(AppUsersRepository appUsersRepository) {
        return appUsersRepository;
    }
}
