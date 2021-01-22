package javaFunctionality;

import cucumber.TestContext;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObject.Merchate_User_PageObjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Merchante_User_Functionality {
	private Properties properties;
	private final String propertyFilePath = "src\\test\\java\\Resource\\TestData.properties";
	String BrandName = "Samsung";
	String Searchtype = "Heladeras";
	WebDriver driver;
	Merchate_User_PageObjects Merchate_User_PageObjects;

	public Merchante_User_Functionality(TestContext context) {

		this.driver = context.getDriver();
		Merchate_User_PageObjects = new Merchate_User_PageObjects(driver);

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}

	}

	public void lauchURl(String URl) {
		URl = properties.getProperty(URl);
		driver.get(URl);
		driver.manage().window().maximize();

	}

	public void landingpage() {

		String actualTitle = "";
		String ExpectedTitle = "Dashboard | Active Admin Depot";

		try {
			actualTitle = driver.getTitle();
			Assert.assertEquals(ExpectedTitle, actualTitle);
			System.out.println("The actual title is " + actualTitle);
			System.out.println("The Expected title is " + ExpectedTitle);

		} catch (AssertionError e) {
			e.printStackTrace();

			System.out.println("The actual title is " + actualTitle);
			System.out.println("The Expected title is " + ExpectedTitle);
			throw e;

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void User_Menu_click() {

		try {
			Merchate_User_PageObjects.User_Menu_Button.click();

			

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void Validate_submenu_Link() {

		try {
			String[] HombreList = new String[] { "HOMBRE", "Jeans", "Pantalones", "Remeras y Polos", "Camperas",
					"Camisas", "Sweaters y Buzos", "Accesorios" };
			Merchate_User_PageObjects.Sale_SubMenu_Validation(Merchate_User_PageObjects.SubMenu_Hombre,
					HombreList);

			String[] MujerList = new String[] { "MUJER", "Jeans", "Remeras", "Camperas", "Camisas", "Sweaters y Buzos",
					"Faldas y Vestidos" };
			Merchate_User_PageObjects.Sale_SubMenu_Validation(Merchate_User_PageObjects.SubMenu_Mujer,
					MujerList);

			String[] KidsList = new String[] { "KIDS", "Girls (4 - 7 años)", "Boys (4 - 7 años)",
					"Teen Girls (8 - 16 años)", "Teen Boys (8 - 16 años)" };
			Merchate_User_PageObjects.Sale_SubMenu_Validation(Merchate_User_PageObjects.SubMenu_Kids,
					KidsList);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
