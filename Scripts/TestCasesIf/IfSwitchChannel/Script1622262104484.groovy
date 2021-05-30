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


WebUI.callTestCase(findTestCase('Test Cases/Common Test Cases/Login'),['Username':Username,'Password':Password])

WebUI.click(findTestObject('Object Repository/IFObject/Page_span_Town Square - TEAM NAME Mattermost/button_Find channelCtrlK'))

WebUI.setText(findTestObject('Object Repository/IFObject/Page_span_Town Square - TEAM NAME Mattermost/input_ESC_quickSwitchInput'), 
    'test')
if(WebUI.verifyElementPresent(findTestObject('Object Repository/IFObject/Page_span_Town Square - TEAM NAME Mattermost/div_Channel to test add  remove memberschan_a53a72'), 0, FailureHandling.STOP_ON_FAILURE)) {
	WebUI.click(findTestObject('Object Repository/IFObject/Page_span_Town Square - TEAM NAME Mattermost/div_Channel to test add  remove memberschan_a53a72'))
	
	WebUI.setText(findTestObject('Object Repository/IFObject/Page_Channel to test add  remove members - _a376a4/textarea_Write to Channel to test add  remo_15c3c5'),
		'hello')
	WebUI.sendKeys(findTestObject('Object Repository/IFObject/Page_te - TEAM NAME Mattermost/textarea_Write to te_post_textbox'), Keys.chord(
		Keys.ENTER))
}


