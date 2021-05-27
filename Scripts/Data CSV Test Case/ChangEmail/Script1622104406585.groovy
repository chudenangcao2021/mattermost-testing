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

for (def rowNum = 1; rowNum <= findTestData('Data CSV/Email').getRowNumbers(); rowNum++) {
    WebUI.click(findTestObject('Object Repository/Change Email/Page_TEST CHANNEL - TEAM NAME Mattermost/button_nguyenvanb_style--none sidebar-heade_3f663e'))

    WebUI.click(findTestObject('Object Repository/Change Email/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Account Settings'))

    WebUI.click(findTestObject('Object Repository/Change Email/Page_TEST CHANNEL - TEAM NAME Mattermost/span_Edit'))

    WebUI.setText(findTestObject('Object Repository/Change Email/Page_TEST CHANNEL - TEAM NAME Mattermost/input_New Email_primaryEmail'), 
        findTestData('Data CSV/Email').getValue(1, rowNum))

    WebUI.setText(findTestObject('Object Repository/Change Email/Page_TEST CHANNEL - TEAM NAME Mattermost/input_Confirm Email_confirmEmail'), 
        findTestData('Data CSV/Email').getValue(1, rowNum))

    WebUI.setText(findTestObject('Object Repository/Change Email/Page_TEST CHANNEL - TEAM NAME Mattermost/input_Current Password_currentPassword'), 
        'Tung@123456')

    WebUI.click(findTestObject('Object Repository/Change Email/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Save'))

    WebUI.click(findTestObject('Object Repository/Change Email/Page_TEST CHANNEL - TEAM NAME Mattermost/span_'))
}

WebUI.closeBrowser()

