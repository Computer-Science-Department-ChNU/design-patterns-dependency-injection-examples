package ua.edu.chnu.kkn.di.data;

import dagger.Component;

import javax.inject.Singleton;

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {

    UsersRepository usersRepository();
}
