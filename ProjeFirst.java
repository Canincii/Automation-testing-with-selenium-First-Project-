import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProjeFirst {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scroll(0,450)");


        WebElement elements = driver.findElement(By.cssSelector("div[class='category-cards'] div:nth-child(1) div:nth-child(1) div:nth-child(2)"));
        elements.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement webTables = driver.findElement(By.cssSelector("div[class='element-list collapse show'] li[id='item-3'] span[class='text']"));
        webTables.click();



        WebElement addButton = driver.findElement(By.cssSelector("#addNewRecordButton"));
        addButton.click();



        WebElement firstName = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"First Name\"]"));
        firstName.click();
        firstName.sendKeys("Mahmut Can");



        WebElement lastName = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"Last Name\"]"));
        lastName.click();
        lastName.sendKeys("İnci");


        WebElement eMail = driver.findElement(By.cssSelector("#userEmail"));
        eMail.click();
        eMail.sendKeys("can.inci@gmail.com");;



        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.click();
        age.sendKeys("26");



        WebElement salary = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"Salary\"]"));
        salary.click();
        salary.sendKeys("15000");


        WebElement department = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"Department\"]"));
        department.click();
        department.sendKeys("Software");



        WebElement submitButton = driver.findElement(By.cssSelector("#submit"));
        submitButton.click();

        Thread.sleep(3000);


        driver.quit();














    }
}

