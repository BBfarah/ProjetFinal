package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	WebDriver driver;
	By usersButton = By.xpath("/html/body/app-root/app-admin/p-menubar/div/p-menubarsub/ul/li[3]/a/span[1]");
    By searchField = By.xpath("//body/app-root[1]/app-admin[1]/app-users[1]/div[1]/p-table[1]/div[1]/div[1]/div[1]/span[1]/input[1]");
    By LASTPageButton = By.xpath("//button[@class='p-ripple p-element p-paginator-last p-paginator-element p-link ng-star-inserted']");
    By expression = By .xpath ("//td[contains(text(),\"Pas d'utilisateurs trouvés.\")]");
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnUsersButton() {
        driver.findElement(usersButton).click();
    }
    public void enterNameInSearchField(String name) {
        driver.findElement(searchField).clear();
        driver.findElement(searchField).sendKeys("AYARI");
    }
    public String getUserListText() {
        WebElement userListElement = driver.findElement(By.xpath("//td[contains(text(),'AYARI')]"));
        return userListElement.getText();
    }
    public void enterFirstNameInSearchField(String firstName) {
        driver.findElement(searchField).clear();
        driver.findElement(searchField).sendKeys("Asma");
    }
    public String getUserListText2(String firstName) {
        String xpathExpression = String.format("//td[contains(text(),'Asma')]", firstName);
        WebElement userListElement2 = driver.findElement(By.xpath(xpathExpression));
        return userListElement2.getText();
    }
    public void enterEmailInSearchField(String email) {
        driver.findElement(searchField).clear();
        driver.findElement(searchField).sendKeys(email);
    }
    public String getUserListText3(String email) {
        String xpathExpression = String.format("//td[contains(text(),'asmaayari@gmail.com')]", email);
        WebElement userListElement3 = driver.findElement(By.xpath(xpathExpression));
        return userListElement3.getText();
    }
    public void enterLetterInSearchField(String letter) {
        driver.findElement(searchField).clear();
        driver.findElement(searchField).sendKeys(letter);
    }
    public String getUserListText4(String letter) {
        String xpathExpression = String.format("//td[contains(text(),'Zied')]", letter);
        WebElement userListElement4 = driver.findElement(By.xpath(xpathExpression));
        return userListElement4.getText();
    }
    public void clickOnLASTPageButton() {
        driver.findElement(LASTPageButton).click();
    }
    public String getUserListText5() {
    	return driver.findElement(expression).getText();
    }
     
}
