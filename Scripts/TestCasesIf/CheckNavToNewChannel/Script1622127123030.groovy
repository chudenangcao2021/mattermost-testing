import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Test Cases/Common Test Cases/Login'),['Username':'cxtuan','Password':'01672471821nT@'])
TestObject object = findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/div_CtrlK_MenuWrapper AddChannelDropdown')
Boolean bool = false
try {
 bool = WebUI.verifyElementVisible(object)
}catch(Exception ex) {
	
} finally {
	if(bool) {
		WebUI.click(object)
		WebUI.click(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/span_Create New Channel'))
		
		WebUI.setText(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/input_Name_newChannelName'), 'NewChannelTest1')
		
		WebUI.click(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Create Channel'))
		
		WebUI.setText(findTestObject('Object Repository/IFObject/Page_te - TEAM NAME Mattermost/textarea_Write to te_post_textbox'),
				'Channel Test If')
	
		WebUI.sendKeys(findTestObject('Object Repository/IFObject/Page_te - TEAM NAME Mattermost/textarea_Write to te_post_textbox'), Keys.chord(
			Keys.ENTER))
		WebUI.closeBrowser()
	}
	else {
		WebUI.closeBrowser()
	}
}



