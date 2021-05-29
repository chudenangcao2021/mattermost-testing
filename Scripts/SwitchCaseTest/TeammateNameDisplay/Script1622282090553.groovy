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

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Test Cases/Common Test Cases/Login'), [('username') : username, ('password') : password], 
    FailureHandling.STOP_ON_FAILURE)	

WebUI.click(findTestObject('Object Repository/SwitchCase/NotifyEmail/Page_span_Town Square - TEAM NAME Mattermost/span'))

WebUI.click(findTestObject('Object Repository/SwitchCase/NotifyEmail/Page_span_Town Square - TEAM NAME Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/SwitchCase/TeamMateName/button_Display'))


WebUI.click(findTestObject('Object Repository/SwitchCase/TeamMateName/div_Teammate Name DisplayEditShow username'))
String show = show
switch(show) {
	case 'username':
		WebUI.click(findTestObject('Object Repository/SwitchCase/TeamMateName/label_Show username'))
		break;
	case 'firstlastname':
		WebUI.click(findTestObject('Object Repository/SwitchCase/TeamMateName/label_Show first and last name'))
		break;
	case 'nickname':
		WebUI.click(findTestObject('Object Repository/SwitchCase/TeamMateName/label_Show nickname if one exists, otherwise show first and last name'))
		break;
	default:
		WebUI.click(findTestObject('Object Repository/SwitchCase/TeamMateName/label_Show username'))
		break;
}

WebUI.click(findTestObject('Object Repository/SwitchCase/TeamMateName/button_Save'))

