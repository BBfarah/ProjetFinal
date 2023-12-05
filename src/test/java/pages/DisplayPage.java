package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisplayPage {
	WebDriver driver;

    public DisplayPage(WebDriver driver) {
        this.driver = driver;
    }
    By User_Btn = By.xpath("//span[contains(text(),'Utilisateurs')]");
    By checkList = By.xpath("//h4[contains(text(),'Liste des utilisateurs')]");
    By checkName = By.xpath("//th[contains(text(),'Nom')]");
    By checkFirstname = By.xpath("//th[contains(text(),'Pr"+"\u00E9"+"nom')]");
    By checkMail = By.xpath("//th[contains(text(),'Email')]");
    By checkDate = By .xpath("//thead/tr[1]/th[4]");
    By checkRole = By .xpath("//thead/tr[1]/th[5]");
    By checkActif = By .xpath("//th[contains(text(),'Actif')]");
    By checkActions = By .xpath("//th[contains(text(),'Actions')]");
    public void ClickOnUser_Btn(){
        driver.findElement(User_Btn).click();
}
    public void CheckList() {
		driver.findElement(checkList).isDisplayed();
	}
    public void CheckName() {
		driver.findElement(checkName).isDisplayed();
	}
    public void CheckFirstname() {
		driver.findElement(checkFirstname).isDisplayed();
	}
    public void CheckMail() {
		driver.findElement(checkMail).isDisplayed();
	}
    public void CheckDate() {
		driver.findElement(checkDate).isDisplayed();
	}
    public void CheckRole() {
		driver.findElement(checkRole).isDisplayed();
	}
    public void CheckActif() {
		driver.findElement(checkActif).isDisplayed();
	}
    public void CheckActions() {
		driver.findElement(checkActions).isDisplayed();
	}
}
