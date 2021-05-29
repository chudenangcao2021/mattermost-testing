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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Test Cases/Common Test Cases/Login'), [('username') : username, ('password') : password], 
    FailureHandling.STOP_ON_FAILURE)	

WebUI.click(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/button_cxtuan_style--none sidebar-header-dropdown__icon'))

WebUI.click(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Account Settings'))

String lang = language

WebUI.click(findTestObject('Object Repository/SwitchCase/Change language/button_Display'))

WebUI.click(findTestObject('Object Repository/SwitchCase/Change language/button_EditLanguage'))

WebUI.click(findTestObject('Object Repository/SwitchCase/Change language/div_English'))

switch (lang) {
    case 'Italiano':
        WebUI.click(findTestObject('Object Repository/SwitchCase/Page_span_Town Square - TEAM NAME Mattermost/div_Italiano'))

        break
    case 'Alpha':
        WebUI.click(findTestObject('Object Repository/SwitchCase/Page_span_Town Square - TEAM NAME Mattermost/div_(Alpha)'))

        break
    case 'Svenska':
        WebUI.click(findTestObject('Object Repository/SwitchCase/Page_span_Town Square - TEAM NAME Mattermost/div_Svenska'))

        break
    default:
        WebUI.click(findTestObject('Object Repository/SwitchCase/Page_span_Town Square - TEAM NAME Mattermost/div_English'))
}

WebUI.click(findTestObject('Object Repository/SwitchCase/Change language/button_Save'))

