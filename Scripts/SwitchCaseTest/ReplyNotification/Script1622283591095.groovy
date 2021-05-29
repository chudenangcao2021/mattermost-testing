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

WebUI.callTestCase(findTestCase('Common Test Cases/Login'), [('Username') : 'nttuan', ('Password') : '12345678zZ@'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/SwitchCase/RelyNotification/Page_span_Town Square - TEAM NAME Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/SwitchCase/RelyNotification/Page_span_Town Square - TEAM NAME Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/SwitchCase/RelyNotification/Page_span_Town Square - TEAM NAME Mattermost/button_Notifications'))

WebUI.click(findTestObject('Object Repository/SwitchCase/RelyNotification/Page_span_Town Square - TEAM NAME Mattermost/span_Edit'))

switch (replyNotificationType) {
	case 'inreply':
		WebUI.click(findTestObject('Object Repository/SwitchCase/RelyNotification/Page_span_Town Square - TEAM NAME Mattermost/label_Trigger notifications on messages in _a77cbe'))
		break
		
	case 'inthread':
		WebUI.click(findTestObject('Object Repository/SwitchCase/RelyNotification/Page_span_Town Square - TEAM NAME Mattermost/label_Trigger notifications on messages in _3c6410'))
		break
		
	case 'donot':
		WebUI.click(findTestObject('Object Repository/SwitchCase/RelyNotification/Page_span_Town Square - TEAM NAME Mattermost/label_Do not trigger notifications on messa_d7ce81'))
		break
		
	default:
		WebUI.click(findTestObject('Object Repository/SwitchCase/RelyNotification/Page_span_Town Square - TEAM NAME Mattermost/label_Trigger notifications on messages in _a77cbe'))
}

WebUI.click(findTestObject('Object Repository/SwitchCase/RelyNotification/Page_span_Town Square - TEAM NAME Mattermost/button_Save'))

WebUI.closeBrowser()

