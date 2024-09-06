package practice;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilities.ExcelFileUtilities;
import genericUtilities.PropertyFileUtilities;
import genericUtilities.SeleniumUtilities;
import objectRepository.ContactInformationPage;
import objectRepository.ContactsPage;
import objectRepository.CreateContactPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class CreateContactUsingCommonDataAndTestData {

	public static void main(String[] args) throws InterruptedException, IOException {
		ExcelFileUtilities eUtil = new ExcelFileUtilities();
		PropertyFileUtilities pUtil = new PropertyFileUtilities();
		SeleniumUtilities sUtil = new SeleniumUtilities();
		// Read a Common data from property file
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("userName");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		// read a text data from Excel file
		String LASTNAME = eUtil.readDataFromExcelFile("Contacts", 1, 2);
		// open the browser
		WebDriver driver = new ChromeDriver();
		sUtil.minimizeWindow(driver);
		sUtil.implicitWait(driver, 10);
		// load the browser
		driver.get(URL);

		// login application
		LoginPage log = new LoginPage(driver);
		log.loginPage(USERNAME, PASSWORD);

		// click on contact link
		HomePage hp = new HomePage(driver);
		hp.clickonContactsLink();

		// click on create contact lookup image
		ContactsPage ctp = new ContactsPage(driver);
		ctp.createContact();

		// create new contact by entering the data
		CreateContactPage ccp = new CreateContactPage(driver);
		ccp.createNewContact(LASTNAME);
		
		// validating
		ContactInformationPage cip = new ContactInformationPage(driver);
		String contactHeader = cip.captureContactInfoumationText();
		if (contactHeader.contains(LASTNAME)) {
			System.out.println(contactHeader);
			System.out.println("success");
		} else {
			System.out.println("fail");
		}
		// logout
		hp.signOut(driver);
		System.out.println("signout success fully");
	}

}
