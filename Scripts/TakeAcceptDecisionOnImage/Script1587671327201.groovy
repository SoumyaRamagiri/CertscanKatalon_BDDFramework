import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

not_run: CustomKeywords.'loginPageMethods.LoginPageFunctions.login'('http://10.204.211.125:8021/csview', 'JohnSmith', 'Test@123')

not_run: CustomKeywords.'loginPageMethods.LoginPageFunctions.login'('http://10.204.211.125:8021/csview', 'JohnSmith', 'Test@123')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.204.211.125:8021/csview/#/apps')

not_run: WebUI.click(findTestObject('Object Repository/Page_Login/span_I Agree'), FailureHandling.OPTIONAL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Language localization data unavailabl_e21466'), 'johnsmith')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_User ID cannot be empty_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

CustomKeywords.'imageSimulationByN25XML.Simulation.simulateN25'()

WebUI.click(findTestObject('Page_Operator Dashboard/span_Image Analysis'))

not_run: WebUI.waitForElementPresent(findTestObject('Page_Operator Screen/span_Scan image is loading'), 30)

WebUI.waitForElementNotVisible(findTestObject('Page_Operator Screen/span_Scan image is loading'), 30)

not_run: CustomKeywords.'image.ImageAllViewsLoaded.waitUntilImageIsloaded'()

not_run: boolean flag = false

not_run: while (!(flag)) {
    not_run: flag = CustomKeywords.'image.ImageAllViewsLoaded.verifyImageAllViewsLoaded'()
}

WebUI.click(findTestObject('Object Repository/Page_Operator Screen/img_Logout_btnAccept'))

WebUI.click(findTestObject('Object Repository/Page_Operator Screen/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Operator Screen/span_johnsmith'))

WebUI.click(findTestObject('Object Repository/Page_Operator Screen/span_Logout'))

WebUI.closeBrowser()

