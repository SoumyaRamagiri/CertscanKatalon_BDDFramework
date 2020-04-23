package loginSteps
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class TakeDecisionOnImage {
	@Then("navigate to operator screen")
	def navigateToOperatorScrn(){
		WebUI.click(findTestObject('Page_Operator Dashboard/span_Image Analysis'))
	}

	@When("User simulate an image")
	def simulateAnImage(){

//		CustomKeywords.'imageSimulationByN25XML.Simulation.simulateN25'()
	}
	@Then("take accept decion on image")
	def takeAcceptDecision(){

		WebUI.waitForElementNotVisible(findTestObject('Page_Operator Screen/span_Scan image is loading'), 30)

		WebUI.click(findTestObject('Object Repository/Page_Operator Screen/img_Logout_btnAccept'))

		WebUI.click(findTestObject('Object Repository/Page_Operator Screen/button_Yes'))
	}
}