package org.example;

import static org.example.Elements.*;

public class LoginPage extends Functions {


    public void hepsiburadaLogin(){
        try {
            click(ACCEPT_COOKIES);
            click(MY_ACCOUNT);
            click(LOGIN);
            sendKeys(USERNAME_INPUT, "b.kirnakk@gmail.com");
            click(BUTTON_LOGIN);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }
}



