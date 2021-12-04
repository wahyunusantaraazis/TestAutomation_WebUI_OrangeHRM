package starter.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class LoginPage extends PageObject {

    //Input Field Username
    @FindBy(id = "txtUsername")
    WebElement FieldUsername;
    public void inputusername (String username){
        FieldUsername.sendKeys(username);
    }

    //Input Field Password
    @FindBy(id = "txtPassword")
    WebElement FieldPassword;
    public void inputpassword (String password){
        FieldPassword.sendKeys(password);
    }

    //Click button login
    @FindBy(id="btnLogin")
    WebElement BtnLogin;
    public void clickBtnLogin(){
        BtnLogin.click();
    }

    //Validate in Dashboard
    @FindBy(id = "welcome")
    WebElement validateDashboard;
    public void validateDashboardName(){
        Assert.assertEquals(true,validateDashboard.isDisplayed());
        //Assert.assertEquals("Welcome Ali",validateDashboard.getText());
    }

    //validate invalid credentials
    @FindBy(id = "spanMessage")
    WebElement alertmessageLoginFailed;
    public void validateInvalidCredentials(){
        Assert.assertEquals("Invalid credentials",alertmessageLoginFailed.getText());
    }
    //validasi alert message username empty
    public void validateUsernameEmpty(){
        Assert.assertEquals("Username cannot be empty",alertmessageLoginFailed.getText());
    }
    //validasi alert message password empty
    public void validatePasswordEmpty(){
        Assert.assertEquals("Password cannot be empty",alertmessageLoginFailed.getText());
    }

}
