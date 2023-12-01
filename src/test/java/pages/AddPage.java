package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddPage {
	WebDriver driver;

    public AddPage(WebDriver driver) {
        this.driver = driver;
    }
    By usersButton = By.xpath("//span[contains(text(),'Utilisateurs')]");
    By addButton = By.xpath("//body/app-root[1]/app-admin[1]/app-users[1]/div[1]/p-table[1]/div[1]/div[1]/div[1]/em[1]");
    By name = By .xpath("//body/app-root[1]/app-admin[1]/app-users[1]/p-dialog[2]/div[1]/div[1]/div[3]/form[1]/div[1]/input[1]");
    By firstname = By.xpath("//body/app-root[1]/app-admin[1]/app-users[1]/p-dialog[2]/div[1]/div[1]/div[3]/form[1]/div[2]/input[1]");
    By email = By.xpath("//body/app-root[1]/app-admin[1]/app-users[1]/p-dialog[2]/div[1]/div[1]/div[3]/form[1]/div[3]/input[1]");
    By BtnRole = By.xpath("//body/app-root[1]/app-admin[1]/app-users[1]/p-dialog[2]/div[1]/div[1]/div[3]/form[1]/div[4]/p-dropdown[1]/div[1]/div[2]");
    By SelectMentor = By.xpath("//span[contains(text(),'Mentor')]");
    By SelectAdmin = By.xpath("//span[contains(text(),'Admin')]");
    By BtnCursus = By.xpath("//body/app-root[1]/app-admin[1]/app-users[1]/p-dialog[2]/div[1]/div[1]/div[3]/form[1]/div[5]/p-dropdown[1]/div[1]/div[2]/span[1]");
    By SelectCursustest = By.xpath("//body/app-root[1]/app-admin[1]/app-users[1]/p-dialog[2]/div[1]/div[1]/div[3]/form[1]/div[5]/p-dropdown[1]/div[1]/p-overlay[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/p-dropdownitem[3]/li[1]");
    By saveButton = By.xpath("//span[contains(text(),'Enregistrer')]");
    By TotalNbrUsers = By.xpath("//div[contains(text(),'Au total, il y a 1221 utilisateurs.')]");
    By ErreurMail = By.xpath("//small[@id='email-validator']");
    public void clickUsersButton() {
        driver.findElement(usersButton).click();
       
    }
    public void clickAddsButton() {
        driver.findElement(addButton).click();
    }
    public void enterUserDetails(String Name, String Firstname, String Email) {
    	driver.findElement(name).sendKeys(Name);
    	driver.findElement(firstname).sendKeys(Firstname);     
    	driver.findElement(email).sendKeys(Email);
    }
    public void selectRoleAndCursus() {
    	driver.findElement(BtnRole).click();
    	driver.findElement(SelectMentor).click();
    	driver.findElement(BtnCursus).click();
    	driver.findElement(SelectCursustest).click();
    }
    public void selectRoleAdmin() {
    	driver.findElement(BtnRole).click();
    	driver.findElement(SelectAdmin).click();
    }
    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }
    public String getTotalNbrUsers() {
       return driver.findElement(TotalNbrUsers).getText();
    }
    public String getErreurMail() {
        return driver.findElement(ErreurMail).getText();
     }
}
