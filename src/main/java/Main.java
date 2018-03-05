import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver1 = initChromeDriver();
        driver1.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
//TC_1  Логин в Админ панель
        WebElement startlogin = driver1.findElement(By.id("email"));
        startlogin.sendKeys("webinar.test@gmail.com");
        WebElement startpass = driver1.findElement(By.id("passwd"));
        startpass.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement submit = driver1.findElement(By.name("submitLogin"));
        submit.click();
        Thread.sleep(5000);
        WebElement picUser = driver1.findElement(By.id("header_employee_box"));
        picUser.click();
        Thread.sleep(1000);
        WebElement logout = driver1.findElement(By.id("header_logout"));
        logout.click();
        driver1.close();


//*TC_2 Проверка работоспособности главного меню Админ панели
        // 2.1 Login
        WebDriver driver = initChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement startlogin1 = driver.findElement(By.id("email"));
        startlogin1.sendKeys("webinar.test@gmail.com");
        WebElement startpass1 = driver.findElement(By.id("passwd"));
        startpass1.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement submit1 = driver.findElement(By.name("submitLogin"));
        submit1.click();
        Thread.sleep(3000);

        // 2.2 Dashboard page
        WebElement mdashboard = driver.findElement(By.id("tab-AdminDashboard"));
        mdashboard.click();
        System.out.println("-----2.2 Dashboard page-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+ driver.getTitle());
        Thread.sleep(3000);

        // 2.3 Заказы
        WebElement morder = driver.findElement(By.id("subtab-AdminParentOrders"));
        morder.click();
        System.out.println("-----2.3 Заказы------");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(3000);

        // 2.4 Каталог
        WebElement mcatalog = driver.findElement(By.id("subtab-AdminCatalog"));
        mcatalog.click();
        System.out.println("-----2.4 Каталог-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        WebElement piclogo = driver.findElement(By.xpath("//*[@class=\"logo pull-left\"]"));
        piclogo.click();
        Thread.sleep(2500);

        //2.5 Клиенты
        WebElement mcustomer = driver.findElement(By.id("subtab-AdminParentCustomer"));
        mcustomer.click();
        System.out.println("-----2.5 Клиенты------");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(5000);

        // 2.6 Support
        WebElement msupport = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        msupport.click();
        System.out.println("-----2.6 Support-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(5000);

        // 2.7 Stats
        WebElement mstats = driver.findElement(By.id("subtab-AdminStats"));
        mstats.click();
        System.out.println("-----2.7 Stats-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(5000);

        // 2.8 Module
        WebElement mmodule = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        mmodule.click();
        System.out.println("-----2.8 Module-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(5000);
        WebElement piclogo1 = driver.findElement(By.xpath("//*[@class=\"logo pull-left\"]"));
        piclogo1.click();
        Thread.sleep(2500);

        // 2.9 Design
        WebElement mdesign = driver.findElement(By.id("subtab-AdminParentThemes"));
        mdesign.click();
        System.out.println("-----2.9 Design-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(5000);

        // 2.10 Delivery
        WebElement mdelivery = driver.findElement(By.id("subtab-AdminParentShipping"));
        mdelivery.click();
        System.out.println("-----2.10 Delivery-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(5000);

        // 2.11 Payment
        WebElement mpayment = driver.findElement(By.id("subtab-AdminParentPayment"));
        mpayment.click();
        System.out.println("-----2.11 Payment-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(5000);

        // 2.12 International
        WebElement minter = driver.findElement(By.id("subtab-AdminInternational"));
        minter.click();
        System.out.println("-----2.12 International-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(5000);

        // 2.13 Shop Parameters
        WebElement msp = driver.findElement(By.id("subtab-ShopParameters"));
        msp.click();
        System.out.println("-----2.13 Shop Parameters-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(5000);

        // 2.14 Configuration
        WebElement mconf = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        mconf.click();
        System.out.println("-----2.14 Configuration-----");
        System.out.println("ER: " + driver.getTitle());
        driver.navigate().refresh();
        System.out.println("AR: "+driver.getTitle());
        Thread.sleep(5000);

        driver.close();

    }
    public static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
        return new ChromeDriver();
    }

}
