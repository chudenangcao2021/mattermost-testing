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

WebUI.callTestCase(findTestCase('Internal Test Cases/Successful Login'), [('Username') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

for (def rowNum = 1; rowNum <= findTestData('Internal/Internal Position').getRowNumbers(); rowNum++) {

WebUI.click(findTestObject('Object Repository/Edit position/Page_span_Town Square - Team 1 Mattermost/span_span_Town Square'))

WebUI.click(findTestObject('Object Repository/Edit position/Page_span_Town Square - Team 1 Mattermost/span'))

WebUI.click(findTestObject('Object Repository/Edit position/Page_span_Town Square - Team 1 Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Edit position/Page_span_Town Square - Team 1 Mattermost/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Edit position/Page_span_Town Square - Team 1 Mattermost/input_Position_position'), 
    findTestData(
			'Internal/Internal Position').getValue(1, rowNum))

WebUI.click(findTestObject('Object Repository/Edit position/Page_span_Town Square - Team 1 Mattermost/button_Save'))

WebUI.click(findTestObject('Object Repository/Edit position/Page_span_Town Square - Team 1 Mattermost/span_'))
}
WebUI.closeBrowser()

