import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy(id = "item_4_title_link")
    private WebElement item;

    public CartPage(WebDriver driver){
        super(driver);
    }

    public String getItemText() {
        return this.item.getText();
    }
}
