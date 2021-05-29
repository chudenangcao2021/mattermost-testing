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

WebUI.click(findTestObject('Object Repository/SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/button_nttuan_style--none sidebar-header-dr_897f13'))

WebUI.click(findTestObject('Object Repository/SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/button_Sidebar'))

WebUI.click(findTestObject('Object Repository/SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/span_Edit'))

WebUI.click(findTestObject('SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/div_All Direct Messages_css-1thkkgx'))

switch (nMessage) {
    case 10:
        WebUI.click(findTestObject('Object Repository/SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/div_10'))

        break
    case 15:
        WebUI.click(findTestObject('Object Repository/SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/div_15'))

        break
    case 20:
        WebUI.click(findTestObject('Object Repository/SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/div_20'))

        break
    case 40:
        WebUI.click(findTestObject('Object Repository/SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/div_20'))

        break
    default:
        WebUI.click(findTestObject('Object Repository/SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/div_All Direct Messages'))}

WebUI.click(findTestObject('Object Repository/SwitchCase/NumberOfDirectMessages/Page_span_Town Square - TEAM NAME Mattermost/button_Save'))

WebUI.closeBrowser()

