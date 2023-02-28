package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePage {

public  YoutubePage(){
    PageFactory.initElements(Driver.getDriver(),this);



}

@FindBy(xpath = "(//yt-icon[@id='logo-icon'])[1]")
    public WebElement youtubeButton;

@FindBy(xpath = "//input[@id='search']")
    public WebElement searcBox;



}
