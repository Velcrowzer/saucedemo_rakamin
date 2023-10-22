package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.addProduct;
import objectRepository.loginPage;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static config.env.driver;
import static stepDefinitions.login.*;
public class add_product {
    public int duration = 10;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration)); //create object

    addProduct elementAdd = new addProduct();
    @Given("user is on sauce_demo inventory")
    public void user_is_on_sauce_demo_inventory() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementAdd.getBtn_cart())
        );
    }
    @When("user click add to cart product")
    public void user_add_product() {
        WebElement field_btnAdd = driver.findElement(elementAdd.getBtn_add());
        field_btnAdd.click();
    }
    @And("user verify product in cart")
    public void user_check_product() {
        WebElement field_btnAdd = driver.findElement(elementAdd.getBtn_cart());
        field_btnAdd.click();
    }
    @Then("user verify (.*) product in cart result$")
    public void user_verify_success_login_result(@NotNull String status) {
        if (status.contains("success")){
            wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.className("cart_quantity"))
            );
        } else {
            driver.findElement(By.className("error-button"));
        }
    }

}
