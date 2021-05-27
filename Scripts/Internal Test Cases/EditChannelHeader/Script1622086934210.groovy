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

for (def rowNum = 1; rowNum <= findTestData('Internal/Internal Channel Header').getRowNumbers(); rowNum++) {
    WebUI.click(findTestObject('Object Repository/Page_Town Square - TEAM NAME Mattermost/div_Off-Topic'))

    WebUI.click(findTestObject('Object Repository/Page_Off-Topic - TEAM NAME Mattermost/span_Off-Topic_channelHeaderDropdownIcon'))

    WebUI.click(findTestObject('Object Repository/Page_Off-Topic - TEAM NAME Mattermost/span_Edit Channel Header'))

    WebUI.setText(findTestObject('Object Repository/Page_Off-Topic - TEAM NAME Mattermost/textarea_Hell'), findTestData(
            'Internal/Internal Channel Header').getValue(1, rowNum))

    WebUI.click(findTestObject('Object Repository/Page_Off-Topic - TEAM NAME Mattermost/span_Save'))
}

WebUI.closeBrowser()

