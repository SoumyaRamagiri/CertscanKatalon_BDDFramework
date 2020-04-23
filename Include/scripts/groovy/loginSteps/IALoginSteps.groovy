package loginSteps
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class IALoginSteps {
	WebDriver driver;
	@Given("User navigates to login page")
	def navigateToLoginPage(){
		WebUI.openBrowser('')

		driver = DriverFactory.getWebDriver()

		WebUI.navigateToUrl('http://10.204.211.125:8021/csview/#/apps')

		WebUI.maximizeWindow()
	}

	@When("User enters (.*) and (.*)")
	def enterCredentials(String userName, String pwd){

		WebUI.setText(findTestObject('Object Repository/Page_Login/input_Language localization data unavailabl_e21466'), userName)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_User ID cannot be empty_password'), pwd)
	}
	@Then("User clicks on Login")
	def clickOnLogin(){

		WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))
	}
	@And("Verify logged in User Home page is displaying")
	def verifyHomePageDisplays(){

		WebUI.waitForElementPresent(findTestObject('Page_Operator Dashboard/span_johnsmith'), 40)

		Assert.assertEquals(driver.getTitle(), 'Operator Dashboard')

		WebUI.verifyTextPresent('OPERATOR', false)

	}
	@Then("User log outs from application")
	def logOutOfApplication(){

		WebUI.click(findTestObject('Object Repository/Page_Operator Dashboard/span_johnsmith'))

		WebUI.click(findTestObject('Object Repository/Page_Operator Dashboard/span_Logout'))

		WebUI.closeBrowser()
	}
}