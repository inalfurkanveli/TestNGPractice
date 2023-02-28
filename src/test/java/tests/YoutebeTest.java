package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.YoutubePage;
import utilities.Driver;

public class YoutebeTest {

public static YoutubePage youtubePage= new YoutubePage();



    //2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin

 @Test
        public void titleTest(){
     //Bir class oluşturun: YoutubeAssertions
     //1) https://www.youtube.com adresine gidin


     //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        String expectedBaslik= "YouTube";
        String actualBaslik=Driver.getDriver().getTitle();

     Assert.assertTrue(actualBaslik.contains(expectedBaslik));

  }
    @Test
    public void youtubeButtonTest(){
        Assert.assertTrue(youtubePage.youtubeButton.isDisplayed());

        Driver.quitDriver();
    }
    @Test
    public void  searcBoxTest(){
        Driver.getDriver().get("https://www.youtube.com");

        Assert.assertTrue(youtubePage.searcBox.isEnabled());
    }

    @Test

    public void  wrongTitleTest(){
        String expectedtitle= "youtube";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertFalse(actualTitle.equals(expectedtitle));



    }



}
