package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//select[contains(@name, \"day\")]";
    public static final String XPATH_SELECT_MONTH = "//select[contains(@name, \"month\")]";
    public static final String XPATH_SELECT_YEAR = "//select[contains(@name, \"year\")]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardDay = new Select(selectDay);
        selectBoardDay.selectByIndex(9);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardMonth = new Select(selectMonth);
        selectBoardMonth.selectByIndex(5);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardYear = new Select(selectYear);
        selectBoardYear.selectByIndex(12);
    }
}
