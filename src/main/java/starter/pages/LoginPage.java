package starter.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class LoginPage extends PageObject {

    //Input Field Username
    @FindBy(id = "txtUsername")
    WebElementFacade FieldUsername;
    public void inputusername (String username){
        FieldUsername.sendKeys(username);
    }
    public void verifyFieldUsername(){
        FieldUsername.shouldBePresent();
    }

    //Input Field Password
    @FindBy(id = "txtPassword")
    WebElementFacade FieldPassword;
    public void inputpassword (String password){
        FieldPassword.sendKeys(password);
    }
    public void verifyFieldPassword(){
        FieldPassword.shouldBePresent();
    }

    //Click button login
    @FindBy(id="btnLogin")
    WebElementFacade BtnLogin;
    public void clickBtnLogin(){
        BtnLogin.click();
    }
    public void verifyButtonLogin(){
        BtnLogin.shouldBeEnabled();
    }

    @FindBy(xpath = "//a[normalize-space()='Forgot your password?']")
    WebElementFacade linkForgotPassword;
    public void verifyLinkForgotPassword(){
        linkForgotPassword.shouldBePresent();
    }

    //Validate in Dashboard
    @FindBy(id = "welcome")
    WebElement validateDashboard;
    public void validateDashboardName(){
        Assert.assertEquals(true,validateDashboard.isDisplayed());
    }

    //validate invalid credentials
    @FindBy(id = "spanMessage")
    WebElement alertMessageLoginFailed;
    public void validateErrorMessage(String message){
        Assert.assertEquals(message,alertMessageLoginFailed.getText());
    }

}
