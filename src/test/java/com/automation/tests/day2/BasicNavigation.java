package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.rmi.Remote;

public class BasicNavigation {

    public static void main(String[] args) throws Exception{

        // to start selenium script we need:
        // setup web-driver( browser driver) and create web-driver object

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // in selenium everything starts from web-driver interface.
        // ChromeDriver extends RemoteWebDriver --> implements WebDriver

        driver.get("http://google.com"); // to open website

        Thread.sleep(3000); // for demo,wait 3 seconds

        String title = driver.getTitle(); // returns<title>Some title</title>text

        String expectedTitle = "Google";

        System.out.println("title is "+ title);


        if(expectedTitle.equals(title)){
            System.out.println("Test passed");
        }else{
            System.out.println("test failed");
        }


        //this must be at the end
        driver.close(); // to close browser

        // browser cannot close itself






    }
}
