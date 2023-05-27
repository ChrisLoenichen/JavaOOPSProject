package JavaOOPS1;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closes Chrome");
    }

    @Override
    public String getTitle() {
        return "ChromeDriver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot of Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("navigates to Chrome");
    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closes Firefox");
    }

    @Override
    public String getTitle() {
        return "FirefoxDriver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screen shot of Firefox");
    }

    @Override
    public void navigate() {
        System.out.println("Navigates to Firefox");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens Safari");
    }

    @Override
    public void close() {
        System.out.println("Closes Safari");
    }

    @Override
    public String getTitle() {
        return "SafariDriver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screen shot of Safari");
    }

    @Override
    public void navigate() {
        System.out.println("Navigates to Safari");
    }
}

