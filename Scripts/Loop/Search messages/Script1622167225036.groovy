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

WebUI.click(findTestObject('Object Repository/SearchMessage/Page_TEST CHANNEL - TEAM NAME Mattermost/span_TEST CHANNEL'))

WebUI.click(findTestObject('Object Repository/SearchMessage/Page_TEST CHANNEL - TEAM NAME Mattermost/span_TEST CHANNEL_icon icon--standard'))

TestData internalSearchMessages =    findTestData('Internal/Internal Search Messages')
int nMessages = internalSearchMessages.getRowNumbers()

for (int i = 1;  i <=  nMessages;   i++) {
	String message = internalSearchMessages.getValue(1, i)
	
	WebUI.setText(findTestObject('Object Repository/SearchMessage/Page_TEST CHANNEL - TEAM NAME Mattermost/input_TEST CHANNEL_searchBox'), message)
	
	WebUI.sendKeys(findTestObject('Object Repository/SearchMessage/Page_TEST CHANNEL - TEAM NAME Mattermost/input_TEST CHANNEL_searchBox'), Keys.chord(Keys.ENTER))
	
	Thread.sleep(500)
}


WebUI.closeBrowser()