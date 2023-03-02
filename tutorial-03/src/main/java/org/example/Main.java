package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class Main {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @Test
    public void task02(){
        String givenUrl = "https://www.saucedemo.com/";
        String destinationUrl = "https://www.saucedemo.com/inventory.html";
        driver.get(givenUrl);
        String currentUrl = driver.getCurrentUrl();
        //we are not using if conditions here

        //Assert is used to verify the links
        Assert.assertEquals(givenUrl,currentUrl);
        //Printing the verification
        System.out.println("Verified the URL");

        //finding the username element and entering data
        WebElement username = driver.findElement(By.xpath("//input[@data-test='username']"));
        username.sendKeys("standard_user");

        //finding the password field and entering data
        WebElement password = driver.findElement(By.xpath("//input[@data-test='password']"));
        password.sendKeys("secret_sauce");

        //finding the login button and clicking it
        WebElement loginBtn = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        loginBtn.click();

        //gets the inventory URL
        String inventoryUrl = driver.getCurrentUrl();
        Assert.assertEquals(destinationUrl,inventoryUrl);
        //Printing the verification
        System.out.println("Verified the destination URL");

        //Select item
        WebElement item = driver.findElement(By.id("item_1_title_link"));
        item.click();

        //Add to cart
        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addToCart.click();

        //Verifying product details
        String productName = "Sauce Labs Bolt T-Shirt";
        double givenPrice = 15.99;
        WebElement itemPrice = driver.findElement(By.className("inventory_details_price"));
        String priceItemStr = itemPrice.getText().replace("$","");
        WebElement productNamePicked = driver.findElement(By.className("inventory_details_name"));
        double priceConverted = Double.parseDouble(priceItemStr);
        String productNameCurrent = productNamePicked.getText();
        Assert.assertEquals(productName,productNameCurrent);
        Assert.assertEquals(priceConverted,givenPrice);
        //Printing the verification
        System.out.println("Verified the product name and price");

        //Click cart
        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();

        //gets the cart URL
        String cartUrlGiven = "https://www.saucedemo.com/cart.html";
        String cartUrl = driver.getCurrentUrl();
        Assert.assertEquals(cartUrlGiven,cartUrl);
        //Printing the verification
        System.out.println("Verified the destination URL");

        //Verifying product details
        WebElement itemPriceCart = driver.findElement(By.className("inventory_item_price"));
        String priceItemCartStr = itemPriceCart.getText().replace("$","");
        WebElement productNameCartPicked = driver.findElement(By.className("inventory_item_name"));
        double priceCartConverted = Double.parseDouble(priceItemCartStr);
        String productNameCartCurrent = productNameCartPicked.getText();
        Assert.assertEquals(productNameCartCurrent,productNameCurrent);
        Assert.assertEquals(priceCartConverted,givenPrice);
        //Printing the verification
        System.out.println("Verified the product name and price");

        //Click remove
        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        removeButton.click();

        //Verifying product details
        WebElement itemRemoved = driver.findElement(By.className("removed_cart_item"));
        //Printing the verification
        System.out.println("Verified the item is removed.");

        //Click continue
        WebElement continueButton = driver.findElement(By.id("continue-shopping"));
        continueButton.click();

        //Add any 2 items to cart
        WebElement addToCart1 = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        addToCart1.click();
        WebElement addToCart2 = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
        addToCart2.click();

        //Go to cart
        WebElement cart = driver.findElement(By.className("shopping_cart_link"));
        cart.click();

        //Listing cart item
        List<WebElement> products = driver.findElements(By.className("cart-item"));

        String[] productNamesOg = {"Sauce Labs Backpack","Sauce Labs Bike Light"};
        Double[] productPriceOg = {29.99 , 9.99};

        //Verification of items and prices
        for (int i = 0 ; i < 2 ; i++){
            String productCartName = products.get(i).findElement(By.className("inventory_item_name")).getText();
            Double productCartPrice = Double.parseDouble(products.get(i).findElement(By.className("inventory_item_price")).getText().replace("$", ""));
            Assert.assertEquals(productCartName,productNamesOg[i]);
            Assert.assertEquals(productCartPrice, productPriceOg[i]);
        }
        //Printing the verification
        System.out.println("Verified the product names and prices in the cart.");

        /*
        WebElement itemCart1Name = driver.findElement(By.id("item_4_title_link"));
        String itemCart1NameText = itemCart1Name.getText();
        String itemCat1NameOg = "Sauce Labs Backpack";
        Assert.assertEquals(itemCat1NameOg,itemCart1NameText);
        WebElement itemCart2Name = driver.findElement(By.id("item_0_title_link"));
        String itemCart2NameText = itemCart2Name.getText();
        String itemCat2NameOg = "Sauce Labs Bike Light";
        Assert.assertEquals(itemCat2NameOg,itemCart2NameText);

        WebElement itemCart1Price = driver.findElement(By.className("inventory_item_price"));
        String itemCart1PriceStr = itemCart1Price.getText().replace("$","");
        double itemCart1PriceDou = Double.parseDouble(itemCart1PriceStr);
        double itemCart1PriceOg = 29.99;
        Assert.assertEquals(itemCart1PriceOg,itemCart1PriceDou);
        WebElement itemCart2Price = driver.findElement(By.className("inventory_item_price"));
        String itemCart2PriceStr = itemCart2Price.getText().replace("$","");
        double itemCart2PriceDou = Double.parseDouble(itemCart2PriceStr);
        double itemCart2PriceOg = 9.99;
        Assert.assertEquals(itemCart2PriceOg,itemCart2PriceDou);
        //Printing the verification
        System.out.println("Verified the product names and prices");
        */


    }
}
