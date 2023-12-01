package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By connexion = By.xpath("/html/body/app-root/app-accueil/app-header/p-menubar/div/p-menubarsub/ul/li[4]/a/span[1]");
	By email = By.xpath("//*[@id='email']");
	By password = By.xpath("//*[@id='password']");
	By login = By.xpath("/html/body/p-dynamicdialog/div/div/div/app-login/form/div[2]/button/span[2]");
	
	public LoginPage(WebDriver driver) {
		 this.driver = driver ;
	 }
	public void clickConnexion() {
		driver.findElement(connexion).click();
	}
	public void credentials(String mail, String pass) {
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pass);
		
	}
	public void Clicklogin() {
		driver.findElement(login).click();
	}

}
