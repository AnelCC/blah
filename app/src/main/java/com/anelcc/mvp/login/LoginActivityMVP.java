package com.anelcc.mvp.login;

// handle the different interface
public interface LoginActivityMVP {

    interface View{
        String getFirstName();
        String getLastName();
        void showInputError();

        void setFirstName(String firstName);
        void setLastName(String lastName);
        void showUserSavedMessage();
        void showUserNotAvailable();
    }

    interface Presenter {
        void setView(LoginActivityMVP.View view);

        void loginButtonClicked();

        void getCurrentUser();
    }

    interface Model {
        void createUser(String name, String lastName);

        User getUser();
    }
}
