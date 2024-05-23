import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void login() {
        //by tag name
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_2 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_3 = wd.findElement(By.xpath("//h1"));


        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));
        List<WebElement> list = wd.findElements(By.cssSelector("a"));
        WebElement a2 = wd.findElement(By.xpath("//a"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));
        WebElement form2 = wd.findElement(By.xpath("//form"));


        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));
        WebElement input2 = wd.findElement(By.xpath("//input"));


        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));
        WebElement button2 = wd.findElement(By.xpath("//button"));


        //by class

        WebElement el = wd.findElement(By.className("container"));
        WebElement el1 = wd.findElement(By.cssSelector(".container"));
        WebElement el2 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el3 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el4 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el5 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement el6 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el7 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement el8 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        //by id
        WebElement el9 = wd.findElement(By.id("root"));
        WebElement el10 = wd.findElement(By.cssSelector("#root"));
        WebElement el11 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute
        WebElement el12 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el13 = wd.findElement(By.xpath("//input[@placeholder='Email']"));

        WebElement el14 = wd.findElement(By.name("password"));
        WebElement el15 = wd.findElement(By.cssSelector("[name='password']"));
        WebElement el16 = wd.findElement(By.xpath("//*[@name='password']"));


        //WebElement el13 = wd.findElement(By.xpath("//input[@placeholder='Email']"));

        //start
        WebElement el17 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement el18 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));

        //end
        WebElement el19 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        WebElement el20 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        //contains
        WebElement el21 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));
    }


    @Test
    public void classwork(){
        //parent

        WebElement el = wd.findElement(By.xpath("//h1/.."));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/parent::div"));


        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one option

        //ancestor-or-self
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement>list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling

        List<WebElement>list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));


        //preceding-sibling
        WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::h1"));
        List<WebElement>list2 = wd.findElements(By.xpath("//a[3]/preceding-sibling::a"));
    }

    @Test
    public void classwork2()
    {
        WebElement element = wd.findElement(By.cssSelector("[name='login']"));
        String text = element.getText();
        System.out.println(text);


        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("*********************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("*********************");
        System.out.println(textAll);


        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("text br--->"+ br.getText());

    }
}