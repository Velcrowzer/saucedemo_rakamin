package objectRepository;

import org.openqa.selenium.By;

public class addProduct {

    By btn_add = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    By btn_cart = By.xpath("//a[@class='shopping_cart_link']/@href");
    public By getBtn_add() {
        return btn_add;
    }
    public By getBtn_cart(){
        return btn_cart;
    }
}
