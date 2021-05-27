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

for (def rowNum = 1; rowNum <= findTestData('Data CSV/Email Member').getRowNumbers(); rowNum++) {
WebUI.click(findTestObject('Object Repository/Invite member/Page_TEST CHANNEL - TEAM NAME Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/Invite member/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Invite PeopleAdd or invite people to_5d2fc4'))

WebUI.click(findTestObject('Object Repository/Invite member/Page_TEST CHANNEL - TEAM NAME Mattermost/div_Add members or email addresses'))

WebUI.setText(findTestObject('Object Repository/Invite member/Page_TEST CHANNEL - TEAM NAME Mattermost/input_Add members or email addresses_react-_5a852a'), 
    findTestData('Data CSV/Email Member').getValue(1, rowNum))

WebUI.sendKeys(findTestObject('Object Repository/Invite member/Page_TEST CHANNEL - TEAM NAME Mattermost/input_Add members or email addresses_react-_5a852a'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Invite member/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Invite Members'))

WebUI.click(findTestObject('Object Repository/Invite member/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Done'))
}

WebUI.closeBrowser()

