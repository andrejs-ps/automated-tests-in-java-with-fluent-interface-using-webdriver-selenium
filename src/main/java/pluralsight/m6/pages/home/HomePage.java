package pluralsight.m6.pages.home;

import org.openqa.selenium.WebDriver;

import static pluralsight.DriverFactory.getChromeDriver;

public class HomePage {

    private HomeActController act;
    private HomeVerifyController verify;

    public HomeActController act(){
        return act;
    }

    public HomeVerifyController verify(){
        return verify;
    }

    private WebDriver driver = getChromeDriver();

    private HomePage(){
        // hide it
    }

    private HomePage(HomeActController act, HomeVerifyController verify){
        this.act = act;
        this.verify = verify;
    }
    public static HomePage getHomePage(){
        return new HomePage(new HomeActController(),
                            new HomeVerifyController());
    }
}
