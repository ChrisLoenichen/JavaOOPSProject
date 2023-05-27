package JavaOOPS1;

public class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver driver []= {new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for(RemoteWebDriver driver1 : driver){
            driver1.open();
            driver1.close();
            driver1.getScreenshot();
            driver1.getTitle();
            driver1.navigate();


        }

    }
}
