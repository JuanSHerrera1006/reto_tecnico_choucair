package co.com.choucair.certification.retotecnico.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F")
public class StartSharpPage extends PageObject {
    public static final Target INPUT_USERNAME = Target
            .the("Where do we write the username")
            .located(By.id("LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target
            .the("Where do we write the password")
            .located(By.id("LoginPanel0_Password"));
    public static final Target SIGNIN_BUTTON = Target
            .the("Button to sign in on page")
            .located(By.id("LoginPanel0_LoginButton"));


}
