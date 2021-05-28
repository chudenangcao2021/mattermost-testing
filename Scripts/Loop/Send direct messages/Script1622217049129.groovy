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
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.callTestCase(findTestCase('Common Test Cases/Login'), [('Username') : 'nttuan', ('Password') : '12345678zZ@'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Direct Message/Page_TEST CHANNEL - TEAM NAME Mattermost/i_DIRECT MESSAGES_icon-plus'))

WebUI.setText(findTestObject('Object Repository/Direct Message/Page_TEST CHANNEL - TEAM NAME Mattermost/input_Search for people_react-select-2-input'), 
   username)

WebUI.sendKeys(findTestObject('Object Repository/Direct Message/Page_TEST CHANNEL - TEAM NAME Mattermost/input_Search for people_react-select-2-input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Direct Message/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Go'))

String message = String.format('This test will sent %d direct messages using while loop', nMessage)

DateTimeFormatter format = DateTimeFormatter.ofPattern('dd-MM-yyyy HH:mm:ss')

WebUI.setText(findTestObject('Object Repository/Direct Message/Page_nguyenvanb - TEAM NAME Mattermost/textarea_Write to nguyenvanb_post_textbox'), 
    message)

WebUI.sendKeys(findTestObject('Object Repository/Direct Message/Page_nguyenvanb - TEAM NAME Mattermost/textarea_Write to nguyenvanb_post_textbox'),
	Keys.chord(Keys.ENTER))

while (nMessage > 0) {
	message = String.format('Sent message to %s at %s', username,  LocalDateTime.now().format(format))

	WebUI.setText(findTestObject('Object Repository/Direct Message/Page_nguyenvanb - TEAM NAME Mattermost/textarea_Write to nguyenvanb_post_textbox'),
		message)

	WebUI.sendKeys(findTestObject('Object Repository/Direct Message/Page_nguyenvanb - TEAM NAME Mattermost/textarea_Write to nguyenvanb_post_textbox'),
		Keys.chord(Keys.ENTER))

	Thread.sleep(500)

	nMessage--
}

WebUI.closeBrowser()

