package co.com.choucair.certification.retotecnico.model.builders;

import co.com.choucair.certification.retotecnico.tasks.Login;
import net.serenitybdd.screenplay.Tasks;

public class LoginBuilder {
    private String username;

    public LoginBuilder withTheUsername(String username){
        this.username = username;
        return this;
    }

    public Login andPassword(String password) {
        return Tasks.instrumented(Login.class, username, password);
    }
}
