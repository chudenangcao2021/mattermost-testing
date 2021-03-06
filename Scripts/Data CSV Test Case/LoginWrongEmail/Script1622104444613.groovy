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

WebUI.navigateToUrl('https://chudenangcao2021.cf/')

for (def rowNum = 1; rowNum <= findTestData('Data CSV/Wrong Email').getRowNumbers(); rowNum++) {
	WebUI.setText(findTestObject('Object Repository/Wrong Password/Page_Mattermost/input_All team communication in one place, _dcc84b'),
		findTestData('Data CSV/Wrong Email').getValue(1, rowNum))

	WebUI.setText(findTestObject('Object Repository/Wrong Password/Page_Mattermost/input_All team communication in one place, _a3edc6'),
		'Tung@123456')

	WebUI.click(findTestObject('Object Repository/Wrong Password/Page_Mattermost/button_Sign in'))

	WebUI.verifyElementPresent(findTestObject('Object Repository/Wrong Password/Page_Mattermost/label_Enter a valid email or username andor_ef8acb'),
		0)
}

WebUI.closeBrowser()